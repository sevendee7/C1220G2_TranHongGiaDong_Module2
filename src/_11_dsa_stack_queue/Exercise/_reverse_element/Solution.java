package _11_dsa_stack_queue.Exercise._reverse_element;

public class Solution {
    private static class Node {
        public int data;
        public Node next;
    }

    private static class Queue {
        public Node front;
        public Node rear;
    }

    public static void enQueue(Queue q, int value) {
        Node temp = new Node();
        temp.data = value;
        if (q.front == null) {
            q.front = q.rear = temp;
        } else {
            q.rear.next = temp;
            q.rear = temp;
            q.rear.next = q.front;
        }
    }

    public static int deQueue(Queue q) {
        if (q.front == null) {
            System.out.println("Queue is empty");
            return Integer.MIN_VALUE;
        }
        int value;
        if (q.front == q.rear) {
            value = q.front.data;
            q.front = null;
            q.rear = null;
        } else {
            Node temp = q.front;
            value = temp.data;
            q.front = q.front.next;
            q.rear.next = q.front;
        }
        return value;
    }

    public static void displayQueue(Queue q) {
        Node node = q.front;
        while (node.next != q.front ) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println(node.data);
    }
    public static void main(String[] args) {
        Queue queue = new Queue();
        enQueue(queue,5);
        enQueue(queue,7);
        enQueue(queue,9);
        displayQueue(queue);
        System.out.println("------");
        deQueue(queue);
        displayQueue(queue);
    }
}
