package com.wipro.exception;

public class CurrencyConverter {
    public static int changeCurrency(int number) throws NumberFormatException {
        if (number == 0)
            throw new NumberFormatException("Invalid Number");
        return number * 80;
    }

    public static void main(String[] args) {
        try {
            int result = changeCurrency(0); // try 5 instead of 0 for success
            System.out.println("Converted: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

