package com.wipro.basic;

public class Exercise15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2, 7, 11, 15}; 
        int target = 9;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("Pair found at indices: [" + i + ", " + j + "]");
                    return;
                }
            }
        }

        System.out.println("No pair found.");

	}

}
