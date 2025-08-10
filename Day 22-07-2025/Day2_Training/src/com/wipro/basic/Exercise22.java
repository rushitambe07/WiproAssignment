package com.wipro.basic;

public class Exercise22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str = "Anagram phrase formed rearranging letters different phrase";
	        String[] words = str.split(" ");

	        String shortWord = words[0];

	        for (String w : words) {
	            if (w.length() < shortWord.length()) {
	                shortWord = w;
	            }
	        }

	        System.out.println("Shortest word: " + shortWord);

	}

}
