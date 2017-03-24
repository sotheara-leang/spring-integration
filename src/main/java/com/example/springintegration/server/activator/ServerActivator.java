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
	public IsoMessage procceedMsg200(IsoMessage isoMessage) {
		logger.debug("server activator received message 200 : {}", isoMessage.debugString());

		return isoMessage;
	}
	
	@ServiceActivator(inputChannel = "channel.300", outputChannel = "outboundChannel")
	public IsoMessage procceedMsg300(IsoMessage isoMessage) throws Exception {
		logger.debug("server activator received message 300 : {}", isoMessage.debugString());

		throw new Exception("Create simple exception");
	}
}