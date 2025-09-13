import java.util.Deque;
import java.util.LinkedList;

public class StackUsingDequeue {

    public static class Stack {
        Deque<Integer> deque = new LinkedList<>();

        public void addLast(int data) {
            deque.addLast(data);
        }

        public int remove() {
            return deque.removeLast();
        }

        public int peek() {
            return deque.getLast();
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.addLast(0);
        stack.addLast(1);
        stack.addLast(2);
        stack.addLast(3);
        stack.addLast(4);
        System.out.println(stack.remove());
        System.out.println(stack.peek());

    }
}
