package com.li.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	@RequestMapping("/index")
	public String index(Map<String, Object> map){
		map.put("name", "李梁");
		return "index";
	}
}	
