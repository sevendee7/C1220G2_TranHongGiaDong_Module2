package _03_mang_va_phuong_thuc_java.Exercise;

import java.util.Scanner;

public class DeleleElementFromArray {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.println("Độ dài của mảng : ");
        byte n = nhap.nextByte();
        int[] mang = new int[n];
        for (byte i = 0; i < n; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1) + ": ");
            mang[i] = nhap.nextInt();
        }
        System.out.println("Nhập giá trị cần xóa trong mảng: ");
        int xoa = nhap.nextInt();
        byte index = 0;
        boolean kiemTra = false;
        for (byte i = 0; i < n; i++) {
            if (xoa == mang[i]) {
                kiemTra = true;
                index = i;
                break;
            }
        }
        if (kiemTra) {
            System.out.println("Mảng trước khi xóa !");
            for (byte i = 0; i < n; i++) {
                System.out.print(mang[i] + "   ");
            }
            System.out.println();
            for (byte i = index; i < mang.length-1; i++) {
                int temp = mang[i];
                mang[i] = mang[i+1];
                mang[i+1] = temp;
            }
            mang[mang.length-1] = 0;
            System.out.println("Mảng sau khi xóa !");
            for (byte i = 0; i < n; i++) {
                System.out.print(mang[i] + "   ");
            }
        }   else {
                System.out.println("Không tìm thấy " + xoa + " trong mảng");
        }
    }
}
