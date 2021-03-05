package _03_mang_va_phuong_thuc_java.Exercise;

import java.util.Scanner;

public class InsertElementToArray {
    static int insert;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        int array [] = {1, 3, 5 ,2 ,4 ,6 ,0 ,0 ,0 ,0};
        System.out.println("Enter number you want to insert: ");
         insert = sc.nextInt();
        System.out.println("Enter index you want to insert: ");
        byte index = input.nextByte();
        if (index <= 0 || index > array.length - 1) {
            System.out.println("Không thể chèn vào mảng !");
        } else {
            int i = array.length-1;
            while (i > index -1) {
                int temp = array[i];
                array[i] = array[i-1];
                array[i-1] = temp;
                i--;
            }
        }
        array[index-1] = insert;
        for (byte i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
    }
}
