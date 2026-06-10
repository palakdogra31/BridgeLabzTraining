import java.util.LinkedList;
import java.util.Queue;

class StackUsingQueues {

    Queue<Integer> q1 =
            new LinkedList<>();

    Queue<Integer> q2 =
            new LinkedList<>();

    void push(int value) {

        q2.offer(value);

        while(!q1.isEmpty()) {
            q2.offer(q1.poll());
        }

        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    int pop() {

        if(q1.isEmpty()) {

            System.out.println(
                    "Stack Empty"
            );

            return -1;
        }

        return q1.poll();
    }

    int top() {

        if(q1.isEmpty()) {
            return -1;
        }

        return q1.peek();
    }
}