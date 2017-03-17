package com.example.springintegration.client;

import java.io.UnsupportedEncodingException;
import java.util.concurrent.ExecutionException;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.springintegration.AbstractTestCase;
import com.example.springintegration.client.gateway.ClientTcpGateway;

public class TestClient extends AbstractTestCase {

	@Autowired
	ClientTcpGateway clientGatway;
	
	@Test
	public void doTest() throws InterruptedException, ExecutionException, UnsupportedEncodingException {
		Object response = clientGatway.send("Hello").get();
		
		System.out.println(response);
	}
}
