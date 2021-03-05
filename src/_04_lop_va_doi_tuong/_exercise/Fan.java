package _04_lop_va_doi_tuong.Exercise;

public class Fan {
    static final int SLOW = 1;
    static final int MEDIUM = 2;
    static final int FAST = 3;
    static final boolean STATUS = true;
    static final double RADIUSDEFAULT = 10;
    static final String COLORDEFAULT = "Blue";
    private int speed;
    private boolean on;
    private double radius;
    private String color;


    public Fan() {
        this.speed = SLOW;
        this.on = STATUS;
        this.radius = RADIUSDEFAULT;
        this.color = COLORDEFAULT;
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
        Fan fan1 = new Fan();
        fan1.setOn(true);
        fan1.setColor("Yellow");
        fan1.setSpeed(FAST);
        fan1.setRadius(7.7);
        Fan fan2 = new Fan();
        fan2.setSpeed(MEDIUM);
        fan2.setColor("Purple");
        System.out.println(fan1.toResult() + "\n" + fan2.toResult());
    }
}
