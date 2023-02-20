package com.nagarro.spring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {

	
	@GetMapping("/api")
	public  List getString () {
		
		List ls= new ArrayList();
		ls.add(new Employee(1,"Aman","Singh",3,"IT",10000));
		ls.add(new Employee(1,"Naman","Singh",5,"Sales",4000));
		ls.add(new Employee(1,"Chaman","Singh",3,"Management",6000));
		
		return ls;
	}
}
