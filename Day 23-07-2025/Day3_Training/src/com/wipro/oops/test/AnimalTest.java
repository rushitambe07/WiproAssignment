package com.wipro.oops.test;

import com.wipro.oops.Bird;
import com.wipro.oops.Dog;
import com.wipro.oops.Human;

public class AnimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human human = new Human("Shubham", 25, "Color:");
        Bird bird = new Bird("Sparrow", 2, "Color:");
        Dog dog = new Dog("Pillu", 4,"Color:");

        human.sound();
        bird.sound();
        dog.sound();

	}

}
