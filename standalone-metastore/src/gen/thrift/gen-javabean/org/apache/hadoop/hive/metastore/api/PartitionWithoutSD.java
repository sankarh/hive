/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hive.metastore.api;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.13.0)")
@org.apache.hadoop.classification.InterfaceAudience.Public @org.apache.hadoop.classification.InterfaceStability.Stable public class PartitionWithoutSD implements org.apache.thrift.TBase<PartitionWithoutSD, PartitionWithoutSD._Fields>, java.io.Serializable, Cloneable, Comparable<PartitionWithoutSD> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("PartitionWithoutSD");

  private static final org.apache.thrift.protocol.TField VALUES_FIELD_DESC = new org.apache.thrift.protocol.TField("values", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField CREATE_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("createTime", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField LAST_ACCESS_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("lastAccessTime", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField RELATIVE_PATH_FIELD_DESC = new org.apache.thrift.protocol.TField("relativePath", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField PARAMETERS_FIELD_DESC = new org.apache.thrift.protocol.TField("parameters", org.apache.thrift.protocol.TType.MAP, (short)5);
  private static final org.apache.thrift.protocol.TField PRIVILEGES_FIELD_DESC = new org.apache.thrift.protocol.TField("privileges", org.apache.thrift.protocol.TType.STRUCT, (short)6);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new PartitionWithoutSDStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new PartitionWithoutSDTupleSchemeFactory();

  private @org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> values; // required
  private int createTime; // required
  private int lastAccessTime; // required
  private @org.apache.thrift.annotation.Nullable java.lang.String relativePath; // required
  private @org.apache.thrift.annotation.Nullable java.util.Map<java.lang.String,java.lang.String> parameters; // required
  private @org.apache.thrift.annotation.Nullable PrincipalPrivilegeSet privileges; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    VALUES((short)1, "values"),
    CREATE_TIME((short)2, "createTime"),
    LAST_ACCESS_TIME((short)3, "lastAccessTime"),
    RELATIVE_PATH((short)4, "relativePath"),
    PARAMETERS((short)5, "parameters"),
    PRIVILEGES((short)6, "privileges");

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
        case 1: // VALUES
          return VALUES;
        case 2: // CREATE_TIME
          return CREATE_TIME;
        case 3: // LAST_ACCESS_TIME
          return LAST_ACCESS_TIME;
        case 4: // RELATIVE_PATH
          return RELATIVE_PATH;
        case 5: // PARAMETERS
          return PARAMETERS;
        case 6: // PRIVILEGES
          return PRIVILEGES;
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
  private static final int __CREATETIME_ISSET_ID = 0;
  private static final int __LASTACCESSTIME_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.PRIVILEGES};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.VALUES, new org.apache.thrift.meta_data.FieldMetaData("values", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.CREATE_TIME, new org.apache.thrift.meta_data.FieldMetaData("createTime", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.LAST_ACCESS_TIME, new org.apache.thrift.meta_data.FieldMetaData("lastAccessTime", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.RELATIVE_PATH, new org.apache.thrift.meta_data.FieldMetaData("relativePath", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PARAMETERS, new org.apache.thrift.meta_data.FieldMetaData("parameters", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.PRIVILEGES, new org.apache.thrift.meta_data.FieldMetaData("privileges", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, PrincipalPrivilegeSet.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(PartitionWithoutSD.class, metaDataMap);
  }

  public PartitionWithoutSD() {
  }

  public PartitionWithoutSD(
    java.util.List<java.lang.String> values,
    int createTime,
    int lastAccessTime,
    java.lang.String relativePath,
    java.util.Map<java.lang.String,java.lang.String> parameters)
  {
    this();
    this.values = values;
    this.createTime = createTime;
    setCreateTimeIsSet(true);
    this.lastAccessTime = lastAccessTime;
    setLastAccessTimeIsSet(true);
    this.relativePath = relativePath;
    this.parameters = parameters;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public PartitionWithoutSD(PartitionWithoutSD other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetValues()) {
      java.util.List<java.lang.String> __this__values = new java.util.ArrayList<java.lang.String>(other.values);
      this.values = __this__values;
    }
    this.createTime = other.createTime;
    this.lastAccessTime = other.lastAccessTime;
    if (other.isSetRelativePath()) {
      this.relativePath = other.relativePath;
    }
    if (other.isSetParameters()) {
      java.util.Map<java.lang.String,java.lang.String> __this__parameters = new java.util.HashMap<java.lang.String,java.lang.String>(other.parameters);
      this.parameters = __this__parameters;
    }
    if (other.isSetPrivileges()) {
      this.privileges = new PrincipalPrivilegeSet(other.privileges);
    }
  }

  public PartitionWithoutSD deepCopy() {
    return new PartitionWithoutSD(this);
  }

  @Override
  public void clear() {
    this.values = null;
    setCreateTimeIsSet(false);
    this.createTime = 0;
    setLastAccessTimeIsSet(false);
    this.lastAccessTime = 0;
    this.relativePath = null;
    this.parameters = null;
    this.privileges = null;
  }

  public int getValuesSize() {
    return (this.values == null) ? 0 : this.values.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<java.lang.String> getValuesIterator() {
    return (this.values == null) ? null : this.values.iterator();
  }

  public void addToValues(java.lang.String elem) {
    if (this.values == null) {
      this.values = new java.util.ArrayList<java.lang.String>();
    }
    this.values.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<java.lang.String> getValues() {
    return this.values;
  }

  public void setValues(@org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> values) {
    this.values = values;
  }

  public void unsetValues() {
    this.values = null;
  }

  /** Returns true if field values is set (has been assigned a value) and false otherwise */
  public boolean isSetValues() {
    return this.values != null;
  }

  public void setValuesIsSet(boolean value) {
    if (!value) {
      this.values = null;
    }
  }

  public int getCreateTime() {
    return this.createTime;
  }

  public void setCreateTime(int createTime) {
    this.createTime = createTime;
    setCreateTimeIsSet(true);
  }

  public void unsetCreateTime() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __CREATETIME_ISSET_ID);
  }

  /** Returns true if field createTime is set (has been assigned a value) and false otherwise */
  public boolean isSetCreateTime() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __CREATETIME_ISSET_ID);
  }

  public void setCreateTimeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __CREATETIME_ISSET_ID, value);
  }

  public int getLastAccessTime() {
    return this.lastAccessTime;
  }

  public void setLastAccessTime(int lastAccessTime) {
    this.lastAccessTime = lastAccessTime;
    setLastAccessTimeIsSet(true);
  }

  public void unsetLastAccessTime() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __LASTACCESSTIME_ISSET_ID);
  }

  /** Returns true if field lastAccessTime is set (has been assigned a value) and false otherwise */
  public boolean isSetLastAccessTime() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __LASTACCESSTIME_ISSET_ID);
  }

  public void setLastAccessTimeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __LASTACCESSTIME_ISSET_ID, value);
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getRelativePath() {
    return this.relativePath;
  }

  public void setRelativePath(@org.apache.thrift.annotation.Nullable java.lang.String relativePath) {
    this.relativePath = relativePath;
  }

  public void unsetRelativePath() {
    this.relativePath = null;
  }

  /** Returns true if field relativePath is set (has been assigned a value) and false otherwise */
  public boolean isSetRelativePath() {
    return this.relativePath != null;
  }

  public void setRelativePathIsSet(boolean value) {
    if (!value) {
      this.relativePath = null;
    }
  }

  public int getParametersSize() {
    return (this.parameters == null) ? 0 : this.parameters.size();
  }

  public void putToParameters(java.lang.String key, java.lang.String val) {
    if (this.parameters == null) {
      this.parameters = new java.util.HashMap<java.lang.String,java.lang.String>();
    }
    this.parameters.put(key, val);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Map<java.lang.String,java.lang.String> getParameters() {
    return this.parameters;
  }

  public void setParameters(@org.apache.thrift.annotation.Nullable java.util.Map<java.lang.String,java.lang.String> parameters) {
    this.parameters = parameters;
  }

  public void unsetParameters() {
    this.parameters = null;
  }

  /** Returns true if field parameters is set (has been assigned a value) and false otherwise */
  public boolean isSetParameters() {
    return this.parameters != null;
  }

  public void setParametersIsSet(boolean value) {
    if (!value) {
      this.parameters = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public PrincipalPrivilegeSet getPrivileges() {
    return this.privileges;
  }

  public void setPrivileges(@org.apache.thrift.annotation.Nullable PrincipalPrivilegeSet privileges) {
    this.privileges = privileges;
  }

  public void unsetPrivileges() {
    this.privileges = null;
  }

  /** Returns true if field privileges is set (has been assigned a value) and false otherwise */
  public boolean isSetPrivileges() {
    return this.privileges != null;
  }

  public void setPrivilegesIsSet(boolean value) {
    if (!value) {
      this.privileges = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case VALUES:
      if (value == null) {
        unsetValues();
      } else {
        setValues((java.util.List<java.lang.String>)value);
      }
      break;

    case CREATE_TIME:
      if (value == null) {
        unsetCreateTime();
      } else {
        setCreateTime((java.lang.Integer)value);
      }
      break;

    case LAST_ACCESS_TIME:
      if (value == null) {
        unsetLastAccessTime();
      } else {
        setLastAccessTime((java.lang.Integer)value);
      }
      break;

    case RELATIVE_PATH:
      if (value == null) {
        unsetRelativePath();
      } else {
        setRelativePath((java.lang.String)value);
      }
      break;

    case PARAMETERS:
      if (value == null) {
        unsetParameters();
      } else {
        setParameters((java.util.Map<java.lang.String,java.lang.String>)value);
      }
      break;

    case PRIVILEGES:
      if (value == null) {
        unsetPrivileges();
      } else {
        setPrivileges((PrincipalPrivilegeSet)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case VALUES:
      return getValues();

    case CREATE_TIME:
      return getCreateTime();

    case LAST_ACCESS_TIME:
      return getLastAccessTime();

    case RELATIVE_PATH:
      return getRelativePath();

    case PARAMETERS:
      return getParameters();

    case PRIVILEGES:
      return getPrivileges();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case VALUES:
      return isSetValues();
    case CREATE_TIME:
      return isSetCreateTime();
    case LAST_ACCESS_TIME:
      return isSetLastAccessTime();
    case RELATIVE_PATH:
      return isSetRelativePath();
    case PARAMETERS:
      return isSetParameters();
    case PRIVILEGES:
      return isSetPrivileges();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof PartitionWithoutSD)
      return this.equals((PartitionWithoutSD)that);
    return false;
  }

  public boolean equals(PartitionWithoutSD that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_values = true && this.isSetValues();
    boolean that_present_values = true && that.isSetValues();
    if (this_present_values || that_present_values) {
      if (!(this_present_values && that_present_values))
        return false;
      if (!this.values.equals(that.values))
        return false;
    }

    boolean this_present_createTime = true;
    boolean that_present_createTime = true;
    if (this_present_createTime || that_present_createTime) {
      if (!(this_present_createTime && that_present_createTime))
        return false;
      if (this.createTime != that.createTime)
        return false;
    }

    boolean this_present_lastAccessTime = true;
    boolean that_present_lastAccessTime = true;
    if (this_present_lastAccessTime || that_present_lastAccessTime) {
      if (!(this_present_lastAccessTime && that_present_lastAccessTime))
        return false;
      if (this.lastAccessTime != that.lastAccessTime)
        return false;
    }

    boolean this_present_relativePath = true && this.isSetRelativePath();
    boolean that_present_relativePath = true && that.isSetRelativePath();
    if (this_present_relativePath || that_present_relativePath) {
      if (!(this_present_relativePath && that_present_relativePath))
        return false;
      if (!this.relativePath.equals(that.relativePath))
        return false;
    }

    boolean this_present_parameters = true && this.isSetParameters();
    boolean that_present_parameters = true && that.isSetParameters();
    if (this_present_parameters || that_present_parameters) {
      if (!(this_present_parameters && that_present_parameters))
        return false;
      if (!this.parameters.equals(that.parameters))
        return false;
    }

    boolean this_present_privileges = true && this.isSetPrivileges();
    boolean that_present_privileges = true && that.isSetPrivileges();
    if (this_present_privileges || that_present_privileges) {
      if (!(this_present_privileges && that_present_privileges))
        return false;
      if (!this.privileges.equals(that.privileges))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetValues()) ? 131071 : 524287);
    if (isSetValues())
      hashCode = hashCode * 8191 + values.hashCode();

    hashCode = hashCode * 8191 + createTime;

    hashCode = hashCode * 8191 + lastAccessTime;

    hashCode = hashCode * 8191 + ((isSetRelativePath()) ? 131071 : 524287);
    if (isSetRelativePath())
      hashCode = hashCode * 8191 + relativePath.hashCode();

    hashCode = hashCode * 8191 + ((isSetParameters()) ? 131071 : 524287);
    if (isSetParameters())
      hashCode = hashCode * 8191 + parameters.hashCode();

    hashCode = hashCode * 8191 + ((isSetPrivileges()) ? 131071 : 524287);
    if (isSetPrivileges())
      hashCode = hashCode * 8191 + privileges.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(PartitionWithoutSD other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetValues()).compareTo(other.isSetValues());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetValues()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.values, other.values);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetCreateTime()).compareTo(other.isSetCreateTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCreateTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.createTime, other.createTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetLastAccessTime()).compareTo(other.isSetLastAccessTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLastAccessTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.lastAccessTime, other.lastAccessTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetRelativePath()).compareTo(other.isSetRelativePath());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRelativePath()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.relativePath, other.relativePath);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetParameters()).compareTo(other.isSetParameters());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetParameters()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.parameters, other.parameters);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetPrivileges()).compareTo(other.isSetPrivileges());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPrivileges()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.privileges, other.privileges);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("PartitionWithoutSD(");
    boolean first = true;

    sb.append("values:");
    if (this.values == null) {
      sb.append("null");
    } else {
      sb.append(this.values);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("createTime:");
    sb.append(this.createTime);
    first = false;
    if (!first) sb.append(", ");
    sb.append("lastAccessTime:");
    sb.append(this.lastAccessTime);
    first = false;
    if (!first) sb.append(", ");
    sb.append("relativePath:");
    if (this.relativePath == null) {
      sb.append("null");
    } else {
      sb.append(this.relativePath);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("parameters:");
    if (this.parameters == null) {
      sb.append("null");
    } else {
      sb.append(this.parameters);
    }
    first = false;
    if (isSetPrivileges()) {
      if (!first) sb.append(", ");
      sb.append("privileges:");
      if (this.privileges == null) {
        sb.append("null");
      } else {
        sb.append(this.privileges);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (privileges != null) {
      privileges.validate();
    }
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class PartitionWithoutSDStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public PartitionWithoutSDStandardScheme getScheme() {
      return new PartitionWithoutSDStandardScheme();
    }
  }

  private static class PartitionWithoutSDStandardScheme extends org.apache.thrift.scheme.StandardScheme<PartitionWithoutSD> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, PartitionWithoutSD struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // VALUES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list242 = iprot.readListBegin();
                struct.values = new java.util.ArrayList<java.lang.String>(_list242.size);
                @org.apache.thrift.annotation.Nullable java.lang.String _elem243;
                for (int _i244 = 0; _i244 < _list242.size; ++_i244)
                {
                  _elem243 = iprot.readString();
                  struct.values.add(_elem243);
                }
                iprot.readListEnd();
              }
              struct.setValuesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // CREATE_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.createTime = iprot.readI32();
              struct.setCreateTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // LAST_ACCESS_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.lastAccessTime = iprot.readI32();
              struct.setLastAccessTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // RELATIVE_PATH
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.relativePath = iprot.readString();
              struct.setRelativePathIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // PARAMETERS
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map245 = iprot.readMapBegin();
                struct.parameters = new java.util.HashMap<java.lang.String,java.lang.String>(2*_map245.size);
                @org.apache.thrift.annotation.Nullable java.lang.String _key246;
                @org.apache.thrift.annotation.Nullable java.lang.String _val247;
                for (int _i248 = 0; _i248 < _map245.size; ++_i248)
                {
                  _key246 = iprot.readString();
                  _val247 = iprot.readString();
                  struct.parameters.put(_key246, _val247);
                }
                iprot.readMapEnd();
              }
              struct.setParametersIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // PRIVILEGES
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.privileges = new PrincipalPrivilegeSet();
              struct.privileges.read(iprot);
              struct.setPrivilegesIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, PartitionWithoutSD struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.values != null) {
        oprot.writeFieldBegin(VALUES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.values.size()));
          for (java.lang.String _iter249 : struct.values)
          {
            oprot.writeString(_iter249);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(CREATE_TIME_FIELD_DESC);
      oprot.writeI32(struct.createTime);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(LAST_ACCESS_TIME_FIELD_DESC);
      oprot.writeI32(struct.lastAccessTime);
      oprot.writeFieldEnd();
      if (struct.relativePath != null) {
        oprot.writeFieldBegin(RELATIVE_PATH_FIELD_DESC);
        oprot.writeString(struct.relativePath);
        oprot.writeFieldEnd();
      }
      if (struct.parameters != null) {
        oprot.writeFieldBegin(PARAMETERS_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, struct.parameters.size()));
          for (java.util.Map.Entry<java.lang.String, java.lang.String> _iter250 : struct.parameters.entrySet())
          {
            oprot.writeString(_iter250.getKey());
            oprot.writeString(_iter250.getValue());
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.privileges != null) {
        if (struct.isSetPrivileges()) {
          oprot.writeFieldBegin(PRIVILEGES_FIELD_DESC);
          struct.privileges.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class PartitionWithoutSDTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public PartitionWithoutSDTupleScheme getScheme() {
      return new PartitionWithoutSDTupleScheme();
    }
  }

  private static class PartitionWithoutSDTupleScheme extends org.apache.thrift.scheme.TupleScheme<PartitionWithoutSD> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, PartitionWithoutSD struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetValues()) {
        optionals.set(0);
      }
      if (struct.isSetCreateTime()) {
        optionals.set(1);
      }
      if (struct.isSetLastAccessTime()) {
        optionals.set(2);
      }
      if (struct.isSetRelativePath()) {
        optionals.set(3);
      }
      if (struct.isSetParameters()) {
        optionals.set(4);
      }
      if (struct.isSetPrivileges()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetValues()) {
        {
          oprot.writeI32(struct.values.size());
          for (java.lang.String _iter251 : struct.values)
          {
            oprot.writeString(_iter251);
          }
        }
      }
      if (struct.isSetCreateTime()) {
        oprot.writeI32(struct.createTime);
      }
      if (struct.isSetLastAccessTime()) {
        oprot.writeI32(struct.lastAccessTime);
      }
      if (struct.isSetRelativePath()) {
        oprot.writeString(struct.relativePath);
      }
      if (struct.isSetParameters()) {
        {
          oprot.writeI32(struct.parameters.size());
          for (java.util.Map.Entry<java.lang.String, java.lang.String> _iter252 : struct.parameters.entrySet())
          {
            oprot.writeString(_iter252.getKey());
            oprot.writeString(_iter252.getValue());
          }
        }
      }
      if (struct.isSetPrivileges()) {
        struct.privileges.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, PartitionWithoutSD struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list253 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.values = new java.util.ArrayList<java.lang.String>(_list253.size);
          @org.apache.thrift.annotation.Nullable java.lang.String _elem254;
          for (int _i255 = 0; _i255 < _list253.size; ++_i255)
          {
            _elem254 = iprot.readString();
            struct.values.add(_elem254);
          }
        }
        struct.setValuesIsSet(true);
      }
      if (incoming.get(1)) {
        struct.createTime = iprot.readI32();
        struct.setCreateTimeIsSet(true);
      }
      if (incoming.get(2)) {
        struct.lastAccessTime = iprot.readI32();
        struct.setLastAccessTimeIsSet(true);
      }
      if (incoming.get(3)) {
        struct.relativePath = iprot.readString();
        struct.setRelativePathIsSet(true);
      }
      if (incoming.get(4)) {
        {
          org.apache.thrift.protocol.TMap _map256 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.parameters = new java.util.HashMap<java.lang.String,java.lang.String>(2*_map256.size);
          @org.apache.thrift.annotation.Nullable java.lang.String _key257;
          @org.apache.thrift.annotation.Nullable java.lang.String _val258;
          for (int _i259 = 0; _i259 < _map256.size; ++_i259)
          {
            _key257 = iprot.readString();
            _val258 = iprot.readString();
            struct.parameters.put(_key257, _val258);
          }
        }
        struct.setParametersIsSet(true);
      }
      if (incoming.get(5)) {
        struct.privileges = new PrincipalPrivilegeSet();
        struct.privileges.read(iprot);
        struct.setPrivilegesIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

