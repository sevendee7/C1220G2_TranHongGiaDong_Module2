package _13_search_algorithm._optional;

import java.util.LinkedList;
import java.util.Scanner;

public class FindMaximumContinuousString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String string = input.next();
        LinkedList<Character> max = new LinkedList<>();

        for (int i = 0; i < string.length(); i++) {
            LinkedList<Character> list = new LinkedList<>();
            list.add(string.charAt(i));
            for (int j = i + 1; j < string.length(); j++) {
                if (string.charAt(j) >= list.getLast()) {
                    list.add(string.charAt(j));
                } else {
                    if (max.size() < list.size())
                        max.clear();
                        max.addAll(list);
                        list.clear();
                        list.add(string.charAt(j));
                }
            }
            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
            list.clear();
            break;
        }

        for (Character newString : max) {
            System.out.print(newString);
        }
    }
}

