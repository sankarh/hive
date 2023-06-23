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

class SkewedInfo
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'skewedColNames',
            'isRequired' => false,
            'type' => TType::LST,
            'etype' => TType::STRING,
            'elem' => array(
                'type' => TType::STRING,
                ),
        ),
        2 => array(
            'var' => 'skewedColValues',
            'isRequired' => false,
            'type' => TType::LST,
            'etype' => TType::LST,
            'elem' => array(
                'type' => TType::LST,
                'etype' => TType::STRING,
                'elem' => array(
                    'type' => TType::STRING,
                    ),
                ),
        ),
        3 => array(
            'var' => 'skewedColValueLocationMaps',
            'isRequired' => false,
            'type' => TType::MAP,
            'ktype' => TType::LST,
            'vtype' => TType::STRING,
            'key' => array(
                'type' => TType::LST,
                'etype' => TType::STRING,
                'elem' => array(
                    'type' => TType::STRING,
                    ),
            ),
            'val' => array(
                'type' => TType::STRING,
                ),
        ),
    );

    /**
     * @var string[]
     */
    public $skewedColNames = null;
    /**
     * @var (string[])[]
     */
    public $skewedColValues = null;
    /**
     * @var array
     */
    public $skewedColValueLocationMaps = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['skewedColNames'])) {
                $this->skewedColNames = $vals['skewedColNames'];
            }
            if (isset($vals['skewedColValues'])) {
                $this->skewedColValues = $vals['skewedColValues'];
            }
            if (isset($vals['skewedColValueLocationMaps'])) {
                $this->skewedColValueLocationMaps = $vals['skewedColValueLocationMaps'];
            }
        }
    }

    public function getName()
    {
        return 'SkewedInfo';
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
                    if ($ftype == TType::LST) {
                        $this->skewedColNames = array();
                        $_size108 = 0;
                        $_etype111 = 0;
                        $xfer += $input->readListBegin($_etype111, $_size108);
                        for ($_i112 = 0; $_i112 < $_size108; ++$_i112) {
                            $elem113 = null;
                            $xfer += $input->readString($elem113);
                            $this->skewedColNames []= $elem113;
                        }
                        $xfer += $input->readListEnd();
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 2:
                    if ($ftype == TType::LST) {
                        $this->skewedColValues = array();
                        $_size114 = 0;
                        $_etype117 = 0;
                        $xfer += $input->readListBegin($_etype117, $_size114);
                        for ($_i118 = 0; $_i118 < $_size114; ++$_i118) {
                            $elem119 = null;
                            $elem119 = array();
                            $_size120 = 0;
                            $_etype123 = 0;
                            $xfer += $input->readListBegin($_etype123, $_size120);
                            for ($_i124 = 0; $_i124 < $_size120; ++$_i124) {
                                $elem125 = null;
                                $xfer += $input->readString($elem125);
                                $elem119 []= $elem125;
                            }
                            $xfer += $input->readListEnd();
                            $this->skewedColValues []= $elem119;
                        }
                        $xfer += $input->readListEnd();
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 3:
                    if ($ftype == TType::MAP) {
                        $this->skewedColValueLocationMaps = array();
                        $_size126 = 0;
                        $_ktype127 = 0;
                        $_vtype128 = 0;
                        $xfer += $input->readMapBegin($_ktype127, $_vtype128, $_size126);
                        for ($_i130 = 0; $_i130 < $_size126; ++$_i130) {
                            $key131 = array();
                            $val132 = '';
                            $key131 = array();
                            $_size133 = 0;
                            $_etype136 = 0;
                            $xfer += $input->readListBegin($_etype136, $_size133);
                            for ($_i137 = 0; $_i137 < $_size133; ++$_i137) {
                                $elem138 = null;
                                $xfer += $input->readString($elem138);
                                $key131 []= $elem138;
                            }
                            $xfer += $input->readListEnd();
                            $xfer += $input->readString($val132);
                            $this->skewedColValueLocationMaps[$key131] = $val132;
                        }
                        $xfer += $input->readMapEnd();
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
        $xfer += $output->writeStructBegin('SkewedInfo');
        if ($this->skewedColNames !== null) {
            if (!is_array($this->skewedColNames)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('skewedColNames', TType::LST, 1);
            $output->writeListBegin(TType::STRING, count($this->skewedColNames));
            foreach ($this->skewedColNames as $iter139) {
                $xfer += $output->writeString($iter139);
            }
            $output->writeListEnd();
            $xfer += $output->writeFieldEnd();
        }
        if ($this->skewedColValues !== null) {
            if (!is_array($this->skewedColValues)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('skewedColValues', TType::LST, 2);
            $output->writeListBegin(TType::LST, count($this->skewedColValues));
            foreach ($this->skewedColValues as $iter140) {
                $output->writeListBegin(TType::STRING, count($iter140));
                foreach ($iter140 as $iter141) {
                    $xfer += $output->writeString($iter141);
                }
                $output->writeListEnd();
            }
            $output->writeListEnd();
            $xfer += $output->writeFieldEnd();
        }
        if ($this->skewedColValueLocationMaps !== null) {
            if (!is_array($this->skewedColValueLocationMaps)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('skewedColValueLocationMaps', TType::MAP, 3);
            $output->writeMapBegin(TType::LST, TType::STRING, count($this->skewedColValueLocationMaps));
            foreach ($this->skewedColValueLocationMaps as $kiter142 => $viter143) {
                $output->writeListBegin(TType::STRING, count($kiter142));
                foreach ($kiter142 as $iter144) {
                    $xfer += $output->writeString($iter144);
                }
                $output->writeListEnd();
                $xfer += $output->writeString($viter143);
            }
            $output->writeMapEnd();
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
