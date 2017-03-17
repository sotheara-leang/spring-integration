package com.example.springintegration.gateway;

import org.springframework.util.concurrent.ListenableFuture;

public interface ServerTcpGateway {

	ListenableFuture<Object> send(Object mesage);
}
