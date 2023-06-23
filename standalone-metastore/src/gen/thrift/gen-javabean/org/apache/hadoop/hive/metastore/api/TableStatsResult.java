/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hive.metastore.api;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.13.0)")
@org.apache.hadoop.classification.InterfaceAudience.Public @org.apache.hadoop.classification.InterfaceStability.Stable public class TableStatsResult implements org.apache.thrift.TBase<TableStatsResult, TableStatsResult._Fields>, java.io.Serializable, Cloneable, Comparable<TableStatsResult> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TableStatsResult");

  private static final org.apache.thrift.protocol.TField TABLE_STATS_FIELD_DESC = new org.apache.thrift.protocol.TField("tableStats", org.apache.thrift.protocol.TType.LIST, (short)1);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TableStatsResultStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TableStatsResultTupleSchemeFactory();

  private @org.apache.thrift.annotation.Nullable java.util.List<ColumnStatisticsObj> tableStats; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TABLE_STATS((short)1, "tableStats");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // TABLE_STATS
          return TABLE_STATS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TABLE_STATS, new org.apache.thrift.meta_data.FieldMetaData("tableStats", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ColumnStatisticsObj.class))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TableStatsResult.class, metaDataMap);
  }

  public TableStatsResult() {
  }

  public TableStatsResult(
    java.util.List<ColumnStatisticsObj> tableStats)
  {
    this();
    this.tableStats = tableStats;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TableStatsResult(TableStatsResult other) {
    if (other.isSetTableStats()) {
      java.util.List<ColumnStatisticsObj> __this__tableStats = new java.util.ArrayList<ColumnStatisticsObj>(other.tableStats.size());
      for (ColumnStatisticsObj other_element : other.tableStats) {
        __this__tableStats.add(new ColumnStatisticsObj(other_element));
      }
      this.tableStats = __this__tableStats;
    }
  }

  public TableStatsResult deepCopy() {
    return new TableStatsResult(this);
  }

  @Override
  public void clear() {
    this.tableStats = null;
  }

  public int getTableStatsSize() {
    return (this.tableStats == null) ? 0 : this.tableStats.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<ColumnStatisticsObj> getTableStatsIterator() {
    return (this.tableStats == null) ? null : this.tableStats.iterator();
  }

  public void addToTableStats(ColumnStatisticsObj elem) {
    if (this.tableStats == null) {
      this.tableStats = new java.util.ArrayList<ColumnStatisticsObj>();
    }
    this.tableStats.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<ColumnStatisticsObj> getTableStats() {
    return this.tableStats;
  }

  public void setTableStats(@org.apache.thrift.annotation.Nullable java.util.List<ColumnStatisticsObj> tableStats) {
    this.tableStats = tableStats;
  }

  public void unsetTableStats() {
    this.tableStats = null;
  }

  /** Returns true if field tableStats is set (has been assigned a value) and false otherwise */
  public boolean isSetTableStats() {
    return this.tableStats != null;
  }

  public void setTableStatsIsSet(boolean value) {
    if (!value) {
      this.tableStats = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case TABLE_STATS:
      if (value == null) {
        unsetTableStats();
      } else {
        setTableStats((java.util.List<ColumnStatisticsObj>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case TABLE_STATS:
      return getTableStats();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case TABLE_STATS:
      return isSetTableStats();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof TableStatsResult)
      return this.equals((TableStatsResult)that);
    return false;
  }

  public boolean equals(TableStatsResult that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_tableStats = true && this.isSetTableStats();
    boolean that_present_tableStats = true && that.isSetTableStats();
    if (this_present_tableStats || that_present_tableStats) {
      if (!(this_present_tableStats && that_present_tableStats))
        return false;
      if (!this.tableStats.equals(that.tableStats))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetTableStats()) ? 131071 : 524287);
    if (isSetTableStats())
      hashCode = hashCode * 8191 + tableStats.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TableStatsResult other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetTableStats()).compareTo(other.isSetTableStats());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTableStats()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tableStats, other.tableStats);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TableStatsResult(");
    boolean first = true;

    sb.append("tableStats:");
    if (this.tableStats == null) {
      sb.append("null");
    } else {
      sb.append(this.tableStats);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetTableStats()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'tableStats' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TableStatsResultStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TableStatsResultStandardScheme getScheme() {
      return new TableStatsResultStandardScheme();
    }
  }

  private static class TableStatsResultStandardScheme extends org.apache.thrift.scheme.StandardScheme<TableStatsResult> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TableStatsResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TABLE_STATS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list432 = iprot.readListBegin();
                struct.tableStats = new java.util.ArrayList<ColumnStatisticsObj>(_list432.size);
                @org.apache.thrift.annotation.Nullable ColumnStatisticsObj _elem433;
                for (int _i434 = 0; _i434 < _list432.size; ++_i434)
                {
                  _elem433 = new ColumnStatisticsObj();
                  _elem433.read(iprot);
                  struct.tableStats.add(_elem433);
                }
                iprot.readListEnd();
              }
              struct.setTableStatsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TableStatsResult struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.tableStats != null) {
        oprot.writeFieldBegin(TABLE_STATS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.tableStats.size()));
          for (ColumnStatisticsObj _iter435 : struct.tableStats)
          {
            _iter435.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TableStatsResultTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TableStatsResultTupleScheme getScheme() {
      return new TableStatsResultTupleScheme();
    }
  }

  private static class TableStatsResultTupleScheme extends org.apache.thrift.scheme.TupleScheme<TableStatsResult> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TableStatsResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      {
        oprot.writeI32(struct.tableStats.size());
        for (ColumnStatisticsObj _iter436 : struct.tableStats)
        {
          _iter436.write(oprot);
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TableStatsResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TList _list437 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.tableStats = new java.util.ArrayList<ColumnStatisticsObj>(_list437.size);
        @org.apache.thrift.annotation.Nullable ColumnStatisticsObj _elem438;
        for (int _i439 = 0; _i439 < _list437.size; ++_i439)
        {
          _elem438 = new ColumnStatisticsObj();
          _elem438.read(iprot);
          struct.tableStats.add(_elem438);
        }
      }
      struct.setTableStatsIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

