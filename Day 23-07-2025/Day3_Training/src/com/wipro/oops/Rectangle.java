package com.wipro.oops;

public class Rectangle extends Shape {

    public Rectangle(String color, boolean filled) {
        super(color, filled);
    }

    @Override
    public String toString() {
        return "Rectangle -> " + super.toString();
    }
}
