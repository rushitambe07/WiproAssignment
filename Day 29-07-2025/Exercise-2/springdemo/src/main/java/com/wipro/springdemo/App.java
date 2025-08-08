package com.wipro.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//        Department dept = (Department) context.getBean("deptBean");
//        dept.setDeptCode("FIN");
//        dept.setDepartmentName("Finance");
//        System.out.println(dept);  
    	
    	
    	
    	College college = (College) context.getBean("collegeBean");
        System.out.println(college);
        }
}
