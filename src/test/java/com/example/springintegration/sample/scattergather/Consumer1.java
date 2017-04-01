package com.example.springintegration.sample.scattergather;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Consumer1 {

	private static Logger logger = LoggerFactory.getLogger(Consumer1.class);
	
	public Integer consumer(Integer value) {
		logger.debug("Consumer1 get => {}", value);
		
		return value + 1;
	}
}
