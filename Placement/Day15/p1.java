package Placement.Day15;
import java.util.*;

public class p1 { // tree
    
    static class TreeNode {
        int data;
        TreeNode left, right;

        TreeNode(int n) {
            int data = n;  //or this.data
            TreeNode left = null;  //or this.left
            TreeNode right = null;  //or this.right
        }
    }
    //Total Nodes

    public static int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return countNodes(root.left) + countNodes(root.right) + 1;
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
    //Non Leaf
    public static int countNonleaf(TreeNode root) {
        if (root == null || (root.left == null && root.right == null)) {
            return 0;
        }
        return countNonleaf(root.left) + countNonleaf(root.right) + 1;
        
    }
    //One Child
    public static int countNodeonechild(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if ((root.left == null && root.right != null) || (root.left != null && root.right == null)) {
            return 1 + countNodeonechild(root.left) + countNodeonechild(root.right);
        }
        return countNodeonechild(root.left) + countNodeonechild(root.right);
    }
    //Two Child
    public static int countNodetwochild(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left != null && root.right != null) {
            return 1 + countNodetwochild(root.left) + countNodetwochild(root.right);
        }
        return countNodetwochild(root.left) + countNodetwochild(root.right);
    } 
    //Search Key
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
        System.out.println("Leaf Nodes = " + countleafNodes(root));
        System.out.println("NonLeaf Nodes = " + countNonleaf(root));
        System.out.println("Nodes with one child = " + countNodeonechild(root));
        System.out.println("Nodes with two children = " + countNodetwochild(root));
        System.out.println("Search Key  = " + search(root, 14));
    }
}
