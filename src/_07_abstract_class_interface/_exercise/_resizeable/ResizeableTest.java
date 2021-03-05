package Exercises._resizeable;

import Exercises.Circle;
import Exercises.Rectangle;
import Exercises.Shape;
import Exercises.Square;

public class ResizeableTest {
    public static void main(String[] args) {
        Shape[] example = new Shape[3];
        example[0] = new Circle(3.5);
        example[1] = new Rectangle(4.5,5.2);
        example[2] = new Square(7.7);

        System.out.println("Before size:");
        System.out.println("Area of circle = " + example[0].getArea());
        System.out.println("Area of rectangle = " + example[1].getArea());
        System.out.println("Area of square = " + example[2].getArea());

        System.out.println("After size:");
        System.out.print("Area of circle = " );
        example[0].resize(Math.random() * 100);
        System.out.print("Area of rectangle = ");
        example[1].resize(Math.random() * 100);
        System.out.print("Area of square = ");
        example[2].resize(Math.random() * 100);
    }
}
