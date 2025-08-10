package com.wipro.genric;

import java.util.ArrayList;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> num = new ArrayList();

        num.add(10);
        num.add(20);
        num.add(30);
        num.add(40);
        num.add(50);

        System.out.println("List: " + num);

        num.remove(2);
        num.add(60);

        System.out.println("Updated List: " + num);
	}

}
