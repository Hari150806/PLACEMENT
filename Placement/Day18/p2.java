package Placement.Day18;

public class p2 { // complete binary tree
    static class TreeNode {
        int data;
        TreeNode left, right;

        TreeNode(int n) {
            this.data = n;
            this.left = null;
            this.right = null;
        }
    }
    public static boolean isCompleteBinaryTree(TreeNode root, int index, int numberNodes) {
        if (root == null) {
            return true;
        }
        if (index >= numberNodes) {
            return false;
        }
        return isCompleteBinaryTree(root.left, 2 * index + 1, numberNodes) &&
               isCompleteBinaryTree(root.right, 2 * index + 2, numberNodes);
    }
    public static int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + countNodes(root.left) + countNodes(root.right);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);

        int numberNodes = countNodes(root);
        if (isCompleteBinaryTree(root, 0, numberNodes)) {
            System.out.println("The binary tree is complete.");
        } else {
            System.out.println("The binary tree is not complete.");
        }
    }
    
    
}
