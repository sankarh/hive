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

class ThriftHiveMetastore_create_table_with_constraints_args
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'tbl',
            'isRequired' => false,
            'type' => TType::STRUCT,
            'class' => '\metastore\Table',
        ),
        2 => array(
            'var' => 'primaryKeys',
            'isRequired' => false,
            'type' => TType::LST,
            'etype' => TType::STRUCT,
            'elem' => array(
                'type' => TType::STRUCT,
                'class' => '\metastore\SQLPrimaryKey',
                ),
        ),
        3 => array(
            'var' => 'foreignKeys',
            'isRequired' => false,
            'type' => TType::LST,
            'etype' => TType::STRUCT,
            'elem' => array(
                'type' => TType::STRUCT,
                'class' => '\metastore\SQLForeignKey',
                ),
        ),
        4 => array(
            'var' => 'uniqueConstraints',
            'isRequired' => false,
            'type' => TType::LST,
            'etype' => TType::STRUCT,
            'elem' => array(
                'type' => TType::STRUCT,
                'class' => '\metastore\SQLUniqueConstraint',
                ),
        ),
        5 => array(
            'var' => 'notNullConstraints',
            'isRequired' => false,
            'type' => TType::LST,
            'etype' => TType::STRUCT,
            'elem' => array(
                'type' => TType::STRUCT,
                'class' => '\metastore\SQLNotNullConstraint',
                ),
        ),
        6 => array(
            'var' => 'defaultConstraints',
            'isRequired' => false,
            'type' => TType::LST,
            'etype' => TType::STRUCT,
            'elem' => array(
                'type' => TType::STRUCT,
                'class' => '\metastore\SQLDefaultConstraint',
                ),
        ),
        7 => array(
            'var' => 'checkConstraints',
            'isRequired' => false,
            'type' => TType::LST,
            'etype' => TType::STRUCT,
            'elem' => array(
                'type' => TType::STRUCT,
                'class' => '\metastore\SQLCheckConstraint',
                ),
        ),
    );

    /**
     * @var \metastore\Table
     */
    public $tbl = null;
    /**
     * @var \metastore\SQLPrimaryKey[]
     */
    public $primaryKeys = null;
    /**
     * @var \metastore\SQLForeignKey[]
     */
    public $foreignKeys = null;
    /**
     * @var \metastore\SQLUniqueConstraint[]
     */
    public $uniqueConstraints = null;
    /**
     * @var \metastore\SQLNotNullConstraint[]
     */
    public $notNullConstraints = null;
    /**
     * @var \metastore\SQLDefaultConstraint[]
     */
    public $defaultConstraints = null;
    /**
     * @var \metastore\SQLCheckConstraint[]
     */
    public $checkConstraints = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['tbl'])) {
                $this->tbl = $vals['tbl'];
            }
            if (isset($vals['primaryKeys'])) {
                $this->primaryKeys = $vals['primaryKeys'];
            }
            if (isset($vals['foreignKeys'])) {
                $this->foreignKeys = $vals['foreignKeys'];
            }
            if (isset($vals['uniqueConstraints'])) {
                $this->uniqueConstraints = $vals['uniqueConstraints'];
            }
            if (isset($vals['notNullConstraints'])) {
                $this->notNullConstraints = $vals['notNullConstraints'];
            }
            if (isset($vals['defaultConstraints'])) {
                $this->defaultConstraints = $vals['defaultConstraints'];
            }
            if (isset($vals['checkConstraints'])) {
                $this->checkConstraints = $vals['checkConstraints'];
            }
        }
    }

    public function getName()
    {
        return 'ThriftHiveMetastore_create_table_with_constraints_args';
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
                    if ($ftype == TType::STRUCT) {
                        $this->tbl = new \metastore\Table();
                        $xfer += $this->tbl->read($input);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 2:
                    if ($ftype == TType::LST) {
                        $this->primaryKeys = array();
                        $_size905 = 0;
                        $_etype908 = 0;
                        $xfer += $input->readListBegin($_etype908, $_size905);
                        for ($_i909 = 0; $_i909 < $_size905; ++$_i909) {
                            $elem910 = null;
                            $elem910 = new \metastore\SQLPrimaryKey();
                            $xfer += $elem910->read($input);
                            $this->primaryKeys []= $elem910;
                        }
                        $xfer += $input->readListEnd();
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 3:
                    if ($ftype == TType::LST) {
                        $this->foreignKeys = array();
                        $_size911 = 0;
                        $_etype914 = 0;
                        $xfer += $input->readListBegin($_etype914, $_size911);
                        for ($_i915 = 0; $_i915 < $_size911; ++$_i915) {
                            $elem916 = null;
                            $elem916 = new \metastore\SQLForeignKey();
                            $xfer += $elem916->read($input);
                            $this->foreignKeys []= $elem916;
                        }
                        $xfer += $input->readListEnd();
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 4:
                    if ($ftype == TType::LST) {
                        $this->uniqueConstraints = array();
                        $_size917 = 0;
                        $_etype920 = 0;
                        $xfer += $input->readListBegin($_etype920, $_size917);
                        for ($_i921 = 0; $_i921 < $_size917; ++$_i921) {
                            $elem922 = null;
                            $elem922 = new \metastore\SQLUniqueConstraint();
                            $xfer += $elem922->read($input);
                            $this->uniqueConstraints []= $elem922;
                        }
                        $xfer += $input->readListEnd();
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 5:
                    if ($ftype == TType::LST) {
                        $this->notNullConstraints = array();
                        $_size923 = 0;
                        $_etype926 = 0;
                        $xfer += $input->readListBegin($_etype926, $_size923);
                        for ($_i927 = 0; $_i927 < $_size923; ++$_i927) {
                            $elem928 = null;
                            $elem928 = new \metastore\SQLNotNullConstraint();
                            $xfer += $elem928->read($input);
                            $this->notNullConstraints []= $elem928;
                        }
                        $xfer += $input->readListEnd();
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 6:
                    if ($ftype == TType::LST) {
                        $this->defaultConstraints = array();
                        $_size929 = 0;
                        $_etype932 = 0;
                        $xfer += $input->readListBegin($_etype932, $_size929);
                        for ($_i933 = 0; $_i933 < $_size929; ++$_i933) {
                            $elem934 = null;
                            $elem934 = new \metastore\SQLDefaultConstraint();
                            $xfer += $elem934->read($input);
                            $this->defaultConstraints []= $elem934;
                        }
                        $xfer += $input->readListEnd();
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 7:
                    if ($ftype == TType::LST) {
                        $this->checkConstraints = array();
                        $_size935 = 0;
                        $_etype938 = 0;
                        $xfer += $input->readListBegin($_etype938, $_size935);
                        for ($_i939 = 0; $_i939 < $_size935; ++$_i939) {
                            $elem940 = null;
                            $elem940 = new \metastore\SQLCheckConstraint();
                            $xfer += $elem940->read($input);
                            $this->checkConstraints []= $elem940;
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
        $xfer += $output->writeStructBegin('ThriftHiveMetastore_create_table_with_constraints_args');
        if ($this->tbl !== null) {
            if (!is_object($this->tbl)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('tbl', TType::STRUCT, 1);
            $xfer += $this->tbl->write($output);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->primaryKeys !== null) {
            if (!is_array($this->primaryKeys)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('primaryKeys', TType::LST, 2);
            $output->writeListBegin(TType::STRUCT, count($this->primaryKeys));
            foreach ($this->primaryKeys as $iter941) {
                $xfer += $iter941->write($output);
            }
            $output->writeListEnd();
            $xfer += $output->writeFieldEnd();
        }
        if ($this->foreignKeys !== null) {
            if (!is_array($this->foreignKeys)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('foreignKeys', TType::LST, 3);
            $output->writeListBegin(TType::STRUCT, count($this->foreignKeys));
            foreach ($this->foreignKeys as $iter942) {
                $xfer += $iter942->write($output);
            }
            $output->writeListEnd();
            $xfer += $output->writeFieldEnd();
        }
        if ($this->uniqueConstraints !== null) {
            if (!is_array($this->uniqueConstraints)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('uniqueConstraints', TType::LST, 4);
            $output->writeListBegin(TType::STRUCT, count($this->uniqueConstraints));
            foreach ($this->uniqueConstraints as $iter943) {
                $xfer += $iter943->write($output);
            }
            $output->writeListEnd();
            $xfer += $output->writeFieldEnd();
        }
        if ($this->notNullConstraints !== null) {
            if (!is_array($this->notNullConstraints)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('notNullConstraints', TType::LST, 5);
            $output->writeListBegin(TType::STRUCT, count($this->notNullConstraints));
            foreach ($this->notNullConstraints as $iter944) {
                $xfer += $iter944->write($output);
            }
            $output->writeListEnd();
            $xfer += $output->writeFieldEnd();
        }
        if ($this->defaultConstraints !== null) {
            if (!is_array($this->defaultConstraints)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('defaultConstraints', TType::LST, 6);
            $output->writeListBegin(TType::STRUCT, count($this->defaultConstraints));
            foreach ($this->defaultConstraints as $iter945) {
                $xfer += $iter945->write($output);
            }
            $output->writeListEnd();
            $xfer += $output->writeFieldEnd();
        }
        if ($this->checkConstraints !== null) {
            if (!is_array($this->checkConstraints)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('checkConstraints', TType::LST, 7);
            $output->writeListBegin(TType::STRUCT, count($this->checkConstraints));
            foreach ($this->checkConstraints as $iter946) {
                $xfer += $iter946->write($output);
            }
            $output->writeListEnd();
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
