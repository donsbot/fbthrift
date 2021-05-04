/**
 * Autogenerated by Thrift for src/module.thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
#pragma once

#include "thrift/compiler/test/fixtures/fatal/gen-cpp2/service1.h"

#include <thrift/lib/cpp2/gen/service_tcc.h>

namespace test_cpp2 { namespace cpp_reflection {
typedef apache::thrift::ThriftPresult<false> service1_method1_pargs;
typedef apache::thrift::ThriftPresult<true> service1_method1_presult;
typedef apache::thrift::ThriftPresult<false, apache::thrift::FieldData<1, ::apache::thrift::type_class::integral, ::std::int32_t*>, apache::thrift::FieldData<2, ::apache::thrift::type_class::structure, ::test_cpp2::cpp_reflection::struct1*>, apache::thrift::FieldData<3, ::apache::thrift::type_class::floating_point, double*>> service1_method2_pargs;
typedef apache::thrift::ThriftPresult<true> service1_method2_presult;
typedef apache::thrift::ThriftPresult<false> service1_method3_pargs;
typedef apache::thrift::ThriftPresult<true, apache::thrift::FieldData<0, ::apache::thrift::type_class::integral, ::std::int32_t*>> service1_method3_presult;
typedef apache::thrift::ThriftPresult<false, apache::thrift::FieldData<1, ::apache::thrift::type_class::integral, ::std::int32_t*>, apache::thrift::FieldData<2, ::apache::thrift::type_class::structure, ::test_cpp2::cpp_reflection::struct1*>, apache::thrift::FieldData<3, ::apache::thrift::type_class::floating_point, double*>> service1_method4_pargs;
typedef apache::thrift::ThriftPresult<true, apache::thrift::FieldData<0, ::apache::thrift::type_class::integral, ::std::int32_t*>> service1_method4_presult;
typedef apache::thrift::ThriftPresult<false> service1_method5_pargs;
typedef apache::thrift::ThriftPresult<true, apache::thrift::FieldData<0, ::apache::thrift::type_class::structure, ::test_cpp2::cpp_reflection::struct2*>> service1_method5_presult;
typedef apache::thrift::ThriftPresult<false, apache::thrift::FieldData<1, ::apache::thrift::type_class::integral, ::std::int32_t*>, apache::thrift::FieldData<2, ::apache::thrift::type_class::structure, ::test_cpp2::cpp_reflection::struct1*>, apache::thrift::FieldData<3, ::apache::thrift::type_class::floating_point, double*>> service1_method6_pargs;
typedef apache::thrift::ThriftPresult<true, apache::thrift::FieldData<0, ::apache::thrift::type_class::structure, ::test_cpp2::cpp_reflection::struct2*>> service1_method6_presult;
template <typename ProtocolIn_, typename ProtocolOut_>
void service1AsyncProcessor::setUpAndProcess_method1(apache::thrift::ResponseChannelRequest::UniquePtr req, apache::thrift::SerializedCompressedRequest&& serializedRequest, apache::thrift::Cpp2RequestContext* ctx, folly::EventBase* eb, apache::thrift::concurrency::ThreadManager* tm) {
  if (!setUpRequestProcessing(req, ctx, eb, tm, apache::thrift::RpcKind::SINGLE_REQUEST_SINGLE_RESPONSE, iface_)) {
    return;
  }
  auto scope = iface_->getRequestExecutionScope(ctx, apache::thrift::concurrency::NORMAL);
  ctx->setRequestExecutionScope(std::move(scope));
  processInThread(std::move(req), std::move(serializedRequest), ctx, eb, tm, apache::thrift::RpcKind::SINGLE_REQUEST_SINGLE_RESPONSE, &service1AsyncProcessor::process_method1<ProtocolIn_, ProtocolOut_>, this);
}

template <typename ProtocolIn_, typename ProtocolOut_>
void service1AsyncProcessor::process_method1(apache::thrift::ResponseChannelRequest::UniquePtr req, apache::thrift::SerializedCompressedRequest&& serializedRequest, apache::thrift::Cpp2RequestContext* ctx, folly::EventBase* eb, apache::thrift::concurrency::ThreadManager* tm) {
  // make sure getRequestContext is null
  // so async calls don't accidentally use it
  iface_->setRequestContext(nullptr);
  service1_method1_pargs args;
  std::unique_ptr<apache::thrift::ContextStack> ctxStack(this->getContextStack(this->getServiceName(), "service1.method1", ctx));
  try {
    deserializeRequest<ProtocolIn_>(args, ctx->getMethodName(), std::move(serializedRequest).uncompress(), ctxStack.get());
  }
  catch (const std::exception& ex) {
    folly::exception_wrapper ew(std::current_exception(), ex);
    apache::thrift::detail::ap::process_handle_exn_deserialization<ProtocolOut_>(
        ew, std::move(req), ctx, eb, "method1");
    return;
  }
  if (!req->getShouldStartProcessing()) {
    apache::thrift::HandlerCallbackBase::releaseRequest(std::move(req), eb);
    return;
  }
  auto callback = std::make_unique<apache::thrift::HandlerCallback<void>>(std::move(req), std::move(ctxStack), return_method1<ProtocolIn_,ProtocolOut_>, throw_wrapped_method1<ProtocolIn_, ProtocolOut_>, ctx->getProtoSeqId(), eb, tm, ctx);
  iface_->async_tm_method1(std::move(callback));
}

template <class ProtocolIn_, class ProtocolOut_>
folly::IOBufQueue service1AsyncProcessor::return_method1(int32_t protoSeqId, apache::thrift::ContextStack* ctx) {
  ProtocolOut_ prot;
  service1_method1_presult result;
  return serializeResponse("method1", &prot, protoSeqId, ctx, result);
}

template <class ProtocolIn_, class ProtocolOut_>
void service1AsyncProcessor::throw_wrapped_method1(apache::thrift::ResponseChannelRequest::UniquePtr req,int32_t protoSeqId,apache::thrift::ContextStack* ctx,folly::exception_wrapper ew,apache::thrift::Cpp2RequestContext* reqCtx) {
  if (!ew) {
    return;
  }
  {
    (void)protoSeqId;
    apache::thrift::detail::ap::process_throw_wrapped_handler_error<ProtocolOut_>(
        ew, std::move(req), reqCtx, ctx, "method1");
    return;
  }
}

template <typename ProtocolIn_, typename ProtocolOut_>
void service1AsyncProcessor::setUpAndProcess_method2(apache::thrift::ResponseChannelRequest::UniquePtr req, apache::thrift::SerializedCompressedRequest&& serializedRequest, apache::thrift::Cpp2RequestContext* ctx, folly::EventBase* eb, apache::thrift::concurrency::ThreadManager* tm) {
  if (!setUpRequestProcessing(req, ctx, eb, tm, apache::thrift::RpcKind::SINGLE_REQUEST_SINGLE_RESPONSE, iface_)) {
    return;
  }
  auto scope = iface_->getRequestExecutionScope(ctx, apache::thrift::concurrency::NORMAL);
  ctx->setRequestExecutionScope(std::move(scope));
  processInThread(std::move(req), std::move(serializedRequest), ctx, eb, tm, apache::thrift::RpcKind::SINGLE_REQUEST_SINGLE_RESPONSE, &service1AsyncProcessor::process_method2<ProtocolIn_, ProtocolOut_>, this);
}

template <typename ProtocolIn_, typename ProtocolOut_>
void service1AsyncProcessor::process_method2(apache::thrift::ResponseChannelRequest::UniquePtr req, apache::thrift::SerializedCompressedRequest&& serializedRequest, apache::thrift::Cpp2RequestContext* ctx, folly::EventBase* eb, apache::thrift::concurrency::ThreadManager* tm) {
  // make sure getRequestContext is null
  // so async calls don't accidentally use it
  iface_->setRequestContext(nullptr);
  service1_method2_pargs args;
  ::std::int32_t uarg_x{0};
  args.get<0>().value = &uarg_x;
  auto uarg_y = std::make_unique<::test_cpp2::cpp_reflection::struct1>();
  args.get<1>().value = uarg_y.get();
  double uarg_z{0};
  args.get<2>().value = &uarg_z;
  std::unique_ptr<apache::thrift::ContextStack> ctxStack(this->getContextStack(this->getServiceName(), "service1.method2", ctx));
  try {
    deserializeRequest<ProtocolIn_>(args, ctx->getMethodName(), std::move(serializedRequest).uncompress(), ctxStack.get());
  }
  catch (const std::exception& ex) {
    folly::exception_wrapper ew(std::current_exception(), ex);
    apache::thrift::detail::ap::process_handle_exn_deserialization<ProtocolOut_>(
        ew, std::move(req), ctx, eb, "method2");
    return;
  }
  if (!req->getShouldStartProcessing()) {
    apache::thrift::HandlerCallbackBase::releaseRequest(std::move(req), eb);
    return;
  }
  auto callback = std::make_unique<apache::thrift::HandlerCallback<void>>(std::move(req), std::move(ctxStack), return_method2<ProtocolIn_,ProtocolOut_>, throw_wrapped_method2<ProtocolIn_, ProtocolOut_>, ctx->getProtoSeqId(), eb, tm, ctx);
  iface_->async_tm_method2(std::move(callback), args.get<0>().ref(), std::move(uarg_y), args.get<2>().ref());
}

template <class ProtocolIn_, class ProtocolOut_>
folly::IOBufQueue service1AsyncProcessor::return_method2(int32_t protoSeqId, apache::thrift::ContextStack* ctx) {
  ProtocolOut_ prot;
  service1_method2_presult result;
  return serializeResponse("method2", &prot, protoSeqId, ctx, result);
}

template <class ProtocolIn_, class ProtocolOut_>
void service1AsyncProcessor::throw_wrapped_method2(apache::thrift::ResponseChannelRequest::UniquePtr req,int32_t protoSeqId,apache::thrift::ContextStack* ctx,folly::exception_wrapper ew,apache::thrift::Cpp2RequestContext* reqCtx) {
  if (!ew) {
    return;
  }
  {
    (void)protoSeqId;
    apache::thrift::detail::ap::process_throw_wrapped_handler_error<ProtocolOut_>(
        ew, std::move(req), reqCtx, ctx, "method2");
    return;
  }
}

template <typename ProtocolIn_, typename ProtocolOut_>
void service1AsyncProcessor::setUpAndProcess_method3(apache::thrift::ResponseChannelRequest::UniquePtr req, apache::thrift::SerializedCompressedRequest&& serializedRequest, apache::thrift::Cpp2RequestContext* ctx, folly::EventBase* eb, apache::thrift::concurrency::ThreadManager* tm) {
  if (!setUpRequestProcessing(req, ctx, eb, tm, apache::thrift::RpcKind::SINGLE_REQUEST_SINGLE_RESPONSE, iface_)) {
    return;
  }
  auto scope = iface_->getRequestExecutionScope(ctx, apache::thrift::concurrency::NORMAL);
  ctx->setRequestExecutionScope(std::move(scope));
  processInThread(std::move(req), std::move(serializedRequest), ctx, eb, tm, apache::thrift::RpcKind::SINGLE_REQUEST_SINGLE_RESPONSE, &service1AsyncProcessor::process_method3<ProtocolIn_, ProtocolOut_>, this);
}

template <typename ProtocolIn_, typename ProtocolOut_>
void service1AsyncProcessor::process_method3(apache::thrift::ResponseChannelRequest::UniquePtr req, apache::thrift::SerializedCompressedRequest&& serializedRequest, apache::thrift::Cpp2RequestContext* ctx, folly::EventBase* eb, apache::thrift::concurrency::ThreadManager* tm) {
  // make sure getRequestContext is null
  // so async calls don't accidentally use it
  iface_->setRequestContext(nullptr);
  service1_method3_pargs args;
  std::unique_ptr<apache::thrift::ContextStack> ctxStack(this->getContextStack(this->getServiceName(), "service1.method3", ctx));
  try {
    deserializeRequest<ProtocolIn_>(args, ctx->getMethodName(), std::move(serializedRequest).uncompress(), ctxStack.get());
  }
  catch (const std::exception& ex) {
    folly::exception_wrapper ew(std::current_exception(), ex);
    apache::thrift::detail::ap::process_handle_exn_deserialization<ProtocolOut_>(
        ew, std::move(req), ctx, eb, "method3");
    return;
  }
  if (!req->getShouldStartProcessing()) {
    apache::thrift::HandlerCallbackBase::releaseRequest(std::move(req), eb);
    return;
  }
  auto callback = std::make_unique<apache::thrift::HandlerCallback<::std::int32_t>>(std::move(req), std::move(ctxStack), return_method3<ProtocolIn_,ProtocolOut_>, throw_wrapped_method3<ProtocolIn_, ProtocolOut_>, ctx->getProtoSeqId(), eb, tm, ctx);
  iface_->async_tm_method3(std::move(callback));
}

template <class ProtocolIn_, class ProtocolOut_>
folly::IOBufQueue service1AsyncProcessor::return_method3(int32_t protoSeqId, apache::thrift::ContextStack* ctx, ::std::int32_t const& _return) {
  ProtocolOut_ prot;
  service1_method3_presult result;
  result.get<0>().value = const_cast<::std::int32_t*>(&_return);
  result.setIsSet(0, true);
  return serializeResponse("method3", &prot, protoSeqId, ctx, result);
}

template <class ProtocolIn_, class ProtocolOut_>
void service1AsyncProcessor::throw_wrapped_method3(apache::thrift::ResponseChannelRequest::UniquePtr req,int32_t protoSeqId,apache::thrift::ContextStack* ctx,folly::exception_wrapper ew,apache::thrift::Cpp2RequestContext* reqCtx) {
  if (!ew) {
    return;
  }
  {
    (void)protoSeqId;
    apache::thrift::detail::ap::process_throw_wrapped_handler_error<ProtocolOut_>(
        ew, std::move(req), reqCtx, ctx, "method3");
    return;
  }
}

template <typename ProtocolIn_, typename ProtocolOut_>
void service1AsyncProcessor::setUpAndProcess_method4(apache::thrift::ResponseChannelRequest::UniquePtr req, apache::thrift::SerializedCompressedRequest&& serializedRequest, apache::thrift::Cpp2RequestContext* ctx, folly::EventBase* eb, apache::thrift::concurrency::ThreadManager* tm) {
  if (!setUpRequestProcessing(req, ctx, eb, tm, apache::thrift::RpcKind::SINGLE_REQUEST_SINGLE_RESPONSE, iface_)) {
    return;
  }
  auto scope = iface_->getRequestExecutionScope(ctx, apache::thrift::concurrency::NORMAL);
  ctx->setRequestExecutionScope(std::move(scope));
  processInThread(std::move(req), std::move(serializedRequest), ctx, eb, tm, apache::thrift::RpcKind::SINGLE_REQUEST_SINGLE_RESPONSE, &service1AsyncProcessor::process_method4<ProtocolIn_, ProtocolOut_>, this);
}

template <typename ProtocolIn_, typename ProtocolOut_>
void service1AsyncProcessor::process_method4(apache::thrift::ResponseChannelRequest::UniquePtr req, apache::thrift::SerializedCompressedRequest&& serializedRequest, apache::thrift::Cpp2RequestContext* ctx, folly::EventBase* eb, apache::thrift::concurrency::ThreadManager* tm) {
  // make sure getRequestContext is null
  // so async calls don't accidentally use it
  iface_->setRequestContext(nullptr);
  service1_method4_pargs args;
  ::std::int32_t uarg_i{0};
  args.get<0>().value = &uarg_i;
  auto uarg_j = std::make_unique<::test_cpp2::cpp_reflection::struct1>();
  args.get<1>().value = uarg_j.get();
  double uarg_k{0};
  args.get<2>().value = &uarg_k;
  std::unique_ptr<apache::thrift::ContextStack> ctxStack(this->getContextStack(this->getServiceName(), "service1.method4", ctx));
  try {
    deserializeRequest<ProtocolIn_>(args, ctx->getMethodName(), std::move(serializedRequest).uncompress(), ctxStack.get());
  }
  catch (const std::exception& ex) {
    folly::exception_wrapper ew(std::current_exception(), ex);
    apache::thrift::detail::ap::process_handle_exn_deserialization<ProtocolOut_>(
        ew, std::move(req), ctx, eb, "method4");
    return;
  }
  if (!req->getShouldStartProcessing()) {
    apache::thrift::HandlerCallbackBase::releaseRequest(std::move(req), eb);
    return;
  }
  auto callback = std::make_unique<apache::thrift::HandlerCallback<::std::int32_t>>(std::move(req), std::move(ctxStack), return_method4<ProtocolIn_,ProtocolOut_>, throw_wrapped_method4<ProtocolIn_, ProtocolOut_>, ctx->getProtoSeqId(), eb, tm, ctx);
  iface_->async_tm_method4(std::move(callback), args.get<0>().ref(), std::move(uarg_j), args.get<2>().ref());
}

template <class ProtocolIn_, class ProtocolOut_>
folly::IOBufQueue service1AsyncProcessor::return_method4(int32_t protoSeqId, apache::thrift::ContextStack* ctx, ::std::int32_t const& _return) {
  ProtocolOut_ prot;
  service1_method4_presult result;
  result.get<0>().value = const_cast<::std::int32_t*>(&_return);
  result.setIsSet(0, true);
  return serializeResponse("method4", &prot, protoSeqId, ctx, result);
}

template <class ProtocolIn_, class ProtocolOut_>
void service1AsyncProcessor::throw_wrapped_method4(apache::thrift::ResponseChannelRequest::UniquePtr req,int32_t protoSeqId,apache::thrift::ContextStack* ctx,folly::exception_wrapper ew,apache::thrift::Cpp2RequestContext* reqCtx) {
  if (!ew) {
    return;
  }
  {
    (void)protoSeqId;
    apache::thrift::detail::ap::process_throw_wrapped_handler_error<ProtocolOut_>(
        ew, std::move(req), reqCtx, ctx, "method4");
    return;
  }
}

template <typename ProtocolIn_, typename ProtocolOut_>
void service1AsyncProcessor::setUpAndProcess_method5(apache::thrift::ResponseChannelRequest::UniquePtr req, apache::thrift::SerializedCompressedRequest&& serializedRequest, apache::thrift::Cpp2RequestContext* ctx, folly::EventBase* eb, apache::thrift::concurrency::ThreadManager* tm) {
  if (!setUpRequestProcessing(req, ctx, eb, tm, apache::thrift::RpcKind::SINGLE_REQUEST_SINGLE_RESPONSE, iface_)) {
    return;
  }
  auto scope = iface_->getRequestExecutionScope(ctx, apache::thrift::concurrency::NORMAL);
  ctx->setRequestExecutionScope(std::move(scope));
  processInThread(std::move(req), std::move(serializedRequest), ctx, eb, tm, apache::thrift::RpcKind::SINGLE_REQUEST_SINGLE_RESPONSE, &service1AsyncProcessor::process_method5<ProtocolIn_, ProtocolOut_>, this);
}

template <typename ProtocolIn_, typename ProtocolOut_>
void service1AsyncProcessor::process_method5(apache::thrift::ResponseChannelRequest::UniquePtr req, apache::thrift::SerializedCompressedRequest&& serializedRequest, apache::thrift::Cpp2RequestContext* ctx, folly::EventBase* eb, apache::thrift::concurrency::ThreadManager* tm) {
  // make sure getRequestContext is null
  // so async calls don't accidentally use it
  iface_->setRequestContext(nullptr);
  service1_method5_pargs args;
  std::unique_ptr<apache::thrift::ContextStack> ctxStack(this->getContextStack(this->getServiceName(), "service1.method5", ctx));
  try {
    deserializeRequest<ProtocolIn_>(args, ctx->getMethodName(), std::move(serializedRequest).uncompress(), ctxStack.get());
  }
  catch (const std::exception& ex) {
    folly::exception_wrapper ew(std::current_exception(), ex);
    apache::thrift::detail::ap::process_handle_exn_deserialization<ProtocolOut_>(
        ew, std::move(req), ctx, eb, "method5");
    return;
  }
  if (!req->getShouldStartProcessing()) {
    apache::thrift::HandlerCallbackBase::releaseRequest(std::move(req), eb);
    return;
  }
  auto callback = std::make_unique<apache::thrift::HandlerCallback<std::unique_ptr<::test_cpp2::cpp_reflection::struct2>>>(std::move(req), std::move(ctxStack), return_method5<ProtocolIn_,ProtocolOut_>, throw_wrapped_method5<ProtocolIn_, ProtocolOut_>, ctx->getProtoSeqId(), eb, tm, ctx);
  iface_->async_tm_method5(std::move(callback));
}

template <class ProtocolIn_, class ProtocolOut_>
folly::IOBufQueue service1AsyncProcessor::return_method5(int32_t protoSeqId, apache::thrift::ContextStack* ctx, ::test_cpp2::cpp_reflection::struct2 const& _return) {
  ProtocolOut_ prot;
  service1_method5_presult result;
  result.get<0>().value = const_cast<::test_cpp2::cpp_reflection::struct2*>(&_return);
  result.setIsSet(0, true);
  return serializeResponse("method5", &prot, protoSeqId, ctx, result);
}

template <class ProtocolIn_, class ProtocolOut_>
void service1AsyncProcessor::throw_wrapped_method5(apache::thrift::ResponseChannelRequest::UniquePtr req,int32_t protoSeqId,apache::thrift::ContextStack* ctx,folly::exception_wrapper ew,apache::thrift::Cpp2RequestContext* reqCtx) {
  if (!ew) {
    return;
  }
  {
    (void)protoSeqId;
    apache::thrift::detail::ap::process_throw_wrapped_handler_error<ProtocolOut_>(
        ew, std::move(req), reqCtx, ctx, "method5");
    return;
  }
}

template <typename ProtocolIn_, typename ProtocolOut_>
void service1AsyncProcessor::setUpAndProcess_method6(apache::thrift::ResponseChannelRequest::UniquePtr req, apache::thrift::SerializedCompressedRequest&& serializedRequest, apache::thrift::Cpp2RequestContext* ctx, folly::EventBase* eb, apache::thrift::concurrency::ThreadManager* tm) {
  if (!setUpRequestProcessing(req, ctx, eb, tm, apache::thrift::RpcKind::SINGLE_REQUEST_SINGLE_RESPONSE, iface_)) {
    return;
  }
  auto scope = iface_->getRequestExecutionScope(ctx, apache::thrift::concurrency::NORMAL);
  ctx->setRequestExecutionScope(std::move(scope));
  processInThread(std::move(req), std::move(serializedRequest), ctx, eb, tm, apache::thrift::RpcKind::SINGLE_REQUEST_SINGLE_RESPONSE, &service1AsyncProcessor::process_method6<ProtocolIn_, ProtocolOut_>, this);
}

template <typename ProtocolIn_, typename ProtocolOut_>
void service1AsyncProcessor::process_method6(apache::thrift::ResponseChannelRequest::UniquePtr req, apache::thrift::SerializedCompressedRequest&& serializedRequest, apache::thrift::Cpp2RequestContext* ctx, folly::EventBase* eb, apache::thrift::concurrency::ThreadManager* tm) {
  // make sure getRequestContext is null
  // so async calls don't accidentally use it
  iface_->setRequestContext(nullptr);
  service1_method6_pargs args;
  ::std::int32_t uarg_l{0};
  args.get<0>().value = &uarg_l;
  auto uarg_m = std::make_unique<::test_cpp2::cpp_reflection::struct1>();
  args.get<1>().value = uarg_m.get();
  double uarg_n{0};
  args.get<2>().value = &uarg_n;
  std::unique_ptr<apache::thrift::ContextStack> ctxStack(this->getContextStack(this->getServiceName(), "service1.method6", ctx));
  try {
    deserializeRequest<ProtocolIn_>(args, ctx->getMethodName(), std::move(serializedRequest).uncompress(), ctxStack.get());
  }
  catch (const std::exception& ex) {
    folly::exception_wrapper ew(std::current_exception(), ex);
    apache::thrift::detail::ap::process_handle_exn_deserialization<ProtocolOut_>(
        ew, std::move(req), ctx, eb, "method6");
    return;
  }
  if (!req->getShouldStartProcessing()) {
    apache::thrift::HandlerCallbackBase::releaseRequest(std::move(req), eb);
    return;
  }
  auto callback = std::make_unique<apache::thrift::HandlerCallback<std::unique_ptr<::test_cpp2::cpp_reflection::struct2>>>(std::move(req), std::move(ctxStack), return_method6<ProtocolIn_,ProtocolOut_>, throw_wrapped_method6<ProtocolIn_, ProtocolOut_>, ctx->getProtoSeqId(), eb, tm, ctx);
  iface_->async_tm_method6(std::move(callback), args.get<0>().ref(), std::move(uarg_m), args.get<2>().ref());
}

template <class ProtocolIn_, class ProtocolOut_>
folly::IOBufQueue service1AsyncProcessor::return_method6(int32_t protoSeqId, apache::thrift::ContextStack* ctx, ::test_cpp2::cpp_reflection::struct2 const& _return) {
  ProtocolOut_ prot;
  service1_method6_presult result;
  result.get<0>().value = const_cast<::test_cpp2::cpp_reflection::struct2*>(&_return);
  result.setIsSet(0, true);
  return serializeResponse("method6", &prot, protoSeqId, ctx, result);
}

template <class ProtocolIn_, class ProtocolOut_>
void service1AsyncProcessor::throw_wrapped_method6(apache::thrift::ResponseChannelRequest::UniquePtr req,int32_t protoSeqId,apache::thrift::ContextStack* ctx,folly::exception_wrapper ew,apache::thrift::Cpp2RequestContext* reqCtx) {
  if (!ew) {
    return;
  }
  {
    (void)protoSeqId;
    apache::thrift::detail::ap::process_throw_wrapped_handler_error<ProtocolOut_>(
        ew, std::move(req), reqCtx, ctx, "method6");
    return;
  }
}


}} // test_cpp2::cpp_reflection
