package com.wipro.oops;

public class Circle extends Shape {

    public Circle(String color, boolean filled) {
        super(color, filled);
    }

    // Optional: You can override toString to specify it's a Circle
    @Override
    public String toString() {
        return "Circle -> " + super.toString();
    }
}
