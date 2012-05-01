/**
 * Autogenerated by Thrift Compiler (0.8.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package edu.berkeley.cs.amplab.carat.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DetailScreenReport implements org.apache.thrift.TBase<DetailScreenReport, DetailScreenReport._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("DetailScreenReport");

  private static final org.apache.thrift.protocol.TField SCORE_FIELD_DESC = new org.apache.thrift.protocol.TField("score", org.apache.thrift.protocol.TType.DOUBLE, (short)1);
  private static final org.apache.thrift.protocol.TField X_VALS_FIELD_DESC = new org.apache.thrift.protocol.TField("xVals", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField Y_VALS_FIELD_DESC = new org.apache.thrift.protocol.TField("yVals", org.apache.thrift.protocol.TType.LIST, (short)3);
  private static final org.apache.thrift.protocol.TField EXPECTED_VALUE_FIELD_DESC = new org.apache.thrift.protocol.TField("expectedValue", org.apache.thrift.protocol.TType.DOUBLE, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new DetailScreenReportStandardSchemeFactory());
    schemes.put(TupleScheme.class, new DetailScreenReportTupleSchemeFactory());
  }

  public double score; // optional
  public List<Double> xVals; // optional
  public List<Double> yVals; // optional
  public double expectedValue; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SCORE((short)1, "score"),
    X_VALS((short)2, "xVals"),
    Y_VALS((short)3, "yVals"),
    EXPECTED_VALUE((short)4, "expectedValue");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // SCORE
          return SCORE;
        case 2: // X_VALS
          return X_VALS;
        case 3: // Y_VALS
          return Y_VALS;
        case 4: // EXPECTED_VALUE
          return EXPECTED_VALUE;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __SCORE_ISSET_ID = 0;
  private static final int __EXPECTEDVALUE_ISSET_ID = 1;
  private BitSet __isset_bit_vector = new BitSet(2);
  private _Fields optionals[] = {_Fields.SCORE,_Fields.X_VALS,_Fields.Y_VALS,_Fields.EXPECTED_VALUE};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SCORE, new org.apache.thrift.meta_data.FieldMetaData("score", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.X_VALS, new org.apache.thrift.meta_data.FieldMetaData("xVals", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE))));
    tmpMap.put(_Fields.Y_VALS, new org.apache.thrift.meta_data.FieldMetaData("yVals", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE))));
    tmpMap.put(_Fields.EXPECTED_VALUE, new org.apache.thrift.meta_data.FieldMetaData("expectedValue", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(DetailScreenReport.class, metaDataMap);
  }

  public DetailScreenReport() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public DetailScreenReport(DetailScreenReport other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.score = other.score;
    if (other.isSetXVals()) {
      List<Double> __this__xVals = new ArrayList<Double>();
      for (Double other_element : other.xVals) {
        __this__xVals.add(other_element);
      }
      this.xVals = __this__xVals;
    }
    if (other.isSetYVals()) {
      List<Double> __this__yVals = new ArrayList<Double>();
      for (Double other_element : other.yVals) {
        __this__yVals.add(other_element);
      }
      this.yVals = __this__yVals;
    }
    this.expectedValue = other.expectedValue;
  }

  public DetailScreenReport deepCopy() {
    return new DetailScreenReport(this);
  }

  @Override
  public void clear() {
    setScoreIsSet(false);
    this.score = 0.0;
    this.xVals = null;
    this.yVals = null;
    setExpectedValueIsSet(false);
    this.expectedValue = 0.0;
  }

  public double getScore() {
    return this.score;
  }

  public DetailScreenReport setScore(double score) {
    this.score = score;
    setScoreIsSet(true);
    return this;
  }

  public void unsetScore() {
    __isset_bit_vector.clear(__SCORE_ISSET_ID);
  }

  /** Returns true if field score is set (has been assigned a value) and false otherwise */
  public boolean isSetScore() {
    return __isset_bit_vector.get(__SCORE_ISSET_ID);
  }

  public void setScoreIsSet(boolean value) {
    __isset_bit_vector.set(__SCORE_ISSET_ID, value);
  }

  public int getXValsSize() {
    return (this.xVals == null) ? 0 : this.xVals.size();
  }

  public java.util.Iterator<Double> getXValsIterator() {
    return (this.xVals == null) ? null : this.xVals.iterator();
  }

  public void addToXVals(double elem) {
    if (this.xVals == null) {
      this.xVals = new ArrayList<Double>();
    }
    this.xVals.add(elem);
  }

  public List<Double> getXVals() {
    return this.xVals;
  }

  public DetailScreenReport setXVals(List<Double> xVals) {
    this.xVals = xVals;
    return this;
  }

  public void unsetXVals() {
    this.xVals = null;
  }

  /** Returns true if field xVals is set (has been assigned a value) and false otherwise */
  public boolean isSetXVals() {
    return this.xVals != null;
  }

  public void setXValsIsSet(boolean value) {
    if (!value) {
      this.xVals = null;
    }
  }

  public int getYValsSize() {
    return (this.yVals == null) ? 0 : this.yVals.size();
  }

  public java.util.Iterator<Double> getYValsIterator() {
    return (this.yVals == null) ? null : this.yVals.iterator();
  }

  public void addToYVals(double elem) {
    if (this.yVals == null) {
      this.yVals = new ArrayList<Double>();
    }
    this.yVals.add(elem);
  }

  public List<Double> getYVals() {
    return this.yVals;
  }

  public DetailScreenReport setYVals(List<Double> yVals) {
    this.yVals = yVals;
    return this;
  }

  public void unsetYVals() {
    this.yVals = null;
  }

  /** Returns true if field yVals is set (has been assigned a value) and false otherwise */
  public boolean isSetYVals() {
    return this.yVals != null;
  }

  public void setYValsIsSet(boolean value) {
    if (!value) {
      this.yVals = null;
    }
  }

  public double getExpectedValue() {
    return this.expectedValue;
  }

  public DetailScreenReport setExpectedValue(double expectedValue) {
    this.expectedValue = expectedValue;
    setExpectedValueIsSet(true);
    return this;
  }

  public void unsetExpectedValue() {
    __isset_bit_vector.clear(__EXPECTEDVALUE_ISSET_ID);
  }

  /** Returns true if field expectedValue is set (has been assigned a value) and false otherwise */
  public boolean isSetExpectedValue() {
    return __isset_bit_vector.get(__EXPECTEDVALUE_ISSET_ID);
  }

  public void setExpectedValueIsSet(boolean value) {
    __isset_bit_vector.set(__EXPECTEDVALUE_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case SCORE:
      if (value == null) {
        unsetScore();
      } else {
        setScore((Double)value);
      }
      break;

    case X_VALS:
      if (value == null) {
        unsetXVals();
      } else {
        setXVals((List<Double>)value);
      }
      break;

    case Y_VALS:
      if (value == null) {
        unsetYVals();
      } else {
        setYVals((List<Double>)value);
      }
      break;

    case EXPECTED_VALUE:
      if (value == null) {
        unsetExpectedValue();
      } else {
        setExpectedValue((Double)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case SCORE:
      return Double.valueOf(getScore());

    case X_VALS:
      return getXVals();

    case Y_VALS:
      return getYVals();

    case EXPECTED_VALUE:
      return Double.valueOf(getExpectedValue());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case SCORE:
      return isSetScore();
    case X_VALS:
      return isSetXVals();
    case Y_VALS:
      return isSetYVals();
    case EXPECTED_VALUE:
      return isSetExpectedValue();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof DetailScreenReport)
      return this.equals((DetailScreenReport)that);
    return false;
  }

  public boolean equals(DetailScreenReport that) {
    if (that == null)
      return false;

    boolean this_present_score = true && this.isSetScore();
    boolean that_present_score = true && that.isSetScore();
    if (this_present_score || that_present_score) {
      if (!(this_present_score && that_present_score))
        return false;
      if (this.score != that.score)
        return false;
    }

    boolean this_present_xVals = true && this.isSetXVals();
    boolean that_present_xVals = true && that.isSetXVals();
    if (this_present_xVals || that_present_xVals) {
      if (!(this_present_xVals && that_present_xVals))
        return false;
      if (!this.xVals.equals(that.xVals))
        return false;
    }

    boolean this_present_yVals = true && this.isSetYVals();
    boolean that_present_yVals = true && that.isSetYVals();
    if (this_present_yVals || that_present_yVals) {
      if (!(this_present_yVals && that_present_yVals))
        return false;
      if (!this.yVals.equals(that.yVals))
        return false;
    }

    boolean this_present_expectedValue = true && this.isSetExpectedValue();
    boolean that_present_expectedValue = true && that.isSetExpectedValue();
    if (this_present_expectedValue || that_present_expectedValue) {
      if (!(this_present_expectedValue && that_present_expectedValue))
        return false;
      if (this.expectedValue != that.expectedValue)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(DetailScreenReport other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    DetailScreenReport typedOther = (DetailScreenReport)other;

    lastComparison = Boolean.valueOf(isSetScore()).compareTo(typedOther.isSetScore());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetScore()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.score, typedOther.score);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetXVals()).compareTo(typedOther.isSetXVals());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetXVals()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.xVals, typedOther.xVals);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetYVals()).compareTo(typedOther.isSetYVals());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetYVals()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.yVals, typedOther.yVals);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetExpectedValue()).compareTo(typedOther.isSetExpectedValue());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExpectedValue()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.expectedValue, typedOther.expectedValue);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("DetailScreenReport(");
    boolean first = true;

    if (isSetScore()) {
      sb.append("score:");
      sb.append(this.score);
      first = false;
    }
    if (isSetXVals()) {
      if (!first) sb.append(", ");
      sb.append("xVals:");
      if (this.xVals == null) {
        sb.append("null");
      } else {
        sb.append(this.xVals);
      }
      first = false;
    }
    if (isSetYVals()) {
      if (!first) sb.append(", ");
      sb.append("yVals:");
      if (this.yVals == null) {
        sb.append("null");
      } else {
        sb.append(this.yVals);
      }
      first = false;
    }
    if (isSetExpectedValue()) {
      if (!first) sb.append(", ");
      sb.append("expectedValue:");
      sb.append(this.expectedValue);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bit_vector = new BitSet(1);
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class DetailScreenReportStandardSchemeFactory implements SchemeFactory {
    public DetailScreenReportStandardScheme getScheme() {
      return new DetailScreenReportStandardScheme();
    }
  }

  private static class DetailScreenReportStandardScheme extends StandardScheme<DetailScreenReport> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, DetailScreenReport struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SCORE
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.score = iprot.readDouble();
              struct.setScoreIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // X_VALS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list16 = iprot.readListBegin();
                struct.xVals = new ArrayList<Double>(_list16.size);
                for (int _i17 = 0; _i17 < _list16.size; ++_i17)
                {
                  double _elem18; // required
                  _elem18 = iprot.readDouble();
                  struct.xVals.add(_elem18);
                }
                iprot.readListEnd();
              }
              struct.setXValsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // Y_VALS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list19 = iprot.readListBegin();
                struct.yVals = new ArrayList<Double>(_list19.size);
                for (int _i20 = 0; _i20 < _list19.size; ++_i20)
                {
                  double _elem21; // required
                  _elem21 = iprot.readDouble();
                  struct.yVals.add(_elem21);
                }
                iprot.readListEnd();
              }
              struct.setYValsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // EXPECTED_VALUE
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.expectedValue = iprot.readDouble();
              struct.setExpectedValueIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, DetailScreenReport struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetScore()) {
        oprot.writeFieldBegin(SCORE_FIELD_DESC);
        oprot.writeDouble(struct.score);
        oprot.writeFieldEnd();
      }
      if (struct.xVals != null) {
        if (struct.isSetXVals()) {
          oprot.writeFieldBegin(X_VALS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.DOUBLE, struct.xVals.size()));
            for (double _iter22 : struct.xVals)
            {
              oprot.writeDouble(_iter22);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.yVals != null) {
        if (struct.isSetYVals()) {
          oprot.writeFieldBegin(Y_VALS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.DOUBLE, struct.yVals.size()));
            for (double _iter23 : struct.yVals)
            {
              oprot.writeDouble(_iter23);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetExpectedValue()) {
        oprot.writeFieldBegin(EXPECTED_VALUE_FIELD_DESC);
        oprot.writeDouble(struct.expectedValue);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class DetailScreenReportTupleSchemeFactory implements SchemeFactory {
    public DetailScreenReportTupleScheme getScheme() {
      return new DetailScreenReportTupleScheme();
    }
  }

  private static class DetailScreenReportTupleScheme extends TupleScheme<DetailScreenReport> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, DetailScreenReport struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetScore()) {
        optionals.set(0);
      }
      if (struct.isSetXVals()) {
        optionals.set(1);
      }
      if (struct.isSetYVals()) {
        optionals.set(2);
      }
      if (struct.isSetExpectedValue()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetScore()) {
        oprot.writeDouble(struct.score);
      }
      if (struct.isSetXVals()) {
        {
          oprot.writeI32(struct.xVals.size());
          for (double _iter24 : struct.xVals)
          {
            oprot.writeDouble(_iter24);
          }
        }
      }
      if (struct.isSetYVals()) {
        {
          oprot.writeI32(struct.yVals.size());
          for (double _iter25 : struct.yVals)
          {
            oprot.writeDouble(_iter25);
          }
        }
      }
      if (struct.isSetExpectedValue()) {
        oprot.writeDouble(struct.expectedValue);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, DetailScreenReport struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.score = iprot.readDouble();
        struct.setScoreIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list26 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.DOUBLE, iprot.readI32());
          struct.xVals = new ArrayList<Double>(_list26.size);
          for (int _i27 = 0; _i27 < _list26.size; ++_i27)
          {
            double _elem28; // required
            _elem28 = iprot.readDouble();
            struct.xVals.add(_elem28);
          }
        }
        struct.setXValsIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TList _list29 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.DOUBLE, iprot.readI32());
          struct.yVals = new ArrayList<Double>(_list29.size);
          for (int _i30 = 0; _i30 < _list29.size; ++_i30)
          {
            double _elem31; // required
            _elem31 = iprot.readDouble();
            struct.yVals.add(_elem31);
          }
        }
        struct.setYValsIsSet(true);
      }
      if (incoming.get(3)) {
        struct.expectedValue = iprot.readDouble();
        struct.setExpectedValueIsSet(true);
      }
    }
  }

}

