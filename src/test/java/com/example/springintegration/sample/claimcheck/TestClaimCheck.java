package com.example.springintegration.sample.claimcheck;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:claim-check.xml")
public class TestClaimCheck {
	
	@Autowired
	MessageChannel inChannel;
	
	@Test
	public void claimCheck() {
		Message<String> message = MessageBuilder.withPayload("Hello world").build();
		inChannel.send(message);
	}
}
