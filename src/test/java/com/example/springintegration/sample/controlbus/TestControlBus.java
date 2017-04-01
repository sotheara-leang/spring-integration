package com.example.springintegration.sample.controlbus;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.GenericMessage;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:control-bus.xml")
public class TestControlBus {
	
	private static Logger logger = LoggerFactory.getLogger(TestControlBus.class);
	
	@Autowired
	private MessageChannel controlChannel;
	
	@Autowired
	private ServiceActivator myServiceActivator;
	
	@Test
	public void doTest() {
		logger.debug("Counter -> {}", myServiceActivator.getCounter());
		
		controlChannel.send(new GenericMessage<String>("@myServiceActivator.increaseCounter()"));
		
		logger.debug("Counter -> {}", myServiceActivator.getCounter());
	}
}
