public class LargestBSTInBT {

    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            left = right = null;
        }

    }

    public static class Info {
        boolean isBST;
        int size;
        int min;
        int max;
        int largestBST;

        public Info(boolean isBST, int size, int min, int max, int largestBST) {
            this.isBST = isBST;
            this.size = size;
            this.min = min;
            this.max = max;
            this.largestBST = largestBST;
        }

    }

    public static int largestBST(Node root) {
        return dfs(root).largestBST;
    }

    public static Info dfs(Node root) {
        if (root == null) {
            return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE, 0);
        }
        Info left = dfs(root.left);
        Info right = dfs(root.right);

        if (left.isBST && right.isBST && root.data > left.max && root.data < right.min) {
            int size = left.size + right.size + 1;
            int minData = Math.min(root.data, left.min);
            int maxData = Math.max(root.data, right.max);
            return new Info(true, size, maxData, minData, size);
        } else {
            int bestChild = Math.max(left.largestBST, right.largestBST);
            return new Info(false, 0, 0, 0, bestChild);
        }

    }

    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(60);
        root.left.left = new Node(5);
        root.left.right = new Node(20);
        root.right.left = new Node(45);
        root.right.right = new Node(70);
        root.right.right.left = new Node(65);
        root.right.right.right = new Node(80);

        System.out.println("Size of largest BST is: " + largestBST(root));
    }
}
