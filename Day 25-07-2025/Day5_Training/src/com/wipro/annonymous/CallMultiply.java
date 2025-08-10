package com.wipro.annonymous;

public class CallMultiply {
	public static void main(String[] args) {
		
        Multiply mul = (a, b) -> a * b;

        int res = mul.multiply(5, 4);

        System.out.println("Result: " + res);
    }

}
