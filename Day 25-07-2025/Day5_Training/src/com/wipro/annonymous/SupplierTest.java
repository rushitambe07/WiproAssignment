package com.wipro.annonymous;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.function.Supplier;

public class SupplierTest {
	public static void main(String[] args) {
        
        Supplier<String> tomorrowDay = () -> {
            DayOfWeek today = LocalDate.now().getDayOfWeek();   
            DayOfWeek tomorrow = today.plus(1);                  
            return tomorrow.toString();                          
        };

       
        System.out.println("Tomorrow is: " + tomorrowDay.get());
    }

}
