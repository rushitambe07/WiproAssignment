package com.wipro.basic;

public class Exercise11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {5, 15, 25, 35}; 

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] * 2;
        }

        System.out.println("Doubled values:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

	}

}
