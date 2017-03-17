package com.example.springintegration.activator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ServerActivater {
	
	private static Logger logger = LoggerFactory.getLogger(ServerActivater.class);
	
	public Object procceed(byte[] message) throws Exception {
		logger.debug("server activator received message : {}", new String(message));
		
		return "Echo : " + new String(message);
	}
}
