package jms;
/*
Use source code downloads, example commands,
and any other techniques at your own risk.
No warranty is provided.
*/

import java.util.Properties;
import javax.jms.JMSException;
import javax.jms.TextMessage;
import javax.jms.Topic;
import javax.jms.TopicConnection;
import javax.jms.TopicConnectionFactory;
import javax.jms.TopicPublisher;
import javax.jms.TopicSession;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class Sender {

	String url_;
	String name_;
	TopicConnection conn = null;
	TopicSession session = null;
	Topic topic = null;

	public Sender(String url, String name) throws JMSException, NamingException {

		url_ = url;
		name_ = name;

    		this.initializeSender();

    	}

	private void initializeSender() throws JMSException, NamingException {


		Properties props = new Properties();
		props.setProperty("java.naming.factory.initial","org.jnp.interfaces.NamingContextFactory");
		props.setProperty("java.naming.factory.url.pkgs", "org.jboss.naming");
		props.setProperty("java.naming.provider.url", url_);

		Context context = new InitialContext(props);

		TopicConnectionFactory tcf = (TopicConnectionFactory) context.lookup("ConnectionFactory");
		conn = tcf.createTopicConnection();
		topic = (Topic) context.lookup(name_);

		session = conn.createTopicSession(false, TopicSession.AUTO_ACKNOWLEDGE);
		conn.start();


	}

	 public void send(String text) throws JMSException, NamingException {

	     // Send a text msg
	     TopicPublisher send = session.createPublisher(topic);
	     TextMessage tm = session.createTextMessage(text);
	     send.publish(tm);
	     send.close();
	 }


	public void disconnect() throws JMSException {
		if(conn != null) {
			conn.stop();
		}

		if(session != null) {
			session.close();
		}

		if(conn != null) {
			conn.close();
		}
	}

	public String getTopicName() {
		return name_;
	}

	public String getTopicURL() {
		return url_;
	}

	
	
	
	
}
