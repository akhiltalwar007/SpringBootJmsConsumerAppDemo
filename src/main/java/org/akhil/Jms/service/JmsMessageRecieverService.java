package org.akhil.Jms.service;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;
@Component
public class JmsMessageRecieverService  {
	
	/*
	 * @Override public void run(String... args) throws Exception { // TODO
	 * Auto-generated method stub Message msg = jt.receive("MyQueue1");
	 * System.out.println(" Msg " +msg.getJMSCorrelationID()); //smsg.get }
	 */
	@JmsListener(destination = "MyQueue1")
	public void readData(String txt) {
		System.out.println(" Data ------ > "+ txt);
	}
}
