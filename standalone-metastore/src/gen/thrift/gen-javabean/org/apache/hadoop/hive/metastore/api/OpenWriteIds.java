/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hive.metastore.api;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)")
@org.apache.hadoop.classification.InterfaceAudience.Public @org.apache.hadoop.classification.InterfaceStability.Stable public class OpenWriteIds implements org.apache.thrift.TBase<OpenWriteIds, OpenWriteIds._Fields>, java.io.Serializable, Cloneable, Comparable<OpenWriteIds> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("OpenWriteIds");

  private static final org.apache.thrift.protocol.TField TABLE_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("tableName", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField WRITE_ID_HIGH_WATER_MARK_FIELD_DESC = new org.apache.thrift.protocol.TField("writeIdHighWaterMark", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField OPEN_WRITE_IDS_FIELD_DESC = new org.apache.thrift.protocol.TField("openWriteIds", org.apache.thrift.protocol.TType.LIST, (short)3);
  private static final org.apache.thrift.protocol.TField MIN_WRITE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("minWriteId", org.apache.thrift.protocol.TType.I64, (short)4);
  private static final org.apache.thrift.protocol.TField ABORTED_BITS_FIELD_DESC = new org.apache.thrift.protocol.TField("abortedBits", org.apache.thrift.protocol.TType.STRING, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new OpenWriteIdsStandardSchemeFactory());
    schemes.put(TupleScheme.class, new OpenWriteIdsTupleSchemeFactory());
  }

  private String tableName; // required
  private long writeIdHighWaterMark; // required
  private List<Long> openWriteIds; // required
  private long minWriteId; // optional
  private ByteBuffer abortedBits; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TABLE_NAME((short)1, "tableName"),
    WRITE_ID_HIGH_WATER_MARK((short)2, "writeIdHighWaterMark"),
    OPEN_WRITE_IDS((short)3, "openWriteIds"),
    MIN_WRITE_ID((short)4, "minWriteId"),
    ABORTED_BITS((short)5, "abortedBits");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // TABLE_NAME
          return TABLE_NAME;
        case 2: // WRITE_ID_HIGH_WATER_MARK
          return WRITE_ID_HIGH_WATER_MARK;
        case 3: // OPEN_WRITE_IDS
          return OPEN_WRITE_IDS;
        case 4: // MIN_WRITE_ID
          return MIN_WRITE_ID;
        case 5: // ABORTED_BITS
          return ABORTED_BITS;
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
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __WRITEIDHIGHWATERMARK_ISSET_ID = 0;
  private static final int __MINWRITEID_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.MIN_WRITE_ID};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TABLE_NAME, new org.apache.thrift.meta_data.FieldMetaData("tableName", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.WRITE_ID_HIGH_WATER_MARK, new org.apache.thrift.meta_data.FieldMetaData("writeIdHighWaterMark", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.OPEN_WRITE_IDS, new org.apache.thrift.meta_data.FieldMetaData("openWriteIds", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64))));
    tmpMap.put(_Fields.MIN_WRITE_ID, new org.apache.thrift.meta_data.FieldMetaData("minWriteId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.ABORTED_BITS, new org.apache.thrift.meta_data.FieldMetaData("abortedBits", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(OpenWriteIds.class, metaDataMap);
  }

  public OpenWriteIds() {
  }

  public OpenWriteIds(
    String tableName,
    long writeIdHighWaterMark,
    List<Long> openWriteIds,
    ByteBuffer abortedBits)
  {
    this();
    this.tableName = tableName;
    this.writeIdHighWaterMark = writeIdHighWaterMark;
    setWriteIdHighWaterMarkIsSet(true);
    this.openWriteIds = openWriteIds;
    this.abortedBits = org.apache.thrift.TBaseHelper.copyBinary(abortedBits);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public OpenWriteIds(OpenWriteIds other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetTableName()) {
      this.tableName = other.tableName;
    }
    this.writeIdHighWaterMark = other.writeIdHighWaterMark;
    if (other.isSetOpenWriteIds()) {
      List<Long> __this__openWriteIds = new ArrayList<Long>(other.openWriteIds);
      this.openWriteIds = __this__openWriteIds;
    }
    this.minWriteId = other.minWriteId;
    if (other.isSetAbortedBits()) {
      this.abortedBits = org.apache.thrift.TBaseHelper.copyBinary(other.abortedBits);
    }
  }

  public OpenWriteIds deepCopy() {
    return new OpenWriteIds(this);
  }

  @Override
  public void clear() {
    this.tableName = null;
    setWriteIdHighWaterMarkIsSet(false);
    this.writeIdHighWaterMark = 0;
    this.openWriteIds = null;
    setMinWriteIdIsSet(false);
    this.minWriteId = 0;
    this.abortedBits = null;
  }

  public String getTableName() {
    return this.tableName;
  }

  public void setTableName(String tableName) {
    this.tableName = tableName;
  }

  public void unsetTableName() {
    this.tableName = null;
  }

  /** Returns true if field tableName is set (has been assigned a value) and false otherwise */
  public boolean isSetTableName() {
    return this.tableName != null;
  }

  public void setTableNameIsSet(boolean value) {
    if (!value) {
      this.tableName = null;
    }
  }

  public long getWriteIdHighWaterMark() {
    return this.writeIdHighWaterMark;
  }

  public void setWriteIdHighWaterMark(long writeIdHighWaterMark) {
    this.writeIdHighWaterMark = writeIdHighWaterMark;
    setWriteIdHighWaterMarkIsSet(true);
  }

  public void unsetWriteIdHighWaterMark() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __WRITEIDHIGHWATERMARK_ISSET_ID);
  }

  /** Returns true if field writeIdHighWaterMark is set (has been assigned a value) and false otherwise */
  public boolean isSetWriteIdHighWaterMark() {
    return EncodingUtils.testBit(__isset_bitfield, __WRITEIDHIGHWATERMARK_ISSET_ID);
  }

  public void setWriteIdHighWaterMarkIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __WRITEIDHIGHWATERMARK_ISSET_ID, value);
  }

  public int getOpenWriteIdsSize() {
    return (this.openWriteIds == null) ? 0 : this.openWriteIds.size();
  }

  public java.util.Iterator<Long> getOpenWriteIdsIterator() {
    return (this.openWriteIds == null) ? null : this.openWriteIds.iterator();
  }

  public void addToOpenWriteIds(long elem) {
    if (this.openWriteIds == null) {
      this.openWriteIds = new ArrayList<Long>();
    }
    this.openWriteIds.add(elem);
  }

  public List<Long> getOpenWriteIds() {
    return this.openWriteIds;
  }

  public void setOpenWriteIds(List<Long> openWriteIds) {
    this.openWriteIds = openWriteIds;
  }

  public void unsetOpenWriteIds() {
    this.openWriteIds = null;
  }

  /** Returns true if field openWriteIds is set (has been assigned a value) and false otherwise */
  public boolean isSetOpenWriteIds() {
    return this.openWriteIds != null;
  }

  public void setOpenWriteIdsIsSet(boolean value) {
    if (!value) {
      this.openWriteIds = null;
    }
  }

  public long getMinWriteId() {
    return this.minWriteId;
  }

  public void setMinWriteId(long minWriteId) {
    this.minWriteId = minWriteId;
    setMinWriteIdIsSet(true);
  }

  public void unsetMinWriteId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __MINWRITEID_ISSET_ID);
  }

  /** Returns true if field minWriteId is set (has been assigned a value) and false otherwise */
  public boolean isSetMinWriteId() {
    return EncodingUtils.testBit(__isset_bitfield, __MINWRITEID_ISSET_ID);
  }

  public void setMinWriteIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __MINWRITEID_ISSET_ID, value);
  }

  public byte[] getAbortedBits() {
    setAbortedBits(org.apache.thrift.TBaseHelper.rightSize(abortedBits));
    return abortedBits == null ? null : abortedBits.array();
  }

  public ByteBuffer bufferForAbortedBits() {
    return org.apache.thrift.TBaseHelper.copyBinary(abortedBits);
  }

  public void setAbortedBits(byte[] abortedBits) {
    this.abortedBits = abortedBits == null ? (ByteBuffer)null : ByteBuffer.wrap(Arrays.copyOf(abortedBits, abortedBits.length));
  }

  public void setAbortedBits(ByteBuffer abortedBits) {
    this.abortedBits = org.apache.thrift.TBaseHelper.copyBinary(abortedBits);
  }

  public void unsetAbortedBits() {
    this.abortedBits = null;
  }

  /** Returns true if field abortedBits is set (has been assigned a value) and false otherwise */
  public boolean isSetAbortedBits() {
    return this.abortedBits != null;
  }

  public void setAbortedBitsIsSet(boolean value) {
    if (!value) {
      this.abortedBits = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TABLE_NAME:
      if (value == null) {
        unsetTableName();
      } else {
        setTableName((String)value);
      }
      break;

    case WRITE_ID_HIGH_WATER_MARK:
      if (value == null) {
        unsetWriteIdHighWaterMark();
      } else {
        setWriteIdHighWaterMark((Long)value);
      }
      break;

    case OPEN_WRITE_IDS:
      if (value == null) {
        unsetOpenWriteIds();
      } else {
        setOpenWriteIds((List<Long>)value);
      }
      break;

    case MIN_WRITE_ID:
      if (value == null) {
        unsetMinWriteId();
      } else {
        setMinWriteId((Long)value);
      }
      break;

    case ABORTED_BITS:
      if (value == null) {
        unsetAbortedBits();
      } else {
        setAbortedBits((ByteBuffer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TABLE_NAME:
      return getTableName();

    case WRITE_ID_HIGH_WATER_MARK:
      return getWriteIdHighWaterMark();

    case OPEN_WRITE_IDS:
      return getOpenWriteIds();

    case MIN_WRITE_ID:
      return getMinWriteId();

    case ABORTED_BITS:
      return getAbortedBits();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TABLE_NAME:
      return isSetTableName();
    case WRITE_ID_HIGH_WATER_MARK:
      return isSetWriteIdHighWaterMark();
    case OPEN_WRITE_IDS:
      return isSetOpenWriteIds();
    case MIN_WRITE_ID:
      return isSetMinWriteId();
    case ABORTED_BITS:
      return isSetAbortedBits();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof OpenWriteIds)
      return this.equals((OpenWriteIds)that);
    return false;
  }

  public boolean equals(OpenWriteIds that) {
    if (that == null)
      return false;

    boolean this_present_tableName = true && this.isSetTableName();
    boolean that_present_tableName = true && that.isSetTableName();
    if (this_present_tableName || that_present_tableName) {
      if (!(this_present_tableName && that_present_tableName))
        return false;
      if (!this.tableName.equals(that.tableName))
        return false;
    }

    boolean this_present_writeIdHighWaterMark = true;
    boolean that_present_writeIdHighWaterMark = true;
    if (this_present_writeIdHighWaterMark || that_present_writeIdHighWaterMark) {
      if (!(this_present_writeIdHighWaterMark && that_present_writeIdHighWaterMark))
        return false;
      if (this.writeIdHighWaterMark != that.writeIdHighWaterMark)
        return false;
    }

    boolean this_present_openWriteIds = true && this.isSetOpenWriteIds();
    boolean that_present_openWriteIds = true && that.isSetOpenWriteIds();
    if (this_present_openWriteIds || that_present_openWriteIds) {
      if (!(this_present_openWriteIds && that_present_openWriteIds))
        return false;
      if (!this.openWriteIds.equals(that.openWriteIds))
        return false;
    }

    boolean this_present_minWriteId = true && this.isSetMinWriteId();
    boolean that_present_minWriteId = true && that.isSetMinWriteId();
    if (this_present_minWriteId || that_present_minWriteId) {
      if (!(this_present_minWriteId && that_present_minWriteId))
        return false;
      if (this.minWriteId != that.minWriteId)
        return false;
    }

    boolean this_present_abortedBits = true && this.isSetAbortedBits();
    boolean that_present_abortedBits = true && that.isSetAbortedBits();
    if (this_present_abortedBits || that_present_abortedBits) {
      if (!(this_present_abortedBits && that_present_abortedBits))
        return false;
      if (!this.abortedBits.equals(that.abortedBits))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_tableName = true && (isSetTableName());
    list.add(present_tableName);
    if (present_tableName)
      list.add(tableName);

    boolean present_writeIdHighWaterMark = true;
    list.add(present_writeIdHighWaterMark);
    if (present_writeIdHighWaterMark)
      list.add(writeIdHighWaterMark);

    boolean present_openWriteIds = true && (isSetOpenWriteIds());
    list.add(present_openWriteIds);
    if (present_openWriteIds)
      list.add(openWriteIds);

    boolean present_minWriteId = true && (isSetMinWriteId());
    list.add(present_minWriteId);
    if (present_minWriteId)
      list.add(minWriteId);

    boolean present_abortedBits = true && (isSetAbortedBits());
    list.add(present_abortedBits);
    if (present_abortedBits)
      list.add(abortedBits);

    return list.hashCode();
  }

  @Override
  public int compareTo(OpenWriteIds other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetTableName()).compareTo(other.isSetTableName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTableName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tableName, other.tableName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetWriteIdHighWaterMark()).compareTo(other.isSetWriteIdHighWaterMark());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetWriteIdHighWaterMark()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.writeIdHighWaterMark, other.writeIdHighWaterMark);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetOpenWriteIds()).compareTo(other.isSetOpenWriteIds());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOpenWriteIds()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.openWriteIds, other.openWriteIds);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMinWriteId()).compareTo(other.isSetMinWriteId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMinWriteId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.minWriteId, other.minWriteId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAbortedBits()).compareTo(other.isSetAbortedBits());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAbortedBits()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.abortedBits, other.abortedBits);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("OpenWriteIds(");
    boolean first = true;

    sb.append("tableName:");
    if (this.tableName == null) {
      sb.append("null");
    } else {
      sb.append(this.tableName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("writeIdHighWaterMark:");
    sb.append(this.writeIdHighWaterMark);
    first = false;
    if (!first) sb.append(", ");
    sb.append("openWriteIds:");
    if (this.openWriteIds == null) {
      sb.append("null");
    } else {
      sb.append(this.openWriteIds);
    }
    first = false;
    if (isSetMinWriteId()) {
      if (!first) sb.append(", ");
      sb.append("minWriteId:");
      sb.append(this.minWriteId);
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("abortedBits:");
    if (this.abortedBits == null) {
      sb.append("null");
    } else {
      org.apache.thrift.TBaseHelper.toString(this.abortedBits, sb);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetTableName()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'tableName' is unset! Struct:" + toString());
    }

    if (!isSetWriteIdHighWaterMark()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'writeIdHighWaterMark' is unset! Struct:" + toString());
    }

    if (!isSetOpenWriteIds()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'openWriteIds' is unset! Struct:" + toString());
    }

    if (!isSetAbortedBits()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'abortedBits' is unset! Struct:" + toString());
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

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class OpenWriteIdsStandardSchemeFactory implements SchemeFactory {
    public OpenWriteIdsStandardScheme getScheme() {
      return new OpenWriteIdsStandardScheme();
    }
  }

  private static class OpenWriteIdsStandardScheme extends StandardScheme<OpenWriteIds> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, OpenWriteIds struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TABLE_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.tableName = iprot.readString();
              struct.setTableNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // WRITE_ID_HIGH_WATER_MARK
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.writeIdHighWaterMark = iprot.readI64();
              struct.setWriteIdHighWaterMarkIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // OPEN_WRITE_IDS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list564 = iprot.readListBegin();
                struct.openWriteIds = new ArrayList<Long>(_list564.size);
                long _elem565;
                for (int _i566 = 0; _i566 < _list564.size; ++_i566)
                {
                  _elem565 = iprot.readI64();
                  struct.openWriteIds.add(_elem565);
                }
                iprot.readListEnd();
              }
              struct.setOpenWriteIdsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // MIN_WRITE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.minWriteId = iprot.readI64();
              struct.setMinWriteIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // ABORTED_BITS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.abortedBits = iprot.readBinary();
              struct.setAbortedBitsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, OpenWriteIds struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.tableName != null) {
        oprot.writeFieldBegin(TABLE_NAME_FIELD_DESC);
        oprot.writeString(struct.tableName);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(WRITE_ID_HIGH_WATER_MARK_FIELD_DESC);
      oprot.writeI64(struct.writeIdHighWaterMark);
      oprot.writeFieldEnd();
      if (struct.openWriteIds != null) {
        oprot.writeFieldBegin(OPEN_WRITE_IDS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I64, struct.openWriteIds.size()));
          for (long _iter567 : struct.openWriteIds)
          {
            oprot.writeI64(_iter567);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.isSetMinWriteId()) {
        oprot.writeFieldBegin(MIN_WRITE_ID_FIELD_DESC);
        oprot.writeI64(struct.minWriteId);
        oprot.writeFieldEnd();
      }
      if (struct.abortedBits != null) {
        oprot.writeFieldBegin(ABORTED_BITS_FIELD_DESC);
        oprot.writeBinary(struct.abortedBits);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class OpenWriteIdsTupleSchemeFactory implements SchemeFactory {
    public OpenWriteIdsTupleScheme getScheme() {
      return new OpenWriteIdsTupleScheme();
    }
  }

  private static class OpenWriteIdsTupleScheme extends TupleScheme<OpenWriteIds> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, OpenWriteIds struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.tableName);
      oprot.writeI64(struct.writeIdHighWaterMark);
      {
        oprot.writeI32(struct.openWriteIds.size());
        for (long _iter568 : struct.openWriteIds)
        {
          oprot.writeI64(_iter568);
        }
      }
      oprot.writeBinary(struct.abortedBits);
      BitSet optionals = new BitSet();
      if (struct.isSetMinWriteId()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetMinWriteId()) {
        oprot.writeI64(struct.minWriteId);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, OpenWriteIds struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.tableName = iprot.readString();
      struct.setTableNameIsSet(true);
      struct.writeIdHighWaterMark = iprot.readI64();
      struct.setWriteIdHighWaterMarkIsSet(true);
      {
        org.apache.thrift.protocol.TList _list569 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I64, iprot.readI32());
        struct.openWriteIds = new ArrayList<Long>(_list569.size);
        long _elem570;
        for (int _i571 = 0; _i571 < _list569.size; ++_i571)
        {
          _elem570 = iprot.readI64();
          struct.openWriteIds.add(_elem570);
        }
      }
      struct.setOpenWriteIdsIsSet(true);
      struct.abortedBits = iprot.readBinary();
      struct.setAbortedBitsIsSet(true);
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.minWriteId = iprot.readI64();
        struct.setMinWriteIdIsSet(true);
      }
    }
  }

}

