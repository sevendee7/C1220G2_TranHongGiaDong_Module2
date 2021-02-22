package _06_ke_thua.Exercise._circle_and_cylinder;

public class Cylinder extends Circle {
    private static final double PI = 3.14;
    private double height = 2.0;

    public Cylinder() {}

    public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return getArea() * height;
    }

    @Override
    public String toString() {
        return "A cylinder is a sub class of "
                + super.toString()
                + "\nVolume = Area * Height = " + getArea() + " * " + getHeight() + " = " + getVolume();
    }
}
