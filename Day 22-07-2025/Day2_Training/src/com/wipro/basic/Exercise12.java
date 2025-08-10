package com.wipro.basic;

public class Exercise12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {100, 67, 98, 678, 45, 123};
        int largest = numbers[0];  

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];  
            }
        }

        System.out.println("Largest number is: " + largest);

	}

}
