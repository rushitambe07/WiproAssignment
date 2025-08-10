package com.wipro.annonymous;

import java.util.function.Predicate;

public class Palindrome {
	public static void main(String[] args) {
		Predicate<String> isPalindrome = s -> s.equals(new StringBuilder(s).reverse().toString());

        System.out.println(isPalindrome.test("madam"));  
        System.out.println(isPalindrome.test("hello"));  
	}

}
