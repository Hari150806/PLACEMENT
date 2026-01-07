package Placement.Day16;

public class p4 {// diameter of tree
    static class TreeNode {
        int data;
        TreeNode left, right;

        TreeNode(int n) {
            this.data = n;
            this.left = null;
            this.right = null;
        }
    }

    static class Height {
        int h;
    }

    public static int diameterUtil(TreeNode root, Height height) {
        if (root == null) {
            height.h = 0;
            return 0;
        }

        Height leftHeight = new Height();
        Height rightHeight = new Height();

        int leftDiameter = diameterUtil(root.left, leftHeight);
        int rightDiameter = diameterUtil(root.right, rightHeight);

        height.h = Math.max(leftHeight.h, rightHeight.h) + 1;

        return Math.max(leftHeight.h + rightHeight.h + 1, Math.max(leftDiameter, rightDiameter));
    }

    public static int diameter(TreeNode root) {
        Height height = new Height();
        return diameterUtil(root, height);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);
        root.left.left.left = new TreeNode(7);

        System.out.println("Diameter of the tree: " + diameter(root));
    }
    
}
