import java.util.ArrayList;

public class Stack {
    public static class StackB {

        ArrayList<Integer> list = new ArrayList<>();

        public boolean isEmpty() {
            return list.size() == 0;
        }

        public void add(int data) {
            list.add(data);
        }

        public int pop() {
            if (isEmpty()) {
                return -1;
            }

            int temp = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return temp;
        }

        public int peek() {
            if (isEmpty()) {
                return -1;
            }
            return list.get(list.size() - 1);
        }

    }

    public static class StackNode {
        int data;
        StackNode next;

        public StackNode(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public static StackNode head;

    public boolean size() {
        StackNode temp = head;
        int size = 0;
        while (temp != null) {
            temp = temp.next;
            size++;

        }
        return size == 0;
    }

    public void addStackNode(int data) {
        StackNode node = new StackNode(data);

        if (size()) {
            head = node;
            return;
        }
        node.next = head;
        head = node;
    }

    public int peek() {
        if (size()) {
            return -1;
        }
        return head.data;
    }

    public int remove() {
        if (size()) {
            return -1;
        }

        int data = head.data;
        head = head.next;
        return data;
    }

    public void print() {
        if (size()) {
            return;
        }
        StackNode temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String args[]) {

        // StackB s = new StackB();
        // s.add(1);
        // s.add(2);
        // s.add(3);
        // System.out.println(s.pop());
        // System.out.println(s.isEmpty());
        // System.out.println(s.peek());
        Stack s = new Stack();
        s.addStackNode(0);
        s.addStackNode(1);
        s.addStackNode(2);
        s.addStackNode(3);
        System.out.println(s.peek());
        // s.remove();
        s.print();

    }
}
