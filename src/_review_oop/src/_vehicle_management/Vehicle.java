package _review_oop.src._vehicle_management;

public class Vehicle {
    private String registrationNumber;
    private int cylinderCapacity;
    private double price;
    private double taxDeclaration;

    public Vehicle(String registrationNumber, int cylinderCapacity, double price) {
        this.registrationNumber = registrationNumber;
        this.cylinderCapacity = cylinderCapacity;
        this.price = price;
        if (cylinderCapacity < 100) {
            this.taxDeclaration = price * 1 / 100;
        } else if (cylinderCapacity >= 100 && cylinderCapacity < 200) {
            this.taxDeclaration = price * 3 / 100;
        } else {
            this.taxDeclaration = price * 5 / 100;
        }
    }

    public int getCylinderCapacity() {
        return this.cylinderCapacity;
    }

    public void setCylinderCapacity(int cylinderCapacity) {
        this.cylinderCapacity = cylinderCapacity;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        return "Vehicle{registrationNumber= " + this.registrationNumber +
                ", cylinderCapacity= " + this.cylinderCapacity +
                ", price= " + this.price +
                ", tax= " + this.taxDeclaration + "}";
    }
}
