package com.tj.sse.service;

import org.springframework.stereotype.Service;


@Service
public class TestService {
	private String ServiceName = "MY NAME IS TEST　SERVICE";
	public void sayServiceName(){
		System.out.println(this.ServiceName);
	}
}
