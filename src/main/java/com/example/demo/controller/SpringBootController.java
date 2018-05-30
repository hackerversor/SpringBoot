package com.example.demo.controller;

import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SpringBootController {
	
	// private LoginService loginService;
	@RequestMapping("/login")
	public String index(/*Map<String,Object> map*/){
//		map.put("name", "Andy");
		return "login";
	}
}
