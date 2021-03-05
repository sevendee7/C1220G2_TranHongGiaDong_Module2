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
        boolean timThay = false;
        for (byte i = 0; i < n; i++) {
            if (xoa == mang[i]) {
                timThay = true;
            }
        }
        if (timThay) {
            System.out.println("Mảng trước khi xóa !");
            for (byte j = 0; j < n; j++) {
                System.out.print(mang[j] + "   ");
            }
            byte index = 0;
            boolean kiemTra = false;
            do {
                for (byte k = 0; k < n; k++) {
                    if (xoa == mang[k]) {
                        kiemTra = true;
                        index = k;
                        break;
                    } else {
                        kiemTra = false;
                    }
                }
                if (kiemTra) {
                    for (byte o = index; o < mang.length - 1; o++) {
                        int temp = mang[o];
                        mang[o] = mang[o + 1];
                        mang[o + 1] = temp;
                    }
                    mang[mang.length - 1] = 0;
                }
            } while (kiemTra);
            System.out.println("\nMảng sau khi xóa !");
            for (byte p = 0; p < n; p++) {
                System.out.print(mang[p] + "   ");
            }
        } else {
            System.out.println("Không tìm thấy " + xoa + " trong mảng");
        }
    }
}
