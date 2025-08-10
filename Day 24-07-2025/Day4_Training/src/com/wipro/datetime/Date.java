package com.wipro.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Date {
public static void main(String[] args) {
		
		LocalDate date = LocalDate.of(2023, Month.NOVEMBER, 1);
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		System.out.println(" Date: " + date.format(dateFormatter));
		
		
	}

}
