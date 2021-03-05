package Exercises._colorable;

import Exercises.Circle;
import Exercises.Rectangle;
import Exercises.Shape;
import Exercises.Square;

public class ColorableTest {
    public static void main(String[] args) {
        Shape[] example = new Shape[3];
        example[0] = new Circle(3.57);
        example[1] = new Rectangle(4.52, 3.57);
        example[2] = new Square(5.32);

        for (byte i = 0; i < example.length; i++) {
            System.out.println("Area = " + example[i].getArea());
            if (example[i] instanceof Square) {
                Colorable colorable = (Colorable) example[i];
                colorable.howToColor();
            }
        }
    }
}
