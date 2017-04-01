package com.example.springintegration.sample.controlbus;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jmx.export.annotation.ManagedOperation;
import org.springframework.messaging.Message;

public class ServiceActivator {
	
	private static Logger logger = LoggerFactory.getLogger(ServiceActivator.class);
	
	private volatile int counter = 0;

	public void doTask(Message<?> message) {
		logger.debug("Counter {}", counter);
	}
	
	@ManagedOperation
	public void increaseCounter() {
		counter++;
	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}
}
