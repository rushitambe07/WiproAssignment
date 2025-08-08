package com.wipro.aopair.service;

import org.aspectj.lang.JoinPoint;
import org.springframework.stereotype.Component;
import com.wipro.aopair.exception.NoSeatAvailableException;

@Component
public class AirTravelProcess {

    public void checkIn(Boolean flag) throws NoSeatAvailableException {

        if (!flag) {
            throw new NoSeatAvailableException("No seats available!");
        }
        System.out.println("Check-in successful.");
    }
   

    public void collectBoardingPass() {
        System.out.println("Show Boarding Pass");

        System.out.println("Boarding pass collected.");
    }

    public void doSecurityCheck() {
        System.out.println("Security check completed.");
    }

    public void doBoarding() {
        System.out.println("Boarding done.");
    }
}
