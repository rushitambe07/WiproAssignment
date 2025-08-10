package com.wipro.basic;

public class Conditional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double number = -0.3; 

        System.out.println("Input value: " + number);

        if (number == 0) {
            System.out.println("Zero");
        } else {
            if (number > 0) {
                System.out.print("Positive");
            } else {
                System.out.print("Negative");
            }

            double absValue = Math.abs(number);

            if (absValue < 1) {
                System.out.println(" small");
            } else if (absValue > 1000000) {
                System.out.println(" large");
            } else {
                System.out.println();
            }
        }
	}

}
