package com.wipro.thread;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberThread n1 = new NumberThread();
		LetterThread n2=new LetterThread();
		
		n1.start();
		n2.start();

	}

}
