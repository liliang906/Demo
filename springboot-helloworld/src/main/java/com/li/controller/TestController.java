package com.li.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@EnableAutoConfiguration
public class TestController {
	
	@RequestMapping("/hello")
	public String hello() {
		return "hello";
	}
	
//	public static void main(String[] args) {
//		SpringApplication.run(TestController.class, args);
//	}
}
