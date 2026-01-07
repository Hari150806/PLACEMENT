package Placement.Day15;
import java.util.*;
public class p8 {  //isomorphic trees
    static class TreeNode {
        int data;
        TreeNode left, right;

        TreeNode(int n) {
            this.data = n;
            this.left = null;
            this.right = null;
        }
    }
    public static boolean isIsomorphic(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) {
            return true;
        }
        if (root1 == null || root2 == null) {
            return false;
        }return (root1.data == root2.data)
        && isIsomorphic(root1.left, root2.left) 
        && isIsomorphic(root1.right, root2.right)||
        (root1.data == root2.data)
        && isIsomorphic(root1.left, root2.right)
        && isIsomorphic(root1.right, root2.left);
         
    }
    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);
        root1.left.left = new TreeNode(4);
        root1.left.right = new TreeNode(5);

        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(3);
        root2.right = new TreeNode(2);
        root2.left.left = new TreeNode(5);
        root2.left.right = new TreeNode(4);

        System.out.println("Are the two trees isomorphic? " + isIsomorphic(root1, root2));
    }
    
}
