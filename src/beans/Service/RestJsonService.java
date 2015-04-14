package beans.Service;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import jms.Listener;
import jms.Sender;

import beans.pojo.JMSQueue;
import beans.pojo.Pojo;

@Path("/json")
public class RestJsonService {
	Pojo pojo=new Pojo();
	@Produces(MediaType.APPLICATION_JSON)
	@GET
	@Path("/{input1}/{input2}")
	public Pojo push(@PathParam("input1") String i1,@PathParam("input2") String i2){
		if(i1!=null && i2!=null){
	JMSQueue queue = new JMSQueue();
	String message = queue.writeQueue(i1, i2);
		pojo.setMessage(message);
		}
		else{
			pojo.setMessage("Invalid values");
		}
		

		return pojo;
		
		
	}
	@GET
	@Produces(MediaType.APPLICATION_JSON)
    public Pojo getList() {
		
Listener listener = new Listener("localhost:1099", "topic/example");
 List list = listener.readQueue(listener);
	pojo.setMessage("List From Queue");
	pojo.setList(list);
        return pojo;
    }
}
