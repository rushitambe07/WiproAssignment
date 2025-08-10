package com.wipro.sql;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Employee> employees = Arrays.asList(
		            new Employee("John", 25, 40000),
		            new Employee("Alice", 35, 60000),
		            new Employee("Bob", 40, 70000),
		            new Employee("Charlie", 20, 30000),
		            new Employee("David", 38, 55000));

		        double avgSalary = employees.stream()
		            .filter(e -> e.getAge() > 30 && e.getSalary() > 50000)
		            .mapToDouble(Employee::getSalary)
		            .average()
		            .orElse(0.0);

		        System.out.println("Average Salary of employees older than 30 and salary > 50000 is : " + avgSalary);
		    }

	}


