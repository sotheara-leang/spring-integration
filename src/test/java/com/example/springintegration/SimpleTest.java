package com.example.springintegration;

import java.io.UnsupportedEncodingException;
import java.util.concurrent.ExecutionException;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.springintegration.gateway.ClientTcpGateway;

public class SimpleTest extends AbstractTestCase {

	@Autowired
	ClientTcpGateway clientGatway;
	
	@Test
	public void doTest() throws InterruptedException, ExecutionException, UnsupportedEncodingException {
		Object response = clientGatway.send("Hello").get();
		
		System.out.println(response);
	}
}
