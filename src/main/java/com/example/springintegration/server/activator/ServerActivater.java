package com.example.springintegration.server.activator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ServerActivater {
	
	private static Logger logger = LoggerFactory.getLogger(ServerActivater.class);
	
	public Object procceed(Object message) throws Exception {
		logger.debug("server activator received message : {}", message);

		return message;
	}
}
