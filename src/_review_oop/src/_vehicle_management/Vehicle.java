package _car_management;

public class Vehicle {
    private int cylinderCapacity;
    private double price;

    public Vehicle(int cylinderCapacity, double price) {
        this.cylinderCapacity = cylinderCapacity;
        this.price = price;
    }

    public int getCylinderCapacity() {
        return cylinderCapacity;
    }

    public void setCylinderCapacity(int cylinderCapacity) {
        this.cylinderCapacity = cylinderCapacity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "cylinderCapacity=" + cylinderCapacity +
                ", price=" + price +
                '}';
    }
}
