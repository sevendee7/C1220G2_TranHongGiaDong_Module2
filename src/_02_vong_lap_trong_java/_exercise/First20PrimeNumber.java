package _02_vong_lap_trong_java.Exercise;

public class First20PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Số nguyên tố thứ 1 = 2");
        byte count = 1;
        int number = 3;
        while (count < 20) {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check) {
                count++;
                System.out.println("Số nguyên tố thứ " + count + " = " + number);
            }
            number++;
        }
    }
}
