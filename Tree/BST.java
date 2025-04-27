package Tree;

import java.util.LinkedList;
import java.util.Queue;

class BST {
    static class Node {
        int data;
        Node left, right;

        Node(int value) {
            data = value;
            left = right = null;
        }
    }

    Node root;

    // Insert a node into BST
    public Node insert(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }
        if (data < root.data)
            root.left = insert(root.left, data);
        else if (data > root.data)
            root.right = insert(root.right, data);

        return root;
    }

    // a. Preorder Traversal
    public void preorder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    // a. Inorder Traversal
    public void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    // a. Postorder Traversal
    public void postorder(Node root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }
    }

    // a. Level Order Traversal (Breadth-First)
    public void levelOrder(Node root) {
        if (root == null)
            return;

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            Node temp = q.poll();
            System.out.print(temp.data + " ");

            if (temp.left != null)
                q.add(temp.left);
            if (temp.right != null)
                q.add(temp.right);
        }
    }

    // b. Count the number of nodes
    public int countNodes(Node root) {
        if (root == null)
            return 0;
        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    // c. Count the number of leaves
    public int countLeaves(Node root) {
        if (root == null)
            return 0;
        if (root.left == null && root.right == null)
            return 1;
        return countLeaves(root.left) + countLeaves(root.right);
    }

    // d. Find the height of the tree
    public int height(Node root) {
        if (root == null)
            return -1; // height of empty tree is -1
        return 1 + Math.max(height(root.left), height(root.right));
    }

    // e. Search for an item in the tree
    public boolean search(Node root, int key) {
        if (root == null)
            return false;
        if (root.data == key)
            return true;
        if (key < root.data)
            return search(root.left, key);
        else
            return search(root.right, key);
    }

    // f. Remove a node from the tree
    public Node delete(Node root, int key) {
        if (root == null)
            return null;

        if (key < root.data)
            root.left = delete(root.left, key);
        else if (key > root.data)
            root.right = delete(root.right, key);
        else {
            // Node with only one child or no child
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            // Node with two children: Get inorder successor (smallest in right subtree)
            root.data = minValue(root.right);

            // Delete the inorder successor
            root.right = delete(root.right, root.data);
        }
        return root;
    }

    private int minValue(Node root) {
        int minv = root.data;
        while (root.left != null) {
            minv = root.left.data;
            root = root.left;
        }
        return minv;
    }

    // Main method
    public static void main(String[] args) {
        BST tree = new BST();
        int[] elements = {50, 30, 20, 40, 70, 60, 80};

        for (int elem : elements) {
            tree.root = tree.insert(tree.root, elem);
        }

        System.out.print("Preorder traversal: ");
        tree.preorder(tree.root);
        System.out.println();

        System.out.print("Inorder traversal: ");
        tree.inorder(tree.root);
        System.out.println();

        System.out.print("Postorder traversal: ");
        tree.postorder(tree.root);
        System.out.println();

        System.out.print("Level order traversal: ");
        tree.levelOrder(tree.root);
        System.out.println();

        System.out.println("Total number of nodes: " + tree.countNodes(tree.root));
        System.out.println("Total number of leaves: " + tree.countLeaves(tree.root));
        System.out.println("Height of the tree: " + tree.height(tree.root));

        int searchKey = 60;
        System.out.println("Is " + searchKey + " present? " + tree.search(tree.root, searchKey));

        int deleteKey = 30;
        tree.root = tree.delete(tree.root, deleteKey);
        System.out.print("Inorder traversal after deleting " + deleteKey + ": ");
        tree.inorder(tree.root);
        System.out.println();
    }
}
