package com.example.springintegration.sample.scattergather;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Consumer2 {

	private static Logger logger = LoggerFactory.getLogger(Consumer2.class);
	
	public Integer consumer(Integer value) {
		logger.debug("Consumer2 get => {}", value);
		
		return value + 1;
	}
}
