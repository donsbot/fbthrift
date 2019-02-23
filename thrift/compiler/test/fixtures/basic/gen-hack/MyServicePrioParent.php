<?hh // strict
/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

/**
 * Original thrift service:-
 * MyServicePrioParent
 */
interface MyServicePrioParentAsyncIf extends \IThriftAsyncIf {
  /**
   * Original thrift definition:-
   * void
   *   ping();
   */
  public function ping(): Awaitable<void>;

  /**
   * Original thrift definition:-
   * void
   *   pong();
   */
  public function pong(): Awaitable<void>;
}

/**
 * Original thrift service:-
 * MyServicePrioParent
 */
interface MyServicePrioParentIf extends \IThriftSyncIf {
  /**
   * Original thrift definition:-
   * void
   *   ping();
   */
  public function ping(): void;

  /**
   * Original thrift definition:-
   * void
   *   pong();
   */
  public function pong(): void;
}

/**
 * Original thrift service:-
 * MyServicePrioParent
 */
interface MyServicePrioParentClientIf extends \IThriftSyncIf {
  /**
   * Original thrift definition:-
   * void
   *   ping();
   */
  public function gen_ping(): Awaitable<void>;

  /**
   * Original thrift definition:-
   * void
   *   pong();
   */
  public function gen_pong(): Awaitable<void>;
}

/**
 * Original thrift service:-
 * MyServicePrioParent
 */
trait MyServicePrioParentClientBase {
  require extends \ThriftClientBase;

  protected function sendImpl_ping(): int {
    $currentseqid = $this->getNextSequenceID();
    $args = new MyServicePrioParent_ping_args(
    );
    try {
      $this->eventHandler_->preSend('ping', $args, $currentseqid);
      if ($this->output_ is \TBinaryProtocolAccelerated)
      {
        \thrift_protocol_write_binary($this->output_, 'ping', \TMessageType::CALL, $args, $currentseqid, $this->output_->isStrictWrite(), false);
      }
      else if ($this->output_ is \TCompactProtocolAccelerated)
      {
        \thrift_protocol_write_compact($this->output_, 'ping', \TMessageType::CALL, $args, $currentseqid, false);
      }
      else
      {
        $this->output_->writeMessageBegin('ping', \TMessageType::CALL, $currentseqid);
        $args->write($this->output_);
        $this->output_->writeMessageEnd();
        $this->output_->getTransport()->flush();
      }
    } catch (\THandlerShortCircuitException $ex) {
      switch ($ex->resultType) {
        case \THandlerShortCircuitException::R_EXPECTED_EX:
        case \THandlerShortCircuitException::R_UNEXPECTED_EX:
          $this->eventHandler_->sendError('ping', $args, $currentseqid, $ex->result);
          throw $ex->result;
        case \THandlerShortCircuitException::R_SUCCESS:
        default:
          $this->eventHandler_->postSend('ping', $args, $currentseqid);
          return $currentseqid;
      }
    } catch (\Exception $ex) {
      $this->eventHandler_->sendError('ping', $args, $currentseqid, $ex);
      throw $ex;
    }
    $this->eventHandler_->postSend('ping', $args, $currentseqid);
    return $currentseqid;
  }

  protected function recvImpl_ping(?int $expectedsequenceid = null): void {
    try {
      $this->eventHandler_->preRecv('ping', $expectedsequenceid);
      if ($this->input_ is \TBinaryProtocolAccelerated) {
        $result = \thrift_protocol_read_binary($this->input_, 'MyServicePrioParent_ping_result', $this->input_->isStrictRead());
      } else if ($this->input_ is \TCompactProtocolAccelerated)
      {
        $result = \thrift_protocol_read_compact($this->input_, 'MyServicePrioParent_ping_result');
      }
      else
      {
        $rseqid = 0;
        $fname = '';
        $mtype = 0;

        $this->input_->readMessageBegin(&$fname, &$mtype, &$rseqid);
        if ($mtype == \TMessageType::EXCEPTION) {
          $x = new \TApplicationException();
          $x->read($this->input_);
          $this->input_->readMessageEnd();
          throw $x;
        }
        $result = new MyServicePrioParent_ping_result();
        $result->read($this->input_);
        $this->input_->readMessageEnd();
        if ($expectedsequenceid !== null && ($rseqid != $expectedsequenceid)) {
          throw new \TProtocolException("ping failed: sequence id is out of order");
        }
      }
    } catch (\THandlerShortCircuitException $ex) {
      switch ($ex->resultType) {
        case \THandlerShortCircuitException::R_EXPECTED_EX:
          $this->eventHandler_->recvException('ping', $expectedsequenceid, $ex->result);
          throw $ex->result;
        case \THandlerShortCircuitException::R_UNEXPECTED_EX:
          $this->eventHandler_->recvError('ping', $expectedsequenceid, $ex->result);
          throw $ex->result;
        case \THandlerShortCircuitException::R_SUCCESS:
        default:
          $this->eventHandler_->postRecv('ping', $expectedsequenceid, $ex->result);
          return;
      }
    } catch (\Exception $ex) {
      $this->eventHandler_->recvError('ping', $expectedsequenceid, $ex);
      throw $ex;
    }
          $this->eventHandler_->postRecv('ping', $expectedsequenceid, null);
return;
  }

  protected function sendImpl_pong(): int {
    $currentseqid = $this->getNextSequenceID();
    $args = new MyServicePrioParent_pong_args(
    );
    try {
      $this->eventHandler_->preSend('pong', $args, $currentseqid);
      if ($this->output_ is \TBinaryProtocolAccelerated)
      {
        \thrift_protocol_write_binary($this->output_, 'pong', \TMessageType::CALL, $args, $currentseqid, $this->output_->isStrictWrite(), false);
      }
      else if ($this->output_ is \TCompactProtocolAccelerated)
      {
        \thrift_protocol_write_compact($this->output_, 'pong', \TMessageType::CALL, $args, $currentseqid, false);
      }
      else
      {
        $this->output_->writeMessageBegin('pong', \TMessageType::CALL, $currentseqid);
        $args->write($this->output_);
        $this->output_->writeMessageEnd();
        $this->output_->getTransport()->flush();
      }
    } catch (\THandlerShortCircuitException $ex) {
      switch ($ex->resultType) {
        case \THandlerShortCircuitException::R_EXPECTED_EX:
        case \THandlerShortCircuitException::R_UNEXPECTED_EX:
          $this->eventHandler_->sendError('pong', $args, $currentseqid, $ex->result);
          throw $ex->result;
        case \THandlerShortCircuitException::R_SUCCESS:
        default:
          $this->eventHandler_->postSend('pong', $args, $currentseqid);
          return $currentseqid;
      }
    } catch (\Exception $ex) {
      $this->eventHandler_->sendError('pong', $args, $currentseqid, $ex);
      throw $ex;
    }
    $this->eventHandler_->postSend('pong', $args, $currentseqid);
    return $currentseqid;
  }

  protected function recvImpl_pong(?int $expectedsequenceid = null): void {
    try {
      $this->eventHandler_->preRecv('pong', $expectedsequenceid);
      if ($this->input_ is \TBinaryProtocolAccelerated) {
        $result = \thrift_protocol_read_binary($this->input_, 'MyServicePrioParent_pong_result', $this->input_->isStrictRead());
      } else if ($this->input_ is \TCompactProtocolAccelerated)
      {
        $result = \thrift_protocol_read_compact($this->input_, 'MyServicePrioParent_pong_result');
      }
      else
      {
        $rseqid = 0;
        $fname = '';
        $mtype = 0;

        $this->input_->readMessageBegin(&$fname, &$mtype, &$rseqid);
        if ($mtype == \TMessageType::EXCEPTION) {
          $x = new \TApplicationException();
          $x->read($this->input_);
          $this->input_->readMessageEnd();
          throw $x;
        }
        $result = new MyServicePrioParent_pong_result();
        $result->read($this->input_);
        $this->input_->readMessageEnd();
        if ($expectedsequenceid !== null && ($rseqid != $expectedsequenceid)) {
          throw new \TProtocolException("pong failed: sequence id is out of order");
        }
      }
    } catch (\THandlerShortCircuitException $ex) {
      switch ($ex->resultType) {
        case \THandlerShortCircuitException::R_EXPECTED_EX:
          $this->eventHandler_->recvException('pong', $expectedsequenceid, $ex->result);
          throw $ex->result;
        case \THandlerShortCircuitException::R_UNEXPECTED_EX:
          $this->eventHandler_->recvError('pong', $expectedsequenceid, $ex->result);
          throw $ex->result;
        case \THandlerShortCircuitException::R_SUCCESS:
        default:
          $this->eventHandler_->postRecv('pong', $expectedsequenceid, $ex->result);
          return;
      }
    } catch (\Exception $ex) {
      $this->eventHandler_->recvError('pong', $expectedsequenceid, $ex);
      throw $ex;
    }
          $this->eventHandler_->postRecv('pong', $expectedsequenceid, null);
return;
  }

}

class MyServicePrioParentAsyncClient extends \ThriftClientBase implements MyServicePrioParentAsyncIf {
  use MyServicePrioParentClientBase;

  /**
   * Original thrift definition:-
   * void
   *   ping();
   */
  public async function ping(): Awaitable<void> {
    $currentseqid = $this->sendImpl_ping();
    await $this->asyncHandler_->genWait($currentseqid);
    $this->recvImpl_ping($currentseqid);
  }

  /**
   * Original thrift definition:-
   * void
   *   pong();
   */
  public async function pong(): Awaitable<void> {
    $currentseqid = $this->sendImpl_pong();
    await $this->asyncHandler_->genWait($currentseqid);
    $this->recvImpl_pong($currentseqid);
  }

}

class MyServicePrioParentClient extends \ThriftClientBase implements MyServicePrioParentClientIf {
  use MyServicePrioParentClientBase;

  /**
   * Original thrift definition:-
   * void
   *   ping();
   */
  public async function gen_ping(): Awaitable<void> {
    $currentseqid = $this->sendImpl_ping();
    await $this->asyncHandler_->genWait($currentseqid);
    $this->recvImpl_ping($currentseqid);
  }

  /**
   * Original thrift definition:-
   * void
   *   pong();
   */
  public async function gen_pong(): Awaitable<void> {
    $currentseqid = $this->sendImpl_pong();
    await $this->asyncHandler_->genWait($currentseqid);
    $this->recvImpl_pong($currentseqid);
  }

  /* send and recv functions */
  public function send_ping(): int {
    return $this->sendImpl_ping();
  }
  public function recv_ping(?int $expectedsequenceid = null): void {
    $this->recvImpl_ping($expectedsequenceid);
  }
  public function send_pong(): int {
    return $this->sendImpl_pong();
  }
  public function recv_pong(?int $expectedsequenceid = null): void {
    $this->recvImpl_pong($expectedsequenceid);
  }
}

abstract class MyServicePrioParentAsyncProcessorBase extends ThriftAsyncProcessor {
  abstract const type TThriftIf as MyServicePrioParentAsyncIf;
  protected async function process_ping(int $seqid, \TProtocol $input, \TProtocol $output): Awaitable<void> {
    $handler_ctx = $this->eventHandler_->getHandlerContext('ping');
    $reply_type = \TMessageType::REPLY;

    $this->eventHandler_->preRead($handler_ctx, 'ping', dict[]);

    if ($input is \TBinaryProtocolAccelerated) {
      $args = \thrift_protocol_read_binary_struct($input, 'MyServicePrioParent_ping_args');
    } else if ($input is \TCompactProtocolAccelerated) {
      $args = \thrift_protocol_read_compact_struct($input, 'MyServicePrioParent_ping_args');
    } else {
      $args = new MyServicePrioParent_ping_args();
      $args->read($input);
    }
    $input->readMessageEnd();
    $this->eventHandler_->postRead($handler_ctx, 'ping', $args);
    $result = new MyServicePrioParent_ping_result();
    try {
      $this->eventHandler_->preExec($handler_ctx, 'ping', $args);
      await $this->handler->ping();
      $this->eventHandler_->postExec($handler_ctx, 'ping', $result);
    } catch (\Exception $ex) {
      $reply_type = \TMessageType::EXCEPTION;
      $this->eventHandler_->handlerError($handler_ctx, 'ping', $ex);
      $result = new \TApplicationException($ex->getMessage()."\n".$ex->getTraceAsString());
    }
    $this->eventHandler_->preWrite($handler_ctx, 'ping', $result);
    if ($output is \TBinaryProtocolAccelerated)
    {
      \thrift_protocol_write_binary($output, 'ping', $reply_type, $result, $seqid, $output->isStrictWrite());
    }
    else if ($output is \TCompactProtocolAccelerated)
    {
      \thrift_protocol_write_compact($output, 'ping', $reply_type, $result, $seqid);
    }
    else
    {
      $output->writeMessageBegin("ping", $reply_type, $seqid);
      $result->write($output);
      $output->writeMessageEnd();
      $output->getTransport()->flush();
    }
    $this->eventHandler_->postWrite($handler_ctx, 'ping', $result);
  }
  protected async function process_pong(int $seqid, \TProtocol $input, \TProtocol $output): Awaitable<void> {
    $handler_ctx = $this->eventHandler_->getHandlerContext('pong');
    $reply_type = \TMessageType::REPLY;

    $this->eventHandler_->preRead($handler_ctx, 'pong', dict[]);

    if ($input is \TBinaryProtocolAccelerated) {
      $args = \thrift_protocol_read_binary_struct($input, 'MyServicePrioParent_pong_args');
    } else if ($input is \TCompactProtocolAccelerated) {
      $args = \thrift_protocol_read_compact_struct($input, 'MyServicePrioParent_pong_args');
    } else {
      $args = new MyServicePrioParent_pong_args();
      $args->read($input);
    }
    $input->readMessageEnd();
    $this->eventHandler_->postRead($handler_ctx, 'pong', $args);
    $result = new MyServicePrioParent_pong_result();
    try {
      $this->eventHandler_->preExec($handler_ctx, 'pong', $args);
      await $this->handler->pong();
      $this->eventHandler_->postExec($handler_ctx, 'pong', $result);
    } catch (\Exception $ex) {
      $reply_type = \TMessageType::EXCEPTION;
      $this->eventHandler_->handlerError($handler_ctx, 'pong', $ex);
      $result = new \TApplicationException($ex->getMessage()."\n".$ex->getTraceAsString());
    }
    $this->eventHandler_->preWrite($handler_ctx, 'pong', $result);
    if ($output is \TBinaryProtocolAccelerated)
    {
      \thrift_protocol_write_binary($output, 'pong', $reply_type, $result, $seqid, $output->isStrictWrite());
    }
    else if ($output is \TCompactProtocolAccelerated)
    {
      \thrift_protocol_write_compact($output, 'pong', $reply_type, $result, $seqid);
    }
    else
    {
      $output->writeMessageBegin("pong", $reply_type, $seqid);
      $result->write($output);
      $output->writeMessageEnd();
      $output->getTransport()->flush();
    }
    $this->eventHandler_->postWrite($handler_ctx, 'pong', $result);
  }
}
class MyServicePrioParentAsyncProcessor extends MyServicePrioParentAsyncProcessorBase {
  const type TThriftIf = MyServicePrioParentAsyncIf;
}

abstract class MyServicePrioParentSyncProcessorBase extends ThriftSyncProcessor {
  abstract const type TThriftIf as MyServicePrioParentIf;
  protected function process_ping(int $seqid, \TProtocol $input, \TProtocol $output): void {
    $handler_ctx = $this->eventHandler_->getHandlerContext('ping');
    $reply_type = \TMessageType::REPLY;

    $this->eventHandler_->preRead($handler_ctx, 'ping', dict[]);

    if ($input is \TBinaryProtocolAccelerated) {
      $args = \thrift_protocol_read_binary_struct($input, 'MyServicePrioParent_ping_args');
    } else if ($input is \TCompactProtocolAccelerated) {
      $args = \thrift_protocol_read_compact_struct($input, 'MyServicePrioParent_ping_args');
    } else {
      $args = new MyServicePrioParent_ping_args();
      $args->read($input);
    }
    $input->readMessageEnd();
    $this->eventHandler_->postRead($handler_ctx, 'ping', $args);
    $result = new MyServicePrioParent_ping_result();
    try {
      $this->eventHandler_->preExec($handler_ctx, 'ping', $args);
      $this->handler->ping();
      $this->eventHandler_->postExec($handler_ctx, 'ping', $result);
    } catch (\Exception $ex) {
      $reply_type = \TMessageType::EXCEPTION;
      $this->eventHandler_->handlerError($handler_ctx, 'ping', $ex);
      $result = new \TApplicationException($ex->getMessage()."\n".$ex->getTraceAsString());
    }
    $this->eventHandler_->preWrite($handler_ctx, 'ping', $result);
    if ($output is \TBinaryProtocolAccelerated)
    {
      \thrift_protocol_write_binary($output, 'ping', $reply_type, $result, $seqid, $output->isStrictWrite());
    }
    else if ($output is \TCompactProtocolAccelerated)
    {
      \thrift_protocol_write_compact($output, 'ping', $reply_type, $result, $seqid);
    }
    else
    {
      $output->writeMessageBegin("ping", $reply_type, $seqid);
      $result->write($output);
      $output->writeMessageEnd();
      $output->getTransport()->flush();
    }
    $this->eventHandler_->postWrite($handler_ctx, 'ping', $result);
  }
  protected function process_pong(int $seqid, \TProtocol $input, \TProtocol $output): void {
    $handler_ctx = $this->eventHandler_->getHandlerContext('pong');
    $reply_type = \TMessageType::REPLY;

    $this->eventHandler_->preRead($handler_ctx, 'pong', dict[]);

    if ($input is \TBinaryProtocolAccelerated) {
      $args = \thrift_protocol_read_binary_struct($input, 'MyServicePrioParent_pong_args');
    } else if ($input is \TCompactProtocolAccelerated) {
      $args = \thrift_protocol_read_compact_struct($input, 'MyServicePrioParent_pong_args');
    } else {
      $args = new MyServicePrioParent_pong_args();
      $args->read($input);
    }
    $input->readMessageEnd();
    $this->eventHandler_->postRead($handler_ctx, 'pong', $args);
    $result = new MyServicePrioParent_pong_result();
    try {
      $this->eventHandler_->preExec($handler_ctx, 'pong', $args);
      $this->handler->pong();
      $this->eventHandler_->postExec($handler_ctx, 'pong', $result);
    } catch (\Exception $ex) {
      $reply_type = \TMessageType::EXCEPTION;
      $this->eventHandler_->handlerError($handler_ctx, 'pong', $ex);
      $result = new \TApplicationException($ex->getMessage()."\n".$ex->getTraceAsString());
    }
    $this->eventHandler_->preWrite($handler_ctx, 'pong', $result);
    if ($output is \TBinaryProtocolAccelerated)
    {
      \thrift_protocol_write_binary($output, 'pong', $reply_type, $result, $seqid, $output->isStrictWrite());
    }
    else if ($output is \TCompactProtocolAccelerated)
    {
      \thrift_protocol_write_compact($output, 'pong', $reply_type, $result, $seqid);
    }
    else
    {
      $output->writeMessageBegin("pong", $reply_type, $seqid);
      $result->write($output);
      $output->writeMessageEnd();
      $output->getTransport()->flush();
    }
    $this->eventHandler_->postWrite($handler_ctx, 'pong', $result);
  }
}
class MyServicePrioParentSyncProcessor extends MyServicePrioParentSyncProcessorBase {
  const type TThriftIf = MyServicePrioParentIf;
}
// For backwards compatibility
class MyServicePrioParentProcessor extends MyServicePrioParentSyncProcessor {}

// HELPER FUNCTIONS AND STRUCTURES

class MyServicePrioParent_ping_args implements \IThriftStruct, \IThriftShapishStruct {
  use \ThriftSerializationTrait;

  public static dict<int, dict<string, mixed>> $_TSPEC = dict[
    ];
  public static Map<string, int> $_TFIELDMAP = Map {
  };
  const type TShape = shape(
    ...
  );
  const int STRUCTURAL_ID = 957977401221134810;

  public function __construct(  ) {
  }

  public function getName(): string {
    return 'MyServicePrioParent_ping_args';
  }

  public static function __fromShape(self::TShape $shape): this {
    $me = new static();
    return $me;
  }

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

class MyServicePrioParent_ping_result implements \IThriftStruct {
  use \ThriftSerializationTrait;

  public static dict<int, dict<string, mixed>> $_TSPEC = dict[
    ];
  public static Map<string, int> $_TFIELDMAP = Map {
  };
  const int STRUCTURAL_ID = 957977401221134810;

  public function __construct(  ) {
  }

  public function getName(): string {
    return 'MyServicePrioParent_ping_result';
  }

  public function readFromJson(string $jsonText): void {
    $parsed = json_decode($jsonText, true);

    if ($parsed === null || !is_array($parsed)) {
      throw new \TProtocolException("Cannot parse the given json string.");
    }

  }

}

class MyServicePrioParent_pong_args implements \IThriftStruct, \IThriftShapishStruct {
  use \ThriftSerializationTrait;

  public static dict<int, dict<string, mixed>> $_TSPEC = dict[
    ];
  public static Map<string, int> $_TFIELDMAP = Map {
  };
  const type TShape = shape(
    ...
  );
  const int STRUCTURAL_ID = 957977401221134810;

  public function __construct(  ) {
  }

  public function getName(): string {
    return 'MyServicePrioParent_pong_args';
  }

  public static function __fromShape(self::TShape $shape): this {
    $me = new static();
    return $me;
  }

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

class MyServicePrioParent_pong_result implements \IThriftStruct {
  use \ThriftSerializationTrait;

  public static dict<int, dict<string, mixed>> $_TSPEC = dict[
    ];
  public static Map<string, int> $_TFIELDMAP = Map {
  };
  const int STRUCTURAL_ID = 957977401221134810;

  public function __construct(  ) {
  }

  public function getName(): string {
    return 'MyServicePrioParent_pong_result';
  }

  public function readFromJson(string $jsonText): void {
    $parsed = json_decode($jsonText, true);

    if ($parsed === null || !is_array($parsed)) {
      throw new \TProtocolException("Cannot parse the given json string.");
    }

  }

}

