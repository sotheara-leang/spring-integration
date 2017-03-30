package com.example.springintegration.sample.direct;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:sample/direct-channel.xml")
public class TestDirectChannel {

	@Autowired
	private MessageChannel directChannel;
	
	@Test
	public void doTest() {
		Message<String> message = MessageBuilder.withPayload("Hello World - Direct Channel").build();
		directChannel.send(message);
	}
}
