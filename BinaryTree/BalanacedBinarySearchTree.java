public class BalanacedBinarySearchTree {
    static public class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node sortedToBST(int nodes[], int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = (start + end) / 2;
        Node newNode = new Node(nodes[mid]);
        newNode.left = sortedToBST(nodes, start, mid - 1);
        newNode.right = sortedToBST(nodes, mid + 1, end);
        return newNode;
    }

    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);

    }

    public static void main(String[] args) {
        int nodes[] = { 3, 5, 6, 8, 10, 11, 12 };
        preOrder(sortedToBST(nodes, 0, nodes.length - 1));

    }
}