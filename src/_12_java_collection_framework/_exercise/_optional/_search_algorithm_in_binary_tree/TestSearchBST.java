package _12_java_collection_framework.Exercice._optional._search_algorithm_in_binary_tree;

import java.util.Scanner;

public class TestSearchBST {
    public static void main(String[] args) {
        BST<String> tree = new BST<>();
        tree.insert("A");
        tree.insert("B");
        tree.insert("C");
        tree.insert("D");
        tree.insert("E");
        tree.insert("F");
        tree.insert("G");
        System.out.println("Enter element to search: ");
        Scanner scan = new Scanner(System.in);
        String element = scan.next();
        tree.search(element);
    }
}
