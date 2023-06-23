/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hive.metastore.api;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.13.0)")
@org.apache.hadoop.classification.InterfaceAudience.Public @org.apache.hadoop.classification.InterfaceStability.Stable public class WMCreateOrDropTriggerToPoolMappingRequest implements org.apache.thrift.TBase<WMCreateOrDropTriggerToPoolMappingRequest, WMCreateOrDropTriggerToPoolMappingRequest._Fields>, java.io.Serializable, Cloneable, Comparable<WMCreateOrDropTriggerToPoolMappingRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("WMCreateOrDropTriggerToPoolMappingRequest");

  private static final org.apache.thrift.protocol.TField RESOURCE_PLAN_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("resourcePlanName", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField TRIGGER_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("triggerName", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField POOL_PATH_FIELD_DESC = new org.apache.thrift.protocol.TField("poolPath", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField DROP_FIELD_DESC = new org.apache.thrift.protocol.TField("drop", org.apache.thrift.protocol.TType.BOOL, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new WMCreateOrDropTriggerToPoolMappingRequestStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new WMCreateOrDropTriggerToPoolMappingRequestTupleSchemeFactory();

  private @org.apache.thrift.annotation.Nullable java.lang.String resourcePlanName; // optional
  private @org.apache.thrift.annotation.Nullable java.lang.String triggerName; // optional
  private @org.apache.thrift.annotation.Nullable java.lang.String poolPath; // optional
  private boolean drop; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    RESOURCE_PLAN_NAME((short)1, "resourcePlanName"),
    TRIGGER_NAME((short)2, "triggerName"),
    POOL_PATH((short)3, "poolPath"),
    DROP((short)4, "drop");

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
        case 1: // RESOURCE_PLAN_NAME
          return RESOURCE_PLAN_NAME;
        case 2: // TRIGGER_NAME
          return TRIGGER_NAME;
        case 3: // POOL_PATH
          return POOL_PATH;
        case 4: // DROP
          return DROP;
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
  private static final int __DROP_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.RESOURCE_PLAN_NAME,_Fields.TRIGGER_NAME,_Fields.POOL_PATH,_Fields.DROP};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.RESOURCE_PLAN_NAME, new org.apache.thrift.meta_data.FieldMetaData("resourcePlanName", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TRIGGER_NAME, new org.apache.thrift.meta_data.FieldMetaData("triggerName", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.POOL_PATH, new org.apache.thrift.meta_data.FieldMetaData("poolPath", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.DROP, new org.apache.thrift.meta_data.FieldMetaData("drop", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(WMCreateOrDropTriggerToPoolMappingRequest.class, metaDataMap);
  }

  public WMCreateOrDropTriggerToPoolMappingRequest() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public WMCreateOrDropTriggerToPoolMappingRequest(WMCreateOrDropTriggerToPoolMappingRequest other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetResourcePlanName()) {
      this.resourcePlanName = other.resourcePlanName;
    }
    if (other.isSetTriggerName()) {
      this.triggerName = other.triggerName;
    }
    if (other.isSetPoolPath()) {
      this.poolPath = other.poolPath;
    }
    this.drop = other.drop;
  }

  public WMCreateOrDropTriggerToPoolMappingRequest deepCopy() {
    return new WMCreateOrDropTriggerToPoolMappingRequest(this);
  }

  @Override
  public void clear() {
    this.resourcePlanName = null;
    this.triggerName = null;
    this.poolPath = null;
    setDropIsSet(false);
    this.drop = false;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getResourcePlanName() {
    return this.resourcePlanName;
  }

  public void setResourcePlanName(@org.apache.thrift.annotation.Nullable java.lang.String resourcePlanName) {
    this.resourcePlanName = resourcePlanName;
  }

  public void unsetResourcePlanName() {
    this.resourcePlanName = null;
  }

  /** Returns true if field resourcePlanName is set (has been assigned a value) and false otherwise */
  public boolean isSetResourcePlanName() {
    return this.resourcePlanName != null;
  }

  public void setResourcePlanNameIsSet(boolean value) {
    if (!value) {
      this.resourcePlanName = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getTriggerName() {
    return this.triggerName;
  }

  public void setTriggerName(@org.apache.thrift.annotation.Nullable java.lang.String triggerName) {
    this.triggerName = triggerName;
  }

  public void unsetTriggerName() {
    this.triggerName = null;
  }

  /** Returns true if field triggerName is set (has been assigned a value) and false otherwise */
  public boolean isSetTriggerName() {
    return this.triggerName != null;
  }

  public void setTriggerNameIsSet(boolean value) {
    if (!value) {
      this.triggerName = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getPoolPath() {
    return this.poolPath;
  }

  public void setPoolPath(@org.apache.thrift.annotation.Nullable java.lang.String poolPath) {
    this.poolPath = poolPath;
  }

  public void unsetPoolPath() {
    this.poolPath = null;
  }

  /** Returns true if field poolPath is set (has been assigned a value) and false otherwise */
  public boolean isSetPoolPath() {
    return this.poolPath != null;
  }

  public void setPoolPathIsSet(boolean value) {
    if (!value) {
      this.poolPath = null;
    }
  }

  public boolean isDrop() {
    return this.drop;
  }

  public void setDrop(boolean drop) {
    this.drop = drop;
    setDropIsSet(true);
  }

  public void unsetDrop() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __DROP_ISSET_ID);
  }

  /** Returns true if field drop is set (has been assigned a value) and false otherwise */
  public boolean isSetDrop() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __DROP_ISSET_ID);
  }

  public void setDropIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __DROP_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case RESOURCE_PLAN_NAME:
      if (value == null) {
        unsetResourcePlanName();
      } else {
        setResourcePlanName((java.lang.String)value);
      }
      break;

    case TRIGGER_NAME:
      if (value == null) {
        unsetTriggerName();
      } else {
        setTriggerName((java.lang.String)value);
      }
      break;

    case POOL_PATH:
      if (value == null) {
        unsetPoolPath();
      } else {
        setPoolPath((java.lang.String)value);
      }
      break;

    case DROP:
      if (value == null) {
        unsetDrop();
      } else {
        setDrop((java.lang.Boolean)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case RESOURCE_PLAN_NAME:
      return getResourcePlanName();

    case TRIGGER_NAME:
      return getTriggerName();

    case POOL_PATH:
      return getPoolPath();

    case DROP:
      return isDrop();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case RESOURCE_PLAN_NAME:
      return isSetResourcePlanName();
    case TRIGGER_NAME:
      return isSetTriggerName();
    case POOL_PATH:
      return isSetPoolPath();
    case DROP:
      return isSetDrop();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof WMCreateOrDropTriggerToPoolMappingRequest)
      return this.equals((WMCreateOrDropTriggerToPoolMappingRequest)that);
    return false;
  }

  public boolean equals(WMCreateOrDropTriggerToPoolMappingRequest that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_resourcePlanName = true && this.isSetResourcePlanName();
    boolean that_present_resourcePlanName = true && that.isSetResourcePlanName();
    if (this_present_resourcePlanName || that_present_resourcePlanName) {
      if (!(this_present_resourcePlanName && that_present_resourcePlanName))
        return false;
      if (!this.resourcePlanName.equals(that.resourcePlanName))
        return false;
    }

    boolean this_present_triggerName = true && this.isSetTriggerName();
    boolean that_present_triggerName = true && that.isSetTriggerName();
    if (this_present_triggerName || that_present_triggerName) {
      if (!(this_present_triggerName && that_present_triggerName))
        return false;
      if (!this.triggerName.equals(that.triggerName))
        return false;
    }

    boolean this_present_poolPath = true && this.isSetPoolPath();
    boolean that_present_poolPath = true && that.isSetPoolPath();
    if (this_present_poolPath || that_present_poolPath) {
      if (!(this_present_poolPath && that_present_poolPath))
        return false;
      if (!this.poolPath.equals(that.poolPath))
        return false;
    }

    boolean this_present_drop = true && this.isSetDrop();
    boolean that_present_drop = true && that.isSetDrop();
    if (this_present_drop || that_present_drop) {
      if (!(this_present_drop && that_present_drop))
        return false;
      if (this.drop != that.drop)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetResourcePlanName()) ? 131071 : 524287);
    if (isSetResourcePlanName())
      hashCode = hashCode * 8191 + resourcePlanName.hashCode();

    hashCode = hashCode * 8191 + ((isSetTriggerName()) ? 131071 : 524287);
    if (isSetTriggerName())
      hashCode = hashCode * 8191 + triggerName.hashCode();

    hashCode = hashCode * 8191 + ((isSetPoolPath()) ? 131071 : 524287);
    if (isSetPoolPath())
      hashCode = hashCode * 8191 + poolPath.hashCode();

    hashCode = hashCode * 8191 + ((isSetDrop()) ? 131071 : 524287);
    if (isSetDrop())
      hashCode = hashCode * 8191 + ((drop) ? 131071 : 524287);

    return hashCode;
  }

  @Override
  public int compareTo(WMCreateOrDropTriggerToPoolMappingRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetResourcePlanName()).compareTo(other.isSetResourcePlanName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetResourcePlanName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.resourcePlanName, other.resourcePlanName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetTriggerName()).compareTo(other.isSetTriggerName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTriggerName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.triggerName, other.triggerName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetPoolPath()).compareTo(other.isSetPoolPath());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPoolPath()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.poolPath, other.poolPath);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetDrop()).compareTo(other.isSetDrop());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDrop()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.drop, other.drop);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("WMCreateOrDropTriggerToPoolMappingRequest(");
    boolean first = true;

    if (isSetResourcePlanName()) {
      sb.append("resourcePlanName:");
      if (this.resourcePlanName == null) {
        sb.append("null");
      } else {
        sb.append(this.resourcePlanName);
      }
      first = false;
    }
    if (isSetTriggerName()) {
      if (!first) sb.append(", ");
      sb.append("triggerName:");
      if (this.triggerName == null) {
        sb.append("null");
      } else {
        sb.append(this.triggerName);
      }
      first = false;
    }
    if (isSetPoolPath()) {
      if (!first) sb.append(", ");
      sb.append("poolPath:");
      if (this.poolPath == null) {
        sb.append("null");
      } else {
        sb.append(this.poolPath);
      }
      first = false;
    }
    if (isSetDrop()) {
      if (!first) sb.append(", ");
      sb.append("drop:");
      sb.append(this.drop);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class WMCreateOrDropTriggerToPoolMappingRequestStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public WMCreateOrDropTriggerToPoolMappingRequestStandardScheme getScheme() {
      return new WMCreateOrDropTriggerToPoolMappingRequestStandardScheme();
    }
  }

  private static class WMCreateOrDropTriggerToPoolMappingRequestStandardScheme extends org.apache.thrift.scheme.StandardScheme<WMCreateOrDropTriggerToPoolMappingRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, WMCreateOrDropTriggerToPoolMappingRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // RESOURCE_PLAN_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.resourcePlanName = iprot.readString();
              struct.setResourcePlanNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TRIGGER_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.triggerName = iprot.readString();
              struct.setTriggerNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // POOL_PATH
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.poolPath = iprot.readString();
              struct.setPoolPathIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // DROP
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.drop = iprot.readBool();
              struct.setDropIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, WMCreateOrDropTriggerToPoolMappingRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.resourcePlanName != null) {
        if (struct.isSetResourcePlanName()) {
          oprot.writeFieldBegin(RESOURCE_PLAN_NAME_FIELD_DESC);
          oprot.writeString(struct.resourcePlanName);
          oprot.writeFieldEnd();
        }
      }
      if (struct.triggerName != null) {
        if (struct.isSetTriggerName()) {
          oprot.writeFieldBegin(TRIGGER_NAME_FIELD_DESC);
          oprot.writeString(struct.triggerName);
          oprot.writeFieldEnd();
        }
      }
      if (struct.poolPath != null) {
        if (struct.isSetPoolPath()) {
          oprot.writeFieldBegin(POOL_PATH_FIELD_DESC);
          oprot.writeString(struct.poolPath);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetDrop()) {
        oprot.writeFieldBegin(DROP_FIELD_DESC);
        oprot.writeBool(struct.drop);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class WMCreateOrDropTriggerToPoolMappingRequestTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public WMCreateOrDropTriggerToPoolMappingRequestTupleScheme getScheme() {
      return new WMCreateOrDropTriggerToPoolMappingRequestTupleScheme();
    }
  }

  private static class WMCreateOrDropTriggerToPoolMappingRequestTupleScheme extends org.apache.thrift.scheme.TupleScheme<WMCreateOrDropTriggerToPoolMappingRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, WMCreateOrDropTriggerToPoolMappingRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetResourcePlanName()) {
        optionals.set(0);
      }
      if (struct.isSetTriggerName()) {
        optionals.set(1);
      }
      if (struct.isSetPoolPath()) {
        optionals.set(2);
      }
      if (struct.isSetDrop()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetResourcePlanName()) {
        oprot.writeString(struct.resourcePlanName);
      }
      if (struct.isSetTriggerName()) {
        oprot.writeString(struct.triggerName);
      }
      if (struct.isSetPoolPath()) {
        oprot.writeString(struct.poolPath);
      }
      if (struct.isSetDrop()) {
        oprot.writeBool(struct.drop);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, WMCreateOrDropTriggerToPoolMappingRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.resourcePlanName = iprot.readString();
        struct.setResourcePlanNameIsSet(true);
      }
      if (incoming.get(1)) {
        struct.triggerName = iprot.readString();
        struct.setTriggerNameIsSet(true);
      }
      if (incoming.get(2)) {
        struct.poolPath = iprot.readString();
        struct.setPoolPathIsSet(true);
      }
      if (incoming.get(3)) {
        struct.drop = iprot.readBool();
        struct.setDropIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

