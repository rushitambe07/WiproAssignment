package com.wipro.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.wipro.genric.Employee;

public class ArrayListEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee("E101", "Raj", 28, 55000.0);
        Employee e2 = new Employee("E102", "Priya", 30, 75000.0);
        Employee e3 = new Employee("E103", "Amit", 25, 50000.0);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);

        Collections.sort(employeeList, new Comparator<Employee>() {
            public int compare(Employee e1, Employee e2) {
                return Double.compare(e2.getEmpSalary(), e1.getEmpSalary());
            }
        });

        for (Employee emp : employeeList) {
            System.out.println(emp);
        }

	}

}
