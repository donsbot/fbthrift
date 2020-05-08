<?hh // strict
/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

/**
 * Original thrift struct:-
 * Foo
 */
class Foo implements \IThriftStruct, \IThriftShapishStruct {
  use \ThriftSerializationTrait;

  const dict<int, this::TFieldSpec> SPEC = dict[
    1 => shape(
      'var' => 'just_int',
      'type' => \TType::I32,
    ),
    2 => shape(
      'var' => 'list_of_strings',
      'type' => \TType::LST,
      'etype' => \TType::STRING,
      'elem' => shape(
        'type' => \TType::STRING,
      ),
      'format' => 'collection',
    ),
    3 => shape(
      'var' => 'set_of_ints',
      'type' => \TType::SET,
      'etype' => \TType::I32,
      'elem' => shape(
        'type' => \TType::I32,
      ),
      'format' => 'array',
    ),
    4 => shape(
      'var' => 'map_of_list_of_strings',
      'type' => \TType::MAP,
      'ktype' => \TType::STRING,
      'vtype' => \TType::LST,
      'key' => shape(
        'type' => \TType::STRING,
      ),
      'val' => shape(
        'type' => \TType::LST,
        'etype' => \TType::STRING,
        'elem' => shape(
          'type' => \TType::STRING,
        ),
        'format' => 'collection',
      ),
      'format' => 'collection',
    ),
    5 => shape(
      'var' => 'map_of_set_of_strings',
      'type' => \TType::MAP,
      'ktype' => \TType::STRING,
      'vtype' => \TType::SET,
      'key' => shape(
        'type' => \TType::STRING,
      ),
      'val' => shape(
        'type' => \TType::SET,
        'etype' => \TType::STRING,
        'elem' => shape(
          'type' => \TType::STRING,
        ),
        'format' => 'array',
      ),
      'format' => 'collection',
    ),
    6 => shape(
      'var' => 'map_of_strings_to_map_of_string_ints',
      'type' => \TType::MAP,
      'ktype' => \TType::STRING,
      'vtype' => \TType::MAP,
      'key' => shape(
        'type' => \TType::STRING,
      ),
      'val' => shape(
        'type' => \TType::MAP,
        'ktype' => \TType::STRING,
        'vtype' => \TType::I32,
        'key' => shape(
          'type' => \TType::STRING,
        ),
        'val' => shape(
          'type' => \TType::I32,
        ),
        'format' => 'collection',
      ),
      'format' => 'collection',
    ),
    7 => shape(
      'var' => 'optional_map_of_map_of_sets',
      'type' => \TType::MAP,
      'ktype' => \TType::I32,
      'vtype' => \TType::MAP,
      'key' => shape(
        'type' => \TType::I32,
      ),
      'val' => shape(
        'type' => \TType::MAP,
        'ktype' => \TType::I32,
        'vtype' => \TType::SET,
        'key' => shape(
          'type' => \TType::I32,
        ),
        'val' => shape(
          'type' => \TType::SET,
          'etype' => \TType::STRING,
          'elem' => shape(
            'type' => \TType::STRING,
          ),
          'format' => 'array',
        ),
        'format' => 'collection',
      ),
      'format' => 'collection',
    ),
  ];
  const dict<string, int> FIELDMAP = dict[
    'just_int' => 1,
    'list_of_strings' => 2,
    'set_of_ints' => 3,
    'map_of_list_of_strings' => 4,
    'map_of_set_of_strings' => 5,
    'map_of_strings_to_map_of_string_ints' => 6,
    'optional_map_of_map_of_sets' => 7,
  ];
  const type TShape = shape(
    'just_int' => int,
    'list_of_strings' => varray<string>,
    'set_of_ints' => darray<int, bool>,
    'map_of_list_of_strings' => darray<string, varray<string>>,
    'map_of_set_of_strings' => darray<string, darray<string, bool>>,
    'map_of_strings_to_map_of_string_ints' => darray<string, darray<string, int>>,
    ?'optional_map_of_map_of_sets' => ?darray<int, darray<int, darray<string, bool>>>,
    ...
  );
  const int STRUCTURAL_ID = 6419322044061300149;
  /**
   * Original thrift field:-
   * 1: i32 just_int
   */
  public int $just_int;
  /**
   * Original thrift field:-
   * 2: list<string> list_of_strings
   */
  public Vector<string> $list_of_strings;
  /**
   * Original thrift field:-
   * 3: set<i32> set_of_ints
   */
  public darray<int, bool> $set_of_ints;
  /**
   * Original thrift field:-
   * 4: map<string, list<string>> map_of_list_of_strings
   */
  public Map<string, Vector<string>> $map_of_list_of_strings;
  /**
   * Original thrift field:-
   * 5: map<string, set<string>> map_of_set_of_strings
   */
  public Map<string, darray<string, bool>> $map_of_set_of_strings;
  /**
   * Original thrift field:-
   * 6: map<string, map<string, i32>> map_of_strings_to_map_of_string_ints
   */
  public Map<string, Map<string, int>> $map_of_strings_to_map_of_string_ints;
  /**
   * Original thrift field:-
   * 7: map<i32, map<i32, set<string>>> optional_map_of_map_of_sets
   */
  public ?Map<int, Map<int, darray<string, bool>>> $optional_map_of_map_of_sets;

  <<__Rx>>
  public function __construct(@KeyedContainer<string, mixed> $vals = darray[]) {
    $this->just_int = (int)idx($vals, 'just_int', 0);
    /* HH_FIXME[4110] previously hidden by unsafe */
    $this->list_of_strings = idx($vals, 'list_of_strings', Vector {});
    /* HH_FIXME[4110] previously hidden by unsafe */
    $this->set_of_ints = idx($vals, 'set_of_ints', darray[]);
    /* HH_FIXME[4110] previously hidden by unsafe */
    $this->map_of_list_of_strings = idx($vals, 'map_of_list_of_strings', Map {});
    /* HH_FIXME[4110] previously hidden by unsafe */
    $this->map_of_set_of_strings = idx($vals, 'map_of_set_of_strings', Map {});
    /* HH_FIXME[4110] previously hidden by unsafe */
    $this->map_of_strings_to_map_of_string_ints = idx($vals, 'map_of_strings_to_map_of_string_ints', Map {});
    if (C\contains_key($vals, 'optional_map_of_map_of_sets')) {
      /* HH_FIXME[4110] previously hidden by unsafe */
      $this->optional_map_of_map_of_sets = idx($vals, 'optional_map_of_map_of_sets', Map {});
    }
  }

  public function getName(): string {
    return 'Foo';
  }

  public static function getAnnotations(): darray<string, mixed> {
    return darray[
    ];
  }
  public static function __fromShape(self::TShape $shape): this {
    $me = new static();
    $me->just_int = $shape['just_int'];
    $me->list_of_strings = (new Vector($shape['list_of_strings']));
    $me->set_of_ints = $shape['set_of_ints'];
    $me->map_of_list_of_strings = (new Map($shape['map_of_list_of_strings']))->map(
      $val0 ==> (new Vector($val0)),
    );
    $me->map_of_set_of_strings = (new Map($shape['map_of_set_of_strings']));
    $me->map_of_strings_to_map_of_string_ints = (new Map($shape['map_of_strings_to_map_of_string_ints']))->map(
      $val1 ==> (new Map($val1)),
    );
    if (Shapes::idx($shape, 'optional_map_of_map_of_sets') !== null) {
      $me->optional_map_of_map_of_sets = (new Map($shape['optional_map_of_map_of_sets']))->map(
        $val2 ==> (new Map($val2)),
      );
    }
    return $me;
  }

  <<__Rx>>
  public function __toShape(): self::TShape {
    return shape(
      'just_int' => $this->just_int,
      'list_of_strings' => varray($this->list_of_strings),
      'set_of_ints' => $this->set_of_ints,
      'map_of_list_of_strings' => $this->map_of_list_of_strings->map(
        $_val0 ==> varray($_val0),
      )
        |> ThriftUtil::toDArray($$),
      'map_of_set_of_strings' => $this->map_of_set_of_strings->map(
        $_val0 ==> darray($_val0),
      )
        |> ThriftUtil::toDArray($$),
      'map_of_strings_to_map_of_string_ints' => $this->map_of_strings_to_map_of_string_ints->map(
        $_val0 ==> ThriftUtil::toDArray($_val0),
      )
        |> ThriftUtil::toDArray($$),
      'optional_map_of_map_of_sets' => $this->optional_map_of_map_of_sets?->map(
        $_val0 ==> $_val0->map(
          $_val1 ==> darray($_val1),
        )
          |> ThriftUtil::toDArray($$),
      )
        |> $$ === null ? null : ThriftUtil::toDArray($$),
    );
  }
}

