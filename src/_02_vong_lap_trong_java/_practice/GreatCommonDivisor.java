package _02_vong_lap_trong_java.Practice;

import java.util.Scanner;

public class GreatCommonDivisor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number = ");
        int first = input.nextInt();
        System.out.println("Enter the second number = ");
        int second = input.nextInt();

        if (first == 0 || second == 0) {
            System.out.println("No common divisor");
        }   else {
            while (first != second) {
                if (first > second) {
                    first -= second;
                } else {
                    second -= first;
                }
            }
            System.out.println("Greatest common divisor = " + first);
        }
    }
}
