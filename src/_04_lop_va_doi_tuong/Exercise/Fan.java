package _04_lop_va_doi_tuong.Exercise;

public class Fan {
    static final int SLOW = 1;
    static final int MEDIUM = 2;
    static final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "Blue";

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean getOn() {
        return this.on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public String toResult() {
        return getOn() ? "Fan is on" + "\tSpeed:" + getSpeed() + "\tColor:" + getColor() + "\tRadius:" + getRadius()
                : "Fan is off" + "\tSpeed:" + getSpeed() + "\tColor:" + getColor() + "\tRadius:" + getRadius();
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan(FAST, true, 10, "Yellow");
        Fan fan2 = new Fan(MEDIUM, false, 5, "Blue");
        System.out.println(fan1.toResult() + "\n" + fan2.toResult());
    }
}
