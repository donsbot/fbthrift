#
# Autogenerated by Thrift
#
# DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
#  @generated
#

from libc.stdint cimport (
    int8_t as cint8_t,
    int16_t as cint16_t,
    int32_t as cint32_t,
    int64_t as cint64_t,
    uint32_t as cuint32_t,
)
from libcpp.string cimport string
from libcpp cimport bool as cbool, nullptr, nullptr_t
from cpython cimport bool as pbool
from libcpp.memory cimport shared_ptr, unique_ptr
from libcpp.vector cimport vector
from libcpp.set cimport set as cset
from libcpp.map cimport map as cmap, pair as cpair
from thrift.py3.exceptions cimport cTException
cimport folly.iobuf as __iobuf
cimport thrift.py3.exceptions
cimport thrift.py3.types
from thrift.py3.common cimport Protocol as __Protocol
from thrift.py3.types cimport (
    bstring,
    field_ref as __field_ref,
    optional_field_ref as __optional_field_ref,
    required_field_ref as __required_field_ref,
)
from folly.optional cimport cOptional
cimport module0.types as _module0_types
cimport module1.types as _module1_types
cdef extern from "src/gen-py3/module2/types.h":
  pass





cdef extern from "src/gen-cpp2/module2_types_custom_protocol.h" namespace "::module2":
    cdef cppclass cStruct__isset "::module2::Struct::__isset":
        bint first
        bint second

    cdef cppclass cStruct "::module2::Struct":
        cStruct() except +
        cStruct(const cStruct&) except +
        bint operator==(cStruct&)
        bint operator!=(cStruct&)
        bint operator<(cStruct&)
        bint operator>(cStruct&)
        bint operator<=(cStruct&)
        bint operator>=(cStruct&)
        __field_ref[_module0_types.cStruct] first_ref()
        _module0_types.cStruct first
        __field_ref[_module1_types.cStruct] second_ref()
        _module1_types.cStruct second
        cStruct__isset __isset

    cdef cppclass cBigStruct__isset "::module2::BigStruct::__isset":
        bint s
        bint id

    cdef cppclass cBigStruct "::module2::BigStruct":
        cBigStruct() except +
        cBigStruct(const cBigStruct&) except +
        bint operator==(cBigStruct&)
        bint operator!=(cBigStruct&)
        bint operator<(cBigStruct&)
        bint operator>(cBigStruct&)
        bint operator<=(cBigStruct&)
        bint operator>=(cBigStruct&)
        __field_ref[cStruct] s_ref()
        cStruct s
        __field_ref[cint32_t] id_ref()
        cint32_t id
        cBigStruct__isset __isset




cdef class Struct(thrift.py3.types.Struct):
    cdef shared_ptr[cStruct] _cpp_obj
    cdef _module0_types.Struct __field_first
    cdef _module1_types.Struct __field_second

    @staticmethod
    cdef unique_ptr[cStruct] _make_instance(
        cStruct* base_instance,
        bint* __isNOTSET,
        _module0_types.Struct first,
        _module1_types.Struct second
    ) except *

    @staticmethod
    cdef create(shared_ptr[cStruct])



cdef class BigStruct(thrift.py3.types.Struct):
    cdef shared_ptr[cBigStruct] _cpp_obj
    cdef Struct __field_s

    @staticmethod
    cdef unique_ptr[cBigStruct] _make_instance(
        cBigStruct* base_instance,
        bint* __isNOTSET,
        Struct s,
        object id
    ) except *

    @staticmethod
    cdef create(shared_ptr[cBigStruct])



cdef extern from "src/gen-cpp2/module2_constants.h" namespace "::module2":
    cdef cStruct cc2 "::module2::module2_constants::c2"()
    cdef cStruct cc3 "::module2::module2_constants::c3"()
    cdef cStruct cc4 "::module2::module2_constants::c4"()
