package _11_dsa_stack_queue.Exercise._reverse_element;

import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        Stack<Number> stack = new Stack<Number>();
        int[] numberList = {1,2,3};
        for (int i = 0; i < numberList.length; i++) {
            stack.push(numberList[i]);
        }
        System.out.println(stack);
        for (int i = 0; i < numberList.length; i++) {
            numberList[i] = (int) stack.pop();
        }
        System.out.println(stack);
        System.out.println("---------------");

        String string = "ABCD";
        String[] mWord = string.split("");
        Stack<String> wStack = new Stack<String>();
        for (int i = 0; i < mWord.length; i++) {
            wStack.push(mWord[i]);
        }
        System.out.println(wStack);
        int i = 0;
        while (!wStack.isEmpty()) {
            mWord[i] = wStack.pop();
            i++;
        }
        string = string.join("",mWord);
        System.out.println(string);
    }
}
