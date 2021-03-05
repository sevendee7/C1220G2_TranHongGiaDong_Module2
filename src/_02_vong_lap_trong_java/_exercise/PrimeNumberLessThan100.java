package _02_vong_lap_trong_java.Exercise;

public class PrimeNumberLessThan100 {
    public static void main(String[] args) {
        System.out.println("Số nguyên tố nhỏ hơn 100: ");
        System.out.print(" 2");
        int number = 3;
        while (number <= 100) {
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
                System.out.print("   " + number);
            }
            number++;
        }
    }
}
