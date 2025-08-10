package com.wipro.test;


public class BoxTest {
    public static void main(String[] args) {
        Box<String> b = new Box();
        b.set("Hello");
        System.out.println("String Box: " + b.get());

        Box<Integer> b1 = new Box();
        b1.set(123);
        System.out.println("Integer Box: " + b1.get());
    }
}