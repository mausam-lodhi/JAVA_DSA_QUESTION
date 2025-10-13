import java.util.ArrayList;
import java.util.List;

public class ConvertBSTToBalancedBST {

    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static class BuildTree {
        public static List<Integer> inOrder(Node root) {
            if (root == null) {
                return new ArrayList<>();
            }
            List<Integer> list = new ArrayList<>();
            list.addAll(inOrder(root.left));
            list.add(root.data);
            list.addAll(inOrder(root.right));
            return list;
        }

        public static Node buildBalancedBinaySearchTree(List<Integer> list, int start, int end) {
            if (start > end) {
                return null;
            }
            int mid = (start + end) / 2;
            Node root = new Node(list.get(mid));
            root.left = buildBalancedBinaySearchTree(list, start, mid - 1);
            root.right = buildBalancedBinaySearchTree(list, mid + 1, end);
            return root;
        }

        public static void preOrder(Node root) {
            if (root == null)
                return;
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    public static void main(String[] args) {
        // Manually creating the BST
        Node root = new Node(8);

        root.left = new Node(6);
        root.right = new Node(10);

        // Left subtree
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);

        // Right subtree
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);

        List<Integer> list = BuildTree.inOrder(root);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        // Build balanced BST
        Node balancedRoot = BuildTree.buildBalancedBinaySearchTree(list, 0, list.size() - 1);

        // Print preorder of balanced BST to see structure
        System.out.println("Preorder of balanced BST:");
        BuildTree.preOrder(balancedRoot);
    }
}
