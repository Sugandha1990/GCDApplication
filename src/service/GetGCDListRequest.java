/**
 * GetGCDListRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package service;

public class GetGCDListRequest  implements java.io.Serializable {
    private java.lang.Integer numberOfElements;

    public GetGCDListRequest() {
    }

    public GetGCDListRequest(
           java.lang.Integer numberOfElements) {
           this.numberOfElements = numberOfElements;
    }


    /**
     * Gets the numberOfElements value for this GetGCDListRequest.
     * 
     * @return numberOfElements
     */
    public java.lang.Integer getNumberOfElements() {
        return numberOfElements;
    }


    /**
     * Sets the numberOfElements value for this GetGCDListRequest.
     * 
     * @param numberOfElements
     */
    public void setNumberOfElements(java.lang.Integer numberOfElements) {
        this.numberOfElements = numberOfElements;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetGCDListRequest)) return false;
        GetGCDListRequest other = (GetGCDListRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.numberOfElements==null && other.getNumberOfElements()==null) || 
             (this.numberOfElements!=null &&
              this.numberOfElements.equals(other.getNumberOfElements())));
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
        if (getNumberOfElements() != null) {
            _hashCode += getNumberOfElements().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetGCDListRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.ws.niit.com/", "getGCDListRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberOfElements");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numberOfElements"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
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
