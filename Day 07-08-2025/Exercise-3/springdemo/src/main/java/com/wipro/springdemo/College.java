package com.wipro.springdemo;

public class College {
     String collegeName;
     Department department;

    public College(String collegeName, Department department) {
        this.collegeName = collegeName;
        this.department = department;
    }

    @Override
    public String toString() {
        return "College [collegeName=" + collegeName + ", department=" + department + "]";
    }
}
