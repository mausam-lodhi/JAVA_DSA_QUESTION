import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class QueueReversal {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        while (!queue.isEmpty()) {
            int item = queue.remove();
            System.out.print(item + " ");
            stack.push(item);
        }
        System.out.println();
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
