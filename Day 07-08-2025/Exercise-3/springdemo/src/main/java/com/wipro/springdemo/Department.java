package com.wipro.springdemo;



public class Department {
     String deptCode;
     String departmentName;

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public String toString() {
        return "Department [deptCode=" + deptCode + ", departmentName=" + departmentName + "]";
    }
}

