package _03_mang_va_phuong_thuc_java.Exercise;

import java.util.Scanner;

public class DemSoLanXuatHien {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào một chuỗi ký tự: ");
        String string = input.nextLine();
        System.out.println("Nhập vào ký tự cần kiểm tra: ");
        char character = input.nextLine().charAt(0);
        byte count = 0;
        for (byte i = 0; i < string.length(); i++) {
            if (character == string.charAt(i)) {
                count++;
            }
        }
        System.out.println("Trong mảng " + string + " \nKý tự " + character + " xuất hiện " + count + " lần!");
    }
}
