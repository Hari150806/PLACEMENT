package Placement.Day17;

public class p2 { //insert in binary search tree
    static class TreeNode {
        int data;
        TreeNode left, right;

        TreeNode(int n) {
            this.data = n;
            this.left = null;
            this.right = null;
        }
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

        System.out.println("Inorder Traversal of the BST:");
        inorderTraversal(root);
    }
    
}
