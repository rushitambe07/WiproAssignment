package com.wipro.oops;

public class Dog extends Animal{

	public Dog(String name, int age, String color) {
		super(name, age, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println(name + " Barkss." + "age : " +age + color+" Black");
		
		
	}

}
