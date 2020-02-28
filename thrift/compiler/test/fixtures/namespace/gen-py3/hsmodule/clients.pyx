#
# Autogenerated by Thrift
#
# DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
#  @generated
#
from libcpp.memory cimport shared_ptr, make_shared, unique_ptr, make_unique
from libcpp.string cimport string
from libcpp cimport bool as cbool
from cpython cimport bool as pbool
from libc.stdint cimport int8_t, int16_t, int32_t, int64_t
from libcpp.vector cimport vector as vector
from libcpp.set cimport set as cset
from libcpp.map cimport map as cmap
from cython.operator cimport dereference as deref, typeid
from cpython.ref cimport PyObject
from thrift.py3.client cimport cRequestChannel_ptr, makeClientWrapper, cClientWrapper
from thrift.py3.exceptions cimport try_make_shared_exception, create_py_exception
from folly cimport cFollyTry, cFollyUnit, c_unit
from folly.cast cimport down_cast_ptr
from libcpp.typeinfo cimport type_info
import thrift.py3.types
cimport thrift.py3.types
from thrift.py3.types cimport move
from thrift.py3.types import NumberType as __NumberType
import thrift.py3.client
cimport thrift.py3.client
from thrift.py3.common cimport RpcOptions as __RpcOptions
from thrift.py3.common import (
  RpcOptions as __RpcOptions,
  InterfaceSpec as __InterfaceSpec,
  MethodSpec as __MethodSpec,
  ArgumentSpec as __ArgumentSpec,
)

from folly.futures cimport bridgeFutureWith
from folly.executor cimport get_executor
cimport folly.iobuf as __iobuf
import folly.iobuf as __iobuf
from folly.iobuf cimport move as move_iobuf
cimport cython

import sys
import types as _py_types
from asyncio import get_event_loop as asyncio_get_event_loop, shield as asyncio_shield, InvalidStateError as asyncio_InvalidStateError

cimport hsmodule.types as _hsmodule_types
import hsmodule.types as _hsmodule_types

from hsmodule.clients_wrapper cimport cHsTestServiceAsyncClient, cHsTestServiceClientWrapper


cdef void HsTestService_init_callback(
    cFollyTry[int64_t]&& result,
    PyObject* userdata
):
    client, pyfuture, options = <object> userdata  
    if result.hasException():
        pyfuture.set_exception(create_py_exception(result.exception(), <__RpcOptions>options))
    else:
        try:
            pyfuture.set_result(result.value())
        except Exception as ex:
            pyfuture.set_exception(ex.with_traceback(None))


cdef object _HsTestService_annotations = _py_types.MappingProxyType({
})


@cython.auto_pickle(False)
cdef class HsTestService(thrift.py3.client.Client):
    annotations = _HsTestService_annotations

    cdef const type_info* _typeid(HsTestService self):
        return &typeid(cHsTestServiceAsyncClient)

    cdef bind_client(HsTestService self, cRequestChannel_ptr&& channel):
        self._client = makeClientWrapper[cHsTestServiceAsyncClient, cHsTestServiceClientWrapper](
            thrift.py3.client.move(channel)
        )

    @cython.always_allow_keywords(True)
    def init(
            HsTestService self,
            int1 not None,
            __RpcOptions rpc_options=None
    ):
        if rpc_options is None:
            rpc_options = <__RpcOptions>__RpcOptions.__new__(__RpcOptions)
        if not isinstance(int1, int):
            raise TypeError(f'int1 is not a {int !r}.')
        else:
            int1 = <int64_t> int1
        self._check_connect_future()
        __loop = asyncio_get_event_loop()
        __future = __loop.create_future()
        __userdata = (self, __future, rpc_options)
        bridgeFutureWith[int64_t](
            self._executor,
            down_cast_ptr[cHsTestServiceClientWrapper, cClientWrapper](self._client.get()).init(rpc_options._cpp_obj, 
                int1,
            ),
            HsTestService_init_callback,
            <PyObject *> __userdata
        )
        return asyncio_shield(__future)


    @staticmethod
    def __get_reflection_for_init():
        return __MethodSpec(
            name="init",
            arguments=[
                __ArgumentSpec(
                    name="int1",
                    type=int,
                    kind=__NumberType.I64,
                    annotations=_py_types.MappingProxyType({
                    }),
                ),
            ],
            result=int,
            result_kind=__NumberType.I64,
            exceptions=[
            ],
            annotations=_py_types.MappingProxyType({
            }),
        )

    @classmethod
    def __get_reflection__(cls):
        return __InterfaceSpec(
            name="HsTestService",
            methods=[
                cls.__get_reflection_for_init(),
            ],
            annotations=_py_types.MappingProxyType({
            }),
        )

