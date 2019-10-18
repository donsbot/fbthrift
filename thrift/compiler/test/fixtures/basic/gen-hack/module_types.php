<?hh // strict
/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

/**
 * Original thrift enum:-
 * MyEnum
 */
enum MyEnum: int {
  MyValue1 = 0;
  MyValue2 = 1;
}

/**
 * Original thrift struct:-
 * MyStruct
 */
class MyStruct implements \IThriftStruct, \IThriftShapishStruct {
  use \ThriftSerializationTrait;

  const dict<int, this::TFieldSpec> SPEC = dict[
    1 => shape(
      'var' => 'MyIntField',
      'type' => \TType::I64,
    ),
    2 => shape(
      'var' => 'MyStringField',
      'type' => \TType::STRING,
    ),
    3 => shape(
      'var' => 'MyDataField',
      'type' => \TType::STRUCT,
      'class' => MyDataItem::class,
    ),
    4 => shape(
      'var' => 'myEnum',
      'type' => \TType::I32,
      'enum' => MyEnum::class,
    ),
  ];
  const dict<string, int> FIELDMAP = dict[
    'MyIntField' => 1,
    'MyStringField' => 2,
    'MyDataField' => 3,
    'myEnum' => 4,
  ];
  const type TShape = shape(
    'MyIntField' => int,
    'MyStringField' => string,
    ?'MyDataField' => ?MyDataItem::TShape,
    ?'myEnum' => ?MyEnum,
    ...
  );
  const int STRUCTURAL_ID = 1814653584841679556;
  /**
   * Original thrift field:-
   * 1: i64 MyIntField
   */
  public int $MyIntField;
  /**
   * Original thrift field:-
   * 2: string MyStringField
   */
  public string $MyStringField;
  /**
   * Original thrift field:-
   * 3: struct module.MyDataItem MyDataField
   */
  public ?MyDataItem $MyDataField;
  /**
   * Original thrift field:-
   * 4: enum module.MyEnum myEnum
   */
  public ?MyEnum $myEnum;

  <<__Rx>>
  public function __construct(?int $MyIntField = null, ?string $MyStringField = null, ?MyDataItem $MyDataField = null, ?MyEnum $myEnum = null  ) {
    if ($MyIntField === null) {
      $this->MyIntField = 0;
    } else {
      $this->MyIntField = $MyIntField;
    }
    if ($MyStringField === null) {
      $this->MyStringField = '';
    } else {
      $this->MyStringField = $MyStringField;
    }
    $this->MyDataField = $MyDataField;
    $this->myEnum = $myEnum;
  }

  public function getName(): string {
    return 'MyStruct';
  }

  public static function __fromShape(self::TShape $shape): this {
    $me = new static();
    $me->MyIntField = $shape['MyIntField'];
    $me->MyStringField = $shape['MyStringField'];
    if (Shapes::idx($shape, 'MyDataField') !== null) {
      $me->MyDataField = MyDataItem::__fromShape($shape['MyDataField']);
    }
    if (Shapes::idx($shape, 'myEnum') !== null) {
      $me->myEnum = $shape['myEnum'];
    }
    return $me;
  }

  <<__Rx>>
  public function __toShape(): self::TShape {
    return shape(
      'MyIntField' => $this->MyIntField,
      'MyStringField' => $this->MyStringField,
      'MyDataField' => $this->MyDataField?->__toShape(),
      'myEnum' => $this->myEnum,
    );
  }
  public function readFromJson(string $jsonText): void {
    $parsed = json_decode($jsonText, true);

    if ($parsed === null || !is_array($parsed)) {
      throw new \TProtocolException("Cannot parse the given json string.");
    }

    if (idx($parsed, 'MyIntField') !== null) {
      $this->MyIntField = /* HH_FIXME[4110] */ $parsed['MyIntField'];
    }    
    if (idx($parsed, 'MyStringField') !== null) {
      $this->MyStringField = /* HH_FIXME[4110] */ $parsed['MyStringField'];
    }    
    if (idx($parsed, 'MyDataField') !== null) {
      $_tmp0 = json_encode(/* HH_FIXME[4110] */ $parsed['MyDataField']);
      $_tmp1 = new MyDataItem();
      $_tmp1->readFromJson($_tmp0);
      $this->MyDataField = $_tmp1;
    }    
    if (idx($parsed, 'myEnum') !== null) {
      $this->myEnum = MyEnum::coerce(/* HH_FIXME[4110] */ $parsed['myEnum']);    }    
  }

}

/**
 * Original thrift struct:-
 * MyDataItem
 */
class MyDataItem implements \IThriftStruct, \IThriftShapishStruct {
  use \ThriftSerializationTrait;

  const dict<int, this::TFieldSpec> SPEC = dict[
  ];
  const dict<string, int> FIELDMAP = dict[
  ];
  const type TShape = shape(
    ...
  );
  const int STRUCTURAL_ID = 957977401221134810;

  <<__Rx>>
  public function __construct(  ) {
  }

  public function getName(): string {
    return 'MyDataItem';
  }

  public static function __fromShape(self::TShape $shape): this {
    $me = new static();
    return $me;
  }

  <<__Rx>>
  public function __toShape(): self::TShape {
    return shape(
    );
  }
  public function readFromJson(string $jsonText): void {
    $parsed = json_decode($jsonText, true);

    if ($parsed === null || !is_array($parsed)) {
      throw new \TProtocolException("Cannot parse the given json string.");
    }

  }

}

enum MyUnionEnum: int {
  _EMPTY_ = 0;
  myEnum = 1;
  myStruct = 2;
  myDataItem = 3;
}

/**
 * Original thrift struct:-
 * MyUnion
 */
class MyUnion implements \IThriftStruct, \IThriftUnion<MyUnionEnum>, \IThriftShapishStruct {
  use \ThriftUnionSerializationTrait;

  const dict<int, this::TFieldSpec> SPEC = dict[
    1 => shape(
      'var' => 'myEnum',
      'union' => true,
      'type' => \TType::I32,
      'enum' => MyEnum::class,
    ),
    2 => shape(
      'var' => 'myStruct',
      'union' => true,
      'type' => \TType::STRUCT,
      'class' => MyStruct::class,
    ),
    3 => shape(
      'var' => 'myDataItem',
      'union' => true,
      'type' => \TType::STRUCT,
      'class' => MyDataItem::class,
    ),
  ];
  const dict<string, int> FIELDMAP = dict[
    'myEnum' => 1,
    'myStruct' => 2,
    'myDataItem' => 3,
  ];
  const type TShape = shape(
    ?'myEnum' => ?MyEnum,
    ?'myStruct' => ?MyStruct::TShape,
    ?'myDataItem' => ?MyDataItem::TShape,
    ...
  );
  const int STRUCTURAL_ID = 3298716738803257608;
  /**
   * Original thrift field:-
   * 1: enum module.MyEnum myEnum
   */
  public ?MyEnum $myEnum;
  /**
   * Original thrift field:-
   * 2: struct module.MyStruct myStruct
   */
  public ?MyStruct $myStruct;
  /**
   * Original thrift field:-
   * 3: struct module.MyDataItem myDataItem
   */
  public ?MyDataItem $myDataItem;
  protected MyUnionEnum $_type = MyUnionEnum::_EMPTY_;

  <<__Rx>>
  public function __construct(?MyEnum $myEnum = null, ?MyStruct $myStruct = null, ?MyDataItem $myDataItem = null  ) {
    $this->_type = MyUnionEnum::_EMPTY_;
    if ($myEnum !== null) {
      $this->myEnum = $myEnum;
      $this->_type = MyUnionEnum::myEnum;
    }
    if ($myStruct !== null) {
      $this->myStruct = $myStruct;
      $this->_type = MyUnionEnum::myStruct;
    }
    if ($myDataItem !== null) {
      $this->myDataItem = $myDataItem;
      $this->_type = MyUnionEnum::myDataItem;
    }
  }

  public function getName(): string {
    return 'MyUnion';
  }

  public function getType(): MyUnionEnum {
    return $this->_type;
  }

  public function set_myEnum(MyEnum $myEnum): this {
    $this->_type = MyUnionEnum::myEnum;
    $this->myEnum = $myEnum;
    return $this;
  }

  public function get_myEnum(): MyEnum {
    invariant(
      $this->_type === MyUnionEnum::myEnum,
      'get_myEnum called on an instance of MyUnion whose current type is %s',
      $this->_type,
    );
    return \nullthrows($this->myEnum);
  }

  public function set_myStruct(MyStruct $myStruct): this {
    $this->_type = MyUnionEnum::myStruct;
    $this->myStruct = $myStruct;
    return $this;
  }

  public function get_myStruct(): MyStruct {
    invariant(
      $this->_type === MyUnionEnum::myStruct,
      'get_myStruct called on an instance of MyUnion whose current type is %s',
      $this->_type,
    );
    return \nullthrows($this->myStruct);
  }

  public function set_myDataItem(MyDataItem $myDataItem): this {
    $this->_type = MyUnionEnum::myDataItem;
    $this->myDataItem = $myDataItem;
    return $this;
  }

  public function get_myDataItem(): MyDataItem {
    invariant(
      $this->_type === MyUnionEnum::myDataItem,
      'get_myDataItem called on an instance of MyUnion whose current type is %s',
      $this->_type,
    );
    return \nullthrows($this->myDataItem);
  }

  public static function __fromShape(self::TShape $shape): this {
    $me = new static();
    $me->_type = MyUnionEnum::_EMPTY_;
    if (Shapes::idx($shape, 'myEnum') !== null) {
      $me->myEnum = $shape['myEnum'];
      $me->_type = MyUnionEnum::myEnum;
    }
    if (Shapes::idx($shape, 'myStruct') !== null) {
      $me->myStruct = MyStruct::__fromShape($shape['myStruct']);
      $me->_type = MyUnionEnum::myStruct;
    }
    if (Shapes::idx($shape, 'myDataItem') !== null) {
      $me->myDataItem = MyDataItem::__fromShape($shape['myDataItem']);
      $me->_type = MyUnionEnum::myDataItem;
    }
    return $me;
  }

  <<__Rx>>
  public function __toShape(): self::TShape {
    return shape(
      'myEnum' => $this->myEnum,
      'myStruct' => $this->myStruct?->__toShape(),
      'myDataItem' => $this->myDataItem?->__toShape(),
    );
  }
  public function readFromJson(string $jsonText): void {
    $this->_type = MyUnionEnum::_EMPTY_;
    $parsed = json_decode($jsonText, true);

    if ($parsed === null || !is_array($parsed)) {
      throw new \TProtocolException("Cannot parse the given json string.");
    }

    if (idx($parsed, 'myEnum') !== null) {
      $this->myEnum = MyEnum::coerce(/* HH_FIXME[4110] */ $parsed['myEnum']);      $this->_type = MyUnionEnum::myEnum;
    }    
    if (idx($parsed, 'myStruct') !== null) {
      $_tmp0 = json_encode(/* HH_FIXME[4110] */ $parsed['myStruct']);
      $_tmp1 = new MyStruct();
      $_tmp1->readFromJson($_tmp0);
      $this->myStruct = $_tmp1;
      $this->_type = MyUnionEnum::myStruct;
    }    
    if (idx($parsed, 'myDataItem') !== null) {
      $_tmp2 = json_encode(/* HH_FIXME[4110] */ $parsed['myDataItem']);
      $_tmp3 = new MyDataItem();
      $_tmp3->readFromJson($_tmp2);
      $this->myDataItem = $_tmp3;
      $this->_type = MyUnionEnum::myDataItem;
    }    
  }

}

