package _11_dsa_stack_queue.Exercise._optional._palindrome;

public class Palindrome {
    public static void main(String[] args) throws Exception {
        String string = "Able was I ere I saw Elba";
        String temp = string.toLowerCase();
        String[] newArray = temp.split("");

        Stack arrayStack = new Stack(temp.length());
        for (int i = 0; i < temp.length(); i++) {
            arrayStack.push(newArray[i]);
        }

        Queue arrayQueue = new Queue(temp.length());
        for (int i = 0; i < temp.length(); i++) {
            arrayQueue.enqueue(newArray[i]);
        }

        boolean isPalindrome = true;
        for (int i = 0; i < temp.length(); i++) {
            if (!arrayStack.pop().equals(arrayQueue.dequeue())) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println('"' + string + "\" is palindrome");
        } else {
            System.out.println('"' + string + "\" is not palindrome");
        }
    }
}
