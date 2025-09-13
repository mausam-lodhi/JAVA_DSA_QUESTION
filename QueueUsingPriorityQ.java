import java.util.PriorityQueue;

public class QueueUsingPriorityQ {
    public int arr[];
    public int size;
    public int capacity;

    public QueueUsingPriorityQ(int length) {
        arr = new int[length];
        size = 0;
        capacity = length;

    }

    public boolean isFull() {
        return size == capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(int item) {
        if (isFull()) {
            System.out.println("The queue is already filled ");
            throw new IllegalStateException();
        }
        int i = shiftItemsToInsert(item);
        arr[i] = item;
        size++;
    }

    public int peek() {
        return arr[0];// smallest one
    }

    public int remove() {
        if (isEmpty()) {
            System.out.println("THe queue is already empty ");
            return -1;
        }
        int i;
        int removed = arr[0];
        for (i = 1; i < size; i++) {
            arr[i - 1] = arr[i];
        }
        size--;
        return removed;

    }

    public int shiftItemsToInsert(int item) {
        int i;
        for (i = size - 1; i >= 0; i--) {
            if (arr[i] > item) {
                arr[i + 1] = arr[i];
            } else
                break;
        }
        return i + 1;
    }

    public static void main(String[] args) {
        QueueUsingPriorityQ queue = new QueueUsingPriorityQ(5);
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(5);
        queue.add(6);
        queue.add(6);
        System.out.println("remove item is : " + queue.remove());

        for (int i = 0; i < queue.size; i++) {
            System.out.println(queue.arr[i]);
        }
    }
}
