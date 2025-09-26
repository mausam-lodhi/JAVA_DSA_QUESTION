import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

public class QueueUsingTwoStacks {
    public static Stack<Integer> stack1 = new Stack<>();
    public static Stack<Integer> stack2 = new Stack<>();

    public static void add(int data) {
        stack1.push(data);
    }

    public static int remove() {
        if (!stack2.isEmpty()) {
            return stack2.pop();
        }
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        return stack2.pop();
    }

    public static void main(String[] args) {
        add(0);
        add(1);
        add(2);
        add(3);
        add(4);
        System.out.println(remove());
        System.out.println(remove());
        System.out.println(remove());
        System.out.println(remove());

        while (!stack2.isEmpty()) {
            // System.out.println(stack2.pop());
        }

    }

}
