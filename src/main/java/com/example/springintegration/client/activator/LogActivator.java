package com.example.springintegration.client.activator;

import java.util.List;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.integration.history.MessageHistory;
import org.springframework.messaging.handler.annotation.Header;

public class LogActivator {
	
	private static Logger logger = LoggerFactory.getLogger(LogActivator.class);

	public void logHistory(@Header(MessageHistory.HEADER_NAME) List<Properties> histories) {
		logger.debug("**** Message History ****");
		
		for (Properties element : histories) {
			logger.debug(element.toString());
		}
		
		logger.debug("**** Message History ****");
	}
}
