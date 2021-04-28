package com.restapi.pkg.service;

import java.util.List;

import com.restapi.pkg.model.Employee;

public interface employeeService {

	public void add(Employee employee);
	
	List<Employee> list();
}
