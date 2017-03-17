package com.example.springintegration.server.activator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.solab.iso8583.IsoMessage;

public class ServerActivater {
	
	private static Logger logger = LoggerFactory.getLogger(ServerActivater.class);
	
	public Object procceed(IsoMessage message) throws Exception {
		logger.debug("server activator received message : {}", message.debugString());

		return message;
	}
}
