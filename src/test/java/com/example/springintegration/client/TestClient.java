package com.example.springintegration.client;

import java.io.UnsupportedEncodingException;
import java.util.concurrent.ExecutionException;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.springintegration.client.gateway.ClientTcpGateway;
import com.solab.iso8583.IsoMessage;
import com.solab.iso8583.MessageFactory;

public class TestClient extends AbstractTestCase {

	@Autowired
	private MessageFactory<IsoMessage> messageFactory;
	
	@Autowired
	private ClientTcpGateway clientTcpGateway;
	
	@Test
	public void doTest() throws InterruptedException, ExecutionException, UnsupportedEncodingException {
		IsoMessage message = messageFactory.newMessage(0x200);
		
		IsoMessage response = clientTcpGateway.send(message).get();

		Assert.assertNotNull(response);
		
		Thread.sleep(5000);
	}
}
