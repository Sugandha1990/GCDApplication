/**
 * SOAPService_Service.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.niit.ws.service;

public interface SOAPService_Service extends javax.xml.rpc.Service {
    public java.lang.String getSOAPServicePortAddress();

    public com.niit.ws.service.SOAPService_PortType getSOAPServicePort() throws javax.xml.rpc.ServiceException;

    public com.niit.ws.service.SOAPService_PortType getSOAPServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
