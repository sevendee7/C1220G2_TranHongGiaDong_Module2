package _14_sort_algorithm._exercise;

public class InsertionSortByStep {
    public static void insertionSort(int array[]) {
        int n = array.length;
        for (int j = 1; j < n; j++) {
            int key = array[j];
            System.out.println("Gán Key cho phần tử thứ " + j + " của mảng = " + array[j]);
            int i = j - 1;
            while ((i > -1) && (array[i] > key)) {
                System.out.println("So sánh key = " + key + " với giá trị hiện tại của i = " + i + "" +
                        " sau đó đổi chỗ phần từ " + array[i + 1] + " với phẩn tử " + array[i]);
                array[i + 1] = array[i];
                i--;
            }
            array[i + 1] = key;
            System.out.println("Mảng hiện tại:");
            for (int k : array) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {9, 14, 3, 2, 43, 11, 58, 22};
        System.out.println("Before Insertion Sort");
        for (int i : arr1) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("-----------------------");

        insertionSort(arr1);//sorting array using insertion sort

        System.out.println("----------------------");
        System.out.println("After Insertion Sort");
        for (int i : arr1) {
            System.out.print(i + " ");
        }
    }
}


