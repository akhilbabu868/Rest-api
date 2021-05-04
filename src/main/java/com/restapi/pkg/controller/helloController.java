package com.restapi.pkg.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.pkg.model.Employee;
import com.restapi.pkg.service.impl.IemployeeService;

import io.swagger.annotations.Api;


@RestController
@RequestMapping("/employee")
@Api(value="employeemaster", description="details of employee")
public class helloController {

	@Autowired
	IemployeeService employeeservice;

	@RequestMapping("/")
	public String hello() {

		return "hello";

	}

	// Employee Save

	@RequestMapping(value="/{employee_id}/update", method =RequestMethod.PUT, produces = "application/json")
	public ResponseEntity<HttpStatus> update(@PathVariable ("employee_id") int Id, @RequestBody Employee employee) {

		employeeservice.update(employee, Id);
		return ResponseEntity.ok(HttpStatus.OK);

	}
	
	
	
	
	@RequestMapping(value = "/save",produces = "application/json", method =RequestMethod.POST)
	public ResponseEntity<HttpStatus> add(@RequestBody Employee employee) {

		employeeservice.add(employee);
		return ResponseEntity.ok(HttpStatus.OK);

	}
	
	
	@RequestMapping(value =  "/all",produces = "application/json", method =RequestMethod.GET)
	public List<Employee> getAll(){
		
		return employeeservice.list();
		
	}
	
	
	@RequestMapping(value ="/employeedetails/{id}",produces = "application/json", method =RequestMethod.GET)
	public Optional<Employee> getById(@PathVariable ("id") Long employeeid){
		
		Optional<Employee> employee = employeeservice.getById(employeeid);
		System.out.println("Optional"+employee.isPresent());
		return employee;
		
	}

	
	@RequestMapping(value ="/employee/details/{name}",produces = "application/json", method =RequestMethod.GET)
	public List<Employee> getByName(@PathVariable ("name") String Firstname){
		
		List<Employee> employee = employeeservice.listBynames(Firstname);
	
		return employee;
		
	}

	
	
//	@GetMapping("/exists/{name}")
//	public boolean isExistByName(@PathVariable ("name") String Firstname){
//			
//		return employeeservice.isExist(Firstname);
//		
//	}


	
	
	
	
}
