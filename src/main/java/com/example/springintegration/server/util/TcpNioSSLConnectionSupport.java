package com.example.springintegration.server.util;

import javax.net.ssl.SSLEngine;

import org.springframework.integration.ip.tcp.connection.DefaultTcpNioSSLConnectionSupport;
import org.springframework.integration.ip.tcp.connection.TcpSSLContextSupport;

public class TcpNioSSLConnectionSupport extends DefaultTcpNioSSLConnectionSupport {

	public TcpNioSSLConnectionSupport(TcpSSLContextSupport sslContextSupport) {
		super(sslContextSupport);
	}

	@Override
	protected void postProcessSSLEngine(SSLEngine sslEngine) {
		sslEngine.setNeedClientAuth(true);
	}
}
