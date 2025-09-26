public class Main {

    public static class Node {
        int data;
        Node next;

        Node() {
        }

        Node(int val) {
            this.data = val;
        }

        Node(int val, Node next) {
            this.data = val;
            this.next = next;
        }

    }

    public static Node addNodes(Node n1, Node n2) {
        Node solution = new Node(-1);
        Node temp = solution;
        int carry = 0;
        while (n1 != null || n2 != null || carry != 0) {
            int x = n1 == null ? 0 : n1.data;
            int y = n1 == null ? 0 : n2.data;
            int sum = x + y + carry;
            carry = sum / 10;

            temp.next = new Node(sum % 10);
            temp = temp.next;
            if (n1 != null)
                n1 = n1.next;
            if (n2 != null)
                n2 = n2.next;

        }
        return solution.next;
    }

    public static void main(String[] args) {
        Main ll = new Main();
        Node l1 = new Node(2, new Node(4, new Node(3)));
        Node l2 = new Node(5, new Node(6, new Node(4)));

        Node solution = addNodes(l1, l2);
        Node temp = solution;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}