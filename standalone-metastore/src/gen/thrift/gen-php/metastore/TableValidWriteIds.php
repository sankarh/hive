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

class TableValidWriteIds
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'fullTableName',
            'isRequired' => true,
            'type' => TType::STRING,
        ),
        2 => array(
            'var' => 'writeIdHighWaterMark',
            'isRequired' => true,
            'type' => TType::I64,
        ),
        3 => array(
            'var' => 'invalidWriteIds',
            'isRequired' => true,
            'type' => TType::LST,
            'etype' => TType::I64,
            'elem' => array(
                'type' => TType::I64,
                ),
        ),
        4 => array(
            'var' => 'minOpenWriteId',
            'isRequired' => false,
            'type' => TType::I64,
        ),
        5 => array(
            'var' => 'abortedBits',
            'isRequired' => true,
            'type' => TType::STRING,
        ),
    );

    /**
     * @var string
     */
    public $fullTableName = null;
    /**
     * @var int
     */
    public $writeIdHighWaterMark = null;
    /**
     * @var int[]
     */
    public $invalidWriteIds = null;
    /**
     * @var int
     */
    public $minOpenWriteId = null;
    /**
     * @var string
     */
    public $abortedBits = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['fullTableName'])) {
                $this->fullTableName = $vals['fullTableName'];
            }
            if (isset($vals['writeIdHighWaterMark'])) {
                $this->writeIdHighWaterMark = $vals['writeIdHighWaterMark'];
            }
            if (isset($vals['invalidWriteIds'])) {
                $this->invalidWriteIds = $vals['invalidWriteIds'];
            }
            if (isset($vals['minOpenWriteId'])) {
                $this->minOpenWriteId = $vals['minOpenWriteId'];
            }
            if (isset($vals['abortedBits'])) {
                $this->abortedBits = $vals['abortedBits'];
            }
        }
    }

    public function getName()
    {
        return 'TableValidWriteIds';
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
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->fullTableName);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 2:
                    if ($ftype == TType::I64) {
                        $xfer += $input->readI64($this->writeIdHighWaterMark);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 3:
                    if ($ftype == TType::LST) {
                        $this->invalidWriteIds = array();
                        $_size552 = 0;
                        $_etype555 = 0;
                        $xfer += $input->readListBegin($_etype555, $_size552);
                        for ($_i556 = 0; $_i556 < $_size552; ++$_i556) {
                            $elem557 = null;
                            $xfer += $input->readI64($elem557);
                            $this->invalidWriteIds []= $elem557;
                        }
                        $xfer += $input->readListEnd();
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 4:
                    if ($ftype == TType::I64) {
                        $xfer += $input->readI64($this->minOpenWriteId);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 5:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->abortedBits);
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
        $xfer += $output->writeStructBegin('TableValidWriteIds');
        if ($this->fullTableName !== null) {
            $xfer += $output->writeFieldBegin('fullTableName', TType::STRING, 1);
            $xfer += $output->writeString($this->fullTableName);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->writeIdHighWaterMark !== null) {
            $xfer += $output->writeFieldBegin('writeIdHighWaterMark', TType::I64, 2);
            $xfer += $output->writeI64($this->writeIdHighWaterMark);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->invalidWriteIds !== null) {
            if (!is_array($this->invalidWriteIds)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('invalidWriteIds', TType::LST, 3);
            $output->writeListBegin(TType::I64, count($this->invalidWriteIds));
            foreach ($this->invalidWriteIds as $iter558) {
                $xfer += $output->writeI64($iter558);
            }
            $output->writeListEnd();
            $xfer += $output->writeFieldEnd();
        }
        if ($this->minOpenWriteId !== null) {
            $xfer += $output->writeFieldBegin('minOpenWriteId', TType::I64, 4);
            $xfer += $output->writeI64($this->minOpenWriteId);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->abortedBits !== null) {
            $xfer += $output->writeFieldBegin('abortedBits', TType::STRING, 5);
            $xfer += $output->writeString($this->abortedBits);
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
