package com.example.springintegration.sample.eventdrivenconsumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.Message;

public class Comsumer1 {

	private static Logger logger = LoggerFactory.getLogger(Comsumer1.class);
	
	public String consumer(Message<String> message) {
		logger.debug("Comsumer1 get message => {}", message);
		
		return "Consumer 1 message";
	}
}
