/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

#pragma once

#include <functional>
#include <folly/Range.h>

#include <thrift/lib/py3/enums.h>
#include "thrift/annotation/gen-cpp2/hack_data.h"
#include "thrift/annotation/gen-cpp2/hack_types.h"
#include "thrift/annotation/gen-cpp2/hack_metadata.h"
namespace thrift {
namespace py3 {



template<>
void reset_field<::facebook::thrift::annotation::hack::FieldWrapper>(
    ::facebook::thrift::annotation::hack::FieldWrapper& obj, uint16_t index) {
  switch (index) {
    case 0:
      obj.name_ref().copy_from(default_inst<::facebook::thrift::annotation::hack::FieldWrapper>().name_ref());
      return;
  }
}

template<>
void reset_field<::facebook::thrift::annotation::hack::SkipCodegen>(
    ::facebook::thrift::annotation::hack::SkipCodegen& obj, uint16_t index) {
  switch (index) {
    case 0:
      obj.reason_ref().copy_from(default_inst<::facebook::thrift::annotation::hack::SkipCodegen>().reason_ref());
      return;
  }
}

template<>
const std::unordered_map<std::string_view, std::string_view>& PyStructTraits<
    ::facebook::thrift::annotation::hack::FieldWrapper>::namesmap() {
  static const folly::Indestructible<NamesMap> map {
    {
    }
  };
  return *map;
}

template<>
const std::unordered_map<std::string_view, std::string_view>& PyStructTraits<
    ::facebook::thrift::annotation::hack::SkipCodegen>::namesmap() {
  static const folly::Indestructible<NamesMap> map {
    {
    }
  };
  return *map;
}
} // namespace py3
} // namespace thrift
