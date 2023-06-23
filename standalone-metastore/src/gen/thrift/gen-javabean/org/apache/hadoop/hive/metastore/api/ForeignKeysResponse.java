/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hive.metastore.api;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.13.0)")
@org.apache.hadoop.classification.InterfaceAudience.Public @org.apache.hadoop.classification.InterfaceStability.Stable public class ForeignKeysResponse implements org.apache.thrift.TBase<ForeignKeysResponse, ForeignKeysResponse._Fields>, java.io.Serializable, Cloneable, Comparable<ForeignKeysResponse> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ForeignKeysResponse");

  private static final org.apache.thrift.protocol.TField FOREIGN_KEYS_FIELD_DESC = new org.apache.thrift.protocol.TField("foreignKeys", org.apache.thrift.protocol.TType.LIST, (short)1);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new ForeignKeysResponseStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new ForeignKeysResponseTupleSchemeFactory();

  private @org.apache.thrift.annotation.Nullable java.util.List<SQLForeignKey> foreignKeys; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    FOREIGN_KEYS((short)1, "foreignKeys");

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
        case 1: // FOREIGN_KEYS
          return FOREIGN_KEYS;
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
    tmpMap.put(_Fields.FOREIGN_KEYS, new org.apache.thrift.meta_data.FieldMetaData("foreignKeys", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, SQLForeignKey.class))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ForeignKeysResponse.class, metaDataMap);
  }

  public ForeignKeysResponse() {
  }

  public ForeignKeysResponse(
    java.util.List<SQLForeignKey> foreignKeys)
  {
    this();
    this.foreignKeys = foreignKeys;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ForeignKeysResponse(ForeignKeysResponse other) {
    if (other.isSetForeignKeys()) {
      java.util.List<SQLForeignKey> __this__foreignKeys = new java.util.ArrayList<SQLForeignKey>(other.foreignKeys.size());
      for (SQLForeignKey other_element : other.foreignKeys) {
        __this__foreignKeys.add(new SQLForeignKey(other_element));
      }
      this.foreignKeys = __this__foreignKeys;
    }
  }

  public ForeignKeysResponse deepCopy() {
    return new ForeignKeysResponse(this);
  }

  @Override
  public void clear() {
    this.foreignKeys = null;
  }

  public int getForeignKeysSize() {
    return (this.foreignKeys == null) ? 0 : this.foreignKeys.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<SQLForeignKey> getForeignKeysIterator() {
    return (this.foreignKeys == null) ? null : this.foreignKeys.iterator();
  }

  public void addToForeignKeys(SQLForeignKey elem) {
    if (this.foreignKeys == null) {
      this.foreignKeys = new java.util.ArrayList<SQLForeignKey>();
    }
    this.foreignKeys.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<SQLForeignKey> getForeignKeys() {
    return this.foreignKeys;
  }

  public void setForeignKeys(@org.apache.thrift.annotation.Nullable java.util.List<SQLForeignKey> foreignKeys) {
    this.foreignKeys = foreignKeys;
  }

  public void unsetForeignKeys() {
    this.foreignKeys = null;
  }

  /** Returns true if field foreignKeys is set (has been assigned a value) and false otherwise */
  public boolean isSetForeignKeys() {
    return this.foreignKeys != null;
  }

  public void setForeignKeysIsSet(boolean value) {
    if (!value) {
      this.foreignKeys = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case FOREIGN_KEYS:
      if (value == null) {
        unsetForeignKeys();
      } else {
        setForeignKeys((java.util.List<SQLForeignKey>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case FOREIGN_KEYS:
      return getForeignKeys();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case FOREIGN_KEYS:
      return isSetForeignKeys();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof ForeignKeysResponse)
      return this.equals((ForeignKeysResponse)that);
    return false;
  }

  public boolean equals(ForeignKeysResponse that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_foreignKeys = true && this.isSetForeignKeys();
    boolean that_present_foreignKeys = true && that.isSetForeignKeys();
    if (this_present_foreignKeys || that_present_foreignKeys) {
      if (!(this_present_foreignKeys && that_present_foreignKeys))
        return false;
      if (!this.foreignKeys.equals(that.foreignKeys))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetForeignKeys()) ? 131071 : 524287);
    if (isSetForeignKeys())
      hashCode = hashCode * 8191 + foreignKeys.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(ForeignKeysResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetForeignKeys()).compareTo(other.isSetForeignKeys());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetForeignKeys()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.foreignKeys, other.foreignKeys);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("ForeignKeysResponse(");
    boolean first = true;

    sb.append("foreignKeys:");
    if (this.foreignKeys == null) {
      sb.append("null");
    } else {
      sb.append(this.foreignKeys);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetForeignKeys()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'foreignKeys' is unset! Struct:" + toString());
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

  private static class ForeignKeysResponseStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ForeignKeysResponseStandardScheme getScheme() {
      return new ForeignKeysResponseStandardScheme();
    }
  }

  private static class ForeignKeysResponseStandardScheme extends org.apache.thrift.scheme.StandardScheme<ForeignKeysResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ForeignKeysResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // FOREIGN_KEYS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list336 = iprot.readListBegin();
                struct.foreignKeys = new java.util.ArrayList<SQLForeignKey>(_list336.size);
                @org.apache.thrift.annotation.Nullable SQLForeignKey _elem337;
                for (int _i338 = 0; _i338 < _list336.size; ++_i338)
                {
                  _elem337 = new SQLForeignKey();
                  _elem337.read(iprot);
                  struct.foreignKeys.add(_elem337);
                }
                iprot.readListEnd();
              }
              struct.setForeignKeysIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, ForeignKeysResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.foreignKeys != null) {
        oprot.writeFieldBegin(FOREIGN_KEYS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.foreignKeys.size()));
          for (SQLForeignKey _iter339 : struct.foreignKeys)
          {
            _iter339.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ForeignKeysResponseTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ForeignKeysResponseTupleScheme getScheme() {
      return new ForeignKeysResponseTupleScheme();
    }
  }

  private static class ForeignKeysResponseTupleScheme extends org.apache.thrift.scheme.TupleScheme<ForeignKeysResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ForeignKeysResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      {
        oprot.writeI32(struct.foreignKeys.size());
        for (SQLForeignKey _iter340 : struct.foreignKeys)
        {
          _iter340.write(oprot);
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ForeignKeysResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TList _list341 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.foreignKeys = new java.util.ArrayList<SQLForeignKey>(_list341.size);
        @org.apache.thrift.annotation.Nullable SQLForeignKey _elem342;
        for (int _i343 = 0; _i343 < _list341.size; ++_i343)
        {
          _elem342 = new SQLForeignKey();
          _elem342.read(iprot);
          struct.foreignKeys.add(_elem342);
        }
      }
      struct.setForeignKeysIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

