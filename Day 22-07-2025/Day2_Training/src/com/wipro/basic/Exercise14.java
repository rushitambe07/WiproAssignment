package com.wipro.basic;

public class Exercise14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 1, 2, 2, 3, 4, 4, 5};
        int n = arr.length;

        int j = 0;

        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
        }

        System.out.println("Length after removing duplicates: " + (j + 1));

	}

}
