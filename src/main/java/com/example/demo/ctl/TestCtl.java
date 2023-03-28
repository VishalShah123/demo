package com.example.demo.ctl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestCtl {

	@GetMapping("/")
	public String abc() {
		return "Home";
	}

	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@GetMapping("/registration")
	public String reg() {
		
		
		return "registration";
	}
	
	
	
}
