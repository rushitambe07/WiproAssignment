package com.wipro.stream;

import java.util.Arrays;
import java.util.List;

public class StreamAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        int sum = list.stream()
                .reduce(0, (a, b) -> a + b);  

        double average = (double) sum / list.size();  

        System.out.println("Average: " + average);

	}

}
