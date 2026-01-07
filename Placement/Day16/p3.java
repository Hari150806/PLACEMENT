package Placement.Day16;
import java.util.*;
public class p3 {  // transform to sum tree
    static class TreeNode {
        int data;
        TreeNode left, right;

        TreeNode(int n) {
            this.data = n;
            this.left = null;
            this.right = null;
        }
    }
    public static int toSumTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int oldValue = root.data;
        root.data = toSumTree(root.left) + toSumTree(root.right);
        return root.data + oldValue;
    }
    public static void inorder(TreeNode root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(-2);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(8);
        root.left.right = new TreeNode(-4);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(5);

        toSumTree(root);
        System.out.println("Inorder traversal of the converted sum tree:");
        inorder(root);
    }
    
}
