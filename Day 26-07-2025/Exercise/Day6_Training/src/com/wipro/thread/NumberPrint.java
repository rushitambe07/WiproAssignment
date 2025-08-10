package com.wipro.thread;

public class NumberPrint implements Runnable{
	String name;

	public NumberPrint(String name) {
		this.name = name;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 10; i++) {
            System.out.println(name + " - " + i);
            try {
                Thread.sleep(1000); // 1 second delay
            } catch (InterruptedException e) {
//                Thread.currentThread().interrupt(); // Reset the interrupt status
                e.printStackTrace();
            }
        }
		
	}

}
