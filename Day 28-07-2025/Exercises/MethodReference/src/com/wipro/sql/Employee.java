package com.wipro.sql;

public class Employee {
    private String name;
    private int age;
    private double salary;

    // Constructor
    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // Getters
    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }
}
