import java.security.Principal;
import java.util.LinkedList;

public class LinkedListByFramework {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();

        ll.addFirst(1);
        ll.addFirst(0);

        System.out.println(ll);
        ll.addLast(2);
        System.out.println(ll);

        ll.removeFirst();
        System.out.println(ll);
        ll.removeLast();

        System.out.println(ll);

    }
}
