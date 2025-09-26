public class QueueUsingArrays {
    public static int arr[];
    public static int front;
    public static int rear;
    public static int size;

    public QueueUsingArrays(int length) {
        arr = new int[length];
        front = -1;
        rear = -1;
    }

    public static boolean isEmpty() {
        if (rear == -1 || front > rear) {
            return true;
        } else
            return false;
    }

    public static boolean isFull() {
        if (rear == front - 1 || front == ((rear + 1) % arr.length)) {
            return true;
        } else
            return false;
    }

    public static void add(int data) {
        if (isFull()) {
            System.out.println("The array is already full ");
        } else if (rear == -1) {
            front = rear = 0;
            arr[rear] = data;
            size++;
        } else {
            rear = (rear + 1) % arr.length;
            arr[rear] = data;
            size++;
        }
    }

    public static int peek() {
        if (isEmpty()) {
            return -1;
        } else
            return arr[front];
    }

    public static int remove() {
        if (isEmpty()) {
            return -1;
        } else if (front == rear) {
            int removedElement = arr[front];
            arr[front] = 0;
            front = rear = -1;
            size--;
            return removedElement;
        } else {
            int removedElement = arr[front];
            arr[front] = 0;
            front++;
            size--;
            return removedElement;
        }
    }

    public static void main(String[] args) {
        QueueUsingArrays q = new QueueUsingArrays(5);
        add(1);
        add(2);
        add(3);
        add(4);
        System.out.println(remove());
        System.out.println(remove());
        System.out.println(remove());
        add(5);
        add(6);
        add(7);
        add(8);
        add(9);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}
