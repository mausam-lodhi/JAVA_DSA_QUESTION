import java.util.ArrayList;

public class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addFisrt(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void addInTheMiddle(int data, int index) {

        if (index == 0) {
            addFisrt(data);
            return;
        }
        Node newNode = new Node(data);
        int i = 0;
        Node temp = head;
        if (head == null) {
            System.out.print("LinkedList is empty ");
        }

        while (i < index - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;

    }

    public void print() {
        if (head == null) {
            System.out.print("LinkedList is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            temp = temp.next;
        }
        System.out.println();
    }

    public static int size() {
        if (head == null) {
            System.out.print("Size is 0 ");
            return 0;
        }
        int sizeOFLL = 0;
        Node temp = head;
        while (temp != null) {
            sizeOFLL++;
            temp = temp.next;
        }
        return sizeOFLL;
    }

    public void removeFirst() {
        if (head == null) {
            System.out.print("The linkedlist is empty ");
        }
        head = head.next;
    }

    public void removeLast() {
        if (head == null) {
            System.out.print("The linkedlist is empty ");
        }
        Node temp = head.next;
        Node prev = head;
        while (temp.next != null) {
            prev = prev.next;
            temp = temp.next;
        }
        prev.next = null;
        tail = prev;
    }

    public void searchIterative(int data) {
        if (head == null) {
            System.out.println("LinkedList is empty");
        }
        Node temp = head;
        int counter = 0;
        while (temp.next != null) {
            if (temp.data == data) {
                System.out.println("The element is found at index " + counter);
                return;
            }
            temp = temp.next;
            counter++;
        }
        System.out.println("The element is not found");
    }

    public void searchRecursively(int data, int index, Node temp) {
        if (temp == null) { // reached end, not found
            System.out.println("The element is not found");
            return;
        }
        if (temp.data == data) { // found element
            System.out.println("The element is found at index : " + index);
            return;
        }
        searchRecursively(data, index + 1, temp.next); // check next node
    }

    public void reverse() {
        Node prev = null;
        Node curr = head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void removeLastNthNode(int nthIndex) {
        if (head == null) {
            System.out.println("The linkedlist is empty !!!");
            return;
        }
        if (nthIndex == 0) {
            removeLast();
            return;
        } else if (nthIndex == size()) {
            removeFirst();
            return;
        }
        int sizeOfLL = size();
        int iToSize = sizeOfLL - nthIndex;
        System.out.println(iToSize);
        int i = 1;

        Node temp = head;
        while (i < iToSize) {
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;

    }

    public boolean isPalindromeByArraylist() {
        ArrayList<Integer> list = new ArrayList<>();
        if (head == null) {
            System.out.println("The linkedlist is empty ");
            return false;
        }
        if (size() == 1) {
            return true;
        }
        Node temp = head;
        int i = 0;
        while (temp != null) {
            list.add(temp.data);
            temp = temp.next;
            i++;
        }

        for (int j = 0, k = list.size() - 1; j < k; j++, k--) {
            if (list.get(j) != (list.get(k))) {
                return false;
            }
        }

        return true;
    }

    public boolean isPalindromeByArrays() {
        if (head == null) {
            return false;
        } else if (size() == 1) {
            return true;
        }

        Node temp = head;
        int i = 0;
        int arr[] = new int[size()];
        while (temp != null) {
            arr[i] = temp.data;
            i++;
            temp = temp.next;
        }
        for (int j = 0, k = arr.length - 1; j < k; j++, k--) {
            if (arr[j] != arr[k]) {
                return false;
            }
        }
        return true;
    }

    public boolean isCycle() {
        if (head.next == null || head == null) {
            System.out.println("no cycle");
            return false;
        }
        Node turtle = head;
        Node rabit = head;

        while (rabit != null && rabit.next != null) {
            turtle = turtle.next;
            rabit = rabit.next.next;

            if (turtle == rabit) {
                return true;
            }
        }
        return false;

    }

    public void removeCycle() {
        if (head.next == null || head == null) {
            System.out.println("no cycle");
            return;
        }
        Node turtle = head;
        Node rabit = head;
        Node temp = head;
        Node ptr = head;
        if (isCycle()) {
            while (rabit != null && rabit.next != null) {
                turtle = turtle.next;
                temp = turtle;
                rabit = rabit.next.next;

                if (turtle == rabit) {
                    break;
                }
            }
            while (ptr != turtle) {
                turtle = turtle.next;
                temp = turtle;
                ptr = ptr.next;

            }

            temp.next = null;
            tail = temp;
        } else
            System.out.println("no cycle");

    }

    private Node getMid(Node head) {
        Node turtle = head;
        Node rabit = head.next;

        while (rabit != null && rabit.next != null) {
            turtle = turtle.next;
            rabit = rabit.next.next;
        }
        return turtle;

    }

    public Node sortLinkedList(Node head) {
        if (head == null || head.next == null)
            return head;

        Node mid = getMid(head);

        Node rightHead = mid.next;
        mid.next = null;

        Node newLeft = sortLinkedList(head);
        Node newRight = sortLinkedList(rightHead);

        return mergeLinkedList(newLeft, newRight);

    }

    public Node mergeLinkedList(Node newLeft, Node newRight) {

        Node head1 = newLeft;
        Node head2 = newRight;

        Node mergedLnkedList = new Node(-1);
        Node temp = mergedLnkedList;

        while (head1 != null && head2 != null) {
            if (head1.data > head2.data) {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            } else {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }

        }
        while (head1 != null) {
            temp.next = head1;

            head1 = head1.next;
            temp = temp.next;
        }
        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergedLnkedList.next;
    }

    public Node zigZag() {

        if (head == null & head.next == null) {
            return head;
        }

        Node mid = getMid(head);
        Node curr = mid;
        Node next;
        Node prev = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node leftHead = head;
        Node rightHead = prev;
        Node nextLeft, nextRight;

        while (leftHead != null && rightHead != null) {
            nextLeft = leftHead.next;
            nextRight = rightHead.next;

            leftHead.next = rightHead;
            rightHead.next = nextLeft; // just point to nextLeft, not nextLeft.next

            leftHead = nextLeft; // move to the next left node
            rightHead = nextRight; // move to the next right node
        }

        return head;

    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFisrt(2);
        ll.addFisrt(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);

        // ll.addInTheMiddle(3, 2);
        // ll.addInTheMiddle(6, 5);
        // ll.addInTheMiddle(0, 0);

        // ll.removeFirst();

        // ll.removeLast();
        // print();
        // size();

        // ll.searchIterative(3);
        // ll.searchRecursively(3, 0, ll.head);
        // ll.reverse();
        // ll.removeLastNthNode(2);
        // System.out.println(ll.isPalindromeByArraylist());
        // System.out.println(ll.isPalindromeByArrays());

        // ll.print();
        // System.out.println(ll.isCycle());
        // ll.removeCycle();
        // System.out.println(ll.isCycle());
        // ll.head = ll.sortLinkedList(ll.head);
        ll.zigZag();
        ll.print();

    }
}