package _11_dsa_stack_queue.Exercise._optional._chuyen_doi_thap_phan_sang_nhi_phan;

import java.util.Scanner;

public class StackClient {
    public static void main(String[] args) throws Exception {
        System.out.println("Nhập vào một số hệ thập phân: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int count = 0;
        int temp = number;
        while (temp > 0) {
            count++;
            temp /= 2;
        }

        Stack stack = new Stack(count);
        System.out.print(number + " trong hệ nhị phân = ");
        while (number > 0) {
            temp = number % 2;
            stack.push(temp);
            number /= 2;
        }

        while (!stack.isEmpty()) {
            System.out.printf(" %d", stack.pop());
        }
    }
}
