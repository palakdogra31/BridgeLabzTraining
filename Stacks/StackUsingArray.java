import java.util.*;

class StackUsingArray {

    int[] arr;
    int top;
    int capacity;

    StackUsingArray(int size) {

        capacity = size;
        arr = new int[capacity];
        top = -1;
    }

    void push(int value) {

        if(top == capacity - 1) {

            System.out.println("Stack Overflow");
            return;
        }

        arr[++top] = value;
    }

    int pop() {

        if(top == -1) {

            System.out.println("Stack Underflow");
            return -1;
        }

        return arr[top--];
    }

    int peek() {

        if(top == -1) {
            return -1;
        }

        return arr[top];
    }

    boolean isEmpty() {

        return top == -1;
    }


    // MAIN METHOD
    public static void main(String[] args) {

        StackUsingArray stack =
                new StackUsingArray(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(
                "Top element: "
                        + stack.peek()
        );

        System.out.println(
                "Popped: "
                        + stack.pop()
        );

        System.out.println(
                "Top after pop: "
                        + stack.peek()
        );

        System.out.println(
                "Is Empty: "
                        + stack.isEmpty()
        );
    }
}