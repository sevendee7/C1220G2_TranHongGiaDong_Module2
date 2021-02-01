package _01_introduction_to_java.Exercise;

import java.util.Scanner;

public class ReadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number = ");
        int number = sc.nextInt();
        int ones = number % 10;
        int seconds = (number / 10) % 10;
        int thirds = (number / 100) % 10;

        String first = "";
        String second = "";
        String third = "";
        if (number > 999 || number < 0) {
            System.out.println("Out of ability");
        } else if (seconds == 1) {
            switch (ones + 10) {
                case 10:
                    second = "ten";
                    break;
                case 11:
                    second = "eleven";
                    break;
                case 12:
                    second = "twelve";
                    break;
                case 13:
                    second = "thirteen";
                    break;
                case 14:
                    second = "fourteen";
                    break;
                case 15:
                    second = "fifteen";
                    break;
                case 16:
                    second = "sixteen";
                    break;
                case 17:
                    second = "seventeen";
                    break;
                case 18:
                    second = "eighteen";
                    break;
                case 19:
                    second = "nineteen";
                    break;
            }
        } if (number == 0) {
            System.out.println("zero");
        } else {
            switch (ones) {
                case 1:
                    first = "one";
                    break;
                case 2:
                    first = "two";
                    break;
                case 3:
                    first = "three";
                    break;
                case 4:
                    first = "four";
                    break;
                case 5:
                    first = "five";
                    break;
                case 6:
                    first = "six";
                    break;
                case 7:
                    first = "seven";
                    break;
                case 8:
                    first = "eight";
                    break;
                case 9:
                    first = "nine";
                    break;
            }
            switch (seconds) {
                case 2:
                    second = "twenty ";
                    break;
                case 3:
                    second = "thirty ";
                    break;
                case 4:
                    second = "fourty ";
                    break;
                case 5:
                    second = "fifty ";
                    break;
                case 6:
                    second = "sixty ";
                    break;
                case 7:
                    second = "seventy ";
                    break;
                case 8:
                    second = "eighty ";
                    break;
                case 9:
                    second = "ninety ";
                    break;
            }
            switch (thirds) {
                case 1:
                    third = "one hundred and ";
                    break;
                case 2:
                    third = "two hundred and ";
                    break;
                case 3:
                    third = "three hundred and ";
                    break;
                case 4:
                    third = "four hundred and ";
                    break;
                case 5:
                    third = "five hundred and ";
                    break;
                case 6:
                    third = "six hundred and ";
                    break;
                case 7:
                    third = "seven hundred and ";
                    break;
                case 8:
                    third = "eight hundred and ";
                    break;
                case 9:
                    third = "nine hundred and ";
                    break;
            }
            if (seconds == 1) {
                System.out.println(third + second);
            } else {
                System.out.println(third + second + first);
            }
        }
    }
}

