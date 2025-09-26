public class QueueUsingLinkedList {
    public static Node head;
    public static Node tail;

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public boolean isEmpty() {
        if (head == null)
            return true;
        else
            return false;
    }

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }

    }

    public int remove() {
        if (head == null) {
            return -1;
        } else if (tail == head) {
            int data = head.data;
            head = tail = null;
            return data;
        } else {
            int val = head.data;
            head = head.next;
            return val;
        }

    }

    public static void main(String[] args) {
        QueueUsingLinkedList n = new QueueUsingLinkedList();
        n.add(0);
        n.add(1);
        n.add(2);
        n.add(3);

        while (!n.isEmpty()) {
            System.out.println(n.remove());
        }
    }
}
