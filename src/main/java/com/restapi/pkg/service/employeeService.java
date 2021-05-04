package com.restapi.pkg.service;

import java.util.List;
import java.util.Optional;

import com.restapi.pkg.model.Employee;

public interface employeeService {

	public void add(Employee employee);
	public void update(Employee employee,int employeeid);
	
    Optional<Employee> getById(Long employeeid);
	
	List<Employee> list();
	
	List<Employee> listBynames(String firstname);
	
	boolean isExist(String firstname);
}
