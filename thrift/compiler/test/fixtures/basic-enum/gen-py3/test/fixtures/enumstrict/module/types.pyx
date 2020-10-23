#
# Autogenerated by Thrift
#
# DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
#  @generated
#
cimport cython as __cython
from cpython.bytes cimport PyBytes_AsStringAndSize
from cpython.object cimport PyTypeObject, Py_LT, Py_LE, Py_EQ, Py_NE, Py_GT, Py_GE
from libcpp.memory cimport shared_ptr, make_shared, unique_ptr, make_unique
from libcpp.string cimport string
from libcpp cimport bool as cbool
from libcpp.iterator cimport inserter as cinserter
from libcpp.utility cimport move as cmove
from cpython cimport bool as pbool
from cython.operator cimport dereference as deref, preincrement as inc, address as ptr_address
import thrift.py3.types
cimport thrift.py3.types
cimport thrift.py3.exceptions
from thrift.py3.types cimport (
    translate_cpp_enum_to_python,
    SetMetaClass as __SetMetaClass,
    const_pointer_cast,
    constant_shared_ptr,
    default_inst,
    reference_shared_ptr as __reference_shared_ptr,
    NOTSET as __NOTSET,
    EnumData as __EnumData,
    EnumFlagsData as __EnumFlagsData,
    UnionTypeEnumData as __UnionTypeEnumData,
    createEnumDataForUnionType as __createEnumDataForUnionType,
)
cimport thrift.py3.std_libcpp as std_libcpp
cimport thrift.py3.serializer as serializer
import folly.iobuf as __iobuf
from folly.optional cimport cOptional
from folly.memory cimport to_shared_ptr as __to_shared_ptr

import sys
from collections.abc import Sequence, Set, Mapping, Iterable
import weakref as __weakref
import builtins as _builtins

cimport test.fixtures.enumstrict.module.types_reflection as _types_reflection


cdef __EnumData __EmptyEnum_enum_data  = __EnumData.create(thrift.py3.types.createEnumData[cEmptyEnum](), EmptyEnum)


@__cython.internal
@__cython.auto_pickle(False)
cdef class __EmptyEnumMeta(thrift.py3.types.EnumMeta):

    def __get_by_name(cls, str name):
        return __EmptyEnum_enum_data.get_by_name(name)

    def __get_by_value(cls, int value):
        return __EmptyEnum_enum_data.get_by_value(value)

    def __get_all_names(cls):
        return __EmptyEnum_enum_data.get_all_names()

    def __len__(cls):
        return __EmptyEnum_enum_data.size()


@__cython.final
@__cython.auto_pickle(False)
cdef class EmptyEnum(thrift.py3.types.CompiledEnum):
    cdef get_by_name(self, str name):
        return __EmptyEnum_enum_data.get_by_name(name)



__SetMetaClass(<PyTypeObject*> EmptyEnum, <PyTypeObject*> __EmptyEnumMeta)


cdef __EnumData __MyEnum_enum_data  = __EnumData.create(thrift.py3.types.createEnumData[cMyEnum](), MyEnum)


@__cython.internal
@__cython.auto_pickle(False)
cdef class __MyEnumMeta(thrift.py3.types.EnumMeta):

    def __get_by_name(cls, str name):
        return __MyEnum_enum_data.get_by_name(name)

    def __get_by_value(cls, int value):
        return __MyEnum_enum_data.get_by_value(value)

    def __get_all_names(cls):
        return __MyEnum_enum_data.get_all_names()

    def __len__(cls):
        return __MyEnum_enum_data.size()


@__cython.final
@__cython.auto_pickle(False)
cdef class MyEnum(thrift.py3.types.CompiledEnum):
    cdef get_by_name(self, str name):
        return __MyEnum_enum_data.get_by_name(name)



__SetMetaClass(<PyTypeObject*> MyEnum, <PyTypeObject*> __MyEnumMeta)


cdef __EnumData __MyBigEnum_enum_data  = __EnumData.create(thrift.py3.types.createEnumData[cMyBigEnum](), MyBigEnum)


@__cython.internal
@__cython.auto_pickle(False)
cdef class __MyBigEnumMeta(thrift.py3.types.EnumMeta):

    def __get_by_name(cls, str name):
        return __MyBigEnum_enum_data.get_by_name(name)

    def __get_by_value(cls, int value):
        return __MyBigEnum_enum_data.get_by_value(value)

    def __get_all_names(cls):
        return __MyBigEnum_enum_data.get_all_names()

    def __len__(cls):
        return __MyBigEnum_enum_data.size()


@__cython.final
@__cython.auto_pickle(False)
cdef class MyBigEnum(thrift.py3.types.CompiledEnum):
    cdef get_by_name(self, str name):
        return __MyBigEnum_enum_data.get_by_name(name)



__SetMetaClass(<PyTypeObject*> MyBigEnum, <PyTypeObject*> __MyBigEnumMeta)



@__cython.auto_pickle(False)
cdef class MyStruct(thrift.py3.types.Struct):

    def __init__(
        MyStruct self, *,
        MyEnum myEnum=None,
        MyBigEnum myBigEnum=None
    ):
        self._cpp_obj = __to_shared_ptr(cmove(MyStruct._make_instance(
          NULL,
          NULL,
          myEnum,
          myBigEnum,
        )))

    def __call__(
        MyStruct self,
        myEnum=__NOTSET,
        myBigEnum=__NOTSET
    ):
        ___NOTSET = __NOTSET  # Cheaper for larger structs
        cdef bint[2] __isNOTSET  # so make_instance is typed

        __fbthrift_changed = False
        if myEnum is ___NOTSET:
            __isNOTSET[0] = True
            myEnum = None
        else:
            __isNOTSET[0] = False
            __fbthrift_changed = True

        if myBigEnum is ___NOTSET:
            __isNOTSET[1] = True
            myBigEnum = None
        else:
            __isNOTSET[1] = False
            __fbthrift_changed = True


        if not __fbthrift_changed:
            return self

        if myEnum is not None:
            if not isinstance(myEnum, MyEnum):
                raise TypeError(f'field myEnum value: { myEnum !r} is not of the enum type { MyEnum }.')

        if myBigEnum is not None:
            if not isinstance(myBigEnum, MyBigEnum):
                raise TypeError(f'field myBigEnum value: { myBigEnum !r} is not of the enum type { MyBigEnum }.')

        __fbthrift_inst = <MyStruct>MyStruct.__new__(MyStruct)
        __fbthrift_inst._cpp_obj = __to_shared_ptr(cmove(MyStruct._make_instance(
          self._cpp_obj.get(),
          __isNOTSET,
          myEnum,
          myBigEnum,
        )))
        return __fbthrift_inst

    @staticmethod
    cdef unique_ptr[cMyStruct] _make_instance(
        cMyStruct* base_instance,
        bint* __isNOTSET,
        MyEnum myEnum ,
        MyBigEnum myBigEnum 
    ) except *:
        cdef unique_ptr[cMyStruct] c_inst
        if base_instance:
            c_inst = make_unique[cMyStruct](deref(base_instance))
        else:
            c_inst = make_unique[cMyStruct]()

        if base_instance:
            # Convert None's to default value. (or unset)
            if not __isNOTSET[0] and myEnum is None:
                deref(c_inst).myEnum_ref().assign(default_inst[cMyStruct]().myEnum_ref().value())
                deref(c_inst).__isset.myEnum = False
                pass

            if not __isNOTSET[1] and myBigEnum is None:
                deref(c_inst).myBigEnum_ref().assign(default_inst[cMyStruct]().myBigEnum_ref().value())
                deref(c_inst).__isset.myBigEnum = False
                pass

        if myEnum is not None:
            deref(c_inst).myEnum_ref().assign(<cMyEnum><int>myEnum)
            deref(c_inst).__isset.myEnum = True
        if myBigEnum is not None:
            deref(c_inst).myBigEnum_ref().assign(<cMyBigEnum><int>myBigEnum)
            deref(c_inst).__isset.myBigEnum = True
        # in C++ you don't have to call move(), but this doesn't translate
        # into a C++ return statement, so you do here
        return cmove(c_inst)

    cdef object __fbthrift_isset(self):
        return thrift.py3.types._IsSet("MyStruct", {
          "myEnum": deref(self._cpp_obj).myEnum_ref().has_value(),
          "myBigEnum": deref(self._cpp_obj).myBigEnum_ref().has_value(),
        })

    def __iter__(self):
        yield 'myEnum', self.myEnum
        yield 'myBigEnum', self.myBigEnum

    @staticmethod
    cdef create(shared_ptr[cMyStruct] cpp_obj):
        __fbthrift_inst = <MyStruct>MyStruct.__new__(MyStruct)
        __fbthrift_inst._cpp_obj = cmove(cpp_obj)
        return __fbthrift_inst

    @property
    def myEnum(self):

        return translate_cpp_enum_to_python(MyEnum, <int>(deref(self._cpp_obj).myEnum_ref().value()))

    @property
    def myBigEnum(self):

        return translate_cpp_enum_to_python(MyBigEnum, <int>(deref(self._cpp_obj).myBigEnum_ref().value()))


    def __hash__(MyStruct self):
        return  super().__hash__()

    def __copy__(MyStruct self):
        cdef shared_ptr[cMyStruct] cpp_obj = make_shared[cMyStruct](
            deref(self._cpp_obj)
        )
        return MyStruct.create(cmove(cpp_obj))

    def __richcmp__(self, other, op):
        cdef int cop = op
        if not (
                isinstance(self, MyStruct) and
                isinstance(other, MyStruct)):
            if cop == Py_EQ:  # different types are never equal
                return False
            elif cop == Py_NE:  # different types are always notequal
                return True
            else:
                return NotImplemented

        cdef cMyStruct* cself = (<MyStruct>self)._cpp_obj.get()
        cdef cMyStruct* cother = (<MyStruct>other)._cpp_obj.get()
        if cop == Py_EQ:
            return deref(cself) == deref(cother)
        elif cop == Py_NE:
            return deref(cself) != deref(cother)
        elif cop == Py_LT:
            return deref(cself) < deref(cother)
        elif cop == Py_LE:
            return deref(cself) <= deref(cother)
        elif cop == Py_GT:
            return deref(cself) > deref(cother)
        elif cop == Py_GE:
            return deref(cself) >= deref(cother)
        else:
            return NotImplemented

    @staticmethod
    def __get_reflection__():
        return _types_reflection.get_reflection__MyStruct()

    cdef __iobuf.IOBuf _serialize(MyStruct self, __Protocol proto):
        cdef unique_ptr[__iobuf.cIOBuf] data
        with nogil:
            data = cmove(serializer.cserialize[cMyStruct](self._cpp_obj.get(), proto))
        return __iobuf.from_unique_ptr(cmove(data))

    cdef cuint32_t _deserialize(MyStruct self, const __iobuf.cIOBuf* buf, __Protocol proto) except? 0:
        cdef cuint32_t needed
        self._cpp_obj = make_shared[cMyStruct]()
        with nogil:
            needed = serializer.cdeserialize[cMyStruct](buf, self._cpp_obj.get(), proto)
        return needed


kOne = MyEnum(<int> (ckOne()))
