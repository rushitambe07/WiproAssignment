package com.wipro.basic;

public class Exercise17 {

    public static void main(String[] args) {
        // Print all months using the built-in values() method
        for (Month m : Month.values()) {
            System.out.println(m);
        }

        // Create a variable and assign FEB
        Month month = Month.FEB;

        // Check if the month is FEB
        if (month == Month.FEB) {
            System.out.println("It is February.");
        }
    }

}
