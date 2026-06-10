class QueueUsingArray {

    int[] arr;
    int front;
    int rear;
    int capacity;

    QueueUsingArray(int size) {

        capacity = size;
        arr = new int[size];

        front = -1;
        rear = -1;
    }

    void enqueue(int value) {

        if(rear == capacity - 1) {

            System.out.println("Queue Overflow");
            return;
        }

        if(front == -1) {
            front = 0;
        }

        arr[++rear] = value;
    }

    int dequeue() {

        if(front == -1 ||
           front > rear) {

            System.out.println("Queue Underflow");
            return -1;
        }

        return arr[front++];
    }

    int peek() {

        if(front == -1 ||
           front > rear) {

            return -1;
        }

        return arr[front];
    }

    boolean isEmpty() {

        return front == -1 ||
               front > rear;
    }
}