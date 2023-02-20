package com.nagarro.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {

	
	@GetMapping("/api")
	public String getString () {
		return "Hi from Controller";
		
	}
}
