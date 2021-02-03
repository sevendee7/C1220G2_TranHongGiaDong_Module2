package _03_mang_va_phuong_thuc_java.Exercise;

import java.util.Scanner;

public class MergeArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập độ dài mảng thứ 1 = ");
        byte size1 = input.nextByte();
        System.out.println("Nhập độ dài mảng thứ 2 = ");
        byte size2 = input.nextByte();

        int array1[] = new int[size1];
            for (byte i = 0; i < size1; i++) {
                System.out.println("Nhập phần tử thứ " + (i+1) + " vào mảng 1");
                array1[i] = input.nextInt();
            }
        int array2[] = new int[size2];
            for (byte i = 0; i < size2; i++) {
                System.out.println("Nhập phần tử thứ " + (i+1) + " vào mảng 2");
                array2[i] = input.nextInt();
            }
        int array3[] = new int[size2+size1];
        for (byte i = 0; i < size1; i++) {
            array3[i] = array1[i];
        }
        for (byte i = 0; i < size2; i++) {
            array3[size1 + i] = array2[i];
        }
        System.out.println("Mảng sau khi gộp: ");
        for (byte i = 0; i < array3.length; i++) {
            System.out.print(array3[i] + "  ");
        }
    }
}
