package _02_vong_lap_trong_java.Exercise;

import java.util.Scanner;

public class ShapeDraw {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner type = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Draw the square triangle");
        System.out.println("2. Draw the rectangle");
        System.out.println("3. Draw isosceles triangle");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");

        byte choice;
        do {
            choice = input.nextByte();
            byte triangleType;
            switch (choice) {
                case 1:
                    System.out.println("Square Triangle Type:");
                    System.out.println("1. Top left");
                    System.out.println("2. Top right");
                    System.out.println("3. Bottom left");
                    System.out.println("4. Bottom right");
                    System.out.println("0. Back to menu");
                    System.out.println("Enter your choice: ");
                    triangleType = type.nextByte();
                    switch (triangleType) {
                        case 1:
                            for (byte i = 0; i < 5; i++) {
                                for (byte j = 1; j <= 5 - i; j++) {
                                    System.out.print(" * ");
                                }
                                System.out.println();
                            }
                            System.out.println("Menu");
                            System.out.println("1. Draw the square triangle");
                            System.out.println("2. Draw the rectangle");
                            System.out.println("3. Draw isosceles triangle");
                            System.out.println("0. Exit");
                            System.out.println("Enter your choice: ");
                            break;
                        case 2:
                            for (byte i = 0; i < 5; i++) {
                                for (byte k = 0; k < i; k++) {
                                    System.out.print("   ");
                                }
                                for (byte j = 1; j <= 5 - i; j++) {
                                    System.out.print(" * ");
                                }
                                System.out.println();
                            }
                            System.out.println("Press 0 to exit !");
                            break;
                        case 3:
                            for (byte i = 4; i >= 0; i--) {
                                for (byte j = 1; j <= 5 - i; j++) {
                                    System.out.print(" * ");
                                }
                                for (byte k = 0; k < i; k++) {
                                    System.out.print("   ");
                                }
                                System.out.println();
                            }
                            System.out.println("Menu");
                            System.out.println("1. Draw the square triangle");
                            System.out.println("2. Draw the rectangle");
                            System.out.println("3. Draw isosceles triangle");
                            System.out.println("0. Exit");
                            System.out.println("Enter your choice: ");
                            break;
                        case 4:
                            for (byte i = 4; i >= 0; i--) {
                                for (byte k = 0; k < i; k++) {
                                    System.out.print("   ");
                                }
                                for (byte j = 1; j <= 5 - i; j++) {
                                    System.out.print(" * ");
                                }
                                System.out.println();
                            }
                            System.out.println("Menu");
                            System.out.println("1. Draw the square triangle");
                            System.out.println("2. Draw the rectangle");
                            System.out.println("3. Draw isosceles triangle");
                            System.out.println("0. Exit");
                            System.out.println("Enter your choice: ");
                            break;
                        case 0:
                            System.out.println("1. Top left");
                            System.out.println("2. Top right");
                            System.out.println("3. Bottom left");
                            System.out.println("4. Bottom right");
                            System.out.println("0. Exit");
                            System.out.println("Enter your choice: ");
                            break;
                    }
                    break;
                case 2:
                    for (byte i = 0; i < 4; i++) {
                        for (byte j = 1; j <= 7; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println();
                    }
                    System.out.println("Menu");
                    System.out.println("1. Draw the square triangle");
                    System.out.println("2. Draw the rectangle");
                    System.out.println("3. Draw isosceles triangle");
                    System.out.println("0. Exit");
                    System.out.println("Enter your choice: ");
                    break;
                case 3:
                    for (byte i = 0; i < 4; i++) {
                        for (byte j = 1; j <= 3 - i; j++) {
                            System.out.print("   ");
                        }
                        for (byte k = 0; k < i * 2 + 1; k++) {
                            System.out.print(" * ");
                        }
                        for (byte j = 1; j <= 3 - i; j++) {
                            System.out.print("   ");
                        }
                        System.out.println();
                    }
                    System.out.println("Menu");
                    System.out.println("1. Draw the square triangle");
                    System.out.println("2. Draw the rectangle");
                    System.out.println("3. Draw isosceles triangle");
                    System.out.println("0. Exit");
                    System.out.println("Enter your choice: ");
                    break;
            }
        }   while (choice != 0);
    }
}
