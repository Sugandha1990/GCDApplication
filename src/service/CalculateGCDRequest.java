/**
 * CalculateGCDRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package service;

public class CalculateGCDRequest  implements java.io.Serializable {
    private java.lang.Integer input1;

    private int input2;

    public CalculateGCDRequest() {
    }

    public CalculateGCDRequest(
           java.lang.Integer input1,
           int input2) {
           this.input1 = input1;
           this.input2 = input2;
    }


    /**
     * Gets the input1 value for this CalculateGCDRequest.
     * 
     * @return input1
     */
    public java.lang.Integer getInput1() {
        return input1;
    }


    /**
     * Sets the input1 value for this CalculateGCDRequest.
     * 
     * @param input1
     */
    public void setInput1(java.lang.Integer input1) {
        this.input1 = input1;
    }


    /**
     * Gets the input2 value for this CalculateGCDRequest.
     * 
     * @return input2
     */
    public int getInput2() {
        return input2;
    }


    /**
     * Sets the input2 value for this CalculateGCDRequest.
     * 
     * @param input2
     */
    public void setInput2(int input2) {
        this.input2 = input2;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CalculateGCDRequest)) return false;
        CalculateGCDRequest other = (CalculateGCDRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.input1==null && other.getInput1()==null) || 
             (this.input1!=null &&
              this.input1.equals(other.getInput1()))) &&
            this.input2 == other.getInput2();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getInput1() != null) {
            _hashCode += getInput1().hashCode();
        }
        _hashCode += getInput2();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CalculateGCDRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.ws.niit.com/", "calculateGCDRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("input1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "input1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("input2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "input2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
