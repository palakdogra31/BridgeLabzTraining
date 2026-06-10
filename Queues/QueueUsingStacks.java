import java.util.Stack;

class QueueUsingStacks {

    Stack<Integer> s1 =
            new Stack<>();

    Stack<Integer> s2 =
            new Stack<>();

    void enqueue(int value) {

        s1.push(value);
    }

    int dequeue() {

        if(s1.isEmpty()) {

            System.out.println(
                    "Queue Empty"
            );

            return -1;
        }

        while(!s1.isEmpty()) {

            s2.push(s1.pop());
        }

        int value = s2.pop();

        while(!s2.isEmpty()) {

            s1.push(s2.pop());
        }

        return value;
    }
}