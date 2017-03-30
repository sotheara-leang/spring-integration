package com.example.springintegration.sample.pubsub;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:sample/pubsub-channel.xml")
public class TestPubsubChannel {

	@Autowired
	private MessageChannel pubsubChannel;
	
	@Test
	public void doTest() {
		Message<String> message = MessageBuilder.withPayload("Hello World - Pubsub Channel").build();
		pubsubChannel.send(message);
	}
}
