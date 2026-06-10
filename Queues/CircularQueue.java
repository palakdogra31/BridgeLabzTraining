class CircularQueue {

    int[] arr;
    int front;
    int rear;
    int capacity;

    CircularQueue(int size) {

        capacity = size;
        arr = new int[size];

        front = -1;
        rear = -1;
    }

    boolean isFull() {

        return front ==
                (rear + 1) % capacity;
    }

    boolean isEmpty() {

        return front == -1;
    }

    void enqueue(int value) {

        if(isFull()) {

            System.out.println(
                    "Queue Full");
            return;
        }

        if(front == -1) {

            front = 0;
        }

        rear =
                (rear + 1) % capacity;

        arr[rear] = value;
    }

    int dequeue() {

        if(isEmpty()) {

            System.out.println(
                    "Queue Empty");
            return -1;
        }

        int value = arr[front];

        if(front == rear) {

            front = -1;
            rear = -1;
        }
        else {

            front =
                    (front + 1)
                            % capacity;
        }

        return value;
    }

    int peek() {

        if(isEmpty()) {
            return -1;
        }

        return arr[front];
    }
}