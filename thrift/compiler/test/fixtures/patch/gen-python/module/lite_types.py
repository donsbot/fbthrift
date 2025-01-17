#
# Autogenerated by Thrift
#
# DO NOT EDIT
#  @generated
#
import folly.iobuf as _fbthrift_iobuf
import thrift.py3lite.types as _fbthrift_py3lite_types
import thrift.py3lite.exceptions as _fbthrift_py3lite_exceptions


import patch.lite_types


class MyData(metaclass=_fbthrift_py3lite_types.StructMeta):
    _fbthrift_SPEC = (
        (
            1,  # id
            True,  # isUnqualified
            "data1",  # name
            _fbthrift_py3lite_types.typeinfo_string,  # typeinfo
            None,  # default value
        ),
        (
            2,  # id
            True,  # isUnqualified
            "data2",  # name
            _fbthrift_py3lite_types.typeinfo_i32,  # typeinfo
            None,  # default value
        ),
    )

    @staticmethod
    def __get_thrift_name__() -> str:
        return "module.MyData"

    @staticmethod
    def __get_thrift_uri__():
        return "test.dev/fixtures/patch/MyData"

    @staticmethod
    def __get_metadata__():
        return _fbthrift_metadata__struct_MyData()



class MyStruct(metaclass=_fbthrift_py3lite_types.StructMeta):
    _fbthrift_SPEC = (
        (
            1,  # id
            True,  # isUnqualified
            "boolVal",  # name
            _fbthrift_py3lite_types.typeinfo_bool,  # typeinfo
            None,  # default value
        ),
        (
            2,  # id
            True,  # isUnqualified
            "byteVal",  # name
            _fbthrift_py3lite_types.typeinfo_byte,  # typeinfo
            None,  # default value
        ),
        (
            3,  # id
            True,  # isUnqualified
            "i16Val",  # name
            _fbthrift_py3lite_types.typeinfo_i16,  # typeinfo
            None,  # default value
        ),
        (
            4,  # id
            True,  # isUnqualified
            "i32Val",  # name
            _fbthrift_py3lite_types.typeinfo_i32,  # typeinfo
            None,  # default value
        ),
        (
            5,  # id
            True,  # isUnqualified
            "i64Val",  # name
            _fbthrift_py3lite_types.typeinfo_i64,  # typeinfo
            None,  # default value
        ),
        (
            6,  # id
            True,  # isUnqualified
            "floatVal",  # name
            _fbthrift_py3lite_types.typeinfo_float,  # typeinfo
            None,  # default value
        ),
        (
            7,  # id
            True,  # isUnqualified
            "doubleVal",  # name
            _fbthrift_py3lite_types.typeinfo_double,  # typeinfo
            None,  # default value
        ),
        (
            8,  # id
            True,  # isUnqualified
            "stringVal",  # name
            _fbthrift_py3lite_types.typeinfo_string,  # typeinfo
            None,  # default value
        ),
        (
            9,  # id
            True,  # isUnqualified
            "binaryVal",  # name
            _fbthrift_py3lite_types.typeinfo_binary,  # typeinfo
            None,  # default value
        ),
        (
            10,  # id
            True,  # isUnqualified
            "structVal",  # name
            lambda: _fbthrift_py3lite_types.StructTypeInfo(MyData),  # typeinfo
            None,  # default value
        ),
        (
            11,  # id
            False,  # isUnqualified
            "optBoolVal",  # name
            _fbthrift_py3lite_types.typeinfo_bool,  # typeinfo
            None,  # default value
        ),
        (
            12,  # id
            False,  # isUnqualified
            "optByteVal",  # name
            _fbthrift_py3lite_types.typeinfo_byte,  # typeinfo
            None,  # default value
        ),
        (
            13,  # id
            False,  # isUnqualified
            "optI16Val",  # name
            _fbthrift_py3lite_types.typeinfo_i16,  # typeinfo
            None,  # default value
        ),
        (
            14,  # id
            False,  # isUnqualified
            "optI32Val",  # name
            _fbthrift_py3lite_types.typeinfo_i32,  # typeinfo
            None,  # default value
        ),
        (
            15,  # id
            False,  # isUnqualified
            "optI64Val",  # name
            _fbthrift_py3lite_types.typeinfo_i64,  # typeinfo
            None,  # default value
        ),
        (
            16,  # id
            False,  # isUnqualified
            "optFloatVal",  # name
            _fbthrift_py3lite_types.typeinfo_float,  # typeinfo
            None,  # default value
        ),
        (
            17,  # id
            False,  # isUnqualified
            "optDoubleVal",  # name
            _fbthrift_py3lite_types.typeinfo_double,  # typeinfo
            None,  # default value
        ),
        (
            18,  # id
            False,  # isUnqualified
            "optStringVal",  # name
            _fbthrift_py3lite_types.typeinfo_string,  # typeinfo
            None,  # default value
        ),
        (
            19,  # id
            False,  # isUnqualified
            "optBinaryVal",  # name
            _fbthrift_py3lite_types.typeinfo_binary,  # typeinfo
            None,  # default value
        ),
        (
            20,  # id
            False,  # isUnqualified
            "optStructVal",  # name
            lambda: _fbthrift_py3lite_types.StructTypeInfo(MyData),  # typeinfo
            None,  # default value
        ),
        (
            21,  # id
            False,  # isUnqualified
            "optListVal",  # name
            lambda: _fbthrift_py3lite_types.ListTypeInfo(_fbthrift_py3lite_types.typeinfo_i16),  # typeinfo
            None,  # default value
        ),
        (
            22,  # id
            False,  # isUnqualified
            "optSetVal",  # name
            lambda: _fbthrift_py3lite_types.SetTypeInfo(_fbthrift_py3lite_types.typeinfo_string),  # typeinfo
            None,  # default value
        ),
        (
            23,  # id
            False,  # isUnqualified
            "optMapVal",  # name
            lambda: _fbthrift_py3lite_types.MapTypeInfo(_fbthrift_py3lite_types.typeinfo_string, _fbthrift_py3lite_types.typeinfo_string),  # typeinfo
            None,  # default value
        ),
    )

    @staticmethod
    def __get_thrift_name__() -> str:
        return "module.MyStruct"

    @staticmethod
    def __get_thrift_uri__():
        return "test.dev/fixtures/patch/MyStruct"

    @staticmethod
    def __get_metadata__():
        return _fbthrift_metadata__struct_MyStruct()



class MyDataPatch(metaclass=_fbthrift_py3lite_types.StructMeta):
    _fbthrift_SPEC = (
        (
            1,  # id
            True,  # isUnqualified
            "data1",  # name
            lambda: _fbthrift_py3lite_types.StructTypeInfo(patch.lite_types.StringPatch),  # typeinfo
            None,  # default value
        ),
        (
            2,  # id
            True,  # isUnqualified
            "data2",  # name
            lambda: _fbthrift_py3lite_types.StructTypeInfo(patch.lite_types.I32Patch),  # typeinfo
            None,  # default value
        ),
    )

    @staticmethod
    def __get_thrift_name__() -> str:
        return "module.MyDataPatch"

    @staticmethod
    def __get_thrift_uri__():
        return "test.dev/fixtures/patch/MyDataPatch"

    @staticmethod
    def __get_metadata__():
        return _fbthrift_metadata__struct_MyDataPatch()



class MyDataValuePatch(metaclass=_fbthrift_py3lite_types.StructMeta):
    _fbthrift_SPEC = (
        (
            1,  # id
            False,  # isUnqualified
            "assign",  # name
            lambda: _fbthrift_py3lite_types.StructTypeInfo(MyData),  # typeinfo
            None,  # default value
        ),
        (
            2,  # id
            True,  # isUnqualified
            "clear",  # name
            _fbthrift_py3lite_types.typeinfo_bool,  # typeinfo
            None,  # default value
        ),
        (
            3,  # id
            True,  # isUnqualified
            "patch",  # name
            lambda: _fbthrift_py3lite_types.StructTypeInfo(MyDataPatch),  # typeinfo
            None,  # default value
        ),
    )

    @staticmethod
    def __get_thrift_name__() -> str:
        return "module.MyDataValuePatch"

    @staticmethod
    def __get_thrift_uri__():
        return "test.dev/fixtures/patch/MyDataValuePatch"

    @staticmethod
    def __get_metadata__():
        return _fbthrift_metadata__struct_MyDataValuePatch()



class OptionalMyDataValuePatch(metaclass=_fbthrift_py3lite_types.StructMeta):
    _fbthrift_SPEC = (
        (
            2,  # id
            True,  # isUnqualified
            "clear",  # name
            _fbthrift_py3lite_types.typeinfo_bool,  # typeinfo
            None,  # default value
        ),
        (
            3,  # id
            True,  # isUnqualified
            "patch",  # name
            lambda: _fbthrift_py3lite_types.StructTypeInfo(MyDataValuePatch),  # typeinfo
            None,  # default value
        ),
        (
            1,  # id
            False,  # isUnqualified
            "ensure",  # name
            lambda: _fbthrift_py3lite_types.StructTypeInfo(MyData),  # typeinfo
            None,  # default value
        ),
        (
            4,  # id
            True,  # isUnqualified
            "patchAfter",  # name
            lambda: _fbthrift_py3lite_types.StructTypeInfo(MyDataValuePatch),  # typeinfo
            None,  # default value
        ),
    )

    @staticmethod
    def __get_thrift_name__() -> str:
        return "module.OptionalMyDataValuePatch"

    @staticmethod
    def __get_thrift_uri__():
        return "test.dev/fixtures/patch/OptionalMyDataValuePatch"

    @staticmethod
    def __get_metadata__():
        return _fbthrift_metadata__struct_OptionalMyDataValuePatch()



class MyStructPatch(metaclass=_fbthrift_py3lite_types.StructMeta):
    _fbthrift_SPEC = (
        (
            1,  # id
            True,  # isUnqualified
            "boolVal",  # name
            lambda: _fbthrift_py3lite_types.StructTypeInfo(patch.lite_types.BoolPatch),  # typeinfo
            None,  # default value
        ),
        (
            2,  # id
            True,  # isUnqualified
            "byteVal",  # name
            lambda: _fbthrift_py3lite_types.StructTypeInfo(patch.lite_types.BytePatch),  # typeinfo
            None,  # default value
        ),
        (
            3,  # id
            True,  # isUnqualified
            "i16Val",  # name
            lambda: _fbthrift_py3lite_types.StructTypeInfo(patch.lite_types.I16Patch),  # typeinfo
            None,  # default value
        ),
        (
            4,  # id
            True,  # isUnqualified
            "i32Val",  # name
            lambda: _fbthrift_py3lite_types.StructTypeInfo(patch.lite_types.I32Patch),  # typeinfo
            None,  # default value
        ),
        (
            5,  # id
            True,  # isUnqualified
            "i64Val",  # name
            lambda: _fbthrift_py3lite_types.StructTypeInfo(patch.lite_types.I64Patch),  # typeinfo
            None,  # default value
        ),
        (
            6,  # id
            True,  # isUnqualified
            "floatVal",  # name
            lambda: _fbthrift_py3lite_types.StructTypeInfo(patch.lite_types.FloatPatch),  # typeinfo
            None,  # default value
        ),
        (
            7,  # id
            True,  # isUnqualified
            "doubleVal",  # name
            lambda: _fbthrift_py3lite_types.StructTypeInfo(patch.lite_types.DoublePatch),  # typeinfo
            None,  # default value
        ),
        (
            8,  # id
            True,  # isUnqualified
            "stringVal",  # name
            lambda: _fbthrift_py3lite_types.StructTypeInfo(patch.lite_types.StringPatch),  # typeinfo
            None,  # default value
        ),
        (
            9,  # id
            True,  # isUnqualified
            "binaryVal",  # name
            lambda: _fbthrift_py3lite_types.StructTypeInfo(patch.lite_types.BinaryPatch),  # typeinfo
            None,  # default value
        ),
        (
            10,  # id
            True,  # isUnqualified
            "structVal",  # name
            lambda: _fbthrift_py3lite_types.StructTypeInfo(MyDataValuePatch),  # typeinfo
            None,  # default value
        ),
        (
            11,  # id
            True,  # isUnqualified
            "optBoolVal",  # name
            lambda: _fbthrift_py3lite_types.StructTypeInfo(patch.lite_types.OptionalBoolPatch),  # typeinfo
            None,  # default value
        ),
        (
            12,  # id
            True,  # isUnqualified
            "optByteVal",  # name
            lambda: _fbthrift_py3lite_types.StructTypeInfo(patch.lite_types.OptionalBytePatch),  # typeinfo
            None,  # default value
        ),
        (
            13,  # id
            True,  # isUnqualified
            "optI16Val",  # name
            lambda: _fbthrift_py3lite_types.StructTypeInfo(patch.lite_types.OptionalI16Patch),  # typeinfo
            None,  # default value
        ),
        (
            14,  # id
            True,  # isUnqualified
            "optI32Val",  # name
            lambda: _fbthrift_py3lite_types.StructTypeInfo(patch.lite_types.OptionalI32Patch),  # typeinfo
            None,  # default value
        ),
        (
            15,  # id
            True,  # isUnqualified
            "optI64Val",  # name
            lambda: _fbthrift_py3lite_types.StructTypeInfo(patch.lite_types.OptionalI64Patch),  # typeinfo
            None,  # default value
        ),
        (
            16,  # id
            True,  # isUnqualified
            "optFloatVal",  # name
            lambda: _fbthrift_py3lite_types.StructTypeInfo(patch.lite_types.OptionalFloatPatch),  # typeinfo
            None,  # default value
        ),
        (
            17,  # id
            True,  # isUnqualified
            "optDoubleVal",  # name
            lambda: _fbthrift_py3lite_types.StructTypeInfo(patch.lite_types.OptionalDoublePatch),  # typeinfo
            None,  # default value
        ),
        (
            18,  # id
            True,  # isUnqualified
            "optStringVal",  # name
            lambda: _fbthrift_py3lite_types.StructTypeInfo(patch.lite_types.OptionalStringPatch),  # typeinfo
            None,  # default value
        ),
        (
            19,  # id
            True,  # isUnqualified
            "optBinaryVal",  # name
            lambda: _fbthrift_py3lite_types.StructTypeInfo(patch.lite_types.OptionalBinaryPatch),  # typeinfo
            None,  # default value
        ),
        (
            20,  # id
            True,  # isUnqualified
            "optStructVal",  # name
            lambda: _fbthrift_py3lite_types.StructTypeInfo(OptionalMyDataValuePatch),  # typeinfo
            None,  # default value
        ),
        (
            21,  # id
            True,  # isUnqualified
            "optListVal",  # name
            lambda: _fbthrift_py3lite_types.StructTypeInfo(OptionalMyStructField21Patch),  # typeinfo
            None,  # default value
        ),
        (
            22,  # id
            True,  # isUnqualified
            "optSetVal",  # name
            lambda: _fbthrift_py3lite_types.StructTypeInfo(OptionalMyStructField22Patch),  # typeinfo
            None,  # default value
        ),
        (
            23,  # id
            True,  # isUnqualified
            "optMapVal",  # name
            lambda: _fbthrift_py3lite_types.StructTypeInfo(OptionalMyStructField23Patch),  # typeinfo
            None,  # default value
        ),
    )

    @staticmethod
    def __get_thrift_name__() -> str:
        return "module.MyStructPatch"

    @staticmethod
    def __get_thrift_uri__():
        return "test.dev/fixtures/patch/MyStructPatch"

    @staticmethod
    def __get_metadata__():
        return _fbthrift_metadata__struct_MyStructPatch()



class MyStructField21Patch(metaclass=_fbthrift_py3lite_types.StructMeta):
    _fbthrift_SPEC = (
        (
            1,  # id
            False,  # isUnqualified
            "assign",  # name
            lambda: _fbthrift_py3lite_types.ListTypeInfo(_fbthrift_py3lite_types.typeinfo_i16),  # typeinfo
            None,  # default value
        ),
        (
            2,  # id
            True,  # isUnqualified
            "clear",  # name
            _fbthrift_py3lite_types.typeinfo_bool,  # typeinfo
            None,  # default value
        ),
        (
            4,  # id
            True,  # isUnqualified
            "append",  # name
            lambda: _fbthrift_py3lite_types.ListTypeInfo(_fbthrift_py3lite_types.typeinfo_i16),  # typeinfo
            None,  # default value
        ),
        (
            5,  # id
            True,  # isUnqualified
            "prepend",  # name
            lambda: _fbthrift_py3lite_types.ListTypeInfo(_fbthrift_py3lite_types.typeinfo_i16),  # typeinfo
            None,  # default value
        ),
    )

    @staticmethod
    def __get_thrift_name__() -> str:
        return "module.MyStructField21Patch"

    @staticmethod
    def __get_thrift_uri__():
        return "test.dev/fixtures/patch/MyStructField21Patch"

    @staticmethod
    def __get_metadata__():
        return _fbthrift_metadata__struct_MyStructField21Patch()



class OptionalMyStructField21Patch(metaclass=_fbthrift_py3lite_types.StructMeta):
    _fbthrift_SPEC = (
        (
            2,  # id
            True,  # isUnqualified
            "clear",  # name
            _fbthrift_py3lite_types.typeinfo_bool,  # typeinfo
            None,  # default value
        ),
        (
            3,  # id
            True,  # isUnqualified
            "patch",  # name
            lambda: _fbthrift_py3lite_types.StructTypeInfo(MyStructField21Patch),  # typeinfo
            None,  # default value
        ),
        (
            1,  # id
            False,  # isUnqualified
            "ensure",  # name
            lambda: _fbthrift_py3lite_types.ListTypeInfo(_fbthrift_py3lite_types.typeinfo_i16),  # typeinfo
            None,  # default value
        ),
        (
            4,  # id
            True,  # isUnqualified
            "patchAfter",  # name
            lambda: _fbthrift_py3lite_types.StructTypeInfo(MyStructField21Patch),  # typeinfo
            None,  # default value
        ),
    )

    @staticmethod
    def __get_thrift_name__() -> str:
        return "module.OptionalMyStructField21Patch"

    @staticmethod
    def __get_thrift_uri__():
        return "test.dev/fixtures/patch/OptionalMyStructField21Patch"

    @staticmethod
    def __get_metadata__():
        return _fbthrift_metadata__struct_OptionalMyStructField21Patch()



class MyStructField22Patch(metaclass=_fbthrift_py3lite_types.StructMeta):
    _fbthrift_SPEC = (
        (
            1,  # id
            False,  # isUnqualified
            "assign",  # name
            lambda: _fbthrift_py3lite_types.SetTypeInfo(_fbthrift_py3lite_types.typeinfo_string),  # typeinfo
            None,  # default value
        ),
        (
            2,  # id
            True,  # isUnqualified
            "clear",  # name
            _fbthrift_py3lite_types.typeinfo_bool,  # typeinfo
            None,  # default value
        ),
        (
            4,  # id
            True,  # isUnqualified
            "add",  # name
            lambda: _fbthrift_py3lite_types.SetTypeInfo(_fbthrift_py3lite_types.typeinfo_string),  # typeinfo
            None,  # default value
        ),
        (
            5,  # id
            True,  # isUnqualified
            "remove",  # name
            lambda: _fbthrift_py3lite_types.SetTypeInfo(_fbthrift_py3lite_types.typeinfo_string),  # typeinfo
            None,  # default value
        ),
    )

    @staticmethod
    def __get_thrift_name__() -> str:
        return "module.MyStructField22Patch"

    @staticmethod
    def __get_thrift_uri__():
        return "test.dev/fixtures/patch/MyStructField22Patch"

    @staticmethod
    def __get_metadata__():
        return _fbthrift_metadata__struct_MyStructField22Patch()



class OptionalMyStructField22Patch(metaclass=_fbthrift_py3lite_types.StructMeta):
    _fbthrift_SPEC = (
        (
            2,  # id
            True,  # isUnqualified
            "clear",  # name
            _fbthrift_py3lite_types.typeinfo_bool,  # typeinfo
            None,  # default value
        ),
        (
            3,  # id
            True,  # isUnqualified
            "patch",  # name
            lambda: _fbthrift_py3lite_types.StructTypeInfo(MyStructField22Patch),  # typeinfo
            None,  # default value
        ),
        (
            1,  # id
            False,  # isUnqualified
            "ensure",  # name
            lambda: _fbthrift_py3lite_types.SetTypeInfo(_fbthrift_py3lite_types.typeinfo_string),  # typeinfo
            None,  # default value
        ),
        (
            4,  # id
            True,  # isUnqualified
            "patchAfter",  # name
            lambda: _fbthrift_py3lite_types.StructTypeInfo(MyStructField22Patch),  # typeinfo
            None,  # default value
        ),
    )

    @staticmethod
    def __get_thrift_name__() -> str:
        return "module.OptionalMyStructField22Patch"

    @staticmethod
    def __get_thrift_uri__():
        return "test.dev/fixtures/patch/OptionalMyStructField22Patch"

    @staticmethod
    def __get_metadata__():
        return _fbthrift_metadata__struct_OptionalMyStructField22Patch()



class MyStructField23Patch(metaclass=_fbthrift_py3lite_types.StructMeta):
    _fbthrift_SPEC = (
        (
            1,  # id
            False,  # isUnqualified
            "assign",  # name
            lambda: _fbthrift_py3lite_types.MapTypeInfo(_fbthrift_py3lite_types.typeinfo_string, _fbthrift_py3lite_types.typeinfo_string),  # typeinfo
            None,  # default value
        ),
        (
            2,  # id
            True,  # isUnqualified
            "clear",  # name
            _fbthrift_py3lite_types.typeinfo_bool,  # typeinfo
            None,  # default value
        ),
        (
            4,  # id
            True,  # isUnqualified
            "add",  # name
            lambda: _fbthrift_py3lite_types.MapTypeInfo(_fbthrift_py3lite_types.typeinfo_string, _fbthrift_py3lite_types.typeinfo_string),  # typeinfo
            None,  # default value
        ),
        (
            6,  # id
            True,  # isUnqualified
            "removeIf",  # name
            lambda: _fbthrift_py3lite_types.MapTypeInfo(_fbthrift_py3lite_types.typeinfo_string, _fbthrift_py3lite_types.typeinfo_string),  # typeinfo
            None,  # default value
        ),
    )

    @staticmethod
    def __get_thrift_name__() -> str:
        return "module.MyStructField23Patch"

    @staticmethod
    def __get_thrift_uri__():
        return "test.dev/fixtures/patch/MyStructField23Patch"

    @staticmethod
    def __get_metadata__():
        return _fbthrift_metadata__struct_MyStructField23Patch()



class OptionalMyStructField23Patch(metaclass=_fbthrift_py3lite_types.StructMeta):
    _fbthrift_SPEC = (
        (
            2,  # id
            True,  # isUnqualified
            "clear",  # name
            _fbthrift_py3lite_types.typeinfo_bool,  # typeinfo
            None,  # default value
        ),
        (
            3,  # id
            True,  # isUnqualified
            "patch",  # name
            lambda: _fbthrift_py3lite_types.StructTypeInfo(MyStructField23Patch),  # typeinfo
            None,  # default value
        ),
        (
            1,  # id
            False,  # isUnqualified
            "ensure",  # name
            lambda: _fbthrift_py3lite_types.MapTypeInfo(_fbthrift_py3lite_types.typeinfo_string, _fbthrift_py3lite_types.typeinfo_string),  # typeinfo
            None,  # default value
        ),
        (
            4,  # id
            True,  # isUnqualified
            "patchAfter",  # name
            lambda: _fbthrift_py3lite_types.StructTypeInfo(MyStructField23Patch),  # typeinfo
            None,  # default value
        ),
    )

    @staticmethod
    def __get_thrift_name__() -> str:
        return "module.OptionalMyStructField23Patch"

    @staticmethod
    def __get_thrift_uri__():
        return "test.dev/fixtures/patch/OptionalMyStructField23Patch"

    @staticmethod
    def __get_metadata__():
        return _fbthrift_metadata__struct_OptionalMyStructField23Patch()



class MyStructValuePatch(metaclass=_fbthrift_py3lite_types.StructMeta):
    _fbthrift_SPEC = (
        (
            1,  # id
            False,  # isUnqualified
            "assign",  # name
            lambda: _fbthrift_py3lite_types.StructTypeInfo(MyStruct),  # typeinfo
            None,  # default value
        ),
        (
            2,  # id
            True,  # isUnqualified
            "clear",  # name
            _fbthrift_py3lite_types.typeinfo_bool,  # typeinfo
            None,  # default value
        ),
        (
            3,  # id
            True,  # isUnqualified
            "patch",  # name
            lambda: _fbthrift_py3lite_types.StructTypeInfo(MyStructPatch),  # typeinfo
            None,  # default value
        ),
    )

    @staticmethod
    def __get_thrift_name__() -> str:
        return "module.MyStructValuePatch"

    @staticmethod
    def __get_thrift_uri__():
        return "test.dev/fixtures/patch/MyStructValuePatch"

    @staticmethod
    def __get_metadata__():
        return _fbthrift_metadata__struct_MyStructValuePatch()



class OptionalMyStructValuePatch(metaclass=_fbthrift_py3lite_types.StructMeta):
    _fbthrift_SPEC = (
        (
            2,  # id
            True,  # isUnqualified
            "clear",  # name
            _fbthrift_py3lite_types.typeinfo_bool,  # typeinfo
            None,  # default value
        ),
        (
            3,  # id
            True,  # isUnqualified
            "patch",  # name
            lambda: _fbthrift_py3lite_types.StructTypeInfo(MyStructValuePatch),  # typeinfo
            None,  # default value
        ),
        (
            1,  # id
            False,  # isUnqualified
            "ensure",  # name
            lambda: _fbthrift_py3lite_types.StructTypeInfo(MyStruct),  # typeinfo
            None,  # default value
        ),
        (
            4,  # id
            True,  # isUnqualified
            "patchAfter",  # name
            lambda: _fbthrift_py3lite_types.StructTypeInfo(MyStructValuePatch),  # typeinfo
            None,  # default value
        ),
    )

    @staticmethod
    def __get_thrift_name__() -> str:
        return "module.OptionalMyStructValuePatch"

    @staticmethod
    def __get_thrift_uri__():
        return "test.dev/fixtures/patch/OptionalMyStructValuePatch"

    @staticmethod
    def __get_metadata__():
        return _fbthrift_metadata__struct_OptionalMyStructValuePatch()


# This unfortunately has to be down here to prevent circular imports
import module.lite_metadata


def _fbthrift_metadata__struct_MyData():
    return module.lite_metadata.gen_metadata_struct_MyData()
def _fbthrift_metadata__struct_MyStruct():
    return module.lite_metadata.gen_metadata_struct_MyStruct()
def _fbthrift_metadata__struct_MyDataPatch():
    return module.lite_metadata.gen_metadata_struct_MyDataPatch()
def _fbthrift_metadata__struct_MyDataValuePatch():
    return module.lite_metadata.gen_metadata_struct_MyDataValuePatch()
def _fbthrift_metadata__struct_OptionalMyDataValuePatch():
    return module.lite_metadata.gen_metadata_struct_OptionalMyDataValuePatch()
def _fbthrift_metadata__struct_MyStructPatch():
    return module.lite_metadata.gen_metadata_struct_MyStructPatch()
def _fbthrift_metadata__struct_MyStructField21Patch():
    return module.lite_metadata.gen_metadata_struct_MyStructField21Patch()
def _fbthrift_metadata__struct_OptionalMyStructField21Patch():
    return module.lite_metadata.gen_metadata_struct_OptionalMyStructField21Patch()
def _fbthrift_metadata__struct_MyStructField22Patch():
    return module.lite_metadata.gen_metadata_struct_MyStructField22Patch()
def _fbthrift_metadata__struct_OptionalMyStructField22Patch():
    return module.lite_metadata.gen_metadata_struct_OptionalMyStructField22Patch()
def _fbthrift_metadata__struct_MyStructField23Patch():
    return module.lite_metadata.gen_metadata_struct_MyStructField23Patch()
def _fbthrift_metadata__struct_OptionalMyStructField23Patch():
    return module.lite_metadata.gen_metadata_struct_OptionalMyStructField23Patch()
def _fbthrift_metadata__struct_MyStructValuePatch():
    return module.lite_metadata.gen_metadata_struct_MyStructValuePatch()
def _fbthrift_metadata__struct_OptionalMyStructValuePatch():
    return module.lite_metadata.gen_metadata_struct_OptionalMyStructValuePatch()

_fbthrift_all_structs = [
    MyData,
    MyStruct,
    MyDataPatch,
    MyDataValuePatch,
    OptionalMyDataValuePatch,
    MyStructPatch,
    MyStructField21Patch,
    OptionalMyStructField21Patch,
    MyStructField22Patch,
    OptionalMyStructField22Patch,
    MyStructField23Patch,
    OptionalMyStructField23Patch,
    MyStructValuePatch,
    OptionalMyStructValuePatch,
]
_fbthrift_py3lite_types.fill_specs(*_fbthrift_all_structs)
