package com.example.springintegration.sample.bridge;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.GenericMessage;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:bridge.xml")
public class TestBridge {
	
	@Autowired
	private MessageChannel directChannel;
	
	@Test
	public void doTest() {
		directChannel.send(new GenericMessage<String>("Hello!!"));
	}
}
