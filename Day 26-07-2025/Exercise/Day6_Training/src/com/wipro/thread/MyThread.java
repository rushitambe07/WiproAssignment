package com.wipro.thread;

public class MyThread extends Thread{
	Counter counter;
	
	MyThread(Counter counter) {
        this.counter = counter;
    }
	
	public void run() {
        for (int i = 0; i < 10; i++) {
            counter.increment();  
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
	}

}
