package _03_mang_va_phuong_thuc_java.Practice;

import java.util.Scanner;

public class FindName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] students = {"Alex", "Bella", "Cindy", "David", "Elena", "Frank"};
        System.out.println("Enter a student's name: ");
        String name = input.nextLine();
        boolean isExist = false;
        for (byte i = 0; i < students.length; i++) {
            if (students[i].equals(name)) {
                System.out.println("Position of " + name + " in the list is: " + (i +1));
                isExist = true;
            }
        }
        if (!isExist) {
            System.out.println("Not found " + name + " in the list");
        }
    }
}
