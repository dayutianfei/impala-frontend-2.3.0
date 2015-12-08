/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.cloudera.impala.thrift;

import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TShowStatsParams implements org.apache.thrift.TBase<TShowStatsParams, TShowStatsParams._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TShowStatsParams");

  private static final org.apache.thrift.protocol.TField IS_SHOW_COL_STATS_FIELD_DESC = new org.apache.thrift.protocol.TField("is_show_col_stats", org.apache.thrift.protocol.TType.BOOL, (short)1);
  private static final org.apache.thrift.protocol.TField TABLE_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("table_name", org.apache.thrift.protocol.TType.STRUCT, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TShowStatsParamsStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TShowStatsParamsTupleSchemeFactory());
  }

  public boolean is_show_col_stats; // required
  public com.cloudera.impala.thrift.TTableName table_name; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    IS_SHOW_COL_STATS((short)1, "is_show_col_stats"),
    TABLE_NAME((short)2, "table_name");

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
        case 1: // IS_SHOW_COL_STATS
          return IS_SHOW_COL_STATS;
        case 2: // TABLE_NAME
          return TABLE_NAME;
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
  private static final int __IS_SHOW_COL_STATS_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.IS_SHOW_COL_STATS, new org.apache.thrift.meta_data.FieldMetaData("is_show_col_stats", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.TABLE_NAME, new org.apache.thrift.meta_data.FieldMetaData("table_name", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.cloudera.impala.thrift.TTableName.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TShowStatsParams.class, metaDataMap);
  }

  public TShowStatsParams() {
  }

  public TShowStatsParams(
    boolean is_show_col_stats,
    com.cloudera.impala.thrift.TTableName table_name)
  {
    this();
    this.is_show_col_stats = is_show_col_stats;
    setIs_show_col_statsIsSet(true);
    this.table_name = table_name;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TShowStatsParams(TShowStatsParams other) {
    __isset_bitfield = other.__isset_bitfield;
    this.is_show_col_stats = other.is_show_col_stats;
    if (other.isSetTable_name()) {
      this.table_name = new com.cloudera.impala.thrift.TTableName(other.table_name);
    }
  }

  public TShowStatsParams deepCopy() {
    return new TShowStatsParams(this);
  }

  @Override
  public void clear() {
    setIs_show_col_statsIsSet(false);
    this.is_show_col_stats = false;
    this.table_name = null;
  }

  public boolean isIs_show_col_stats() {
    return this.is_show_col_stats;
  }

  public TShowStatsParams setIs_show_col_stats(boolean is_show_col_stats) {
    this.is_show_col_stats = is_show_col_stats;
    setIs_show_col_statsIsSet(true);
    return this;
  }

  public void unsetIs_show_col_stats() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __IS_SHOW_COL_STATS_ISSET_ID);
  }

  /** Returns true if field is_show_col_stats is set (has been assigned a value) and false otherwise */
  public boolean isSetIs_show_col_stats() {
    return EncodingUtils.testBit(__isset_bitfield, __IS_SHOW_COL_STATS_ISSET_ID);
  }

  public void setIs_show_col_statsIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __IS_SHOW_COL_STATS_ISSET_ID, value);
  }

  public com.cloudera.impala.thrift.TTableName getTable_name() {
    return this.table_name;
  }

  public TShowStatsParams setTable_name(com.cloudera.impala.thrift.TTableName table_name) {
    this.table_name = table_name;
    return this;
  }

  public void unsetTable_name() {
    this.table_name = null;
  }

  /** Returns true if field table_name is set (has been assigned a value) and false otherwise */
  public boolean isSetTable_name() {
    return this.table_name != null;
  }

  public void setTable_nameIsSet(boolean value) {
    if (!value) {
      this.table_name = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case IS_SHOW_COL_STATS:
      if (value == null) {
        unsetIs_show_col_stats();
      } else {
        setIs_show_col_stats((Boolean)value);
      }
      break;

    case TABLE_NAME:
      if (value == null) {
        unsetTable_name();
      } else {
        setTable_name((com.cloudera.impala.thrift.TTableName)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case IS_SHOW_COL_STATS:
      return Boolean.valueOf(isIs_show_col_stats());

    case TABLE_NAME:
      return getTable_name();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case IS_SHOW_COL_STATS:
      return isSetIs_show_col_stats();
    case TABLE_NAME:
      return isSetTable_name();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TShowStatsParams)
      return this.equals((TShowStatsParams)that);
    return false;
  }

  public boolean equals(TShowStatsParams that) {
    if (that == null)
      return false;

    boolean this_present_is_show_col_stats = true;
    boolean that_present_is_show_col_stats = true;
    if (this_present_is_show_col_stats || that_present_is_show_col_stats) {
      if (!(this_present_is_show_col_stats && that_present_is_show_col_stats))
        return false;
      if (this.is_show_col_stats != that.is_show_col_stats)
        return false;
    }

    boolean this_present_table_name = true && this.isSetTable_name();
    boolean that_present_table_name = true && that.isSetTable_name();
    if (this_present_table_name || that_present_table_name) {
      if (!(this_present_table_name && that_present_table_name))
        return false;
      if (!this.table_name.equals(that.table_name))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_is_show_col_stats = true;
    builder.append(present_is_show_col_stats);
    if (present_is_show_col_stats)
      builder.append(is_show_col_stats);

    boolean present_table_name = true && (isSetTable_name());
    builder.append(present_table_name);
    if (present_table_name)
      builder.append(table_name);

    return builder.toHashCode();
  }

  public int compareTo(TShowStatsParams other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    TShowStatsParams typedOther = (TShowStatsParams)other;

    lastComparison = Boolean.valueOf(isSetIs_show_col_stats()).compareTo(typedOther.isSetIs_show_col_stats());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIs_show_col_stats()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.is_show_col_stats, typedOther.is_show_col_stats);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTable_name()).compareTo(typedOther.isSetTable_name());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTable_name()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.table_name, typedOther.table_name);
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
    StringBuilder sb = new StringBuilder("TShowStatsParams(");
    boolean first = true;

    sb.append("is_show_col_stats:");
    sb.append(this.is_show_col_stats);
    first = false;
    if (!first) sb.append(", ");
    sb.append("table_name:");
    if (this.table_name == null) {
      sb.append("null");
    } else {
      sb.append(this.table_name);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'is_show_col_stats' because it's a primitive and you chose the non-beans generator.
    // check for sub-struct validity
    if (table_name != null) {
      table_name.validate();
    }
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

  private static class TShowStatsParamsStandardSchemeFactory implements SchemeFactory {
    public TShowStatsParamsStandardScheme getScheme() {
      return new TShowStatsParamsStandardScheme();
    }
  }

  private static class TShowStatsParamsStandardScheme extends StandardScheme<TShowStatsParams> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TShowStatsParams struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // IS_SHOW_COL_STATS
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.is_show_col_stats = iprot.readBool();
              struct.setIs_show_col_statsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TABLE_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.table_name = new com.cloudera.impala.thrift.TTableName();
              struct.table_name.read(iprot);
              struct.setTable_nameIsSet(true);
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

      // check for required fields of primitive type, which can't be checked in the validate method
      if (!struct.isSetIs_show_col_stats()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'is_show_col_stats' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TShowStatsParams struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(IS_SHOW_COL_STATS_FIELD_DESC);
      oprot.writeBool(struct.is_show_col_stats);
      oprot.writeFieldEnd();
      if (struct.table_name != null) {
        oprot.writeFieldBegin(TABLE_NAME_FIELD_DESC);
        struct.table_name.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TShowStatsParamsTupleSchemeFactory implements SchemeFactory {
    public TShowStatsParamsTupleScheme getScheme() {
      return new TShowStatsParamsTupleScheme();
    }
  }

  private static class TShowStatsParamsTupleScheme extends TupleScheme<TShowStatsParams> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TShowStatsParams struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeBool(struct.is_show_col_stats);
      BitSet optionals = new BitSet();
      if (struct.isSetTable_name()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetTable_name()) {
        struct.table_name.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TShowStatsParams struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.is_show_col_stats = iprot.readBool();
      struct.setIs_show_col_statsIsSet(true);
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.table_name = new com.cloudera.impala.thrift.TTableName();
        struct.table_name.read(iprot);
        struct.setTable_nameIsSet(true);
      }
    }
  }

}
