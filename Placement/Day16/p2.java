package Placement.Day16;
import java.util.*;
public class p2 { // left view of binary tree
    static class TreeNode {
        int data;
        TreeNode left, right;

        TreeNode(int n) {
            this.data = n;
            this.left = null;
            this.right = null;
        }
    }
    public static void leftViewUtil(TreeNode root, int level, ArrayList<Integer> result) {
        if (root == null) {
            return;
        }
        if (level == result.size()) {
            result.add(root.data);
        }
        leftViewUtil(root.left, level + 1, result);
        leftViewUtil(root.right, level + 1, result);
    }
    public static ArrayList<Integer> leftView(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        leftViewUtil(root, 0, result);
        return result;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.left.right.right = new TreeNode(5);
        root.left.right.right.right = new TreeNode(6);

        ArrayList<Integer> leftViewNodes = leftView(root);
        System.out.println("Left View of Binary Tree: " + leftViewNodes);
    }
}
