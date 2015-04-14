/**
 * SOAPServicePortBindingSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.niit.ws.service;

public class SOAPServicePortBindingSkeleton implements com.niit.ws.service.SOAPService_PortType, org.apache.axis.wsdl.Skeleton {
    private com.niit.ws.service.SOAPService_PortType impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://service.ws.niit.com/", "calculateGCDRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://service.ws.niit.com/", "calculateGCDRequest"), com.niit.ws.service.CalculateGCDRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getGcd", _params, new javax.xml.namespace.QName("http://service.ws.niit.com/", "calculateGCDResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://service.ws.niit.com/", "calculateGCDResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "getGcd"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getGcd") == null) {
            _myOperations.put("getGcd", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getGcd")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("Exception");
        _fault.setQName(new javax.xml.namespace.QName("http://service.ws.niit.com/", "Exception"));
        _fault.setClassName("com.niit.ws.service.Exception");
        _fault.setXmlType(new javax.xml.namespace.QName("http://service.ws.niit.com/", "Exception"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://service.ws.niit.com/", "getGCDListRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://service.ws.niit.com/", "getGCDListRequest"), com.niit.ws.service.GetGCDListRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getGcdList", _params, new javax.xml.namespace.QName("http://service.ws.niit.com/", "getGCDListResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://service.ws.niit.com/", "getGCDListResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "getGcdList"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getGcdList") == null) {
            _myOperations.put("getGcdList", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getGcdList")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("Exception");
        _fault.setQName(new javax.xml.namespace.QName("http://service.ws.niit.com/", "Exception"));
        _fault.setClassName("com.niit.ws.service.Exception");
        _fault.setXmlType(new javax.xml.namespace.QName("http://service.ws.niit.com/", "Exception"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://service.ws.niit.com/", "getGCDSumRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://service.ws.niit.com/", "getGCDSumRequest"), com.niit.ws.service.GetGCDSumRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getGcdSum", _params, new javax.xml.namespace.QName("http://service.ws.niit.com/", "getGCDSumResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://service.ws.niit.com/", "getGCDSumResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "getGcdSum"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getGcdSum") == null) {
            _myOperations.put("getGcdSum", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getGcdSum")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("Exception");
        _fault.setQName(new javax.xml.namespace.QName("http://service.ws.niit.com/", "Exception"));
        _fault.setClassName("com.niit.ws.service.Exception");
        _fault.setXmlType(new javax.xml.namespace.QName("http://service.ws.niit.com/", "Exception"));
        _oper.addFault(_fault);
    }

    public SOAPServicePortBindingSkeleton() {
        this.impl = new com.niit.ws.service.SOAPServicePortBindingImpl();
    }

    public SOAPServicePortBindingSkeleton(com.niit.ws.service.SOAPService_PortType impl) {
        this.impl = impl;
    }
    public com.niit.ws.service.CalculateGCDResponse getGcd(com.niit.ws.service.CalculateGCDRequest parameters) throws java.rmi.RemoteException, com.niit.ws.service.Exception
    {
        com.niit.ws.service.CalculateGCDResponse ret = impl.getGcd(parameters);
        return ret;
    }

    public int[] getGcdList(com.niit.ws.service.GetGCDListRequest parameters) throws java.rmi.RemoteException, com.niit.ws.service.Exception
    {
        int[] ret = impl.getGcdList(parameters);
        return ret;
    }

    public int[] getGcdSum(com.niit.ws.service.GetGCDSumRequest parameters) throws java.rmi.RemoteException, com.niit.ws.service.Exception
    {
        int[] ret = impl.getGcdSum(parameters);
        return ret;
    }

}
