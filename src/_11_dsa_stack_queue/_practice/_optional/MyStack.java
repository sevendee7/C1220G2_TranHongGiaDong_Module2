package _11_dsa_stack_queue.Practice._optional;

public class MyStack {
    public int[] array;
    public int size;
    public int index;

    public MyStack(int size) {
        this.size = size;
        array = new int[size];
    }

    public boolean isFull() {
        if (index == size) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        if (index == 0) {
            return true;
        }
        return false;
    }

    public void push(int element) {
        if (isFull()) {
            throw new StackOverflowError("Stack is full");
        }
        array[index] = element;
        index++;
    }

    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is null");
        }
        return array[--index];
    }

    public int size() {
        return index;
    }
}
