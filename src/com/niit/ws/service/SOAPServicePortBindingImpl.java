/**
 * SOAPServicePortBindingImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.niit.ws.service;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import service.CalculateGCDResponse;

import jms.Listener;



   
    @WebService
    public class SOAPServicePortBindingImpl implements com.niit.ws.service.SOAPService_PortType{
    	@WebMethod
    	public int[] getGcdList(com.niit.ws.service.GetGCDListRequest parameters) throws java.rmi.RemoteException, com.niit.ws.service.Exception {

    	    
    		
Listener listener = new Listener("localhost:1099", "topic/example");
 List listFromQueue = listener.readQueue(listener);

 int[] list = new int[listFromQueue.size()];
     for (int i=0; i<list.length-1;i++){
    	 list[i]=(int) listFromQueue.get(i);
     }  
     return list;
        }
    	@WebMethod
    	public CalculateGCDResponse getGcd(CalculateGCDRequest parameters) throws java.rmi.RemoteException, com.niit.ws.service.Exception {
    		CalculateGCDResponse resp= new CalculateGCDResponse();

    		
            Listener listener = new Listener("localhost:1099", "topic/example");
             List<Integer> list = listener.readQueue(listener);
                    resp.setOutput(findGCD(list.get(list.size()-1),list.get(list.size()-2)));
                	return resp;
                }
        private  int findGCD(int number1, int number2) {
            //base case
            if(number2 == 0){
                return number1;
            }
            return findGCD(number2, number1%number2);
        }
    	@WebMethod
        public int[] getGcdSum(com.niit.ws.service.GetGCDSumRequest parameters) throws java.rmi.RemoteException, com.niit.ws.service.Exception {
            return null;
        }
      
    }
}
