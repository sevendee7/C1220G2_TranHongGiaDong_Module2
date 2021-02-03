package _03_mang_va_phuong_thuc_java.Exercise;

import java.util.Scanner;

public class TimSoLonNhatMang2Chieu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số hàng = ");
        byte row = input.nextByte();
        System.out.println("Nhập số cột = ");
        byte column = input.nextByte();
        int array[][] = new int[row][column];
        for (byte i = 0; i < row; i++) {
            for (byte j = 0; j < array[i].length; j++) {
                System.out.println("Nhập giá trị cho hàng " + (i+1) + " cột thứ " + (j+1) + " = ");
                array[i][j] = input.nextInt();
            }
        }
        int max = array[0][0];
        for (byte i = 0; i < row; i++) {
            for (byte j = 0; j < array[i].length; j++) {
                if (max < array[i][j]) {
                    max = array[i][j];
                }
            }
        }
        System.out.println("Mảng nhập vào:");
        for (byte i = 0; i < row; i++) {
            for (byte j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println("Số lớn nhất là = " + max);
    }
}
