package _02_vong_lap_trong_java.Practice;

import java.util.Scanner;

public class MoneyInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter investment amount: ");
        double money = sc.nextDouble();
        System.out.println("Enter number of month: ");
        double month = sc.nextDouble();
        System.out.println("Enter annual interest rate in percentage: ");
        double interest_rate = sc.nextDouble();
        double total_interest = 1;

        for (int i = 0; i < month; i++) {
            total_interest += money * (interest_rate/100/12) * month;
        }

        System.out.println("Total of interest = " + total_interest);
    }
}
