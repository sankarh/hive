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

class ThriftHiveMetastore_isPartitionMarkedForEvent_args
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'db_name',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        2 => array(
            'var' => 'tbl_name',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        3 => array(
            'var' => 'part_vals',
            'isRequired' => false,
            'type' => TType::MAP,
            'ktype' => TType::STRING,
            'vtype' => TType::STRING,
            'key' => array(
                'type' => TType::STRING,
            ),
            'val' => array(
                'type' => TType::STRING,
                ),
        ),
        4 => array(
            'var' => 'eventType',
            'isRequired' => false,
            'type' => TType::I32,
        ),
    );

    /**
     * @var string
     */
    public $db_name = null;
    /**
     * @var string
     */
    public $tbl_name = null;
    /**
     * @var array
     */
    public $part_vals = null;
    /**
     * @var int
     */
    public $eventType = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['db_name'])) {
                $this->db_name = $vals['db_name'];
            }
            if (isset($vals['tbl_name'])) {
                $this->tbl_name = $vals['tbl_name'];
            }
            if (isset($vals['part_vals'])) {
                $this->part_vals = $vals['part_vals'];
            }
            if (isset($vals['eventType'])) {
                $this->eventType = $vals['eventType'];
            }
        }
    }

    public function getName()
    {
        return 'ThriftHiveMetastore_isPartitionMarkedForEvent_args';
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
                        $xfer += $input->readString($this->db_name);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 2:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->tbl_name);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 3:
                    if ($ftype == TType::MAP) {
                        $this->part_vals = array();
                        $_size1270 = 0;
                        $_ktype1271 = 0;
                        $_vtype1272 = 0;
                        $xfer += $input->readMapBegin($_ktype1271, $_vtype1272, $_size1270);
                        for ($_i1274 = 0; $_i1274 < $_size1270; ++$_i1274) {
                            $key1275 = '';
                            $val1276 = '';
                            $xfer += $input->readString($key1275);
                            $xfer += $input->readString($val1276);
                            $this->part_vals[$key1275] = $val1276;
                        }
                        $xfer += $input->readMapEnd();
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 4:
                    if ($ftype == TType::I32) {
                        $xfer += $input->readI32($this->eventType);
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
        $xfer += $output->writeStructBegin('ThriftHiveMetastore_isPartitionMarkedForEvent_args');
        if ($this->db_name !== null) {
            $xfer += $output->writeFieldBegin('db_name', TType::STRING, 1);
            $xfer += $output->writeString($this->db_name);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->tbl_name !== null) {
            $xfer += $output->writeFieldBegin('tbl_name', TType::STRING, 2);
            $xfer += $output->writeString($this->tbl_name);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->part_vals !== null) {
            if (!is_array($this->part_vals)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('part_vals', TType::MAP, 3);
            $output->writeMapBegin(TType::STRING, TType::STRING, count($this->part_vals));
            foreach ($this->part_vals as $kiter1277 => $viter1278) {
                $xfer += $output->writeString($kiter1277);
                $xfer += $output->writeString($viter1278);
            }
            $output->writeMapEnd();
            $xfer += $output->writeFieldEnd();
        }
        if ($this->eventType !== null) {
            $xfer += $output->writeFieldBegin('eventType', TType::I32, 4);
            $xfer += $output->writeI32($this->eventType);
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
