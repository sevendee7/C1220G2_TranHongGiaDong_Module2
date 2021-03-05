package _14_sort_algorithm._optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BubbleSort {
    public static void bubbleSort(List<Integer> list) {
        boolean needNextPass = true;
        for (int k = 1; k < list.size() && needNextPass; k++) {
            needNextPass = false;
            for (int i = 0; i < list.size() - k; i++) {
                if (list.get(i) > list.get(i + 1)) {
                    int temp = list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, temp);

                    needNextPass = true;
                }
            }
            if (needNextPass == false) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list size:");
        int size = scanner.nextInt();
        for (int i = 1; i < size + 1; i++) {
            System.out.print("Enter the " + i + " value = ");
            integerList.add(scanner.nextInt());
        }
        System.out.println("Your input list: ");
        for (int i = 0; i < integerList.size(); i++) {
            System.out.print(integerList.get(i) + "\t");
        }
        System.out.println();
        System.out.println("-------------------");
        bubbleSort(integerList);
        System.out.println("Your list after sorted: ");
        for (int i = 0; i < integerList.size(); i++) {
            System.out.print(integerList.get(i) + "\t");
        }
        System.out.println();
    }
}
