package Placement.Day16;
import java.util.*;
public class p1 {  //print all node at level k
    static class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }

    static void printKLevel(Node root, int k) {
        if (root == null) {
            return;
        }
        if (k == 0) {
            System.out.print(root.data + " ");
            return;
        }
        printKLevel(root.left, k - 1);
        printKLevel(root.right, k - 1);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int k = 2;
        System.out.println("Nodes at level " + k + ":");
        printKLevel(root, k);
    }
    
}
