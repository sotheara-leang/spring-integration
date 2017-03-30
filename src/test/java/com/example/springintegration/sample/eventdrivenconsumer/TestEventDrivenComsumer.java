package com.example.springintegration.sample.eventdrivenconsumer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:sample/event-driven-consumer.xml")
public class TestEventDrivenComsumer {
	
	@Autowired
	MessageChannel pubsubChannel;
	
	@Test
	public void doTest() {
		Message<String> message = MessageBuilder.withPayload("Hello event-driven consumer").build();
		pubsubChannel.send(message);
	}
}
