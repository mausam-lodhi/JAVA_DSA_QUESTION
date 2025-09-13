public class DoublyLinkedList {

    public class Node {

        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }

    }

    public static Node head;
    public static Node tail;

    public static int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;

    }

    public int removeFirst() {
        if (head == null) {
            System.out.println("LinkedList is empty !!!");

        } else if (head.next == null) {
            head = tail = null;
            size--;
            return Integer.MIN_VALUE;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }

    public int removeLast() {

        if (head == null) {
            System.out.println("LInkeLIst is empty !!!");

        } else if (head.next == null) {
            head = tail = null;
            size--;
            return Integer.MIN_VALUE;
        }
        Node temp = head;
        Node ptr = null;
        while (temp.next != null) {
            ptr = temp;
            temp = temp.next;
        }
        int val = temp.data;
        temp.prev = null;
        ptr.next = null;
        size--;

        return val;

    }

    public void print() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void reverseDLL() {
        if (head == null || head.next == null)
            return;
        Node prev = null;
        Node curr = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;

        }
        head = prev;

    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.addLast(2);
        dll.addFirst(1);
        dll.addFirst(0);
        dll.addLast(3);
        dll.print();
        dll.reverseDLL();
        dll.print();

    }
}
