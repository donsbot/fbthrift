/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

package test.fixtures.complex_union;

import com.facebook.swift.codec.*;
import com.facebook.swift.codec.ThriftField.Requiredness;
import com.facebook.swift.codec.ThriftField.Recursiveness;
import java.util.*;

import static com.google.common.base.MoreObjects.toStringHelper;

@SwiftGenerated
@ThriftUnion("ListUnion")
public final class ListUnion {
    private static final Map<Short, String> ID_TO_THRIFT_NAME = new HashMap();
    static {
      ID_TO_THRIFT_NAME.put((short) 2, "intListValue");
      ID_TO_THRIFT_NAME.put((short) 3, "stringListValue");
    }
    private Object value;
    private short id;
    
    @ThriftConstructor
    public ListUnion() {
    }
    
    public static ListUnion fromIntListValue(final List<Long> intListValue) {
        ListUnion res = new ListUnion();
        res.value = intListValue;
        res.id = 2;
        return res;
    }
    
    public static ListUnion fromStringListValue(final List<String> stringListValue) {
        ListUnion res = new ListUnion();
        res.value = stringListValue;
        res.id = 3;
        return res;
    }
    
    @ThriftField
    @Deprecated
    public void setIntListValue(final List<Long> intListValue) {
        this.value = intListValue;
        this.id = 2;
    }
    @ThriftField
    @Deprecated
    public void setStringListValue(final List<String> stringListValue) {
        this.value = stringListValue;
        this.id = 3;
    }

    @ThriftField(value=2, name="intListValue", requiredness=Requiredness.NONE)
    public List<Long> getIntListValue() {
        if (this.id != 2) {
            throw new IllegalStateException("Not a intListValue element!");
        }
        return (List<Long>) value;
    }

    public boolean isSetIntListValue() {
        return this.id == 2;
    }

    @ThriftField(value=3, name="stringListValue", requiredness=Requiredness.NONE)
    public List<String> getStringListValue() {
        if (this.id != 3) {
            throw new IllegalStateException("Not a stringListValue element!");
        }
        return (List<String>) value;
    }

    public boolean isSetStringListValue() {
        return this.id == 3;
    }

    @ThriftUnionId
    public short getThriftId() {
        return this.id;
    }

    public String getThriftName() {
        return ID_TO_THRIFT_NAME.get(this.id);
    }

    @Override
    public String toString() {
        return toStringHelper(this)
            .add("value", value)
            .add("id", id)
            .add("name", getThriftName())
            .add("type", value == null ? "<null>" : value.getClass().getSimpleName())
            .toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        ListUnion other = (ListUnion)o;

        return Objects.equals(this.id, other.id)
                && Objects.deepEquals(this.value, other.value);
    }

    @Override
    public int hashCode() {
        return Arrays.deepHashCode(new Object[] {
            id,
            value,
        });
    }
}
