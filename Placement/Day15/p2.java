package Placement.Day15;
import java.util.*;
public class p2 { //total Node in tree
    
    static class TreeNode {
        int data;
        TreeNode left, right;

        TreeNode(int n) {
            this.data = n;  
            this.left = null;  
            this.right = null;  
        }
    }
    //Total Nodes
    public static int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return countNodes(root.left) + countNodes(root.right) + 1;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(7);
        root.right = new TreeNode(9);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(6);
        root.left.right.left = new TreeNode(5);
        root.left.right.right = new TreeNode(11);
        root.right.right = new TreeNode(9);
        root.right.right.left = new TreeNode(5);

        System.out.println("Total Nodes = " + countNodes(root));
       
    }
     
}
