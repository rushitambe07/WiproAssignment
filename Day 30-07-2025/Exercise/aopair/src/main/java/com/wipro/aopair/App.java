package com.wipro.aopair;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.wipro.aopair.service.AirTravelProcess;
import com.wipro.aopair.exception.NoSeatAvailableException;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.scan("com.wipro.aopair");
        ctx.refresh();

        AirTravelProcess process = ctx.getBean(AirTravelProcess.class);

        try {
            process.checkIn(true);  
            process.collectBoardingPass();
            process.doSecurityCheck();
            process.doBoarding();
        } catch (NoSeatAvailableException ex) {
           
        }
    }
}
