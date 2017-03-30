package com.example.springintegration.sample.serviceactivator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:service-activator.xml")
public class TestServiceActivator {
	
	@Autowired
	MessageChannel inChannel;
	
	@Test
	public void doTest() {
		Message<String> message = MessageBuilder.withPayload("Hello service activator").setHeader("myHeader", "123").build();
		inChannel.send(message);
	}
}
