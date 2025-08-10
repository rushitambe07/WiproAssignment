package com.wipro.genric;

import java.util.Comparator;

public class SortByEmpAge implements Comparator<Employee> {
    public int compare(Employee e1, Employee e2) {
        return Integer.compare(e1.getEmpAge(), e2.getEmpAge());
    }
}
