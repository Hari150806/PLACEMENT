package Placement.Day15;
import java.util.*;
public class p6 {  // searchkey in tree
    static class TreeNode {
        int data;
        TreeNode left, right;

        TreeNode(int n) {
            this.data = n;
            this.left = null;
            this.right = null;
        }
    }
    public static boolean search(TreeNode root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data == key) {
            return true;
        }
        return search(root.left, key) || search(root.right, key);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);
        root.right.right = new TreeNode(15);
        root.right.left = new TreeNode(12);
        root.right.right.right = new TreeNode(15);

        int key =11;
        System.out.println("Search Key " + key + " = " + search(root, key));
    }
    
}
