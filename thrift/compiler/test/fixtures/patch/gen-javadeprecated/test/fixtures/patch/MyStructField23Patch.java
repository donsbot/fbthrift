/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package test.fixtures.patch;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import java.util.BitSet;
import java.util.Arrays;
import com.facebook.thrift.*;
import com.facebook.thrift.annotations.*;
import com.facebook.thrift.async.*;
import com.facebook.thrift.meta_data.*;
import com.facebook.thrift.server.*;
import com.facebook.thrift.transport.*;
import com.facebook.thrift.protocol.*;

@SuppressWarnings({ "unused", "serial" })
public class MyStructField23Patch implements TBase, java.io.Serializable, Cloneable, Comparable<MyStructField23Patch> {
  private static final TStruct STRUCT_DESC = new TStruct("MyStructField23Patch");
  private static final TField ASSIGN_FIELD_DESC = new TField("assign", TType.MAP, (short)1);
  private static final TField CLEAR_FIELD_DESC = new TField("clear", TType.BOOL, (short)2);
  private static final TField ADD_FIELD_DESC = new TField("add", TType.MAP, (short)4);
  private static final TField REMOVE_IF_FIELD_DESC = new TField("removeIf", TType.MAP, (short)6);

  /**
   * Assigns to a given struct. If set, all other operations are ignored.
   */
  public Map<String,String> assign;
  /**
   * Clears a given value. Applies first.
   */
  public boolean clear;
  /**
   * Adds entries, if not already present. Currently Ignored.
   */
  public Map<String,String> add;
  /**
   * Removes the given key/value pairs, if present. Currently Ignored.
   */
  public Map<String,String> removeIf;
  public static final int ASSIGN = 1;
  public static final int CLEAR = 2;
  public static final int ADD = 4;
  public static final int REMOVEIF = 6;

  // isset id assignments
  private static final int __CLEAR_ISSET_ID = 0;
  private BitSet __isset_bit_vector = new BitSet(1);

  public static final Map<Integer, FieldMetaData> metaDataMap;

  static {
    Map<Integer, FieldMetaData> tmpMetaDataMap = new HashMap<Integer, FieldMetaData>();
    tmpMetaDataMap.put(ASSIGN, new FieldMetaData("assign", TFieldRequirementType.OPTIONAL, 
        new MapMetaData(TType.MAP, 
            new FieldValueMetaData(TType.STRING), 
            new FieldValueMetaData(TType.STRING))));
    tmpMetaDataMap.put(CLEAR, new FieldMetaData("clear", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.BOOL)));
    tmpMetaDataMap.put(ADD, new FieldMetaData("add", TFieldRequirementType.DEFAULT, 
        new MapMetaData(TType.MAP, 
            new FieldValueMetaData(TType.STRING), 
            new FieldValueMetaData(TType.STRING))));
    tmpMetaDataMap.put(REMOVEIF, new FieldMetaData("removeIf", TFieldRequirementType.DEFAULT, 
        new MapMetaData(TType.MAP, 
            new FieldValueMetaData(TType.STRING), 
            new FieldValueMetaData(TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMetaDataMap);
  }

  static {
    FieldMetaData.addStructMetaDataMap(MyStructField23Patch.class, metaDataMap);
  }

  public MyStructField23Patch() {
  }

  public MyStructField23Patch(
      boolean clear,
      Map<String,String> add,
      Map<String,String> removeIf) {
    this();
    this.clear = clear;
    setClearIsSet(true);
    this.add = add;
    this.removeIf = removeIf;
  }

  public MyStructField23Patch(
      Map<String,String> assign,
      boolean clear,
      Map<String,String> add,
      Map<String,String> removeIf) {
    this();
    this.assign = assign;
    this.clear = clear;
    setClearIsSet(true);
    this.add = add;
    this.removeIf = removeIf;
  }

  public static class Builder {
    private Map<String,String> assign;
    private boolean clear;
    private Map<String,String> add;
    private Map<String,String> removeIf;

    BitSet __optional_isset = new BitSet(1);

    public Builder() {
    }

    public Builder setAssign(final Map<String,String> assign) {
      this.assign = assign;
      return this;
    }

    public Builder setClear(final boolean clear) {
      this.clear = clear;
      __optional_isset.set(__CLEAR_ISSET_ID, true);
      return this;
    }

    public Builder setAdd(final Map<String,String> add) {
      this.add = add;
      return this;
    }

    public Builder setRemoveIf(final Map<String,String> removeIf) {
      this.removeIf = removeIf;
      return this;
    }

    public MyStructField23Patch build() {
      MyStructField23Patch result = new MyStructField23Patch();
      result.setAssign(this.assign);
      if (__optional_isset.get(__CLEAR_ISSET_ID)) {
        result.setClear(this.clear);
      }
      result.setAdd(this.add);
      result.setRemoveIf(this.removeIf);
      return result;
    }
  }

  public static Builder builder() {
    return new Builder();
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public MyStructField23Patch(MyStructField23Patch other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    if (other.isSetAssign()) {
      this.assign = TBaseHelper.deepCopy(other.assign);
    }
    this.clear = TBaseHelper.deepCopy(other.clear);
    if (other.isSetAdd()) {
      this.add = TBaseHelper.deepCopy(other.add);
    }
    if (other.isSetRemoveIf()) {
      this.removeIf = TBaseHelper.deepCopy(other.removeIf);
    }
  }

  public MyStructField23Patch deepCopy() {
    return new MyStructField23Patch(this);
  }

  /**
   * Assigns to a given struct. If set, all other operations are ignored.
   */
  public Map<String,String> getAssign() {
    return this.assign;
  }

  /**
   * Assigns to a given struct. If set, all other operations are ignored.
   */
  public MyStructField23Patch setAssign(Map<String,String> assign) {
    this.assign = assign;
    return this;
  }

  public void unsetAssign() {
    this.assign = null;
  }

  // Returns true if field assign is set (has been assigned a value) and false otherwise
  public boolean isSetAssign() {
    return this.assign != null;
  }

  public void setAssignIsSet(boolean __value) {
    if (!__value) {
      this.assign = null;
    }
  }

  /**
   * Clears a given value. Applies first.
   */
  public boolean isClear() {
    return this.clear;
  }

  /**
   * Clears a given value. Applies first.
   */
  public MyStructField23Patch setClear(boolean clear) {
    this.clear = clear;
    setClearIsSet(true);
    return this;
  }

  public void unsetClear() {
    __isset_bit_vector.clear(__CLEAR_ISSET_ID);
  }

  // Returns true if field clear is set (has been assigned a value) and false otherwise
  public boolean isSetClear() {
    return __isset_bit_vector.get(__CLEAR_ISSET_ID);
  }

  public void setClearIsSet(boolean __value) {
    __isset_bit_vector.set(__CLEAR_ISSET_ID, __value);
  }

  /**
   * Adds entries, if not already present. Currently Ignored.
   */
  public Map<String,String> getAdd() {
    return this.add;
  }

  /**
   * Adds entries, if not already present. Currently Ignored.
   */
  public MyStructField23Patch setAdd(Map<String,String> add) {
    this.add = add;
    return this;
  }

  public void unsetAdd() {
    this.add = null;
  }

  // Returns true if field add is set (has been assigned a value) and false otherwise
  public boolean isSetAdd() {
    return this.add != null;
  }

  public void setAddIsSet(boolean __value) {
    if (!__value) {
      this.add = null;
    }
  }

  /**
   * Removes the given key/value pairs, if present. Currently Ignored.
   */
  public Map<String,String> getRemoveIf() {
    return this.removeIf;
  }

  /**
   * Removes the given key/value pairs, if present. Currently Ignored.
   */
  public MyStructField23Patch setRemoveIf(Map<String,String> removeIf) {
    this.removeIf = removeIf;
    return this;
  }

  public void unsetRemoveIf() {
    this.removeIf = null;
  }

  // Returns true if field removeIf is set (has been assigned a value) and false otherwise
  public boolean isSetRemoveIf() {
    return this.removeIf != null;
  }

  public void setRemoveIfIsSet(boolean __value) {
    if (!__value) {
      this.removeIf = null;
    }
  }

  @SuppressWarnings("unchecked")
  public void setFieldValue(int fieldID, Object __value) {
    switch (fieldID) {
    case ASSIGN:
      if (__value == null) {
        unsetAssign();
      } else {
        setAssign((Map<String,String>)__value);
      }
      break;

    case CLEAR:
      if (__value == null) {
        unsetClear();
      } else {
        setClear((Boolean)__value);
      }
      break;

    case ADD:
      if (__value == null) {
        unsetAdd();
      } else {
        setAdd((Map<String,String>)__value);
      }
      break;

    case REMOVEIF:
      if (__value == null) {
        unsetRemoveIf();
      } else {
        setRemoveIf((Map<String,String>)__value);
      }
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case ASSIGN:
      return getAssign();

    case CLEAR:
      return new Boolean(isClear());

    case ADD:
      return getAdd();

    case REMOVEIF:
      return getRemoveIf();

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  @Override
  public boolean equals(Object _that) {
    if (_that == null)
      return false;
    if (this == _that)
      return true;
    if (!(_that instanceof MyStructField23Patch))
      return false;
    MyStructField23Patch that = (MyStructField23Patch)_that;

    if (!TBaseHelper.equalsNobinary(this.isSetAssign(), that.isSetAssign(), this.assign, that.assign)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.clear, that.clear)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetAdd(), that.isSetAdd(), this.add, that.add)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetRemoveIf(), that.isSetRemoveIf(), this.removeIf, that.removeIf)) { return false; }

    return true;
  }

  @Override
  public int hashCode() {
    return Arrays.deepHashCode(new Object[] {assign, clear, add, removeIf});
  }

  @Override
  public int compareTo(MyStructField23Patch other) {
    if (other == null) {
      // See java.lang.Comparable docs
      throw new NullPointerException();
    }

    if (other == this) {
      return 0;
    }
    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetAssign()).compareTo(other.isSetAssign());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(assign, other.assign);
    if (lastComparison != 0) { 
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetClear()).compareTo(other.isSetClear());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(clear, other.clear);
    if (lastComparison != 0) { 
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetAdd()).compareTo(other.isSetAdd());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(add, other.add);
    if (lastComparison != 0) { 
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetRemoveIf()).compareTo(other.isSetRemoveIf());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(removeIf, other.removeIf);
    if (lastComparison != 0) { 
      return lastComparison;
    }
    return 0;
  }

  public void read(TProtocol iprot) throws TException {
    TField __field;
    iprot.readStructBegin(metaDataMap);
    while (true)
    {
      __field = iprot.readFieldBegin();
      if (__field.type == TType.STOP) {
        break;
      }
      switch (__field.id)
      {
        case ASSIGN:
          if (__field.type == TType.MAP) {
            {
              TMap _map45 = iprot.readMapBegin();
              this.assign = new HashMap<String,String>(Math.max(0, 2*_map45.size));
              for (int _i46 = 0; 
                   (_map45.size < 0) ? iprot.peekMap() : (_i46 < _map45.size); 
                   ++_i46)
              {
                String _key47;
                String _val48;
                _key47 = iprot.readString();
                _val48 = iprot.readString();
                this.assign.put(_key47, _val48);
              }
              iprot.readMapEnd();
            }
          } else {
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case CLEAR:
          if (__field.type == TType.BOOL) {
            this.clear = iprot.readBool();
            setClearIsSet(true);
          } else {
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case ADD:
          if (__field.type == TType.MAP) {
            {
              TMap _map49 = iprot.readMapBegin();
              this.add = new HashMap<String,String>(Math.max(0, 2*_map49.size));
              for (int _i50 = 0; 
                   (_map49.size < 0) ? iprot.peekMap() : (_i50 < _map49.size); 
                   ++_i50)
              {
                String _key51;
                String _val52;
                _key51 = iprot.readString();
                _val52 = iprot.readString();
                this.add.put(_key51, _val52);
              }
              iprot.readMapEnd();
            }
          } else {
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case REMOVEIF:
          if (__field.type == TType.MAP) {
            {
              TMap _map53 = iprot.readMapBegin();
              this.removeIf = new HashMap<String,String>(Math.max(0, 2*_map53.size));
              for (int _i54 = 0; 
                   (_map53.size < 0) ? iprot.peekMap() : (_i54 < _map53.size); 
                   ++_i54)
              {
                String _key55;
                String _val56;
                _key55 = iprot.readString();
                _val56 = iprot.readString();
                this.removeIf.put(_key55, _val56);
              }
              iprot.readMapEnd();
            }
          } else {
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, __field.type);
          break;
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();


    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.assign != null) {
      if (isSetAssign()) {
        oprot.writeFieldBegin(ASSIGN_FIELD_DESC);
        {
          oprot.writeMapBegin(new TMap(TType.STRING, TType.STRING, this.assign.size()));
          for (Map.Entry<String, String> _iter57 : this.assign.entrySet())          {
            oprot.writeString(_iter57.getKey());
            oprot.writeString(_iter57.getValue());
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
    }
    oprot.writeFieldBegin(CLEAR_FIELD_DESC);
    oprot.writeBool(this.clear);
    oprot.writeFieldEnd();
    if (this.add != null) {
      oprot.writeFieldBegin(ADD_FIELD_DESC);
      {
        oprot.writeMapBegin(new TMap(TType.STRING, TType.STRING, this.add.size()));
        for (Map.Entry<String, String> _iter58 : this.add.entrySet())        {
          oprot.writeString(_iter58.getKey());
          oprot.writeString(_iter58.getValue());
        }
        oprot.writeMapEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.removeIf != null) {
      oprot.writeFieldBegin(REMOVE_IF_FIELD_DESC);
      {
        oprot.writeMapBegin(new TMap(TType.STRING, TType.STRING, this.removeIf.size()));
        for (Map.Entry<String, String> _iter59 : this.removeIf.entrySet())        {
          oprot.writeString(_iter59.getKey());
          oprot.writeString(_iter59.getValue());
        }
        oprot.writeMapEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    return toString(1, true);
  }

  @Override
  public String toString(int indent, boolean prettyPrint) {
    String indentStr = prettyPrint ? TBaseHelper.getIndentedString(indent) : "";
    String newLine = prettyPrint ? "\n" : "";
    String space = prettyPrint ? " " : "";
    StringBuilder sb = new StringBuilder("MyStructField23Patch");
    sb.append(space);
    sb.append("(");
    sb.append(newLine);
    boolean first = true;

    if (isSetAssign())
    {
      sb.append(indentStr);
      sb.append("assign");
      sb.append(space);
      sb.append(":").append(space);
      if (this.getAssign() == null) {
        sb.append("null");
      } else {
        sb.append(TBaseHelper.toString(this.getAssign(), indent + 1, prettyPrint));
      }
      first = false;
    }
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("clear");
    sb.append(space);
    sb.append(":").append(space);
    sb.append(TBaseHelper.toString(this.isClear(), indent + 1, prettyPrint));
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("add");
    sb.append(space);
    sb.append(":").append(space);
    if (this.getAdd() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this.getAdd(), indent + 1, prettyPrint));
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("removeIf");
    sb.append(space);
    sb.append(":").append(space);
    if (this.getRemoveIf() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this.getRemoveIf(), indent + 1, prettyPrint));
    }
    first = false;
    sb.append(newLine + TBaseHelper.reduceIndent(indentStr));
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

