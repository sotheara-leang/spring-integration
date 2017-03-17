package com.example.springintegration.client.gateway;

import org.springframework.util.concurrent.ListenableFuture;

import com.solab.iso8583.IsoMessage;

public interface ClientTcpGateway {

	ListenableFuture<IsoMessage> send(IsoMessage mesage);
}
