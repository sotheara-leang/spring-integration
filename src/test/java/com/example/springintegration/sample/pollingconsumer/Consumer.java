package com.example.springintegration.sample.pollingconsumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Consumer {

	private static Logger logger = LoggerFactory.getLogger(Consumer.class);
	
	public String consumer(String message) {
		logger.debug("Consumer get message => {}", message);
		
		return message;
	}
}
