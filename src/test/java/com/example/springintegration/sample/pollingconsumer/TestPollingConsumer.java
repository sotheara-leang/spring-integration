package com.example.springintegration.sample.pollingconsumer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.GenericMessage;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:polling-consumer.xml")
public class TestPollingConsumer {
	
	@Autowired
	private MessageChannel queueChannel;
	
	@Test
	public void doTest() throws InterruptedException {
		for (int i = 0; i< 5; i++) {
			queueChannel.send(new GenericMessage<String>("Hello World " + (i + 1)));
		}
		
		Thread.sleep(16000);
	}
}
