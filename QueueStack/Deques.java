import java.util.Deque;
import java.util.LinkedList;

public class Deques {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(2);
        deque.addFirst(1);
        deque.addFirst(0);
        deque.addLast(3);
        deque.addLast(4);
        deque.addLast(5);
        System.out.println(deque);
        // deque.removeLast();
        // deque.removeLast();
        // deque.removeFirst();
        // deque.removeFirst();
        System.out.println(deque);
        System.out.println("The first element is : " + deque.getFirst());
        System.out.println("The last element is : " + deque.getLast());

    }
}
