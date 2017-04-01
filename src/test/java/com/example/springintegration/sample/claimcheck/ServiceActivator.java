package com.example.springintegration.sample.claimcheck;

import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.Message;

public class ServiceActivator {

	private static Logger logger = LoggerFactory.getLogger(ServiceActivator.class);
	
	public Message<?> doTask(Message<?> message) {
		logger.debug("MyServiceActivator get message => {}", message);
		
		UUID claimId = (UUID) message.getPayload();
		
		logger.debug("Claim check id => {}", claimId);
		
		return message;
	}
}
