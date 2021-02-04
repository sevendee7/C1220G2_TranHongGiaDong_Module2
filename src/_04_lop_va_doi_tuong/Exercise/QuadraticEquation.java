package _04_lop_va_doi_tuong.Exercise;

import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    public double getDiscriminant() {
        double delta = Math.pow(getB(),2) - 4 * getA() * getC();
        return delta;
    }

    public double getRoot1() {
        double r1 = (-getB() + (Math.sqrt(getDiscriminant()))) / 2 * getA();
        return r1;
    }

    public double getRoot2() {
        double r2 = (-getB() - (Math.sqrt(getDiscriminant()))) / 2 * getA();
        return r2;
    }

    public void getResult() {
        if (getDiscriminant() > 0) {
            System.out.println("The equation has two roots " + getRoot1() + " and " + getRoot2());
        }   else if (getDiscriminant() == 0) {
            System.out.println("The equation has one root " + getRoot1());
        }   else {
            System.out.println("The equation has no real roots");
        }
    }

    public static void main(String[] args) {
        double a;
        double b;
        double c;
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập a = ");
        a = input.nextDouble();
        System.out.print("\nNhập b = ");
        b = input.nextDouble();
        System.out.print("\nNhập c = ");
        c = input.nextDouble();
        QuadraticEquation example = new QuadraticEquation(a,b,c);
        example.getResult();
    }
}
