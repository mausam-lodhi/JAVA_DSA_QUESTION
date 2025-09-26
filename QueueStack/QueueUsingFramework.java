import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueUsingFramework {
    public static void reverse(Queue<Integer> queue) {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            Stack<Integer> stack = new Stack<>();
            while (!queue.isEmpty()) {
                int frontElement = queue.peek();
                stack.add(frontElement);
                queue.remove();
            }
            while (!stack.isEmpty()) {
                queue.add(stack.pop());
            }
            System.out.println(queue);
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        q.remove();
        System.out.println(q.peek());
        System.err.println(q);
        reverse(q);
    }
}
