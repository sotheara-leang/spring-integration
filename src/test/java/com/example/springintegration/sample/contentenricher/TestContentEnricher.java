package com.example.springintegration.sample.contentenricher;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.springintegration.sample.domain.Person;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:content-enricher.xml")
public class TestContentEnricher {
	
	@Autowired
	MessageChannel headerEnricherChannel;
	
	@Autowired
	MessageChannel enricherChannel;
	
	@Test
	public void headerEnricher() {
		Message<String> message = MessageBuilder.withPayload("header enricher").build();
		headerEnricherChannel.send(message);
	}
	
	@Test
	public void enricher() {
		Person person = new Person();
		person.setLastName("Sok");
		person.setFirstName("Dara");
		
		Message<Person> message = MessageBuilder.withPayload(person)
												.setHeaderIfAbsent("myHeader", "123")
												.build();
		enricherChannel.send(message);
	}
}
