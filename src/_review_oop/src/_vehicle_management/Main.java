package _review_oop.src._vehicle_management;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("001", 75, 3000);
        VehicleManager vehicleManager = new VehicleManager(new ArrayList<>());
        vehicleManager.addNewVehicle(vehicle);
        Scanner scanner = new Scanner(System.in);

        Byte choose;
        do {
            System.out.println("Main Menu" +
                    "\n 1. Add new vehicle" +
                    "\n 2. Show tax declaration of vehicle" +
                    "\n 3. Exit" +
                    "\nEnter your choice:  ");
            choose = scanner.nextByte();
            String quit;
            switch (choose) {
                case 1:
                    vehicleManager.addNewVehicle();
                    break;
                case 2:
                    vehicleManager.showTaxDeclaration(vehicleManager.vehicleList);
                    break;
                case 3:
                    break;
            }
        } while (choose != 3);
    }
}

