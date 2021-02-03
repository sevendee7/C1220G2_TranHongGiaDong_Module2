package _03_mang_va_phuong_thuc_java.Practice;

import java.util.Scanner;

public class DemSoHocSinh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        byte size;
        do {
            System.out.println("Nhập số lượng học sinh: ");
            size = input.nextByte();
        } while (size < 0 || size >= 30);

        int bangDiem[] = new int[size];
        byte count = 0;
        for (byte i = 0; i < size; i++) {
            System.out.println("Nhập điểm của học sinh thứ " + (i+1) + " = ");
            bangDiem[i] = input.nextInt();
            if (bangDiem[i] >=  5) {
                count++;
            }
        }
        System.out.println("Bảng điểm: ");
        for (byte i = 0; i < size; i++) {
            System.out.print(bangDiem[i] + "\t");
        }
        System.out.println("\nCó " + count + " học sinh thi đỗ !");
    }
}
