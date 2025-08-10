package com.wipro.basic;

public class Exercise18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Racecar";
        str = str.toLowerCase();  

        boolean isPalin = true;

        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                isPalin = false;
                break;
            }
        }

        if (isPalin)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

	}

}
