import java.util.Queue;
import java.util.LinkedList;

public class BuildTreeAndOperations {
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

    public static class BinaryTree {
        static int index = -1;

        public static Node buildBinaryTree(int nodes[]) {
            index++;
            if (nodes[index] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[index]);
            newNode.left = buildBinaryTree(nodes);
            newNode.right = buildBinaryTree(nodes);
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

        public static void inOrder(Node root) {
            if (root == null) {
                return;
            }
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }

        public static void postOrder(Node root) {
            if (root == null) {
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }

        public static void levelOrder(Node root) {
            if (root == null) {
                return;
            }
            Queue<Node> queue = new LinkedList<>();
            queue.add(root);

            while (!queue.isEmpty()) {
                Node currNode = queue.poll();
                System.out.print(currNode.data + " ");
                if (currNode.left != null) {
                    queue.add(currNode.left);

                }
                if (currNode.right != null) {
                    queue.add(currNode.right);
                }
            }
        }

        public static int height(Node root) {
            if (root == null) {
                return 0;
            }
            int lh = height(root.left);
            int rh = height(root.right);
            return Math.max(lh, rh) + 1;
        }

        public static int count(Node root) {
            if (root == null) {
                return 0;
            }
            int lcount = count(root.left);
            int rcount = count(root.right);
            return lcount + rcount + 1;
        }

        public static int summation(Node root) {
            if (root == null) {
                return 0;
            }
            int data = root.data;
            if (root.left == null || root.right == null) {
                return (root.data);

            }
            int sum = summation(root.left) + summation(root.right) + data;
            return sum;
        }

        public static int diameter(Node root) {
            if (root == null) {
                return 0;
            }
            int leftDia = diameter(root.left);
            int leftHeight = height(root.left);

            int rightDia = diameter(root.right);
            int rightHeight = height(root.right);

            int selfDia = leftHeight + rightHeight + 1;

            return Math.max(selfDia, Math.max(leftDia, rightDia));
        }
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 6, -1, -1
        };
        Node root = BinaryTree.buildBinaryTree(nodes);
        System.out.print("The Preorder is : ");
        BinaryTree.preOrder(root);
        System.out.print("The Preorder is : ");
        System.out.println();
        BinaryTree.inOrder(root);
        System.out.println();
        BinaryTree.postOrder(root);
        System.out.println();
        BinaryTree.levelOrder(root);
        System.out.println();
        System.out.println("The height of the tree is : " + BinaryTree.height(root));
        System.out.println("The number of nodes are : " + BinaryTree.count(root));
        System.out.println("The summation of the nodes are : " + BinaryTree.summation(root));
        System.out.println("The max diameter is the : " + BinaryTree.diameter(root));
    }
}