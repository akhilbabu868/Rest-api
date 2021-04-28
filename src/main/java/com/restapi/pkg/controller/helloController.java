package com.restapi.pkg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.pkg.model.Employee;
import com.restapi.pkg.service.impl.IemployeeService;


@RestController
public class helloController {

	@Autowired
	IemployeeService employeeservice;

	@RequestMapping("/")
	public String hello() {

		return "hello";

	}

	// Employee Save

	@PostMapping("/employee/save")
	public ResponseEntity<HttpStatus> add(@RequestBody Employee employee) {

		employeeservice.add(employee);
		return ResponseEntity.ok(HttpStatus.OK);

	}
	
	
	@GetMapping("/employee/all")
	public List<Employee> getAll(){
		
		return employeeservice.list();
		
	}

}
