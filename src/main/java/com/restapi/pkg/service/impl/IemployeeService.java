package com.restapi.pkg.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restapi.pkg.model.Employee;
import com.restapi.pkg.repository.employeeRepository;
import com.restapi.pkg.service.employeeService;

@Service
public class IemployeeService implements employeeService {

	
	@Autowired
	private employeeRepository employeerepository;
	
	@Override
	public void add(Employee employee) {
		// TODO Auto-generated method stub
		employeerepository.save(employee);
		
	}

	@Override
	public List<Employee> list() {
		// TODO Auto-generated method stub
		return employeerepository.findAll();
	}

}
