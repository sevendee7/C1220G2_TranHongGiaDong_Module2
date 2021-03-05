package _01_introduction_to_java.Exercise;

import java.util.Scanner;

public class MoneyExchange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double vnd = 23000;
        double usd;

        System.out.println("Nhập số tiền USD = ");
        usd = sc.nextDouble();
        double quyDoi = usd * vnd;
        System.out.println(usd + "$ = " + quyDoi + "VNĐ");
    }
}
