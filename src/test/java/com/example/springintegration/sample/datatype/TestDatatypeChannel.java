package com.example.springintegration.sample.datatype;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.GenericMessage;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:datatype-channel.xml")
public class TestDatatypeChannel {

	@Autowired
	private MessageChannel datatypeChannel;
	
	@Test
	public void sendStringMessage() {
		datatypeChannel.send(new GenericMessage<String>("Hello World"));
	}
	
	@Test
	public void sendIntegerMessage() {
		datatypeChannel.send(new GenericMessage<Integer>(2222));
	}
	
	@Test
	public void sendDoubleMessage() {
		datatypeChannel.send(new GenericMessage<Double>(5D));
	}
}
