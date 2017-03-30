package com.example.springintegration.sample.channeladapter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InboundBean {
	
	private static Logger logger = LoggerFactory.getLogger(InboundBean.class);
	
	public Object procceed() {
		String message = "hello world";
		
		logger.debug("Inbound bean send message => {}", message);
		
		return message;
	}
}
