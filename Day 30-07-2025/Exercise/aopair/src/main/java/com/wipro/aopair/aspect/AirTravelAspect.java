package com.wipro.aopair.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
import com.wipro.aopair.exception.NoSeatAvailableException;

@Aspect
@Component
public class AirTravelAspect {

    @Before("execution(* com.wipro.aopair.service.AirTravelProcess.checkIn(..))")
    public void showPhotoId(JoinPoint jp) {
        System.out.println("Show Photo ID before Check-In --");
    }

    @Before("execution(* com.wipro.aopair.service.AirTravelProcess.doSecurityCheck..*(..)) ")
    public void showBoardingPass(JoinPoint jp) {
        System.out.println("Show Boarding Pass");
    }

    @AfterThrowing(
        pointcut = "execution(* com.wipro.aopair.service.AirTravelProcess.checkIn(..))",
        throwing = "ex")
    public void handleNoSeatException(JoinPoint jp, NoSeatAvailableException ex) {
        System.out.println("!! Exception occurred: " + ex.getMessage());
    }
}
