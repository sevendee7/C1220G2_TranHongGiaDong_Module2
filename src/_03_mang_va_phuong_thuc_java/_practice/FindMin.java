package _03_mang_va_phuong_thuc_java.Practice;

public class FindMin {
    public static int minValue(int[] array){
        int min = array[0];
        int j = 0;
        for (byte i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array [i];
                j = i;
            }
        }
        return j;
    }
    public static void main(String[] args) {
        int []arr = {4, 12, 7, 8, 1, 6, 9};
        int index = minValue(arr);
        System.out.println("The smallest element in the array is: " + arr[index]);
    }
}
