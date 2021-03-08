package _15_debug_exception._exercise;

import java.util.Scanner;

public class TestException {
    static void validate(int side1, int side2, int side3) throws IllegalTriangleException {
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            throw new IllegalTriangleException("Cạnh tam giác phải là số dương");
        } else if (side1 + side2 < side3 || side1 + side3 < side2 || side2 + side3 < side1) {
            throw new IllegalTriangleException("Các cạnh không thỏa mãn bất đẳng thức tam giác");
        } else {
            System.out.println("Tam giác hợp lệ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Nhập cạnh thứ nhất = ");
                String side1 = scanner.nextLine();
                System.out.println("Nhập cạnh thứ hai = ");
                String side2 = scanner.nextLine();
                System.out.println("Nhập cạnh thứ ba = ");
                String side3 = scanner.nextLine();
                validate(Integer.parseInt(side1), Integer.parseInt(side2), Integer.parseInt(side3));
                break;
            } catch (IllegalTriangleException e) {
                System.out.println("Tam giác không hợp lệ, " + e.getMessage());
            }
        }
    }
}
