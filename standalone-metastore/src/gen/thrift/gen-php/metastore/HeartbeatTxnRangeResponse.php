<?php
namespace metastore;

/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
use Thrift\Base\TBase;
use Thrift\Type\TType;
use Thrift\Type\TMessageType;
use Thrift\Exception\TException;
use Thrift\Exception\TProtocolException;
use Thrift\Protocol\TProtocol;
use Thrift\Protocol\TBinaryProtocolAccelerated;
use Thrift\Exception\TApplicationException;

class HeartbeatTxnRangeResponse
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'aborted',
            'isRequired' => true,
            'type' => TType::SET,
            'etype' => TType::I64,
            'elem' => array(
                'type' => TType::I64,
                ),
        ),
        2 => array(
            'var' => 'nosuch',
            'isRequired' => true,
            'type' => TType::SET,
            'etype' => TType::I64,
            'elem' => array(
                'type' => TType::I64,
                ),
        ),
    );

    /**
     * @var int[]
     */
    public $aborted = null;
    /**
     * @var int[]
     */
    public $nosuch = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['aborted'])) {
                $this->aborted = $vals['aborted'];
            }
            if (isset($vals['nosuch'])) {
                $this->nosuch = $vals['nosuch'];
            }
        }
    }

    public function getName()
    {
        return 'HeartbeatTxnRangeResponse';
    }


    public function read($input)
    {
        $xfer = 0;
        $fname = null;
        $ftype = 0;
        $fid = 0;
        $xfer += $input->readStructBegin($fname);
        while (true) {
            $xfer += $input->readFieldBegin($fname, $ftype, $fid);
            if ($ftype == TType::STOP) {
                break;
            }
            switch ($fid) {
                case 1:
                    if ($ftype == TType::SET) {
                        $this->aborted = array();
                        $_size601 = 0;
                        $_etype604 = 0;
                        $xfer += $input->readSetBegin($_etype604, $_size601);
                        for ($_i605 = 0; $_i605 < $_size601; ++$_i605) {
                            $elem606 = null;
                            $xfer += $input->readI64($elem606);
                            $this->aborted[$elem606] = true;
                        }
                        $xfer += $input->readSetEnd();
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 2:
                    if ($ftype == TType::SET) {
                        $this->nosuch = array();
                        $_size607 = 0;
                        $_etype610 = 0;
                        $xfer += $input->readSetBegin($_etype610, $_size607);
                        for ($_i611 = 0; $_i611 < $_size607; ++$_i611) {
                            $elem612 = null;
                            $xfer += $input->readI64($elem612);
                            $this->nosuch[$elem612] = true;
                        }
                        $xfer += $input->readSetEnd();
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                default:
                    $xfer += $input->skip($ftype);
                    break;
            }
            $xfer += $input->readFieldEnd();
        }
        $xfer += $input->readStructEnd();
        return $xfer;
    }

    public function write($output)
    {
        $xfer = 0;
        $xfer += $output->writeStructBegin('HeartbeatTxnRangeResponse');
        if ($this->aborted !== null) {
            if (!is_array($this->aborted)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('aborted', TType::SET, 1);
            $output->writeSetBegin(TType::I64, count($this->aborted));
            foreach ($this->aborted as $iter613 => $iter614) {
                $xfer += $output->writeI64($iter613);
            }
            $output->writeSetEnd();
            $xfer += $output->writeFieldEnd();
        }
        if ($this->nosuch !== null) {
            if (!is_array($this->nosuch)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('nosuch', TType::SET, 2);
            $output->writeSetBegin(TType::I64, count($this->nosuch));
            foreach ($this->nosuch as $iter615 => $iter616) {
                $xfer += $output->writeI64($iter615);
            }
            $output->writeSetEnd();
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
