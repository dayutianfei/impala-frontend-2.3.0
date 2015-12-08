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

public class TGetDataSrcsResult implements org.apache.thrift.TBase<TGetDataSrcsResult, TGetDataSrcsResult._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TGetDataSrcsResult");

  private static final org.apache.thrift.protocol.TField DATA_SRC_NAMES_FIELD_DESC = new org.apache.thrift.protocol.TField("data_src_names", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField LOCATIONS_FIELD_DESC = new org.apache.thrift.protocol.TField("locations", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField CLASS_NAMES_FIELD_DESC = new org.apache.thrift.protocol.TField("class_names", org.apache.thrift.protocol.TType.LIST, (short)3);
  private static final org.apache.thrift.protocol.TField API_VERSIONS_FIELD_DESC = new org.apache.thrift.protocol.TField("api_versions", org.apache.thrift.protocol.TType.LIST, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TGetDataSrcsResultStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TGetDataSrcsResultTupleSchemeFactory());
  }

  public List<String> data_src_names; // required
  public List<String> locations; // required
  public List<String> class_names; // required
  public List<String> api_versions; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    DATA_SRC_NAMES((short)1, "data_src_names"),
    LOCATIONS((short)2, "locations"),
    CLASS_NAMES((short)3, "class_names"),
    API_VERSIONS((short)4, "api_versions");

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
        case 1: // DATA_SRC_NAMES
          return DATA_SRC_NAMES;
        case 2: // LOCATIONS
          return LOCATIONS;
        case 3: // CLASS_NAMES
          return CLASS_NAMES;
        case 4: // API_VERSIONS
          return API_VERSIONS;
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
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.DATA_SRC_NAMES, new org.apache.thrift.meta_data.FieldMetaData("data_src_names", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.LOCATIONS, new org.apache.thrift.meta_data.FieldMetaData("locations", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.CLASS_NAMES, new org.apache.thrift.meta_data.FieldMetaData("class_names", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.API_VERSIONS, new org.apache.thrift.meta_data.FieldMetaData("api_versions", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TGetDataSrcsResult.class, metaDataMap);
  }

  public TGetDataSrcsResult() {
  }

  public TGetDataSrcsResult(
    List<String> data_src_names,
    List<String> locations,
    List<String> class_names,
    List<String> api_versions)
  {
    this();
    this.data_src_names = data_src_names;
    this.locations = locations;
    this.class_names = class_names;
    this.api_versions = api_versions;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TGetDataSrcsResult(TGetDataSrcsResult other) {
    if (other.isSetData_src_names()) {
      List<String> __this__data_src_names = new ArrayList<String>();
      for (String other_element : other.data_src_names) {
        __this__data_src_names.add(other_element);
      }
      this.data_src_names = __this__data_src_names;
    }
    if (other.isSetLocations()) {
      List<String> __this__locations = new ArrayList<String>();
      for (String other_element : other.locations) {
        __this__locations.add(other_element);
      }
      this.locations = __this__locations;
    }
    if (other.isSetClass_names()) {
      List<String> __this__class_names = new ArrayList<String>();
      for (String other_element : other.class_names) {
        __this__class_names.add(other_element);
      }
      this.class_names = __this__class_names;
    }
    if (other.isSetApi_versions()) {
      List<String> __this__api_versions = new ArrayList<String>();
      for (String other_element : other.api_versions) {
        __this__api_versions.add(other_element);
      }
      this.api_versions = __this__api_versions;
    }
  }

  public TGetDataSrcsResult deepCopy() {
    return new TGetDataSrcsResult(this);
  }

  @Override
  public void clear() {
    this.data_src_names = null;
    this.locations = null;
    this.class_names = null;
    this.api_versions = null;
  }

  public int getData_src_namesSize() {
    return (this.data_src_names == null) ? 0 : this.data_src_names.size();
  }

  public java.util.Iterator<String> getData_src_namesIterator() {
    return (this.data_src_names == null) ? null : this.data_src_names.iterator();
  }

  public void addToData_src_names(String elem) {
    if (this.data_src_names == null) {
      this.data_src_names = new ArrayList<String>();
    }
    this.data_src_names.add(elem);
  }

  public List<String> getData_src_names() {
    return this.data_src_names;
  }

  public TGetDataSrcsResult setData_src_names(List<String> data_src_names) {
    this.data_src_names = data_src_names;
    return this;
  }

  public void unsetData_src_names() {
    this.data_src_names = null;
  }

  /** Returns true if field data_src_names is set (has been assigned a value) and false otherwise */
  public boolean isSetData_src_names() {
    return this.data_src_names != null;
  }

  public void setData_src_namesIsSet(boolean value) {
    if (!value) {
      this.data_src_names = null;
    }
  }

  public int getLocationsSize() {
    return (this.locations == null) ? 0 : this.locations.size();
  }

  public java.util.Iterator<String> getLocationsIterator() {
    return (this.locations == null) ? null : this.locations.iterator();
  }

  public void addToLocations(String elem) {
    if (this.locations == null) {
      this.locations = new ArrayList<String>();
    }
    this.locations.add(elem);
  }

  public List<String> getLocations() {
    return this.locations;
  }

  public TGetDataSrcsResult setLocations(List<String> locations) {
    this.locations = locations;
    return this;
  }

  public void unsetLocations() {
    this.locations = null;
  }

  /** Returns true if field locations is set (has been assigned a value) and false otherwise */
  public boolean isSetLocations() {
    return this.locations != null;
  }

  public void setLocationsIsSet(boolean value) {
    if (!value) {
      this.locations = null;
    }
  }

  public int getClass_namesSize() {
    return (this.class_names == null) ? 0 : this.class_names.size();
  }

  public java.util.Iterator<String> getClass_namesIterator() {
    return (this.class_names == null) ? null : this.class_names.iterator();
  }

  public void addToClass_names(String elem) {
    if (this.class_names == null) {
      this.class_names = new ArrayList<String>();
    }
    this.class_names.add(elem);
  }

  public List<String> getClass_names() {
    return this.class_names;
  }

  public TGetDataSrcsResult setClass_names(List<String> class_names) {
    this.class_names = class_names;
    return this;
  }

  public void unsetClass_names() {
    this.class_names = null;
  }

  /** Returns true if field class_names is set (has been assigned a value) and false otherwise */
  public boolean isSetClass_names() {
    return this.class_names != null;
  }

  public void setClass_namesIsSet(boolean value) {
    if (!value) {
      this.class_names = null;
    }
  }

  public int getApi_versionsSize() {
    return (this.api_versions == null) ? 0 : this.api_versions.size();
  }

  public java.util.Iterator<String> getApi_versionsIterator() {
    return (this.api_versions == null) ? null : this.api_versions.iterator();
  }

  public void addToApi_versions(String elem) {
    if (this.api_versions == null) {
      this.api_versions = new ArrayList<String>();
    }
    this.api_versions.add(elem);
  }

  public List<String> getApi_versions() {
    return this.api_versions;
  }

  public TGetDataSrcsResult setApi_versions(List<String> api_versions) {
    this.api_versions = api_versions;
    return this;
  }

  public void unsetApi_versions() {
    this.api_versions = null;
  }

  /** Returns true if field api_versions is set (has been assigned a value) and false otherwise */
  public boolean isSetApi_versions() {
    return this.api_versions != null;
  }

  public void setApi_versionsIsSet(boolean value) {
    if (!value) {
      this.api_versions = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case DATA_SRC_NAMES:
      if (value == null) {
        unsetData_src_names();
      } else {
        setData_src_names((List<String>)value);
      }
      break;

    case LOCATIONS:
      if (value == null) {
        unsetLocations();
      } else {
        setLocations((List<String>)value);
      }
      break;

    case CLASS_NAMES:
      if (value == null) {
        unsetClass_names();
      } else {
        setClass_names((List<String>)value);
      }
      break;

    case API_VERSIONS:
      if (value == null) {
        unsetApi_versions();
      } else {
        setApi_versions((List<String>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case DATA_SRC_NAMES:
      return getData_src_names();

    case LOCATIONS:
      return getLocations();

    case CLASS_NAMES:
      return getClass_names();

    case API_VERSIONS:
      return getApi_versions();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case DATA_SRC_NAMES:
      return isSetData_src_names();
    case LOCATIONS:
      return isSetLocations();
    case CLASS_NAMES:
      return isSetClass_names();
    case API_VERSIONS:
      return isSetApi_versions();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TGetDataSrcsResult)
      return this.equals((TGetDataSrcsResult)that);
    return false;
  }

  public boolean equals(TGetDataSrcsResult that) {
    if (that == null)
      return false;

    boolean this_present_data_src_names = true && this.isSetData_src_names();
    boolean that_present_data_src_names = true && that.isSetData_src_names();
    if (this_present_data_src_names || that_present_data_src_names) {
      if (!(this_present_data_src_names && that_present_data_src_names))
        return false;
      if (!this.data_src_names.equals(that.data_src_names))
        return false;
    }

    boolean this_present_locations = true && this.isSetLocations();
    boolean that_present_locations = true && that.isSetLocations();
    if (this_present_locations || that_present_locations) {
      if (!(this_present_locations && that_present_locations))
        return false;
      if (!this.locations.equals(that.locations))
        return false;
    }

    boolean this_present_class_names = true && this.isSetClass_names();
    boolean that_present_class_names = true && that.isSetClass_names();
    if (this_present_class_names || that_present_class_names) {
      if (!(this_present_class_names && that_present_class_names))
        return false;
      if (!this.class_names.equals(that.class_names))
        return false;
    }

    boolean this_present_api_versions = true && this.isSetApi_versions();
    boolean that_present_api_versions = true && that.isSetApi_versions();
    if (this_present_api_versions || that_present_api_versions) {
      if (!(this_present_api_versions && that_present_api_versions))
        return false;
      if (!this.api_versions.equals(that.api_versions))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_data_src_names = true && (isSetData_src_names());
    builder.append(present_data_src_names);
    if (present_data_src_names)
      builder.append(data_src_names);

    boolean present_locations = true && (isSetLocations());
    builder.append(present_locations);
    if (present_locations)
      builder.append(locations);

    boolean present_class_names = true && (isSetClass_names());
    builder.append(present_class_names);
    if (present_class_names)
      builder.append(class_names);

    boolean present_api_versions = true && (isSetApi_versions());
    builder.append(present_api_versions);
    if (present_api_versions)
      builder.append(api_versions);

    return builder.toHashCode();
  }

  public int compareTo(TGetDataSrcsResult other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    TGetDataSrcsResult typedOther = (TGetDataSrcsResult)other;

    lastComparison = Boolean.valueOf(isSetData_src_names()).compareTo(typedOther.isSetData_src_names());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetData_src_names()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.data_src_names, typedOther.data_src_names);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLocations()).compareTo(typedOther.isSetLocations());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLocations()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.locations, typedOther.locations);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetClass_names()).compareTo(typedOther.isSetClass_names());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetClass_names()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.class_names, typedOther.class_names);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetApi_versions()).compareTo(typedOther.isSetApi_versions());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetApi_versions()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.api_versions, typedOther.api_versions);
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
    StringBuilder sb = new StringBuilder("TGetDataSrcsResult(");
    boolean first = true;

    sb.append("data_src_names:");
    if (this.data_src_names == null) {
      sb.append("null");
    } else {
      sb.append(this.data_src_names);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("locations:");
    if (this.locations == null) {
      sb.append("null");
    } else {
      sb.append(this.locations);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("class_names:");
    if (this.class_names == null) {
      sb.append("null");
    } else {
      sb.append(this.class_names);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("api_versions:");
    if (this.api_versions == null) {
      sb.append("null");
    } else {
      sb.append(this.api_versions);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (data_src_names == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'data_src_names' was not present! Struct: " + toString());
    }
    if (locations == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'locations' was not present! Struct: " + toString());
    }
    if (class_names == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'class_names' was not present! Struct: " + toString());
    }
    if (api_versions == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'api_versions' was not present! Struct: " + toString());
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TGetDataSrcsResultStandardSchemeFactory implements SchemeFactory {
    public TGetDataSrcsResultStandardScheme getScheme() {
      return new TGetDataSrcsResultStandardScheme();
    }
  }

  private static class TGetDataSrcsResultStandardScheme extends StandardScheme<TGetDataSrcsResult> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TGetDataSrcsResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // DATA_SRC_NAMES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list24 = iprot.readListBegin();
                struct.data_src_names = new ArrayList<String>(_list24.size);
                for (int _i25 = 0; _i25 < _list24.size; ++_i25)
                {
                  String _elem26; // required
                  _elem26 = iprot.readString();
                  struct.data_src_names.add(_elem26);
                }
                iprot.readListEnd();
              }
              struct.setData_src_namesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // LOCATIONS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list27 = iprot.readListBegin();
                struct.locations = new ArrayList<String>(_list27.size);
                for (int _i28 = 0; _i28 < _list27.size; ++_i28)
                {
                  String _elem29; // required
                  _elem29 = iprot.readString();
                  struct.locations.add(_elem29);
                }
                iprot.readListEnd();
              }
              struct.setLocationsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // CLASS_NAMES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list30 = iprot.readListBegin();
                struct.class_names = new ArrayList<String>(_list30.size);
                for (int _i31 = 0; _i31 < _list30.size; ++_i31)
                {
                  String _elem32; // required
                  _elem32 = iprot.readString();
                  struct.class_names.add(_elem32);
                }
                iprot.readListEnd();
              }
              struct.setClass_namesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // API_VERSIONS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list33 = iprot.readListBegin();
                struct.api_versions = new ArrayList<String>(_list33.size);
                for (int _i34 = 0; _i34 < _list33.size; ++_i34)
                {
                  String _elem35; // required
                  _elem35 = iprot.readString();
                  struct.api_versions.add(_elem35);
                }
                iprot.readListEnd();
              }
              struct.setApi_versionsIsSet(true);
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
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TGetDataSrcsResult struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.data_src_names != null) {
        oprot.writeFieldBegin(DATA_SRC_NAMES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.data_src_names.size()));
          for (String _iter36 : struct.data_src_names)
          {
            oprot.writeString(_iter36);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.locations != null) {
        oprot.writeFieldBegin(LOCATIONS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.locations.size()));
          for (String _iter37 : struct.locations)
          {
            oprot.writeString(_iter37);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.class_names != null) {
        oprot.writeFieldBegin(CLASS_NAMES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.class_names.size()));
          for (String _iter38 : struct.class_names)
          {
            oprot.writeString(_iter38);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.api_versions != null) {
        oprot.writeFieldBegin(API_VERSIONS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.api_versions.size()));
          for (String _iter39 : struct.api_versions)
          {
            oprot.writeString(_iter39);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TGetDataSrcsResultTupleSchemeFactory implements SchemeFactory {
    public TGetDataSrcsResultTupleScheme getScheme() {
      return new TGetDataSrcsResultTupleScheme();
    }
  }

  private static class TGetDataSrcsResultTupleScheme extends TupleScheme<TGetDataSrcsResult> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TGetDataSrcsResult struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      {
        oprot.writeI32(struct.data_src_names.size());
        for (String _iter40 : struct.data_src_names)
        {
          oprot.writeString(_iter40);
        }
      }
      {
        oprot.writeI32(struct.locations.size());
        for (String _iter41 : struct.locations)
        {
          oprot.writeString(_iter41);
        }
      }
      {
        oprot.writeI32(struct.class_names.size());
        for (String _iter42 : struct.class_names)
        {
          oprot.writeString(_iter42);
        }
      }
      {
        oprot.writeI32(struct.api_versions.size());
        for (String _iter43 : struct.api_versions)
        {
          oprot.writeString(_iter43);
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TGetDataSrcsResult struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TList _list44 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
        struct.data_src_names = new ArrayList<String>(_list44.size);
        for (int _i45 = 0; _i45 < _list44.size; ++_i45)
        {
          String _elem46; // required
          _elem46 = iprot.readString();
          struct.data_src_names.add(_elem46);
        }
      }
      struct.setData_src_namesIsSet(true);
      {
        org.apache.thrift.protocol.TList _list47 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
        struct.locations = new ArrayList<String>(_list47.size);
        for (int _i48 = 0; _i48 < _list47.size; ++_i48)
        {
          String _elem49; // required
          _elem49 = iprot.readString();
          struct.locations.add(_elem49);
        }
      }
      struct.setLocationsIsSet(true);
      {
        org.apache.thrift.protocol.TList _list50 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
        struct.class_names = new ArrayList<String>(_list50.size);
        for (int _i51 = 0; _i51 < _list50.size; ++_i51)
        {
          String _elem52; // required
          _elem52 = iprot.readString();
          struct.class_names.add(_elem52);
        }
      }
      struct.setClass_namesIsSet(true);
      {
        org.apache.thrift.protocol.TList _list53 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
        struct.api_versions = new ArrayList<String>(_list53.size);
        for (int _i54 = 0; _i54 < _list53.size; ++_i54)
        {
          String _elem55; // required
          _elem55 = iprot.readString();
          struct.api_versions.add(_elem55);
        }
      }
      struct.setApi_versionsIsSet(true);
    }
  }

}
