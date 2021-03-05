package _10_dsa_danh_sach.Exercie._deploy_linked_list_methods;

import java.util.Arrays;
import java.util.LinkedList;

public class MyLinkedList<E> {
    private Node head;
    private int numNodes;

    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    public MyLinkedList() {}

    public MyLinkedList(Object data) {
        head = new Node(data);
    }

    public void add(int index, E element) {
        Node temp = head;
        Node holder;

        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(element);
        temp.next.next = holder;
        numNodes++;
    }

    public void addFirst(E e) {
        Node temp = head;
        head = new Node(e);
        head.next = temp;
        numNodes++;
    }

    public void addLast(E e) {
        Node node = new Node(e);

        if (head == null) {
            head = node;
            numNodes++;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
        numNodes++;
    }

    public E remove(int index) {
        Node temp = head;

        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        numNodes--;
        return (E) temp;
    }

    public int size() {
        return numNodes;
    }

    public E getFirst() {
        if (head == null) {
            return null;
        }
        return (E) head.data;
    }

    public E getLast() {
        if (head == null) {
            return null;
        }

        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        return (E) temp.next.data;
    }

    public void printList() {
        Node temp = head;

        System.out.print("[ ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("] ");
    }
}
