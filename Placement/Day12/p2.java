package Placement.Day12;
import java.util.*;
public class p2 {  // find pairs with given sum in double linked list
    static class Node{
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }

    public static void findPairsWithSum(Node head, int targetSum) {
        Node left = head;
        Node right = head;

        // Move right to the end of the list
        while (right.next != null) {
            right = right.next;
        }

        boolean found = false;

        while (left != null && right != null && left != right && right.next != left) {
            int currentSum = left.data + right.data;

            if (currentSum == targetSum) {
                System.out.println("(" + left.data + ", " + right.data + ")");
                found = true;
                left = left.next;
                right = right.prev;
            } else if (currentSum < targetSum) {
                left = left.next;
            } else {
                right = right.prev;
            }
        }

        if (!found) {
            System.out.println("No pairs found with the given sum.");
        }
    }
    
}
