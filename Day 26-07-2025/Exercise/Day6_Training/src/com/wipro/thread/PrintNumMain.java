package com.wipro.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PrintNumMain {
	public static void main(String args[]) {
		ExecutorService ex = Executors.newFixedThreadPool(5);
		
		for(int i=1; i<=5; i++) {
			ex.submit(new NumberPrint("Task"+i));
		}
		ex.shutdown();
	}

}
