package _05_access_modifier_static_method_static_property.Exercise;

public class Circle {
    private static final double RADIUS_CONST = 1.0;
    private static final String COLOR_CONST = "red";
    private static final double PI = 3.14;
    private double radius;
    private String color;

    public Circle() {
        this.radius = RADIUS_CONST;
        this.color = COLOR_CONST;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return radius * radius * PI;
    }

    public static void main(String[] args) {
        Circle example = new Circle();
        System.out.println("Radius = " + example.getRadius());
        System.out.println("Color = " + example.getColor());
        System.out.println("Area = " + example.getArea());
    }
}
