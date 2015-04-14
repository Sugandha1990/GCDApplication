package publisher;

import javax.xml.ws.Endpoint;

import service.SOAPServicePortBindingImpl;
import com.sun.research.ws.wadl.Response;

public class Publisher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Endpoint.publish("http://localhost:8071/SOAPService",new SOAPServicePortBindingImpl());
		System.out.println("published");
	}

}
