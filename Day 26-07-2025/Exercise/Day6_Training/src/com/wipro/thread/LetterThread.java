package com.wipro.thread;

public class LetterThread extends Thread{

	public void run() {
		for(char  ch='A'; ch<='J';ch++) {
			System.out.println("Character :"+ch);
		}
		try {
            Thread.sleep(1000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
	}
}
