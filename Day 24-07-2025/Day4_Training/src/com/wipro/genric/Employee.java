package com.wipro.genric;

public class Employee {
	String empId;
    String empName;
    int empAge;
    double empSalary;
    
    
    public Employee(String empId, String empName, int empAge, double empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empAge = empAge;
        this.empSalary = empSalary;
    }
    
    public String getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public int getEmpAge() {
        return empAge;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    @Override
    public String toString() {
        return "Employee [empId=" + empId + ", empName=" + empName + ", empAge=" + empAge + ", empSalary=" + empSalary + "]";
    }

}
