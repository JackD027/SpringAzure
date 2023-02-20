package com.nagarro.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {

	
	@GetMapping("/api")
	public String getString () {
		return 
		"[
    {
        "id": 1,
        "firstName": "Aman",
        "lastName": "Singh",
        "exp": 3,
        "dept": "IT",
        "salary": 1000
    },
    {
        "id": 2,
        "firstName": "Naman",
        "lastName": "Singh",
        "exp": 5,
        "dept": "Sales",
        "salary": 4000
    },
    {
        "id": 3,
        "firstName": "Chaman",
        "lastName": "Singh",
        "exp": 4,
        "dept": "Management",
        "salary": 5000
    }
]";
	}
}
