package com.wipro.relationshipdemo.service;

import com.wipro.relationshipdemo.entity.Employee;

public interface EmployeeService {
 Employee saveEmployee(Employee employee);

Employee getEmployeeById(int id);
 
}
