package com.wipro.oops;

public class Human extends Animal{

	public Human(String name, int age, String color) {
		super(name,age, color);
		// TODO Auto-generated constructor stub
	}
	@Override
    public void sound() {
        System.out.println(name + "  Hello! "+ "age : " +age + color+" White");
    }

}
