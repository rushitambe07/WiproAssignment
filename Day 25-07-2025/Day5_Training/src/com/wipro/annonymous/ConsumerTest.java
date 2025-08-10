package com.wipro.annonymous;

import java.util.function.Consumer;

public class ConsumerTest {
	public static void main(String[] args) {
        Consumer<Integer> nextEven = num -> {
            if (num % 2 == 0)
                System.out.println(num + 2);
            else
                System.out.println(num + 1);
        };

        nextEven.accept(5);    
        nextEven.accept(100); 
        
	}

}
