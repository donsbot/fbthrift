/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

package test.fixtures.basic;

import com.facebook.swift.codec.*;
import com.facebook.swift.codec.ThriftField.Requiredness;
import com.facebook.swift.codec.ThriftField.Recursiveness;
import com.google.common.collect.*;
import java.util.*;
import org.apache.thrift.*;
import org.apache.thrift.async.*;
import org.apache.thrift.meta_data.*;
import org.apache.thrift.server.*;
import org.apache.thrift.transport.*;
import org.apache.thrift.protocol.*;
import org.apache.thrift.meta_data.FieldValueMetaData;
import static com.google.common.base.MoreObjects.toStringHelper;
import static com.google.common.base.MoreObjects.ToStringHelper;

@SwiftGenerated
@com.facebook.swift.codec.ThriftStruct(value="MyStruct", builder=MyStruct.Builder.class)
public final class MyStruct {

    @ThriftConstructor
    public MyStruct(
        @com.facebook.swift.codec.ThriftField(value=1, name="MyIntField", requiredness=Requiredness.NONE) final long myIntField,
        @com.facebook.swift.codec.ThriftField(value=2, name="MyStringField", requiredness=Requiredness.NONE) final String myStringField,
        @com.facebook.swift.codec.ThriftField(value=3, name="MyDataField", requiredness=Requiredness.NONE) final test.fixtures.basic.MyDataItem myDataField,
        @com.facebook.swift.codec.ThriftField(value=4, name="myEnum", requiredness=Requiredness.NONE) final test.fixtures.basic.MyEnum myEnum,
        @com.facebook.swift.codec.ThriftField(value=5, name="oneway", requiredness=Requiredness.NONE) final boolean oneway,
        @com.facebook.swift.codec.ThriftField(value=6, name="readonly", requiredness=Requiredness.NONE) final boolean readonly,
        @com.facebook.swift.codec.ThriftField(value=7, name="idempotent", requiredness=Requiredness.NONE) final boolean idempotent
    ) {
        this.myIntField = myIntField;
        this.myStringField = myStringField;
        this.myDataField = myDataField;
        this.myEnum = myEnum;
        this.oneway = oneway;
        this.readonly = readonly;
        this.idempotent = idempotent;
    }
    
    @ThriftConstructor
    protected MyStruct() {
      this.myIntField = 0L;
      this.myStringField = null;
      this.myDataField = null;
      this.myEnum = null;
      this.oneway = false;
      this.readonly = false;
      this.idempotent = false;
    }
    
    public static class Builder {
    
        private long myIntField = 0L;
        private String myStringField = null;
        private test.fixtures.basic.MyDataItem myDataField = null;
        private test.fixtures.basic.MyEnum myEnum = null;
        private boolean oneway = false;
        private boolean readonly = false;
        private boolean idempotent = false;
    
        @com.facebook.swift.codec.ThriftField(value=1, name="MyIntField", requiredness=Requiredness.NONE)
        public Builder setMyIntField(long myIntField) {
            this.myIntField = myIntField;
            return this;
        }
    
        public long getMyIntField() { return myIntField; }
    
            @com.facebook.swift.codec.ThriftField(value=2, name="MyStringField", requiredness=Requiredness.NONE)
        public Builder setMyStringField(String myStringField) {
            this.myStringField = myStringField;
            return this;
        }
    
        public String getMyStringField() { return myStringField; }
    
            @com.facebook.swift.codec.ThriftField(value=3, name="MyDataField", requiredness=Requiredness.NONE)
        public Builder setMyDataField(test.fixtures.basic.MyDataItem myDataField) {
            this.myDataField = myDataField;
            return this;
        }
    
        public test.fixtures.basic.MyDataItem getMyDataField() { return myDataField; }
    
            @com.facebook.swift.codec.ThriftField(value=4, name="myEnum", requiredness=Requiredness.NONE)
        public Builder setMyEnum(test.fixtures.basic.MyEnum myEnum) {
            this.myEnum = myEnum;
            return this;
        }
    
        public test.fixtures.basic.MyEnum getMyEnum() { return myEnum; }
    
            @com.facebook.swift.codec.ThriftField(value=5, name="oneway", requiredness=Requiredness.NONE)
        public Builder setOneway(boolean oneway) {
            this.oneway = oneway;
            return this;
        }
    
        public boolean isOneway() { return oneway; }
    
            @com.facebook.swift.codec.ThriftField(value=6, name="readonly", requiredness=Requiredness.NONE)
        public Builder setReadonly(boolean readonly) {
            this.readonly = readonly;
            return this;
        }
    
        public boolean isReadonly() { return readonly; }
    
            @com.facebook.swift.codec.ThriftField(value=7, name="idempotent", requiredness=Requiredness.NONE)
        public Builder setIdempotent(boolean idempotent) {
            this.idempotent = idempotent;
            return this;
        }
    
        public boolean isIdempotent() { return idempotent; }
    
        public Builder() { }
        public Builder(MyStruct other) {
            this.myIntField = other.myIntField;
            this.myStringField = other.myStringField;
            this.myDataField = other.myDataField;
            this.myEnum = other.myEnum;
            this.oneway = other.oneway;
            this.readonly = other.readonly;
            this.idempotent = other.idempotent;
        }
    
        @ThriftConstructor
        public MyStruct build() {
            MyStruct result = new MyStruct (
                this.myIntField,
                this.myStringField,
                this.myDataField,
                this.myEnum,
                this.oneway,
                this.readonly,
                this.idempotent
            );
            return result;
        }
    }
    
    public static final Map<String, Integer> NAMES_TO_IDS = new HashMap();
    public static final Map<Integer, TField> FIELD_METADATA = new HashMap<>();
    private static final TStruct STRUCT_DESC = new TStruct("MyStruct");
    private final long myIntField;
    public static final int _MYINTFIELD = 1;
    private static final TField MY_INT_FIELD_FIELD_DESC = new TField("MyIntField", TType.I64, (short)1);
        private final String myStringField;
    public static final int _MYSTRINGFIELD = 2;
    private static final TField MY_STRING_FIELD_FIELD_DESC = new TField("MyStringField", TType.STRING, (short)2);
        private final test.fixtures.basic.MyDataItem myDataField;
    public static final int _MYDATAFIELD = 3;
    private static final TField MY_DATA_FIELD_FIELD_DESC = new TField("MyDataField", TType.STRUCT, (short)3);
        private final test.fixtures.basic.MyEnum myEnum;
    public static final int _MYENUM = 4;
    private static final TField MY_ENUM_FIELD_DESC = new TField("myEnum", TType.I32, (short)4);
        private final boolean oneway;
    public static final int _ONEWAY = 5;
    private static final TField ONEWAY_FIELD_DESC = new TField("oneway", TType.BOOL, (short)5);
        private final boolean readonly;
    public static final int _READONLY = 6;
    private static final TField READONLY_FIELD_DESC = new TField("readonly", TType.BOOL, (short)6);
        private final boolean idempotent;
    public static final int _IDEMPOTENT = 7;
    private static final TField IDEMPOTENT_FIELD_DESC = new TField("idempotent", TType.BOOL, (short)7);
    static {
      NAMES_TO_IDS.put("myIntField", 1);
      FIELD_METADATA.put(1, MY_INT_FIELD_FIELD_DESC);
      NAMES_TO_IDS.put("myStringField", 2);
      FIELD_METADATA.put(2, MY_STRING_FIELD_FIELD_DESC);
      NAMES_TO_IDS.put("myDataField", 3);
      FIELD_METADATA.put(3, MY_DATA_FIELD_FIELD_DESC);
      NAMES_TO_IDS.put("myEnum", 4);
      FIELD_METADATA.put(4, MY_ENUM_FIELD_DESC);
      NAMES_TO_IDS.put("oneway", 5);
      FIELD_METADATA.put(5, ONEWAY_FIELD_DESC);
      NAMES_TO_IDS.put("readonly", 6);
      FIELD_METADATA.put(6, READONLY_FIELD_DESC);
      NAMES_TO_IDS.put("idempotent", 7);
      FIELD_METADATA.put(7, IDEMPOTENT_FIELD_DESC);
    }
    
    @com.facebook.swift.codec.ThriftField(value=1, name="MyIntField", requiredness=Requiredness.NONE)
    public long getMyIntField() { return myIntField; }
    
    
    @com.facebook.swift.codec.ThriftField(value=2, name="MyStringField", requiredness=Requiredness.NONE)
    public String getMyStringField() { return myStringField; }
    
    
    @com.facebook.swift.codec.ThriftField(value=3, name="MyDataField", requiredness=Requiredness.NONE)
    public test.fixtures.basic.MyDataItem getMyDataField() { return myDataField; }
    
    
    @com.facebook.swift.codec.ThriftField(value=4, name="myEnum", requiredness=Requiredness.NONE)
    public test.fixtures.basic.MyEnum getMyEnum() { return myEnum; }
    
    
    @com.facebook.swift.codec.ThriftField(value=5, name="oneway", requiredness=Requiredness.NONE)
    public boolean isOneway() { return oneway; }
    
    
    @com.facebook.swift.codec.ThriftField(value=6, name="readonly", requiredness=Requiredness.NONE)
    public boolean isReadonly() { return readonly; }
    
    
    @com.facebook.swift.codec.ThriftField(value=7, name="idempotent", requiredness=Requiredness.NONE)
    public boolean isIdempotent() { return idempotent; }
    
    @java.lang.Override
    public String toString() {
        ToStringHelper helper = toStringHelper(this);
        helper.add("myIntField", myIntField);
        helper.add("myStringField", myStringField);
        helper.add("myDataField", myDataField);
        helper.add("myEnum", myEnum);
        helper.add("oneway", oneway);
        helper.add("readonly", readonly);
        helper.add("idempotent", idempotent);
        return helper.toString();
    }
    
    @java.lang.Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
    
        MyStruct other = (MyStruct)o;
    
        return
            Objects.equals(myIntField, other.myIntField) &&
            Objects.equals(myStringField, other.myStringField) &&
            Objects.equals(myDataField, other.myDataField) &&
            Objects.equals(myEnum, other.myEnum) &&
            Objects.equals(oneway, other.oneway) &&
            Objects.equals(readonly, other.readonly) &&
            Objects.equals(idempotent, other.idempotent) &&
            true;
    }
    
    @java.lang.Override
    public int hashCode() {
        return Arrays.deepHashCode(new Object[] {
            myIntField,
            myStringField,
            myDataField,
            myEnum,
            oneway,
            readonly,
            idempotent
        });
    }
    
    
    public static MyStruct read0(TProtocol oprot) throws TException {
      TField __field;
      oprot.readStructBegin(MyStruct.NAMES_TO_IDS, MyStruct.FIELD_METADATA);
      MyStruct.Builder builder = new MyStruct.Builder();
      while (true) {
        __field = oprot.readFieldBegin();
        if (__field.type == TType.STOP) { break; }
        switch (__field.id) {
        case _MYINTFIELD:
          if (__field.type == TType.I64) {
            long myIntField = oprot.readI64();
            builder.setMyIntField(myIntField);
          } else {
            TProtocolUtil.skip(oprot, __field.type);
          }
          break;
        case _MYSTRINGFIELD:
          if (__field.type == TType.STRING) {
            String myStringField = oprot.readString();
            builder.setMyStringField(myStringField);
          } else {
            TProtocolUtil.skip(oprot, __field.type);
          }
          break;
        case _MYDATAFIELD:
          if (__field.type == TType.STRUCT) {
            test.fixtures.basic.MyDataItem myDataField = test.fixtures.basic.MyDataItem.read0(oprot);
            builder.setMyDataField(myDataField);
          } else {
            TProtocolUtil.skip(oprot, __field.type);
          }
          break;
        case _MYENUM:
          if (__field.type == TType.I32) {
            test.fixtures.basic.MyEnum myEnum = test.fixtures.basic.MyEnum.fromInteger(oprot.readI32());
            builder.setMyEnum(myEnum);
          } else {
            TProtocolUtil.skip(oprot, __field.type);
          }
          break;
        case _ONEWAY:
          if (__field.type == TType.BOOL) {
            boolean oneway = oprot.readBool();
            builder.setOneway(oneway);
          } else {
            TProtocolUtil.skip(oprot, __field.type);
          }
          break;
        case _READONLY:
          if (__field.type == TType.BOOL) {
            boolean readonly = oprot.readBool();
            builder.setReadonly(readonly);
          } else {
            TProtocolUtil.skip(oprot, __field.type);
          }
          break;
        case _IDEMPOTENT:
          if (__field.type == TType.BOOL) {
            boolean idempotent = oprot.readBool();
            builder.setIdempotent(idempotent);
          } else {
            TProtocolUtil.skip(oprot, __field.type);
          }
          break;
        default:
          TProtocolUtil.skip(oprot, __field.type);
          break;
        }
        oprot.readFieldEnd();
      }
      oprot.readStructEnd();
      return builder.build();
    }
    
    public void write0(TProtocol oprot) throws TException {
      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(MY_INT_FIELD_FIELD_DESC);
      oprot.writeI64(this.myIntField);
      oprot.writeFieldEnd();
      if (this.myStringField != null) {
        oprot.writeFieldBegin(MY_STRING_FIELD_FIELD_DESC);
        oprot.writeString(this.myStringField);
        oprot.writeFieldEnd();
      }
      if (this.myDataField != null) {
        oprot.writeFieldBegin(MY_DATA_FIELD_FIELD_DESC);
        this.myDataField.write0(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(MY_ENUM_FIELD_DESC);
      oprot.writeI32(this.myEnum == null ? 0 : this.myEnum.getValue());
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(ONEWAY_FIELD_DESC);
      oprot.writeBool(this.oneway);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(READONLY_FIELD_DESC);
      oprot.writeBool(this.readonly);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(IDEMPOTENT_FIELD_DESC);
      oprot.writeBool(this.idempotent);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
    private static class _MyStructLazy {
        private static final MyStruct _DEFAULT = new MyStruct.Builder().build();
    }
    
    public static MyStruct defaultInstance() {
        return  _MyStructLazy._DEFAULT;
    }
}
