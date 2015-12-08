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

public class TGrantRevokeRoleParams implements org.apache.thrift.TBase<TGrantRevokeRoleParams, TGrantRevokeRoleParams._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TGrantRevokeRoleParams");

  private static final org.apache.thrift.protocol.TField ROLE_NAMES_FIELD_DESC = new org.apache.thrift.protocol.TField("role_names", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField GROUP_NAMES_FIELD_DESC = new org.apache.thrift.protocol.TField("group_names", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField IS_GRANT_FIELD_DESC = new org.apache.thrift.protocol.TField("is_grant", org.apache.thrift.protocol.TType.BOOL, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TGrantRevokeRoleParamsStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TGrantRevokeRoleParamsTupleSchemeFactory());
  }

  public List<String> role_names; // required
  public List<String> group_names; // required
  public boolean is_grant; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ROLE_NAMES((short)1, "role_names"),
    GROUP_NAMES((short)2, "group_names"),
    IS_GRANT((short)3, "is_grant");

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
        case 1: // ROLE_NAMES
          return ROLE_NAMES;
        case 2: // GROUP_NAMES
          return GROUP_NAMES;
        case 3: // IS_GRANT
          return IS_GRANT;
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
  private static final int __IS_GRANT_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ROLE_NAMES, new org.apache.thrift.meta_data.FieldMetaData("role_names", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.GROUP_NAMES, new org.apache.thrift.meta_data.FieldMetaData("group_names", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.IS_GRANT, new org.apache.thrift.meta_data.FieldMetaData("is_grant", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TGrantRevokeRoleParams.class, metaDataMap);
  }

  public TGrantRevokeRoleParams() {
  }

  public TGrantRevokeRoleParams(
    List<String> role_names,
    List<String> group_names,
    boolean is_grant)
  {
    this();
    this.role_names = role_names;
    this.group_names = group_names;
    this.is_grant = is_grant;
    setIs_grantIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TGrantRevokeRoleParams(TGrantRevokeRoleParams other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetRole_names()) {
      List<String> __this__role_names = new ArrayList<String>();
      for (String other_element : other.role_names) {
        __this__role_names.add(other_element);
      }
      this.role_names = __this__role_names;
    }
    if (other.isSetGroup_names()) {
      List<String> __this__group_names = new ArrayList<String>();
      for (String other_element : other.group_names) {
        __this__group_names.add(other_element);
      }
      this.group_names = __this__group_names;
    }
    this.is_grant = other.is_grant;
  }

  public TGrantRevokeRoleParams deepCopy() {
    return new TGrantRevokeRoleParams(this);
  }

  @Override
  public void clear() {
    this.role_names = null;
    this.group_names = null;
    setIs_grantIsSet(false);
    this.is_grant = false;
  }

  public int getRole_namesSize() {
    return (this.role_names == null) ? 0 : this.role_names.size();
  }

  public java.util.Iterator<String> getRole_namesIterator() {
    return (this.role_names == null) ? null : this.role_names.iterator();
  }

  public void addToRole_names(String elem) {
    if (this.role_names == null) {
      this.role_names = new ArrayList<String>();
    }
    this.role_names.add(elem);
  }

  public List<String> getRole_names() {
    return this.role_names;
  }

  public TGrantRevokeRoleParams setRole_names(List<String> role_names) {
    this.role_names = role_names;
    return this;
  }

  public void unsetRole_names() {
    this.role_names = null;
  }

  /** Returns true if field role_names is set (has been assigned a value) and false otherwise */
  public boolean isSetRole_names() {
    return this.role_names != null;
  }

  public void setRole_namesIsSet(boolean value) {
    if (!value) {
      this.role_names = null;
    }
  }

  public int getGroup_namesSize() {
    return (this.group_names == null) ? 0 : this.group_names.size();
  }

  public java.util.Iterator<String> getGroup_namesIterator() {
    return (this.group_names == null) ? null : this.group_names.iterator();
  }

  public void addToGroup_names(String elem) {
    if (this.group_names == null) {
      this.group_names = new ArrayList<String>();
    }
    this.group_names.add(elem);
  }

  public List<String> getGroup_names() {
    return this.group_names;
  }

  public TGrantRevokeRoleParams setGroup_names(List<String> group_names) {
    this.group_names = group_names;
    return this;
  }

  public void unsetGroup_names() {
    this.group_names = null;
  }

  /** Returns true if field group_names is set (has been assigned a value) and false otherwise */
  public boolean isSetGroup_names() {
    return this.group_names != null;
  }

  public void setGroup_namesIsSet(boolean value) {
    if (!value) {
      this.group_names = null;
    }
  }

  public boolean isIs_grant() {
    return this.is_grant;
  }

  public TGrantRevokeRoleParams setIs_grant(boolean is_grant) {
    this.is_grant = is_grant;
    setIs_grantIsSet(true);
    return this;
  }

  public void unsetIs_grant() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __IS_GRANT_ISSET_ID);
  }

  /** Returns true if field is_grant is set (has been assigned a value) and false otherwise */
  public boolean isSetIs_grant() {
    return EncodingUtils.testBit(__isset_bitfield, __IS_GRANT_ISSET_ID);
  }

  public void setIs_grantIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __IS_GRANT_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ROLE_NAMES:
      if (value == null) {
        unsetRole_names();
      } else {
        setRole_names((List<String>)value);
      }
      break;

    case GROUP_NAMES:
      if (value == null) {
        unsetGroup_names();
      } else {
        setGroup_names((List<String>)value);
      }
      break;

    case IS_GRANT:
      if (value == null) {
        unsetIs_grant();
      } else {
        setIs_grant((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ROLE_NAMES:
      return getRole_names();

    case GROUP_NAMES:
      return getGroup_names();

    case IS_GRANT:
      return Boolean.valueOf(isIs_grant());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ROLE_NAMES:
      return isSetRole_names();
    case GROUP_NAMES:
      return isSetGroup_names();
    case IS_GRANT:
      return isSetIs_grant();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TGrantRevokeRoleParams)
      return this.equals((TGrantRevokeRoleParams)that);
    return false;
  }

  public boolean equals(TGrantRevokeRoleParams that) {
    if (that == null)
      return false;

    boolean this_present_role_names = true && this.isSetRole_names();
    boolean that_present_role_names = true && that.isSetRole_names();
    if (this_present_role_names || that_present_role_names) {
      if (!(this_present_role_names && that_present_role_names))
        return false;
      if (!this.role_names.equals(that.role_names))
        return false;
    }

    boolean this_present_group_names = true && this.isSetGroup_names();
    boolean that_present_group_names = true && that.isSetGroup_names();
    if (this_present_group_names || that_present_group_names) {
      if (!(this_present_group_names && that_present_group_names))
        return false;
      if (!this.group_names.equals(that.group_names))
        return false;
    }

    boolean this_present_is_grant = true;
    boolean that_present_is_grant = true;
    if (this_present_is_grant || that_present_is_grant) {
      if (!(this_present_is_grant && that_present_is_grant))
        return false;
      if (this.is_grant != that.is_grant)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_role_names = true && (isSetRole_names());
    builder.append(present_role_names);
    if (present_role_names)
      builder.append(role_names);

    boolean present_group_names = true && (isSetGroup_names());
    builder.append(present_group_names);
    if (present_group_names)
      builder.append(group_names);

    boolean present_is_grant = true;
    builder.append(present_is_grant);
    if (present_is_grant)
      builder.append(is_grant);

    return builder.toHashCode();
  }

  public int compareTo(TGrantRevokeRoleParams other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    TGrantRevokeRoleParams typedOther = (TGrantRevokeRoleParams)other;

    lastComparison = Boolean.valueOf(isSetRole_names()).compareTo(typedOther.isSetRole_names());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRole_names()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.role_names, typedOther.role_names);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetGroup_names()).compareTo(typedOther.isSetGroup_names());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGroup_names()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.group_names, typedOther.group_names);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIs_grant()).compareTo(typedOther.isSetIs_grant());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIs_grant()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.is_grant, typedOther.is_grant);
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
    StringBuilder sb = new StringBuilder("TGrantRevokeRoleParams(");
    boolean first = true;

    sb.append("role_names:");
    if (this.role_names == null) {
      sb.append("null");
    } else {
      sb.append(this.role_names);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("group_names:");
    if (this.group_names == null) {
      sb.append("null");
    } else {
      sb.append(this.group_names);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("is_grant:");
    sb.append(this.is_grant);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (role_names == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'role_names' was not present! Struct: " + toString());
    }
    if (group_names == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'group_names' was not present! Struct: " + toString());
    }
    // alas, we cannot check 'is_grant' because it's a primitive and you chose the non-beans generator.
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

  private static class TGrantRevokeRoleParamsStandardSchemeFactory implements SchemeFactory {
    public TGrantRevokeRoleParamsStandardScheme getScheme() {
      return new TGrantRevokeRoleParamsStandardScheme();
    }
  }

  private static class TGrantRevokeRoleParamsStandardScheme extends StandardScheme<TGrantRevokeRoleParams> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TGrantRevokeRoleParams struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ROLE_NAMES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list170 = iprot.readListBegin();
                struct.role_names = new ArrayList<String>(_list170.size);
                for (int _i171 = 0; _i171 < _list170.size; ++_i171)
                {
                  String _elem172; // required
                  _elem172 = iprot.readString();
                  struct.role_names.add(_elem172);
                }
                iprot.readListEnd();
              }
              struct.setRole_namesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // GROUP_NAMES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list173 = iprot.readListBegin();
                struct.group_names = new ArrayList<String>(_list173.size);
                for (int _i174 = 0; _i174 < _list173.size; ++_i174)
                {
                  String _elem175; // required
                  _elem175 = iprot.readString();
                  struct.group_names.add(_elem175);
                }
                iprot.readListEnd();
              }
              struct.setGroup_namesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // IS_GRANT
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.is_grant = iprot.readBool();
              struct.setIs_grantIsSet(true);
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
      if (!struct.isSetIs_grant()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'is_grant' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TGrantRevokeRoleParams struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.role_names != null) {
        oprot.writeFieldBegin(ROLE_NAMES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.role_names.size()));
          for (String _iter176 : struct.role_names)
          {
            oprot.writeString(_iter176);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.group_names != null) {
        oprot.writeFieldBegin(GROUP_NAMES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.group_names.size()));
          for (String _iter177 : struct.group_names)
          {
            oprot.writeString(_iter177);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(IS_GRANT_FIELD_DESC);
      oprot.writeBool(struct.is_grant);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TGrantRevokeRoleParamsTupleSchemeFactory implements SchemeFactory {
    public TGrantRevokeRoleParamsTupleScheme getScheme() {
      return new TGrantRevokeRoleParamsTupleScheme();
    }
  }

  private static class TGrantRevokeRoleParamsTupleScheme extends TupleScheme<TGrantRevokeRoleParams> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TGrantRevokeRoleParams struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      {
        oprot.writeI32(struct.role_names.size());
        for (String _iter178 : struct.role_names)
        {
          oprot.writeString(_iter178);
        }
      }
      {
        oprot.writeI32(struct.group_names.size());
        for (String _iter179 : struct.group_names)
        {
          oprot.writeString(_iter179);
        }
      }
      oprot.writeBool(struct.is_grant);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TGrantRevokeRoleParams struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TList _list180 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
        struct.role_names = new ArrayList<String>(_list180.size);
        for (int _i181 = 0; _i181 < _list180.size; ++_i181)
        {
          String _elem182; // required
          _elem182 = iprot.readString();
          struct.role_names.add(_elem182);
        }
      }
      struct.setRole_namesIsSet(true);
      {
        org.apache.thrift.protocol.TList _list183 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
        struct.group_names = new ArrayList<String>(_list183.size);
        for (int _i184 = 0; _i184 < _list183.size; ++_i184)
        {
          String _elem185; // required
          _elem185 = iprot.readString();
          struct.group_names.add(_elem185);
        }
      }
      struct.setGroup_namesIsSet(true);
      struct.is_grant = iprot.readBool();
      struct.setIs_grantIsSet(true);
    }
  }

}
