package com.example.springintegration.gateway;

import org.springframework.util.concurrent.ListenableFuture;

public interface ClientTcpGateway {

	ListenableFuture<Object> send(Object mesage);
}
