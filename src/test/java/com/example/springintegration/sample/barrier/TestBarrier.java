package com.example.springintegration.sample.barrier;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.GenericMessage;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:barrier.xml")
public class TestBarrier {
	
	@Autowired
	private MessageChannel pubsubChannel;
	
	@Test
	public void doTest() {
		pubsubChannel.send(new GenericMessage<String>("Hello!!"));
	}
}
