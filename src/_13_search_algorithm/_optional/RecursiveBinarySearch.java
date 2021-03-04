package _13_search_algorithm._optional;

import _13_search_algorithm.Practice.BinarySearch;

public class RecursiveBinarySearch {
    static int binarySearch(int[] array, int left, int right, int x) {
        if (left > right) {
            return -1;
        }
        if (right >= left) {
            int mid = (left + right) / 2;
            if (array[mid] == x) {
                return mid;
            } else if (array[mid] > x) {
                return binarySearch(array, left, (mid - 1), x);
            } else if (array[mid] < x) {
                return binarySearch(array, (mid + 1), right, x);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 10, 40};
        int n = arr.length;
        int x = 10;
        int result = binarySearch(arr, 0, n - 1, x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);
    }
}

