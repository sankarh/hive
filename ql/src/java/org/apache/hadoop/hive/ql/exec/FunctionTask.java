/**
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

package org.apache.hadoop.hive.ql.exec;

import static org.apache.hadoop.util.StringUtils.stringifyException;

import java.io.IOException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.hadoop.hive.common.JavaUtils;
import org.apache.hadoop.hive.conf.HiveConf;
import org.apache.hadoop.hive.metastore.api.Function;
import org.apache.hadoop.hive.metastore.api.PrincipalType;
import org.apache.hadoop.hive.ql.Context;
import org.apache.hadoop.hive.ql.DriverContext;
import org.apache.hadoop.hive.ql.QueryPlan;
import org.apache.hadoop.hive.ql.exec.FunctionUtils.FunctionType;
import org.apache.hadoop.hive.ql.exec.FunctionUtils.UDFClassType;
import org.apache.hadoop.hive.ql.metadata.Hive;
import org.apache.hadoop.hive.ql.metadata.HiveException;
import org.apache.hadoop.hive.ql.plan.CreateFunctionDesc;
import org.apache.hadoop.hive.ql.plan.DropFunctionDesc;
import org.apache.hadoop.hive.ql.plan.CreateMacroDesc;
import org.apache.hadoop.hive.ql.plan.DropMacroDesc;
import org.apache.hadoop.hive.ql.plan.FunctionWork;
import org.apache.hadoop.hive.ql.plan.api.StageType;
import org.apache.hadoop.hive.ql.session.SessionState;
import org.apache.hadoop.hive.ql.udf.generic.GenericUDAFResolver;
import org.apache.hadoop.hive.ql.udf.generic.GenericUDF;
import org.apache.hadoop.hive.ql.udf.generic.GenericUDTF;
import org.apache.hadoop.util.ReflectionUtils;
import org.apache.hadoop.util.StringUtils;

/**
 * FunctionTask.
 *
 */
public class FunctionTask extends Task<FunctionWork> {
  private static final long serialVersionUID = 1L;
  private static transient final Log LOG = LogFactory.getLog(FunctionTask.class);

  transient HiveConf conf;

  public FunctionTask() {
    super();
  }

  @Override
  public void initialize(HiveConf conf, QueryPlan queryPlan, DriverContext ctx) {
    super.initialize(conf, queryPlan, ctx);
    this.conf = conf;
  }

  @Override
  public int execute(DriverContext driverContext) {
    CreateFunctionDesc createFunctionDesc = work.getCreateFunctionDesc();
    if (createFunctionDesc != null) {
      if (createFunctionDesc.isTemp()) {
        return createTemporaryFunction(createFunctionDesc);
      } else {
        try {
          return createPermanentFunction(Hive.get(conf), createFunctionDesc);
        } catch (Exception e) {
          setException(e);
          LOG.error(stringifyException(e));
          return 1;
        }
      }
    }

    DropFunctionDesc dropFunctionDesc = work.getDropFunctionDesc();
    if (dropFunctionDesc != null) {
      if (dropFunctionDesc.isTemp()) {
        return dropTemporaryFunction(dropFunctionDesc);
      } else {
        try {
          return dropPermanentFunction(Hive.get(conf), dropFunctionDesc);
        } catch (Exception e) {
          setException(e);
          LOG.error(stringifyException(e));
          return 1;
        }
      }
    }

    CreateMacroDesc createMacroDesc = work.getCreateMacroDesc();
    if (createMacroDesc != null) {
      return createMacro(createMacroDesc);
    }

    DropMacroDesc dropMacroDesc = work.getDropMacroDesc();
    if (dropMacroDesc != null) {
      return dropMacro(dropMacroDesc);
    }
    return 0;
  }

  private int createPermanentFunction(Hive db, CreateFunctionDesc createFunctionDesc)
      throws HiveException, IOException {
    String[] qualifiedNameParts = FunctionUtils.getQualifiedFunctionNameParts(
        createFunctionDesc.getFunctionName());
    String dbName = qualifiedNameParts[0];
    String funcName = qualifiedNameParts[1];
    String registeredName = FunctionUtils.qualifyFunctionName(funcName, dbName);
    String className = createFunctionDesc.getClassName();
    boolean addedToRegistry = false;

    try {
      // UDF class should exist
      Class<?> udfClass = getUdfClass(createFunctionDesc);
      if (FunctionUtils.getUDFClassType(udfClass) == UDFClassType.UNKNOWN) {
        console.printError("FAILED: Class " + createFunctionDesc.getClassName()
            + " does not implement UDF, GenericUDF, or UDAF");
        return 1;
      }

      // TODO: There should be a registerPermanentFunction()
      addedToRegistry = FunctionRegistry.registerTemporaryFunction(registeredName, udfClass);
      if (!addedToRegistry) {
        console.printError("Failed to register " + registeredName
            + " using class " + createFunctionDesc.getClassName());
        return 1;
      }

      // Add to metastore
      Function func = new Function(
          funcName,
          dbName,
          className,
          SessionState.get().getUserName(),
          PrincipalType.USER,
          (int) (System.currentTimeMillis() / 1000),
          org.apache.hadoop.hive.metastore.api.FunctionType.JAVA);
      db.createFunction(func);
      return 0;
    } catch (ClassNotFoundException e) {
      console.printError("FAILED: Class " + createFunctionDesc.getClassName() + " not found");
      LOG.info("create function: " + StringUtils.stringifyException(e));
      if (addedToRegistry) {
        FunctionRegistry.unregisterTemporaryUDF(registeredName);
      }
      return 1;
    }
  }

  private int createTemporaryFunction(CreateFunctionDesc createFunctionDesc) {
    try {
      Class<?> udfClass = getUdfClass(createFunctionDesc);
      boolean registered = FunctionRegistry.registerTemporaryFunction(
        createFunctionDesc.getFunctionName(),
        udfClass);
      if (registered) {
        return 0;
      }
      console.printError("FAILED: Class " + createFunctionDesc.getClassName()
          + " does not implement UDF, GenericUDF, or UDAF");
      return 1;
    } catch (ClassNotFoundException e) {
      console.printError("FAILED: Class " + createFunctionDesc.getClassName() + " not found");
      LOG.info("create function: " + StringUtils.stringifyException(e));
      return 1;
    }
  }

  private int createMacro(CreateMacroDesc createMacroDesc) {
    FunctionRegistry.registerTemporaryMacro(
      createMacroDesc.getMacroName(),
      createMacroDesc.getBody(),
      createMacroDesc.getColNames(),
      createMacroDesc.getColTypes());
    return 0;
  }

  private int dropMacro(DropMacroDesc dropMacroDesc) {
    try {
      FunctionRegistry.unregisterTemporaryUDF(dropMacroDesc
          .getMacroName());
      return 0;
    } catch (HiveException e) {
      LOG.info("drop macro: " + StringUtils.stringifyException(e));
      return 1;
    }
  }

  private int dropPermanentFunction(Hive db, DropFunctionDesc dropFunctionDesc) {
    try {
      String[] qualifiedNameParts = FunctionUtils.getQualifiedFunctionNameParts(
          dropFunctionDesc.getFunctionName());
      String dbName = qualifiedNameParts[0];
      String funcName = qualifiedNameParts[1];

      String registeredName = FunctionUtils.qualifyFunctionName(funcName, dbName);
      // TODO: there should be a unregisterPermanentUDF()
      FunctionRegistry.unregisterTemporaryUDF(registeredName);
      db.dropFunction(dbName, funcName);

      return 0;
    } catch (Exception e) {
      LOG.info("drop function: " + StringUtils.stringifyException(e));
      console.printError("FAILED: error during drop function: " + StringUtils.stringifyException(e));
      return 1;
    }
  }

  private int dropTemporaryFunction(DropFunctionDesc dropFunctionDesc) {
    try {
      FunctionRegistry.unregisterTemporaryUDF(dropFunctionDesc
          .getFunctionName());
      return 0;
    } catch (HiveException e) {
      LOG.info("drop function: " + StringUtils.stringifyException(e));
      return 1;
    }
  }

  @SuppressWarnings("unchecked")
  private Class<?> getUdfClass(CreateFunctionDesc desc) throws ClassNotFoundException {
    return Class.forName(desc.getClassName(), true, JavaUtils.getClassLoader());
  }

  @Override
  public StageType getType() {
    return StageType.FUNC;
  }

  @Override
  public String getName() {
    return "FUNCTION";
  }
}
