package com.example.springintegration.client.error;

import org.springframework.messaging.MessagingException;

public class ErrorHandler {

	public Object handleError(MessagingException exception) throws Exception {
		return exception.getMessage();
	}
}
