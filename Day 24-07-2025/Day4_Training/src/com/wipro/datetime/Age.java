package com.wipro.datetime;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Age {
	public static void main(String[] args) {
        LocalDate birthDate = LocalDate.of(2002, Month.MAY, 21);
        int age = getAge(birthDate);
        System.out.println("Age: " + age + " years");
    }

    public static int getAge(LocalDate dt) {
        LocalDate today = LocalDate.now();

        int age = today.getYear() - dt.getYear();

        if (
            today.getMonthValue() < dt.getMonthValue() ||
            (today.getMonthValue() == dt.getMonthValue() && today.getDayOfMonth() < dt.getDayOfMonth())
        ) {
            age--;
        }

        return age;
    }
}
