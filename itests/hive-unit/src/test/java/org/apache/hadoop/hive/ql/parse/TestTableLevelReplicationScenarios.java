/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.hadoop.hive.ql.parse;

import org.apache.hadoop.hive.conf.HiveConf;
import org.apache.hadoop.hive.metastore.conf.MetastoreConf;
import org.apache.hadoop.hive.metastore.messaging.json.gzip.GzipJSONMessageEncoder;
import org.apache.hadoop.hive.ql.ErrorMsg;
import org.apache.hadoop.security.UserGroupInformation;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Tests Table level replication scenarios.
 */
public class TestTableLevelReplicationScenarios extends BaseReplicationScenariosAcidTables {

  @BeforeClass
  public static void classLevelSetup() throws Exception {
    Map<String, String> overrides = new HashMap<>();
    overrides.put(MetastoreConf.ConfVars.EVENT_MESSAGE_FACTORY.getHiveName(),
        GzipJSONMessageEncoder.class.getCanonicalName());
    overrides.put(HiveConf.ConfVars.REPL_DUMP_METADATA_ONLY.varname, "false");
    overrides.put(HiveConf.ConfVars.REPL_INCLUDE_EXTERNAL_TABLES.varname, "true");
    overrides.put(HiveConf.ConfVars.HIVE_DISTCP_DOAS_USER.varname,
        UserGroupInformation.getCurrentUser().getUserName());

    internalBeforeClassSetup(overrides, TestTableLevelReplicationScenarios.class);
  }

  enum CreateTableType {
    FULL_ACID, MM_ACID, NON_ACID, EXTERNAL
  }

  class CreateTableInfo {
    String tableName;
    CreateTableType type;
    boolean isPartitioned;

    CreateTableInfo(String tableName, CreateTableType type, boolean isPartitioned) {
      this.tableName = tableName;
      this.type = type;
      this.isPartitioned = isPartitioned;
    }
  }

  private void createTables(List<CreateTableInfo> createTblsInfo) throws Throwable {
    for (CreateTableInfo tblInfo : createTblsInfo) {
      StringBuilder strBuilder = new StringBuilder("create ");
      if (tblInfo.type == CreateTableType.EXTERNAL) {
        strBuilder.append(" external ");
      }
      strBuilder.append(" table ").append(primaryDbName).append(".").append(tblInfo.tableName);

      if (tblInfo.isPartitioned) {
        strBuilder.append(" (a int) partitioned by (b int) ");
      } else {
        strBuilder.append(" (a int, b int) ");
      }

      if (tblInfo.type == CreateTableType.FULL_ACID) {
        strBuilder.append(" clustered by (a) into 2 buckets stored as orc " +
                "tblproperties (\"transactional\"=\"true\")");
      } else if (tblInfo.type == CreateTableType.MM_ACID) {
        strBuilder.append(" tblproperties(\"transactional\"=\"true\", " +
                "\"transactional_properties\"=\"insert_only\")");
      }

      String createTableCmd = strBuilder.toString();
      primary.run("use " + primaryDbName)
              .run(createTableCmd)
              .run("insert into " + tblInfo.tableName + " values(1, 10)");
    }
  }

  private void createTables(String[] tableNames, CreateTableType type) throws Throwable {
    List<CreateTableInfo> createTablesInfo = new ArrayList<>();
    for (String tblName : tableNames) {
      createTablesInfo.add(new CreateTableInfo(tblName, type, false));
    }
    createTables(createTablesInfo);
  }

  private void replicateAndVerify(String replPolicy, String lastReplId,
                                  List<String> dumpWithClause,
                                  List<String> loadWithClause,
                                  String[] expectedTables) throws Throwable {
    if (dumpWithClause == null) {
      dumpWithClause = new ArrayList<>();
    }
    if (loadWithClause == null) {
      loadWithClause = new ArrayList<>();
    }

    // For bootstrap replication, drop the target database before triggering it.
    if (lastReplId == null) {
      replica.run("drop database if exists " + replicatedDbName + " cascade");
    }
    WarehouseInstance.Tuple tuple = primary.run("use " + primaryDbName)
            .dump(replPolicy, lastReplId, dumpWithClause);

    replica.load(replicatedDbName, tuple.dumpLocation, loadWithClause)
            .run("use " + replicatedDbName)
            .run("show tables")
            .verifyResults(expectedTables);
  }

  @Test
  public void testBasicBootstrapWithIncludeList() throws Throwable {
    String[] originalNonAcidTables = new String[] {"t1", "t2" };
    String[] originalFullAcidTables = new String[] {"t3", "t4" };
    String[] originalMMAcidTables = new String[] {"t5" };
    createTables(originalNonAcidTables, CreateTableType.NON_ACID);
    createTables(originalFullAcidTables, CreateTableType.FULL_ACID);
    createTables(originalMMAcidTables, CreateTableType.MM_ACID);

    // Replicate and verify if only 2 tables are replicated to target.
    String replPolicy = primaryDbName + ".['t1', 't4', 't5']";
    String[] replicatedTables = new String[] {"t1", "t4", "t5" };
    replicateAndVerify(replPolicy, null, null, null, replicatedTables);
  }

  @Test
  public void testBasicBootstrapWithIncludeAndExcludeList() throws Throwable {
    String[] originalTables = new String[] {"t1", "t11", "t2", "t3", "t100" };
    createTables(originalTables, CreateTableType.NON_ACID);

    // Replicate and verify if only 3 tables are replicated to target.
    String replPolicy = primaryDbName + ".['t1*', 't3'].['t100']";
    String[] replicatedTables = new String[] {"t1", "t11", "t3" };
    replicateAndVerify(replPolicy, null, null, null, replicatedTables);
  }

  @Test
  public void testBasicIncrementalWithIncludeList() throws Throwable {
    WarehouseInstance.Tuple tupleBootstrap = primary.run("use " + primaryDbName)
            .dump(primaryDbName, null);
    replica.load(replicatedDbName, tupleBootstrap.dumpLocation);

    String[] originalNonAcidTables = new String[] {"t1", "t2" };
    String[] originalFullAcidTables = new String[] {"t3", "t4" };
    String[] originalMMAcidTables = new String[] {"t5" };
    createTables(originalNonAcidTables, CreateTableType.NON_ACID);
    createTables(originalFullAcidTables, CreateTableType.FULL_ACID);
    createTables(originalMMAcidTables, CreateTableType.MM_ACID);

    // Replicate and verify if only 2 tables are replicated to target.
    String replPolicy = primaryDbName + ".['t1', 't5']";
    String[] replicatedTables = new String[] {"t1", "t5" };
    replicateAndVerify(replPolicy, tupleBootstrap.lastReplicationId, null, null, replicatedTables);
  }

  @Test
  public void testBasicIncrementalWithIncludeAndExcludeList() throws Throwable {
    WarehouseInstance.Tuple tupleBootstrap = primary.run("use " + primaryDbName)
            .dump(primaryDbName, null);
    replica.load(replicatedDbName, tupleBootstrap.dumpLocation);

    String[] originalTables = new String[] {"t1", "t11", "t2", "t3", "t111" };
    createTables(originalTables, CreateTableType.NON_ACID);

    // Replicate and verify if only 3 tables are replicated to target.
    String replPolicy = primaryDbName + ".['t1+', 't2'].['t11', 't3']";
    String[] replicatedTables = new String[] {"t1", "t111", "t2" };
    replicateAndVerify(replPolicy, tupleBootstrap.lastReplicationId, null, null, replicatedTables);
  }

  @Test
  public void testReplDumpWithIncorrectTablePolicy() throws Throwable {
    String[] originalTables = new String[] {"t1", "t11", "t2", "t3", "t111" };
    createTables(originalTables, CreateTableType.NON_ACID);

    // Invalid repl policy where abrubtly placed DOT which causes ParseException during REPL dump.
    String[] replicatedTables = new String[]{};
    boolean failed;
    String[] invalidReplPolicies = new String[] {
        primaryDbName + ".t1.t2", // Two explicit table names not allowed.
        primaryDbName + ".['t1'].t2", // Table name and include list not allowed.
        primaryDbName + ".t1.['t2']", // Table name and exclude list not allowed.
        primaryDbName + ".[t1].t2", // Table name and include list not allowed.
        primaryDbName + ".['t1+'].", // Abrubtly ended dot.
        primaryDbName + "..[]" // Multiple dots
    };
    for (String replPolicy : invalidReplPolicies) {
      failed = false;
      try {
        replicateAndVerify(replPolicy, null, null, null, replicatedTables);
      } catch (Exception ex) {
        LOG.info("Got exception: {}", ex.getMessage());
        Assert.assertTrue(ex instanceof ParseException);
        failed = true;
      }
      Assert.assertTrue(failed);
    }

    // Invalid pattern where we didn't enclose table pattern within single or double quotes.
    String replPolicy = primaryDbName + ".[t1].[t2]";
    failed = false;
    try {
      replicateAndVerify(replPolicy, null, null, null, replicatedTables);
    } catch (Exception ex) {
      LOG.info("Got exception: {}", ex.getMessage());
      Assert.assertTrue(ex instanceof SemanticException);
      Assert.assertTrue(ex.getMessage().equals(ErrorMsg.REPL_INVALID_DB_OR_TABLE_PATTERN.getMsg()));
      failed = true;
    }
    Assert.assertTrue(failed);
  }

  @Test
  public void testFullDbBootstrapReplicationWithDifferentReplPolicyFormats() throws Throwable {
    String[] originalTables = new String[] {"t1", "t200", "t3333" };
    createTables(originalTables, CreateTableType.NON_ACID);

    // List of repl policy formats that leads to Full DB replication.
    String[] fullDbReplPolicies = new String[] {
            primaryDbName + ".['.*?']",
            primaryDbName + ".['.*?'].[]"
    };

    // Replicate and verify if all 3 tables are replicated to target.
    for (String replPolicy : fullDbReplPolicies) {
      replicateAndVerify(replPolicy, null, null, null, originalTables);
    }
  }

  @Test
  public void testCaseInSensitiveNatureOfReplPolicy() throws Throwable {
    String[] originalTables = new String[] {"a1", "aA11", "B2", "Cc3" };
    createTables(originalTables, CreateTableType.NON_ACID);

    // Replicate and verify if 2 tables are replicated as per policy.
    String replPolicy = primaryDbName.toUpperCase() + ".['.*a1+', 'cc3', 'B2'].['AA1+', 'b2']";
    String[] replicatedTables = new String[] {"a1", "cc3" };
    replicateAndVerify(replPolicy, null, null, null, replicatedTables);
  }
}
