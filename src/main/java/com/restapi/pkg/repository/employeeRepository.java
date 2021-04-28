package com.restapi.pkg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restapi.pkg.model.Employee;

public interface employeeRepository extends JpaRepository<Employee, Long>  {

}
