package com.example.springintegration.server;

import org.springframework.context.support.GenericXmlApplicationContext;

public class AppBootstrap {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		GenericXmlApplicationContext appContext = new GenericXmlApplicationContext();
		appContext.load("classpath:context-root.xml");
		appContext.registerShutdownHook();
		appContext.refresh();
	}
}