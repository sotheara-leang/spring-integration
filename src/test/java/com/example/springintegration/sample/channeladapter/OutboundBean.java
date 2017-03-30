package com.example.springintegration.sample.channeladapter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OutboundBean {

	private static Logger logger = LoggerFactory.getLogger(OutboundBean.class);
	
	public void procceed(Object message) {
		logger.debug("Outbound bean get message => {}", message);
	}
}
