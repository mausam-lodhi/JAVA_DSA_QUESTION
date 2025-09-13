
public class CicularQueue {
    public static int front;
    public static int rear;
    public static int size;
    public static int arr[];

    public static class InnerCicularQueue {

        InnerCicularQueue(int size) {
            arr = new int[size];
            front = -1;
            rear = -1;
            size = size;
        }

        boolean isEmpty() {
            if (front == -1 && rear == -1) {
                return true;
            } else
                return false;
        }

        boolean isFull() {
            if (front == (rear + 1) % arr.length) {
                return true;
            } else
                return false;
        }

        void add(int data) {
            if (isFull()) {
                System.out.println("Cicular Queue is already fulll !!!");
            } else if (front == -1 && rear == -1) {
                front = rear = 0;
                arr[rear] = data;
            } else {
                arr[(++rear) % arr.length] = data;
            }
        }

        int remove() {
            if (isEmpty()) {
                System.out.println("Queue is already empty");
                return -1;
            } else if (front == rear) {
                int deleatedValue = arr[front];
                front = rear = -1;
                return deleatedValue;

            } else {
                int deleatedValue = arr[front];
                front = (++front) % 10;
                return deleatedValue;
            }
        }
    }

    public static void main(String[] args) {
        InnerCicularQueue q = new InnerCicularQueue(3);
        q.add(1);
        q.add(2);
        q.add(4);

        while (!q.isEmpty()) {
            System.out.println(q.remove());
        }
    }

}