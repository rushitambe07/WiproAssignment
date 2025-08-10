package com.wipro.basic;

public class Exercise7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float num1 = 25.586f;
        float num2 = 25.589f;

        long number1 = Math.round(num1 * 1000);
        long number2 = Math.round(num2 * 1000);

        if (number1 == number2) {
            System.out.println("They are same up to 3 decimal places.");
        } else {
            System.out.println("They are different.");
        }
	}

}
