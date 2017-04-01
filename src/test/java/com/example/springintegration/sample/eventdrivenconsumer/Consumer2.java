package com.example.springintegration.sample.eventdrivenconsumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.Message;

public class Consumer2 {

	private static Logger logger = LoggerFactory.getLogger(Consumer2.class);
	
	public String consumer(Message<String> message) {
		logger.debug("Consumer2 get message => {}", message);
		
		return "Consumer 2 message";
	}
}
