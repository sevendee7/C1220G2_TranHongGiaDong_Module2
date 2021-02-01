package _01_introduction_to_java.Practice;

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your weight = ");
        float weight = scanner.nextFloat();

        System.out.println("Enter your height = ");
        float height = scanner.nextFloat();

        float bmi = weight / (height*height);

        if (0 < bmi && bmi < 18.5) {
            System.out.println("Underweight !");
        } else if (bmi < 25) {
            System.out.println("Normal !");
        } else if (bmi < 30) {
            System.out.printf("Overweight !");
        } else {
            System.out.println("Obese !");
        }
    }
}
