package Placement.Day17;

public class p3 { //delete in binary search tree
    static class TreeNode {
        int data;
        TreeNode left, right;

        TreeNode(int n) {
            this.data = n;
            this.left = null;
            this.right = null;
        }
    }

    public static TreeNode deleteBST(TreeNode root, int key) {
        if (root == null) {
            return null;
        }
        if (key < root.data) {
            root.left = deleteBST(root.left, key);
        } else if (key > root.data) {
            root.right = deleteBST(root.right, key);
        } else {
            // Node with only one child or no child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            // Node with two children: Get the inorder successor (smallest in the right subtree)
            root.data = minValue(root.right);
            // Delete the inorder successor
            root.right = deleteBST(root.right, root.data);
        }
        return root;
    }

    public static int minValue(TreeNode root) {
        int minv = root.data;
        while (root.left != null) {
            minv = root.left.data;
            root = root.left;
        }
        return minv;
    }

    public static void inorderTraversal(TreeNode root) {
        if (root != null) {
            inorderTraversal(root.left);
            System.out.print(root.data + " ");
            inorderTraversal(root.right);
        }
    }

    public static void main(String[] args) {
        TreeNode root = null;
        int[] keysToInsert = {8, 3, 10, 1, 6, 14, 4, 7, 13};

        for (int key : keysToInsert) {
            root = insertBST(root, key);
        }

        System.out.println("Inorder Traversal of the BST before deletion:");
        inorderTraversal(root);
        System.out.println();

        int keyToDelete = 6;
        root = deleteBST(root, keyToDelete);

        System.out.println("Inorder Traversal of the BST after deleting " + keyToDelete + ":");
        inorderTraversal(root);
    }

    public static TreeNode insertBST(TreeNode root, int key) {
        if (root == null) {
            return new TreeNode(key);
        }
        if (key < root.data) {
            root.left = insertBST(root.left, key);
        } else if (key > root.data) {
            root.right = insertBST(root.right, key);
        }
        return root;
    }
}