package com.wipro.oops;

public abstract class Animal {
    String name;
    int age;
    String color;

    public Animal(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color=color;
    }

    // Abstract method
    public abstract void sound();
}
