package _11_dsa_stack_queue.Exercise._optional._palindrome;

public class Queue {
    public int capacity;
    public String[] queueArr;
    public int head = 0;
    public int tail = -1;
    public int currentSize = 0;

    public Queue(int queueSize) {
        this.capacity = queueSize;
        queueArr = new String[this.capacity];
    }

    public boolean isQueueFull() {
        boolean check = false;
        if (currentSize == capacity) {
            check = true;
        }
        return check;
    }

    public boolean isQueueEmpty() {
        boolean check = false;
        if (currentSize == 0) {
            check = true;
        }
        return check;
    }

    public void enqueue(String item) {
        tail++;
        queueArr[tail] = item;
        currentSize++;

    }

    public String dequeue() {
        head++;
        return queueArr[head - 1];
    }
}
