package com.wipro.genric;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);

        System.out.println("Original List: " + numbers);

        Set<Integer> set = new HashSet<>(numbers);
        System.out.println("List without duplicates: " + set);

	}

}
