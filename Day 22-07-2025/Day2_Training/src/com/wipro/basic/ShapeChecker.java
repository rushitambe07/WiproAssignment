package com.wipro.basic;

public class ShapeChecker {

	public static void main(String[] args) {
		char shape='S';
		
		if (shape == 'R' ) {
            System.out.println("Rectangle");
        } else if (shape == 'C' ) {
            System.out.println("Circle");
        } else if (shape == 'S') {
            System.out.println("Square");
        } else {
            System.out.println("Other");
        }
	}

}
