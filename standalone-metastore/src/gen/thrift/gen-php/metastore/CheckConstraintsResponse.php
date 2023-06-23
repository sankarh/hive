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

class CheckConstraintsResponse
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'checkConstraints',
            'isRequired' => true,
            'type' => TType::LST,
            'etype' => TType::STRUCT,
            'elem' => array(
                'type' => TType::STRUCT,
                'class' => '\metastore\SQLCheckConstraint',
                ),
        ),
    );

    /**
     * @var \metastore\SQLCheckConstraint[]
     */
    public $checkConstraints = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['checkConstraints'])) {
                $this->checkConstraints = $vals['checkConstraints'];
            }
        }
    }

    public function getName()
    {
        return 'CheckConstraintsResponse';
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
                        $this->checkConstraints = array();
                        $_size326 = 0;
                        $_etype329 = 0;
                        $xfer += $input->readListBegin($_etype329, $_size326);
                        for ($_i330 = 0; $_i330 < $_size326; ++$_i330) {
                            $elem331 = null;
                            $elem331 = new \metastore\SQLCheckConstraint();
                            $xfer += $elem331->read($input);
                            $this->checkConstraints []= $elem331;
                        }
                        $xfer += $input->readListEnd();
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
        $xfer += $output->writeStructBegin('CheckConstraintsResponse');
        if ($this->checkConstraints !== null) {
            if (!is_array($this->checkConstraints)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('checkConstraints', TType::LST, 1);
            $output->writeListBegin(TType::STRUCT, count($this->checkConstraints));
            foreach ($this->checkConstraints as $iter332) {
                $xfer += $iter332->write($output);
            }
            $output->writeListEnd();
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
