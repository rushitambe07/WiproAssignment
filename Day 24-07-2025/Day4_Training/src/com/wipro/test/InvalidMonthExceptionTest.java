package com.wipro.test;

import com.wipro.exception.InvalidMonthException;

public class InvalidMonthExceptionTest {

    // Method to check the month
    public static void checkMonth(int month) throws InvalidMonthException {
        if (month < 1 || month > 12) {
            throw new InvalidMonthException("Invalid month: " + month + ". Must be between 1 and 12.");
        } else {
            System.out.println("Valid month: " + month);
        }
    }

    // Main method
    public static void main(String[] args) {
        try {
            checkMonth(5);   // Valid
            checkMonth(15);  // Invalid
        } catch (InvalidMonthException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}