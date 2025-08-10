package com.wipro.annonymous;

public class Main {
	public static void main(String[] args) {
        
        Greet greet = () -> System.out.println("Hello Lambda");

        greet.sayHello();
    }

}
