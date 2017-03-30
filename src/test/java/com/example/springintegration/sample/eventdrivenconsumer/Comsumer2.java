package com.example.springintegration.sample.eventdrivenconsumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.Message;

public class Comsumer2 {

	private static Logger logger = LoggerFactory.getLogger(Comsumer2.class);
	
	public String consumer(Message<String> message) {
		logger.debug("Comsumer2 get message => {}", message);
		
		return "Consumer 2 message";
	}
}
