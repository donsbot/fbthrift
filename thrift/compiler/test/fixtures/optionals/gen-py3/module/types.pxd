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
cdef extern from "src/gen-py3/module/types.h":
  pass


cdef extern from "src/gen-cpp2/module_types.h" namespace "::cpp2":
    cdef cppclass cAnimal "::cpp2::Animal":
        pass





cdef class Animal(thrift.py3.types.CompiledEnum):
    pass

cdef extern from "src/gen-cpp2/module_types_custom_protocol.h" namespace "::cpp2":
    cdef cppclass cColor__isset "::cpp2::Color::__isset":
        bint red
        bint green
        bint blue
        bint alpha

    cdef cppclass cColor "::cpp2::Color":
        cColor() except +
        cColor(const cColor&) except +
        bint operator==(cColor&)
        bint operator!=(cColor&)
        bint operator<(cColor&)
        bint operator>(cColor&)
        bint operator<=(cColor&)
        bint operator>=(cColor&)
        __field_ref[double] red_ref()
        double red
        __field_ref[double] green_ref()
        double green
        __field_ref[double] blue_ref()
        double blue
        __field_ref[double] alpha_ref()
        double alpha
        cColor__isset __isset

    cdef cppclass cVehicle__isset "::cpp2::Vehicle::__isset":
        bint color
        bint licensePlate
        bint description
        bint name
        bint hasAC

    cdef cppclass cVehicle "::cpp2::Vehicle":
        cVehicle() except +
        cVehicle(const cVehicle&) except +
        bint operator==(cVehicle&)
        bint operator!=(cVehicle&)
        bint operator<(cVehicle&)
        bint operator>(cVehicle&)
        bint operator<=(cVehicle&)
        bint operator>=(cVehicle&)
        __field_ref[cColor] color_ref()
        cColor color
        __optional_field_ref[string] licensePlate_ref()
        string licensePlate
        __optional_field_ref[string] description_ref()
        string description
        __optional_field_ref[string] name_ref()
        string name
        __optional_field_ref[cbool] hasAC_ref()
        cbool hasAC
        cVehicle__isset __isset

    cdef cppclass cPerson__isset "::cpp2::Person::__isset":
        bint id
        bint name
        bint age
        bint address
        bint favoriteColor
        bint friends
        bint bestFriend
        bint petNames
        bint afraidOfAnimal
        bint vehicles

    cdef cppclass cPerson "::cpp2::Person":
        cPerson() except +
        cPerson(const cPerson&) except +
        bint operator==(cPerson&)
        bint operator!=(cPerson&)
        bint operator<(cPerson&)
        bint operator>(cPerson&)
        bint operator<=(cPerson&)
        bint operator>=(cPerson&)
        __field_ref[cint64_t] id_ref()
        cint64_t id
        __field_ref[string] name_ref()
        string name
        __optional_field_ref[cint16_t] age_ref()
        cint16_t age
        __optional_field_ref[string] address_ref()
        string address
        __optional_field_ref[cColor] favoriteColor_ref()
        cColor favoriteColor
        __optional_field_ref[cset[cint64_t]] friends_ref()
        cset[cint64_t] friends
        __optional_field_ref[cint64_t] bestFriend_ref()
        cint64_t bestFriend
        __optional_field_ref[cmap[cAnimal,string]] petNames_ref()
        cmap[cAnimal,string] petNames
        __optional_field_ref[cAnimal] afraidOfAnimal_ref()
        cAnimal afraidOfAnimal
        __optional_field_ref[vector[cVehicle]] vehicles_ref()
        vector[cVehicle] vehicles
        cPerson__isset __isset




cdef class Color(thrift.py3.types.Struct):
    cdef shared_ptr[cColor] _cpp_obj

    @staticmethod
    cdef unique_ptr[cColor] _make_instance(
        cColor* base_instance,
        bint* __isNOTSET,
        object red,
        object green,
        object blue,
        object alpha
    ) except *

    @staticmethod
    cdef create(shared_ptr[cColor])



cdef class Vehicle(thrift.py3.types.Struct):
    cdef shared_ptr[cVehicle] _cpp_obj
    cdef Color __field_color

    @staticmethod
    cdef unique_ptr[cVehicle] _make_instance(
        cVehicle* base_instance,
        bint* __isNOTSET,
        Color color,
        str licensePlate,
        str description,
        str name,
        pbool hasAC
    ) except *

    @staticmethod
    cdef create(shared_ptr[cVehicle])



cdef class Person(thrift.py3.types.Struct):
    cdef shared_ptr[cPerson] _cpp_obj
    cdef Color __field_favoriteColor
    cdef Set__i64 __field_friends
    cdef Map__Animal_string __field_petNames
    cdef List__Vehicle __field_vehicles

    @staticmethod
    cdef unique_ptr[cPerson] _make_instance(
        cPerson* base_instance,
        bint* __isNOTSET,
        object id,
        str name,
        object age,
        str address,
        Color favoriteColor,
        object friends,
        object bestFriend,
        object petNames,
        Animal afraidOfAnimal,
        object vehicles
    ) except *

    @staticmethod
    cdef create(shared_ptr[cPerson])


cdef class Set__i64(thrift.py3.types.Set):
    cdef shared_ptr[cset[cint64_t]] _cpp_obj
    @staticmethod
    cdef create(shared_ptr[cset[cint64_t]])
    @staticmethod
    cdef shared_ptr[cset[cint64_t]] _make_instance(object items) except *

cdef class Map__Animal_string(thrift.py3.types.Map):
    cdef shared_ptr[cmap[cAnimal,string]] _cpp_obj
    @staticmethod
    cdef create(shared_ptr[cmap[cAnimal,string]])
    @staticmethod
    cdef shared_ptr[cmap[cAnimal,string]] _make_instance(object items) except *

cdef class List__Vehicle(thrift.py3.types.List):
    cdef shared_ptr[vector[cVehicle]] _cpp_obj
    @staticmethod
    cdef create(shared_ptr[vector[cVehicle]])
    @staticmethod
    cdef shared_ptr[vector[cVehicle]] _make_instance(object items) except *


