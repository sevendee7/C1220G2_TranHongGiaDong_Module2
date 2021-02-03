package _03_mang_va_phuong_thuc_java.Exercise;

import java.util.Scanner;

public class TinhTongDuongCheo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập kích thước ma trận = ");
        byte size = input.nextByte();
        int array[][] = new int[size][size];
        for (byte i = 0; i < size; i++) {
            for (byte j = 0; j < array[i].length; j++) {
                System.out.println("Nhập giá trị cho hàng " + (i+1) + " cột thứ " + (j+1) + " = ");
                array[i][j] = input.nextInt();
            }
        }
        System.out.println("Mảng nhập vào:");
        for (byte i = 0; i < size; i++) {
            for (byte j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "  ");
            }
            System.out.println();
        }
        int sumCheoTrai = 0;
        int sumCheoPhai = 0;
        for (byte i = 0; i < size; i++) {
            for (byte j = 0; j < size; j++) {
                if (i == j) {
                    sumCheoTrai += array[i][j];
                }
                if ((i + j) == (size - 1)) {
                    sumCheoPhai += array[i][j];
                }
            }
        }
        System.out.print("Tổng các số đường chéo thứ 1 = " + sumCheoTrai + "\n");
        System.out.print("Tổng các số đường chéo thứ 2 = " + sumCheoPhai + "\n");
    }
}
