package com.wipro.relationshipdemo.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.relationshipdemo.entity.Employee;
import com.wipro.relationshipdemo.repo.EmployeeRepository;
import com.wipro.relationshipdemo.service.EmployeeService;


@Service
public class EmployeeServiceImpl implements EmployeeService {

 @Autowired
 private EmployeeRepository employeeRepo;

 @Override
 public Employee saveEmployee(Employee employee) {
     return employeeRepo.save(employee);
 }

@Override
public Employee getEmployeeById(int id) {
    return employeeRepo.findById(id).orElse(null);

}


}

