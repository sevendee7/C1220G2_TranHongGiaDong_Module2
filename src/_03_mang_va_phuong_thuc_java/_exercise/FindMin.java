package _03_mang_va_phuong_thuc_java.Exercise;

import java.util.Scanner;

public class FindMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nhập độ dài của mảng: ");
        byte size = input.nextByte();
        int array[] = new int[size];
        for (byte i = 0; i < size; i++) {
            System.out.println("Nhập phần tử thứ " + (i+1) + " vào mảng");
            array[i] = input.nextInt();
        }
        int min = array[0];
        for (byte i = 1; i < size; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("SỐ nhỏ nhất trong mảng = " + min);
    }
}
