package com.wipro.exception;

public class NullPointer {
    public static void main(String[] args) {
        String fName = null;

        try {
            String st = fName.toUpperCase();  // This will throw NullPointerException
            System.out.println("Upper case: " + st);
        } catch (NullPointerException e) {
            System.out.println("find NullPointerException fName is null");
        }
    }
}

