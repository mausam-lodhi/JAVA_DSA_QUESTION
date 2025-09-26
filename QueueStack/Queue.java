public class Queue {

    public static int rear;
    public static int front;

    public static class InnerQueue {
        int arr[];

        public InnerQueue(int size) {
            arr = new int[size];
            front = -1;
            rear = -1;
        }

        boolean isEmpty() {
            if (front > rear) {
                return true;
            } else
                return false;
        }

        boolean isFull() {
            if (rear == arr.length - 1) {
                return true;
            } else
                return false;
        }

        void add(int data) {
            if (isFull()) {
                System.out.println("Queue is full !!!");
            } else if (front == -1) {
                front = rear = 0;
                arr[rear] = data;
            } else
                arr[++rear] = data;
        }

        int remove() {
            if (isEmpty()) {
                System.out.println("Queue is already empty !!!");
                return -1;
            } else if (rear == 0 && front == 0) {
                int deleatedValue = arr[front];
                front = rear = -1;
                return deleatedValue;

            } else {
                int deleatedValue = arr[front];
                front++;
                return deleatedValue;
            }
        }

        int peek() {
            if (isEmpty()) {
                System.out.println("Queue is  empty !!!");
                return 0;
            } else
                return arr[front];

        }
    }

    public static void main(String[] args) {
        InnerQueue q = new InnerQueue(5);

        q.add(2);
        q.add(3);
        q.add(4);

        System.out.println("\nIs queue empty? " + q.isEmpty());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());

        for (int i = front; i <= rear; i++) {
            System.out.print(q.arr[i] + " ");
        }

    }
}
