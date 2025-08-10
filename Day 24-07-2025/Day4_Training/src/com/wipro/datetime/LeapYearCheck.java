package com.wipro.datetime;

import java.time.LocalDate;

public class LeapYearCheck {
	public static void main(String[] args) {
        LocalDate date = LocalDate.of(2022, 3, 1); 

        int year = date.getYear();

        if (isLeapYear(year)) {
            System.out.println(year + " is  Leap Year.");
        } else {
            System.out.println(year + " is not  Leap Year.");
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

}
