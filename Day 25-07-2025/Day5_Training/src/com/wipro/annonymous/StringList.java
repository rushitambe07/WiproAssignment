package com.wipro.annonymous;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<List<String>, List<Integer>> f = list -> {
            List<Integer> num = new ArrayList<>();
            for (String s : list) {
                num.add(s.length());
            }
            return num;
        };

        List<String> list = Arrays.asList("Jayanta", "Amit", "Vasu");
        System.out.println(f.apply(list));  

	}

}
