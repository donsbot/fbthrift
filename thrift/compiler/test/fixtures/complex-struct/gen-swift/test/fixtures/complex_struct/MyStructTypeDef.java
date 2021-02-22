/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

package test.fixtures.complex_struct;

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
@com.facebook.swift.codec.ThriftStruct(value="MyStructTypeDef", builder=MyStructTypeDef.Builder.class)
public final class MyStructTypeDef {

    @ThriftConstructor
    public MyStructTypeDef(
        @com.facebook.swift.codec.ThriftField(value=1, name="myLongField", requiredness=Requiredness.NONE) final long myLongField,
        @com.facebook.swift.codec.ThriftField(value=2, name="myLongTypeDef", requiredness=Requiredness.NONE) final long myLongTypeDef,
        @com.facebook.swift.codec.ThriftField(value=3, name="myStringField", requiredness=Requiredness.NONE) final String myStringField,
        @com.facebook.swift.codec.ThriftField(value=4, name="myStringTypedef", requiredness=Requiredness.NONE) final String myStringTypedef,
        @com.facebook.swift.codec.ThriftField(value=5, name="myMapField", requiredness=Requiredness.NONE) final Map<Short, String> myMapField,
        @com.facebook.swift.codec.ThriftField(value=6, name="myMapTypedef", requiredness=Requiredness.NONE) final Map<Short, String> myMapTypedef,
        @com.facebook.swift.codec.ThriftField(value=7, name="myListField", requiredness=Requiredness.NONE) final List<Double> myListField,
        @com.facebook.swift.codec.ThriftField(value=8, name="myListTypedef", requiredness=Requiredness.NONE) final List<Double> myListTypedef,
        @com.facebook.swift.codec.ThriftField(value=9, name="myMapListOfTypeDef", requiredness=Requiredness.NONE) final Map<Short, List<List<Double>>> myMapListOfTypeDef
    ) {
        this.myLongField = myLongField;
        this.myLongTypeDef = myLongTypeDef;
        this.myStringField = myStringField;
        this.myStringTypedef = myStringTypedef;
        this.myMapField = myMapField;
        this.myMapTypedef = myMapTypedef;
        this.myListField = myListField;
        this.myListTypedef = myListTypedef;
        this.myMapListOfTypeDef = myMapListOfTypeDef;
    }
    
    @ThriftConstructor
    protected MyStructTypeDef() {
      this.myLongField = 0L;
      this.myLongTypeDef = 0L;
      this.myStringField = null;
      this.myStringTypedef = null;
      this.myMapField = null;
      this.myMapTypedef = null;
      this.myListField = null;
      this.myListTypedef = null;
      this.myMapListOfTypeDef = null;
    }
    
    public static class Builder {
    
        private long myLongField = 0L;
        private long myLongTypeDef = 0L;
        private String myStringField = null;
        private String myStringTypedef = null;
        private Map<Short, String> myMapField = null;
        private Map<Short, String> myMapTypedef = null;
        private List<Double> myListField = null;
        private List<Double> myListTypedef = null;
        private Map<Short, List<List<Double>>> myMapListOfTypeDef = null;
    
        @com.facebook.swift.codec.ThriftField(value=1, name="myLongField", requiredness=Requiredness.NONE)
        public Builder setMyLongField(long myLongField) {
            this.myLongField = myLongField;
            return this;
        }
    
        public long getMyLongField() { return myLongField; }
    
            @com.facebook.swift.codec.ThriftField(value=2, name="myLongTypeDef", requiredness=Requiredness.NONE)
        public Builder setMyLongTypeDef(long myLongTypeDef) {
            this.myLongTypeDef = myLongTypeDef;
            return this;
        }
    
        public long getMyLongTypeDef() { return myLongTypeDef; }
    
            @com.facebook.swift.codec.ThriftField(value=3, name="myStringField", requiredness=Requiredness.NONE)
        public Builder setMyStringField(String myStringField) {
            this.myStringField = myStringField;
            return this;
        }
    
        public String getMyStringField() { return myStringField; }
    
            @com.facebook.swift.codec.ThriftField(value=4, name="myStringTypedef", requiredness=Requiredness.NONE)
        public Builder setMyStringTypedef(String myStringTypedef) {
            this.myStringTypedef = myStringTypedef;
            return this;
        }
    
        public String getMyStringTypedef() { return myStringTypedef; }
    
            @com.facebook.swift.codec.ThriftField(value=5, name="myMapField", requiredness=Requiredness.NONE)
        public Builder setMyMapField(Map<Short, String> myMapField) {
            this.myMapField = myMapField;
            return this;
        }
    
        public Map<Short, String> getMyMapField() { return myMapField; }
    
            @com.facebook.swift.codec.ThriftField(value=6, name="myMapTypedef", requiredness=Requiredness.NONE)
        public Builder setMyMapTypedef(Map<Short, String> myMapTypedef) {
            this.myMapTypedef = myMapTypedef;
            return this;
        }
    
        public Map<Short, String> getMyMapTypedef() { return myMapTypedef; }
    
            @com.facebook.swift.codec.ThriftField(value=7, name="myListField", requiredness=Requiredness.NONE)
        public Builder setMyListField(List<Double> myListField) {
            this.myListField = myListField;
            return this;
        }
    
        public List<Double> getMyListField() { return myListField; }
    
            @com.facebook.swift.codec.ThriftField(value=8, name="myListTypedef", requiredness=Requiredness.NONE)
        public Builder setMyListTypedef(List<Double> myListTypedef) {
            this.myListTypedef = myListTypedef;
            return this;
        }
    
        public List<Double> getMyListTypedef() { return myListTypedef; }
    
            @com.facebook.swift.codec.ThriftField(value=9, name="myMapListOfTypeDef", requiredness=Requiredness.NONE)
        public Builder setMyMapListOfTypeDef(Map<Short, List<List<Double>>> myMapListOfTypeDef) {
            this.myMapListOfTypeDef = myMapListOfTypeDef;
            return this;
        }
    
        public Map<Short, List<List<Double>>> getMyMapListOfTypeDef() { return myMapListOfTypeDef; }
    
        public Builder() { }
        public Builder(MyStructTypeDef other) {
            this.myLongField = other.myLongField;
            this.myLongTypeDef = other.myLongTypeDef;
            this.myStringField = other.myStringField;
            this.myStringTypedef = other.myStringTypedef;
            this.myMapField = other.myMapField;
            this.myMapTypedef = other.myMapTypedef;
            this.myListField = other.myListField;
            this.myListTypedef = other.myListTypedef;
            this.myMapListOfTypeDef = other.myMapListOfTypeDef;
        }
    
        @ThriftConstructor
        public MyStructTypeDef build() {
            MyStructTypeDef result = new MyStructTypeDef (
                this.myLongField,
                this.myLongTypeDef,
                this.myStringField,
                this.myStringTypedef,
                this.myMapField,
                this.myMapTypedef,
                this.myListField,
                this.myListTypedef,
                this.myMapListOfTypeDef
            );
            return result;
        }
    }
    
    public static final Map<String, Integer> NAMES_TO_IDS = new HashMap();
    public static final Map<Integer, TField> FIELD_METADATA = new HashMap<>();
    private static final TStruct STRUCT_DESC = new TStruct("MyStructTypeDef");
    private final long myLongField;
    public static final int _MYLONGFIELD = 1;
    private static final TField MY_LONG_FIELD_FIELD_DESC = new TField("myLongField", TType.I64, (short)1);
        private final long myLongTypeDef;
    public static final int _MYLONGTYPEDEF = 2;
    private static final TField MY_LONG_TYPE_DEF_FIELD_DESC = new TField("myLongTypeDef", TType.I64, (short)2);
        private final String myStringField;
    public static final int _MYSTRINGFIELD = 3;
    private static final TField MY_STRING_FIELD_FIELD_DESC = new TField("myStringField", TType.STRING, (short)3);
        private final String myStringTypedef;
    public static final int _MYSTRINGTYPEDEF = 4;
    private static final TField MY_STRING_TYPEDEF_FIELD_DESC = new TField("myStringTypedef", TType.STRING, (short)4);
        private final Map<Short, String> myMapField;
    public static final int _MYMAPFIELD = 5;
    private static final TField MY_MAP_FIELD_FIELD_DESC = new TField("myMapField", TType.MAP, (short)5);
        private final Map<Short, String> myMapTypedef;
    public static final int _MYMAPTYPEDEF = 6;
    private static final TField MY_MAP_TYPEDEF_FIELD_DESC = new TField("myMapTypedef", TType.MAP, (short)6);
        private final List<Double> myListField;
    public static final int _MYLISTFIELD = 7;
    private static final TField MY_LIST_FIELD_FIELD_DESC = new TField("myListField", TType.LIST, (short)7);
        private final List<Double> myListTypedef;
    public static final int _MYLISTTYPEDEF = 8;
    private static final TField MY_LIST_TYPEDEF_FIELD_DESC = new TField("myListTypedef", TType.LIST, (short)8);
        private final Map<Short, List<List<Double>>> myMapListOfTypeDef;
    public static final int _MYMAPLISTOFTYPEDEF = 9;
    private static final TField MY_MAP_LIST_OF_TYPE_DEF_FIELD_DESC = new TField("myMapListOfTypeDef", TType.MAP, (short)9);
    static {
      NAMES_TO_IDS.put("myLongField", 1);
      FIELD_METADATA.put(1, MY_LONG_FIELD_FIELD_DESC);
      NAMES_TO_IDS.put("myLongTypeDef", 2);
      FIELD_METADATA.put(2, MY_LONG_TYPE_DEF_FIELD_DESC);
      NAMES_TO_IDS.put("myStringField", 3);
      FIELD_METADATA.put(3, MY_STRING_FIELD_FIELD_DESC);
      NAMES_TO_IDS.put("myStringTypedef", 4);
      FIELD_METADATA.put(4, MY_STRING_TYPEDEF_FIELD_DESC);
      NAMES_TO_IDS.put("myMapField", 5);
      FIELD_METADATA.put(5, MY_MAP_FIELD_FIELD_DESC);
      NAMES_TO_IDS.put("myMapTypedef", 6);
      FIELD_METADATA.put(6, MY_MAP_TYPEDEF_FIELD_DESC);
      NAMES_TO_IDS.put("myListField", 7);
      FIELD_METADATA.put(7, MY_LIST_FIELD_FIELD_DESC);
      NAMES_TO_IDS.put("myListTypedef", 8);
      FIELD_METADATA.put(8, MY_LIST_TYPEDEF_FIELD_DESC);
      NAMES_TO_IDS.put("myMapListOfTypeDef", 9);
      FIELD_METADATA.put(9, MY_MAP_LIST_OF_TYPE_DEF_FIELD_DESC);
    }
    
    @com.facebook.swift.codec.ThriftField(value=1, name="myLongField", requiredness=Requiredness.NONE)
    public long getMyLongField() { return myLongField; }
    
    
    @com.facebook.swift.codec.ThriftField(value=2, name="myLongTypeDef", requiredness=Requiredness.NONE)
    public long getMyLongTypeDef() { return myLongTypeDef; }
    
    
    @com.facebook.swift.codec.ThriftField(value=3, name="myStringField", requiredness=Requiredness.NONE)
    public String getMyStringField() { return myStringField; }
    
    
    @com.facebook.swift.codec.ThriftField(value=4, name="myStringTypedef", requiredness=Requiredness.NONE)
    public String getMyStringTypedef() { return myStringTypedef; }
    
    
    @com.facebook.swift.codec.ThriftField(value=5, name="myMapField", requiredness=Requiredness.NONE)
    public Map<Short, String> getMyMapField() { return myMapField; }
    
    
    @com.facebook.swift.codec.ThriftField(value=6, name="myMapTypedef", requiredness=Requiredness.NONE)
    public Map<Short, String> getMyMapTypedef() { return myMapTypedef; }
    
    
    @com.facebook.swift.codec.ThriftField(value=7, name="myListField", requiredness=Requiredness.NONE)
    public List<Double> getMyListField() { return myListField; }
    
    
    @com.facebook.swift.codec.ThriftField(value=8, name="myListTypedef", requiredness=Requiredness.NONE)
    public List<Double> getMyListTypedef() { return myListTypedef; }
    
    
    @com.facebook.swift.codec.ThriftField(value=9, name="myMapListOfTypeDef", requiredness=Requiredness.NONE)
    public Map<Short, List<List<Double>>> getMyMapListOfTypeDef() { return myMapListOfTypeDef; }
    
    @java.lang.Override
    public String toString() {
        ToStringHelper helper = toStringHelper(this);
        helper.add("myLongField", myLongField);
        helper.add("myLongTypeDef", myLongTypeDef);
        helper.add("myStringField", myStringField);
        helper.add("myStringTypedef", myStringTypedef);
        helper.add("myMapField", myMapField);
        helper.add("myMapTypedef", myMapTypedef);
        helper.add("myListField", myListField);
        helper.add("myListTypedef", myListTypedef);
        helper.add("myMapListOfTypeDef", myMapListOfTypeDef);
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
    
        MyStructTypeDef other = (MyStructTypeDef)o;
    
        return
            Objects.equals(myLongField, other.myLongField) &&
            Objects.equals(myLongTypeDef, other.myLongTypeDef) &&
            Objects.equals(myStringField, other.myStringField) &&
            Objects.equals(myStringTypedef, other.myStringTypedef) &&
            Objects.equals(myMapField, other.myMapField) &&
            Objects.equals(myMapTypedef, other.myMapTypedef) &&
            Objects.equals(myListField, other.myListField) &&
            Objects.equals(myListTypedef, other.myListTypedef) &&
            Objects.equals(myMapListOfTypeDef, other.myMapListOfTypeDef) &&
            true;
    }
    
    @java.lang.Override
    public int hashCode() {
        return Arrays.deepHashCode(new Object[] {
            myLongField,
            myLongTypeDef,
            myStringField,
            myStringTypedef,
            myMapField,
            myMapTypedef,
            myListField,
            myListTypedef,
            myMapListOfTypeDef
        });
    }
    
    
    public static MyStructTypeDef read0(TProtocol oprot) throws TException {
      TField __field;
      oprot.readStructBegin(MyStructTypeDef.NAMES_TO_IDS, MyStructTypeDef.FIELD_METADATA);
      MyStructTypeDef.Builder builder = new MyStructTypeDef.Builder();
      while (true) {
        __field = oprot.readFieldBegin();
        if (__field.type == TType.STOP) { break; }
        switch (__field.id) {
        case _MYLONGFIELD:
          if (__field.type == TType.I64) {
            long myLongField = oprot.readI64();
            builder.setMyLongField(myLongField);
          } else {
            TProtocolUtil.skip(oprot, __field.type);
          }
          break;
        case _MYLONGTYPEDEF:
          if (__field.type == TType.I64) {
            long myLongTypeDef = oprot.readI64();
            builder.setMyLongTypeDef(myLongTypeDef);
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
        case _MYSTRINGTYPEDEF:
          if (__field.type == TType.STRING) {
            String myStringTypedef = oprot.readString();
            builder.setMyStringTypedef(myStringTypedef);
          } else {
            TProtocolUtil.skip(oprot, __field.type);
          }
          break;
        case _MYMAPFIELD:
          if (__field.type == TType.MAP) {
            Map<Short, String> myMapField;
            {
            TMap _map = oprot.readMapBegin();
            myMapField = new HashMap<Short, String>(Math.max(0, _map.size));
            for (int _i = 0; (_map.size < 0) ? oprot.peekMap() : (_i < _map.size); _i++) {
                
                short _key1 = oprot.readI16();
                String _value1 = oprot.readString();
                myMapField.put(_key1, _value1);
            }
            }
            oprot.readMapEnd();
            builder.setMyMapField(myMapField);
          } else {
            TProtocolUtil.skip(oprot, __field.type);
          }
          break;
        case _MYMAPTYPEDEF:
          if (__field.type == TType.MAP) {
            Map<Short, String> myMapTypedef;
            {
            TMap _map = oprot.readMapBegin();
            myMapTypedef = new HashMap<Short, String>(Math.max(0, _map.size));
            for (int _i = 0; (_map.size < 0) ? oprot.peekMap() : (_i < _map.size); _i++) {
                
                short _key1 = oprot.readI16();
                String _value1 = oprot.readString();
                myMapTypedef.put(_key1, _value1);
            }
            }
            oprot.readMapEnd();
            builder.setMyMapTypedef(myMapTypedef);
          } else {
            TProtocolUtil.skip(oprot, __field.type);
          }
          break;
        case _MYLISTFIELD:
          if (__field.type == TType.LIST) {
            List<Double> myListField;
            {
            TList _list = oprot.readListBegin();
            myListField = new ArrayList<Double>(Math.max(0, _list.size));
            for (int _i = 0; (_list.size < 0) ? oprot.peekList() : (_i < _list.size); _i++) {
                
                double _value1 = oprot.readDouble();
                myListField.add(_value1);
            }
            oprot.readListEnd();
            }
            builder.setMyListField(myListField);
          } else {
            TProtocolUtil.skip(oprot, __field.type);
          }
          break;
        case _MYLISTTYPEDEF:
          if (__field.type == TType.LIST) {
            List<Double> myListTypedef;
            {
            TList _list = oprot.readListBegin();
            myListTypedef = new ArrayList<Double>(Math.max(0, _list.size));
            for (int _i = 0; (_list.size < 0) ? oprot.peekList() : (_i < _list.size); _i++) {
                
                double _value1 = oprot.readDouble();
                myListTypedef.add(_value1);
            }
            oprot.readListEnd();
            }
            builder.setMyListTypedef(myListTypedef);
          } else {
            TProtocolUtil.skip(oprot, __field.type);
          }
          break;
        case _MYMAPLISTOFTYPEDEF:
          if (__field.type == TType.MAP) {
            Map<Short, List<List<Double>>> myMapListOfTypeDef;
            {
            TMap _map = oprot.readMapBegin();
            myMapListOfTypeDef = new HashMap<Short, List<List<Double>>>(Math.max(0, _map.size));
            for (int _i = 0; (_map.size < 0) ? oprot.peekMap() : (_i < _map.size); _i++) {
                
                short _key1 = oprot.readI16();
                List<List<Double>> _value1;
                            {
                            TList _list1 = oprot.readListBegin();
                            _value1 = new ArrayList<List<Double>>(Math.max(0, _list1.size));
                            for (int _i1 = 0; (_list1.size < 0) ? oprot.peekList() : (_i1 < _list1.size); _i1++) {
                                
                                List<Double> _value2;
            {
            TList _list2 = oprot.readListBegin();
            _value2 = new ArrayList<Double>(Math.max(0, _list2.size));
            for (int _i2 = 0; (_list2.size < 0) ? oprot.peekList() : (_i2 < _list2.size); _i2++) {
                
                
                double _value3 = oprot.readDouble();
                
                
                _value2.add(_value3);
                
            }
            oprot.readListEnd();
            }

                                
                                _value1.add(_value2);
                                
                            }
                            oprot.readListEnd();
                            }
                                myMapListOfTypeDef.put(_key1, _value1);
            }
            }
            oprot.readMapEnd();
            builder.setMyMapListOfTypeDef(myMapListOfTypeDef);
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
      oprot.writeFieldBegin(MY_LONG_FIELD_FIELD_DESC);
      oprot.writeI64(this.myLongField);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(MY_LONG_TYPE_DEF_FIELD_DESC);
      oprot.writeI64(this.myLongTypeDef);
      oprot.writeFieldEnd();
      if (this.myStringField != null) {
        oprot.writeFieldBegin(MY_STRING_FIELD_FIELD_DESC);
        oprot.writeString(this.myStringField);
        oprot.writeFieldEnd();
      }
      if (this.myStringTypedef != null) {
        oprot.writeFieldBegin(MY_STRING_TYPEDEF_FIELD_DESC);
        oprot.writeString(this.myStringTypedef);
        oprot.writeFieldEnd();
      }
      if (this.myMapField != null) {
        oprot.writeFieldBegin(MY_MAP_FIELD_FIELD_DESC);
        Map<Short, String> _iter0 = this.myMapField;
        oprot.writeMapBegin(new TMap(TType.I16, TType.STRING, _iter0.size()));
        for (Map.Entry<Short, String> _iter1 : _iter0.entrySet()) {
          oprot.writeI16(_iter1.getKey());
          oprot.writeString(_iter1.getValue());
        }
        oprot.writeMapEnd();
        oprot.writeFieldEnd();
      }
      if (this.myMapTypedef != null) {
        oprot.writeFieldBegin(MY_MAP_TYPEDEF_FIELD_DESC);
        Map<Short, String> _iter0 = this.myMapTypedef;
        oprot.writeMapBegin(new TMap(TType.I16, TType.STRING, _iter0.size()));
        for (Map.Entry<Short, String> _iter1 : _iter0.entrySet()) {
          oprot.writeI16(_iter1.getKey());
          oprot.writeString(_iter1.getValue());
        }
        oprot.writeMapEnd();
        oprot.writeFieldEnd();
      }
      if (this.myListField != null) {
        oprot.writeFieldBegin(MY_LIST_FIELD_FIELD_DESC);
        List<Double> _iter0 = this.myListField;
        oprot.writeListBegin(new TList(TType.DOUBLE, _iter0.size()));
        for (double _iter1 : _iter0) {
          oprot.writeDouble(_iter1);
        }
        oprot.writeListEnd();
        oprot.writeFieldEnd();
      }
      if (this.myListTypedef != null) {
        oprot.writeFieldBegin(MY_LIST_TYPEDEF_FIELD_DESC);
        List<Double> _iter0 = this.myListTypedef;
        oprot.writeListBegin(new TList(TType.DOUBLE, _iter0.size()));
        for (double _iter1 : _iter0) {
          oprot.writeDouble(_iter1);
        }
        oprot.writeListEnd();
        oprot.writeFieldEnd();
      }
      if (this.myMapListOfTypeDef != null) {
        oprot.writeFieldBegin(MY_MAP_LIST_OF_TYPE_DEF_FIELD_DESC);
        Map<Short, List<List<Double>>> _iter0 = this.myMapListOfTypeDef;
        oprot.writeMapBegin(new TMap(TType.I16, TType.LIST, _iter0.size()));
        for (Map.Entry<Short, List<List<Double>>> _iter1 : _iter0.entrySet()) {
          oprot.writeI16(_iter1.getKey());
          
          oprot.writeListBegin(new TList(TType.LIST, _iter1.getValue().size()));
        for (List<Double> _iter2 : _iter1.getValue()) {
          oprot.writeListBegin(new TList(TType.DOUBLE, _iter2.size()));
        for (double _iter3 : _iter2) {
          oprot.writeDouble(_iter3);
        }
        oprot.writeListEnd();
        }
        oprot.writeListEnd();
        }
        oprot.writeMapEnd();
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
    private static class _MyStructTypeDefLazy {
        private static final MyStructTypeDef _DEFAULT = new MyStructTypeDef.Builder().build();
    }
    
    public static MyStructTypeDef defaultInstance() {
        return  _MyStructTypeDefLazy._DEFAULT;
    }
}
