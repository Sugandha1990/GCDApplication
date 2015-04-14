/**
 * SOAPService_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.niit.ws.service;

public interface SOAPService_PortType extends java.rmi.Remote {
    public com.niit.ws.service.CalculateGCDResponse getGcd(com.niit.ws.service.CalculateGCDRequest parameters) throws java.rmi.RemoteException, com.niit.ws.service.Exception;
    public int[] getGcdList(com.niit.ws.service.GetGCDListRequest parameters) throws java.rmi.RemoteException, com.niit.ws.service.Exception;
    public int[] getGcdSum(com.niit.ws.service.GetGCDSumRequest parameters) throws java.rmi.RemoteException, com.niit.ws.service.Exception;
}
