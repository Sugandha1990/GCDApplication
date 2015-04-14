package beans.pojo;

import javax.jms.JMSException;
import javax.naming.NamingException;

import jms.Listener;
import jms.Sender;

public class JMSQueue {

	
	public String writeQueue(String i1,String i2){

		System.out.println("Starting JMS Example Sender");
		try {
        	Sender sender = new Sender("localhost:1099", "topic/example");

        	System.out.println("Sending values to queue");

        	sender.send(i1);
        	sender.send(i2);
        	
				

        	sender.disconnect();
        	} catch (JMSException | NamingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
       	 return "Successfully Added";

     }
	
	
}
