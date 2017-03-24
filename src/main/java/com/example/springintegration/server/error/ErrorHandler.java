package com.example.springintegration.server.error;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessagingException;

import com.solab.iso8583.IsoMessage;

public class ErrorHandler {

	private static Logger logger = LoggerFactory.getLogger(ErrorHandler.class);
	
	@SuppressWarnings("unchecked")
	public Message<IsoMessage> handleError(MessagingException exception) throws Exception {
		logger.error(exception.getMessage(), exception);
		
		return (Message<IsoMessage>) exception.getFailedMessage();
	}
}
