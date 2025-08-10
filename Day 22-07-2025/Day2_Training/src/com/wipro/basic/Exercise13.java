package com.wipro.basic;

public class Exercise13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10, 5, 20, 8, 15};

        int largest = arr[0];
        int secondLargest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;  
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        System.out.println("Second largest number is: " + secondLargest);
	}

}
