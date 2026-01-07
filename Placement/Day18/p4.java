package Placement.Day18;

public class p4 { // convert into heap tree
    static class TreeNode {
        int data;
        TreeNode left, right;

        TreeNode(int n) {
            this.data = n;
            this.left = null;
            this.right = null;
        }
    }
    public static void inorderTraversal(TreeNode root, java.util.List<Integer> list) {
        if (root == null) {
            return;
        }
        inorderTraversal(root.left, list);
        list.add(root.data);
        inorderTraversal(root.right, list);
    }
    public static TreeNode sortedArrayToBST(java.util.List<Integer> list, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = (start + end) / 2;
        TreeNode node = new TreeNode(list.get(mid));
        node.left = sortedArrayToBST(list, start, mid - 1);
        node.right = sortedArrayToBST(list, mid + 1, end);
        return node;
    }
    public static TreeNode convertToHeapTree(TreeNode root) {
        java.util.List<Integer> list = new java.util.ArrayList<>();
        inorderTraversal(root, list);
        return sortedArrayToBST(list, 0, list.size() - 1);
    }
    public static void printInorder(TreeNode root) {
        if (root == null) {
            return;
        }
        printInorder(root.left);
        System.out.print(root.data + " ");
        printInorder(root.right);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(30);
        root.right = new TreeNode(20);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(15);
        root.right.right = new TreeNode(25);

        System.out.println("Inorder traversal of the original tree:");
        printInorder(root);
        System.out.println();

        TreeNode heapRoot = convertToHeapTree(root);

        System.out.println("Inorder traversal of the converted heap tree:");
        printInorder(heapRoot);
    }
    
    
}
