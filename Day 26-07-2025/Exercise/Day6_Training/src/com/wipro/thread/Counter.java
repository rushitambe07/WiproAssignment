package com.wipro.thread;

public class Counter {
	int count = 0;
	
	public synchronized void increment() {
        count++;
    }
	public int getCount() {
		// TODO Auto-generated method stub
		return count;
	}

}
