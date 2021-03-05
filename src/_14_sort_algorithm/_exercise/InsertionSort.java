package _14_sort_algorithm._exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InsertionSort {
    public static void insertionSort(List<Integer> list) {
        int n = list.size();
        for (int j = 1; j < n; j++) {
            int key = list.get(j);
            int i = j - 1;
            while ((i > -1) && (list.get(i) > key)) {
                list.set(i+1,list.get(i));
                i--;
            }
            list.set(i + 1, key);
        }
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list size:");
        int size = scanner.nextInt();
        for (int i = 1; i < size+1; i++) {
            System.out.print("Enter the " + i + " value = ");
            list.add(scanner.nextInt());
        }
        System.out.println("Before Insertion Sort");
        for (int i : list) {
            System.out.print(i + " ");
        }
        System.out.println();

        insertionSort(list);

        System.out.println("----------------------");
        System.out.println("After Insertion Sort");
        for (int i : list) {
            System.out.print(i + " ");
        }
    }
}

