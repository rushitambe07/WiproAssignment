package com.wipro.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterNames {
	public static void main(String[] args) {
        List<String> names = Arrays.asList("Jayanta", "Jnanedra");

        List<String> result = names.stream()
                .filter(name -> name.toLowerCase().contains("ja"))
                .collect(Collectors.toList());

        System.out.println(result); 
	}

}
