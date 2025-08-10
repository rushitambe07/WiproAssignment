package com.wipro.oops.test;

import com.wipro.oops.Circle;
import com.wipro.oops.Rectangle;
import com.wipro.oops.Square;

public class ShapeTest {

    public static void main(String[] args) {
        Circle circle = new Circle("Red", true);
        Rectangle rectangle = new Rectangle("Blue", false);
        Square square = new Square("Green", true);

        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(square);
    }
}
