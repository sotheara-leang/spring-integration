package com.example.springintegration.client;

import java.util.concurrent.ExecutionException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.example.springintegration.client.gateway.ClientTcpGateway;
import com.solab.iso8583.IsoMessage;
import com.solab.iso8583.MessageFactory;

public class ClientBootstrap {

	private static Logger logger = LoggerFactory.getLogger(ClientBootstrap.class);
	
	@SuppressWarnings({ "resource", "unchecked" })
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		GenericXmlApplicationContext appContext = new GenericXmlApplicationContext();
		appContext.load("classpath:client/context-root.xml");
		appContext.registerShutdownHook();
		appContext.refresh();
		
		MessageFactory<IsoMessage> messageFactory = appContext.getBean(MessageFactory.class);
		
		ClientTcpGateway clientTcpGateway = appContext.getBean(ClientTcpGateway.class);
		
		IsoMessage message = messageFactory.newMessage(0x300);
		
		IsoMessage response = clientTcpGateway.send(message).get();
		
		logger.debug(response.debugString());
	}
}