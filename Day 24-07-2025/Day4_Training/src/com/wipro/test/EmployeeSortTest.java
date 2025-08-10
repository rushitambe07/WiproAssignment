package com.wipro.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import com.wipro.genric.Employee;
import com.wipro.genric.SortByEmpId;
import com.wipro.genric.SortByEmpName;
import com.wipro.genric.SortByEmpAge;


import com.wipro.genric.Employee;

public class EmployeeSortTest {
    public static void main(String[] args) {
    	List<Employee> empList = new CopyOnWriteArrayList<>();

        empList.add(new Employee("E101", "Shubham", 25, 75000));
        empList.add(new Employee("E102", "Tejas", 28, 85000));
        empList.add(new Employee("E103", "Rahul", 30, 90000));
        empList.add(new Employee("E104", "Sham", 27, 65000));

        for (Employee emp : empList) {
            if (emp.getEmpSalary() > 80000) {
                empList.remove(emp);
            }
        }

        System.out.println("Employees with salary <= 80000:");
        for (Employee emp : empList) {
            System.out.println(emp);
        }
    
    }
}

