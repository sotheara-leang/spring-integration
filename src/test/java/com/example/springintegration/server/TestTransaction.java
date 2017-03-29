package com.example.springintegration.server;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;

import com.solab.iso8583.IsoMessage;
import com.solab.iso8583.MessageFactory;

public class TestTransaction extends AbstractTestCase {

	@Autowired
	MessageChannel inboundChannel;
	
	@Autowired
	MessageFactory<IsoMessage> isoMessageFactory;
	
	@Test
	public void doTest() {
		
		IsoMessage isoMessage = isoMessageFactory.newMessage(0x300);
	
		Message<?> message = MessageBuilder.withPayload(isoMessage).build();
		
		inboundChannel.send(message);
		
		
	}
}
