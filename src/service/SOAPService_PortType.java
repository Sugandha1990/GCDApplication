/**
 * SOAPService_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package service;

public interface SOAPService_PortType extends java.rmi.Remote {
    public service.CalculateGCDResponse getGcd(service.CalculateGCDRequest parameters) throws java.rmi.RemoteException, service.Exception;
    public int[] getGcdList(service.GetGCDListRequest parameters) throws java.rmi.RemoteException, service.Exception;
}
