package com.example.springintegration.server.activator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;

import com.solab.iso8583.IsoMessage;

@MessageEndpoint
public class ServerActivator {
	
	private static Logger logger = LoggerFactory.getLogger(ServerActivator.class);
	
	@ServiceActivator(inputChannel = "channel.200", outputChannel = "outboundChannel")
	public IsoMessage procceedMsg200(IsoMessage message) throws Exception {
		logger.debug("server activator received message : {}", message.debugString());

		return message;
	}
	
	@ServiceActivator(inputChannel = "channel.300", outputChannel = "outboundChannel")
	public IsoMessage procceedMsg300(IsoMessage message) throws Exception {
		logger.debug("server activator received message : {}", message.debugString());

		return message;
	}
}