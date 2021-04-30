package com.restapi.pkg.service.impl;

import java.util.List;
import java.util.Optional;

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

	@Override
	public void update(Employee employee, int employeeid) {
		// TODO Auto-generated method stub
	  employeerepository.save(employee);
	}

	@Override
	public Optional<Employee> getById(Long employeeid) {
		// TODO Auto-generated method stub
		return employeerepository.findById(employeeid);
	}
	
}

