package Placement.Day15;
import java.util.*;
public class p3 { //count leaf in tree
    
    static class TreeNode {
        int data;
        TreeNode left, right;

        TreeNode(int n) {
            this.data = n;  
            this.left = null;  
            this.right = null;  
        }
    }
    //Leaf
    public static int countleafNodes(TreeNode root) {   
        if (root == null){
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        return countleafNodes(root.left) + countleafNodes(root.right);
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

        System.out.println("Leaf Nodes = " + countleafNodes(root));
       
    }
    
}
