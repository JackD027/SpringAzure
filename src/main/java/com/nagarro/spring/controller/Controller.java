package com.nagarro.spring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {
List ls= new ArrayList();
	
	
	@PostMapping("/addEmployee")
	public Employee addEmployee(@RequestBody Employee emp) {
		Employee employee = new Employee(emp.getId(),emp.getFirstName(),emp.getLastName(),emp.getExp(),emp.getDept(),emp.getSalary());
		ls.add(employee);
		return(employee);
	}
	
	@GetMapping("/getEmployee")
	public  List getEmployee () {
		return ls;
	}
}



