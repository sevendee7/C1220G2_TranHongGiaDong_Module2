package _01_introduction_to_java.Practice;

import java.util.Scanner;

public class CountDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Which month you want to know ? ");
        byte month = scanner.nextByte();

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("The month " + month + " has 31 days !");
                break;
            case 2:
                System.out.println("The month 2 has 28 or 29 days !");
                break;
            default:
                System.out.println(month + " has 30 days");
        }
    }
}
