package _01_introduction_to_java.Practice;

import java.util.Scanner;

public class CheckLeapYear {
    static boolean isLeapYear;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the year: ");
        int year = scanner.nextInt();

        if (year % 400 == 0) {
            isLeapYear = true;
        }   else if (year % 4 == 0) {
            isLeapYear = true;
        }

        if (isLeapYear) {
            System.out.println(year + " is a Leap year");
        }   else {
            System.out.println(year + " is not a Leap year");
        }
    }
}
