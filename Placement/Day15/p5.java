package Placement.Day15;
import java.util.*;
public class p5 { // coutof key in tree
    static class TreeNode {
        int data;
        TreeNode left, right;

        TreeNode(int n) {
            this.data = n;
            this.left = null;
            this.right = null;
        }
    }

    public static int countKey(TreeNode root, int key) {
        if (root == null) {
            return 0;
        }
        int count =  0;
        if(root.data==key){
            count = 1;
        }
        return count + countKey(root.left, key) + countKey(root.right, key);
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

        int key = 15;
        System.out.println("Count of key " + key + " = " + countKey(root, key));
    }
    
}
