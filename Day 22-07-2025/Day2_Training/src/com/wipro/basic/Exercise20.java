package com.wipro.basic;
import java.util.*;

public class Exercise20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "earth";
        String b = "heart";

        char[] arr1 = a.toCharArray();
        char[] arr2 = b.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1, arr2))
            System.out.println("Anagrams");
        else
            System.out.println("Not Anagrams");

	}

}
