import java.util.LinkedList;
import java.util.Queue;
import java.util.Deque;

public class QueueUsingDeque {

    public static class Queue {
        Deque<Integer> deque = new LinkedList<>();

        public void add(int data) {
            deque.addLast(data);
        }

        public int remove() {
            return deque.removeFirst();
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.add(0);
        queue.add(1);
        queue.add(2);
        queue.add(3);
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
    }
}
