package com.wipro.thread;

public class MainTest {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		Counter counter = new Counter();

        MyThread t1 = new MyThread(counter);
        MyThread t2 = new MyThread(counter);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("count: " + counter.getCount());

	}

}
