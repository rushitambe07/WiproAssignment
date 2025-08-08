package com.wipro.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.wipro.springdemo.bean.Mobile;


public class App1 {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.scan("com.wipro.springdemo.bean"); 
        ctx.refresh();

        Mobile mobile = ctx.getBean(Mobile.class);
        System.out.println(mobile);

        ctx.close();
    }
}
