package com.wipro.oops;

public class Bird extends Animal{

	public Bird(String name, int age, String color) {
		super(name, age, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println(name + " chiu." +"age : " +age +color+" golden");
		
		
	}
	
	

}
