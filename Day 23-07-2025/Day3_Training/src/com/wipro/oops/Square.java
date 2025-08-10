package com.wipro.oops;

public class Square extends Shape {

    public Square(String color, boolean filled) {
        super(color, filled);
    }

    @Override
    public String toString() {
        return "Square -> " + super.toString();
    }
}
