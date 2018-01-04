package com.li.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestHello {
	
	@RequestMapping("/hello2")
	public String hello2() {
		return "hello2";
	}
	
	
}
