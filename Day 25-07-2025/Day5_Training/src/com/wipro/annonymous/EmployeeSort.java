package com.wipro.annonymous;

import java.util.Arrays;
import java.util.List;

public class EmployeeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> empList = Arrays.asList(
	            new Employee("Ravi", 30),
	            new Employee("Amit", 25),
	            new Employee("Suman", 35)
	        );

	        empList.sort((e1, e2) -> e1.name.compareTo(e2.name));

	        for (Employee e : empList) {
	            System.out.println(e);
	        }
	        
	       // System.out.println(Employee);

	}

}
