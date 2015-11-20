package com.tj.sse.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tj.sse.service.TestService;

@Controller
@RequestMapping("/testController")
public class TestController {
	@Autowired
	private TestService testService;
	public void setTestService(TestService testService){
		this.testService = testService;
	}
	
	@RequestMapping(value="/invokeTestService", method=RequestMethod.GET)
	public void invokeTestService(HttpServletRequest request, HttpServletResponse response){
		System.out.println("I am test controller, going to invoke test service");
		testService.sayServiceName();
	}
	
	
}
