package com.example.springintegration.server.activator;

import java.util.List;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.integration.history.MessageHistory;
import org.springframework.messaging.handler.annotation.Header;

import com.solab.iso8583.IsoMessage;

public class LogActivator {
	
	private static Logger logger = LoggerFactory.getLogger(LogActivator.class);

	public IsoMessage logHistory(IsoMessage message, @Header(MessageHistory.HEADER_NAME) List<Properties> histories) {
		logger.debug("**** Message History ****");
		logger.debug("message : {}", message.debugString());
		
		for (Properties element : histories) {
			logger.debug(element.toString());
		}
		
		logger.debug("**** Message History ****");
		
		return message;
	}
}
