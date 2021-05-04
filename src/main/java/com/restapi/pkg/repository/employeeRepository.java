package com.restapi.pkg.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restapi.pkg.model.Employee;

public interface employeeRepository extends JpaRepository<Employee, Long>  {

    List<Employee> findByFirstName(String firstname);
    
    
	
	
}
