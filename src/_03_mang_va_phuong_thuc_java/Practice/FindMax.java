package _03_mang_va_phuong_thuc_java.Practice;

import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        byte size;
        int[] array;
        do {
            System.out.println("Enter the size of list: ");
            size = input.nextByte();
            if (size > 20) {
                System.out.println("Size need to be less than 20");
            }
        }   while (size > 20);

        array = new int[size];
        int index = 0;
        int max = array[0];
        for (byte i = 0; i < size; i++) {
            System.out.println("Enter element " + (i + 1) + " : ");
            array[i] = input.nextInt();
            if (max < array[i]) {
                max = array[i];
                index = i + 1;
            }
        }
        System.out.println("The greatest value is " + max + " at position " + index);
    }
}
