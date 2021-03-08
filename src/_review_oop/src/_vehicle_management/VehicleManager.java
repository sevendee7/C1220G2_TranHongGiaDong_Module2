package _review_oop.src._vehicle_management;

import java.util.List;
import java.util.Scanner;

public class VehicleManager {
    Scanner scanner = new Scanner(System.in);
    List<Vehicle> vehicleList;

    public VehicleManager(List<Vehicle> vehicleList) {
        this.vehicleList = vehicleList;
    }

    public List<Vehicle> getVehicleList() {
        return vehicleList;
    }

    public void setVehicleList(List<Vehicle> vehicleList) {
        this.vehicleList = vehicleList;
    }

    public List<Vehicle> addNewVehicle() {
        System.out.println("Enter registration number: ");
        String registrationNumber = scanner.next();
        System.out.println("Enter cylinder capacity of vehicle: ");
        int cylinderCapacity = scanner.nextInt();
        System.out.println("Enter vehicle's price: ");
        double vehiclePrice = scanner.nextDouble();
        Vehicle vehicle = new Vehicle(registrationNumber, cylinderCapacity, vehiclePrice);
        vehicleList.add(vehicle);
        return vehicleList;
    }

    public void addNewVehicle(Vehicle vehicle) {
        this.vehicleList.add(vehicle);
    }

    public void showTaxDeclaration(List<Vehicle> vehicleList) {
        for (int i = 0; i < vehicleList.size(); i++) {
            System.out.println(vehicleList.get(i));
        }
    }

    @Override
    public String toString() {
        return "VehicleManager{" +
                ", vehicleList=" + vehicleList +
                '}';
    }
}
