package com.wipro.relationshipdemo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.relationshipdemo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
}

