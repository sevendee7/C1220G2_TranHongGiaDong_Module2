package _05_access_modifier_static_method_static_property.Exercise;

public class Circle {
    private static final double RADIUSCONST = 1.0;
    private static final String COLORCONST = "red";
    private double radius;
    private String color;

    public Circle() {
        this.radius = RADIUSCONST;
        this.color = COLORCONST;
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
}
