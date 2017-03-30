package com.example.springintegration.sample.serviceactivator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.GenericMessage;

public class MyServiceActivator {
	
	private static Logger logger = LoggerFactory.getLogger(MyServiceActivator.class);
	
	public Message<String> doTask(Message<String> message) {
		logger.debug("MyServiceActivator get message => {}", message);
		
		return new GenericMessage<String>("New Message");
	}
}
