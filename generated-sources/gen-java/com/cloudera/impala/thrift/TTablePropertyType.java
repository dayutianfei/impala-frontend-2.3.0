/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.cloudera.impala.thrift;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum TTablePropertyType implements org.apache.thrift.TEnum {
  TBL_PROPERTY(0),
  SERDE_PROPERTY(1);

  private final int value;

  private TTablePropertyType(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static TTablePropertyType findByValue(int value) { 
    switch (value) {
      case 0:
        return TBL_PROPERTY;
      case 1:
        return SERDE_PROPERTY;
      default:
        return null;
    }
  }
}