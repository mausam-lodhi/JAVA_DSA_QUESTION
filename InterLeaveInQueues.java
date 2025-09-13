import java.util.Queue;
import java.util.LinkedList;

public class InterLeaveInQueues {
    public static void interLeaveInQueues(Queue<Integer> queue, int size) {
        Queue<Integer> queue2 = new LinkedList<>();

        for (int i = size / 2; i < size; i++) {
            queue2.add(queue.remove());
        }
        while (!queue2.isEmpty()) {
            queue.add(queue2.remove());
            queue.add(queue.remove());
        }
        while (!queue.isEmpty()) {
            System.out.print(queue.remove() + " ");
        }
    }

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);
        queue.add(7);
        queue.add(8);
        queue.add(9);
        queue.add(10);

        interLeaveInQueues(queue, 10);
    }
}
