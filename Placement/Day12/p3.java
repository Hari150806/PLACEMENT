package Placement.Day12;
import java.util.*;
public class p3 {  // rortate doubly linked list with key k=3
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

    public static Node rotateDoublyLinkedList(Node head, int k) {
        if (head == null || k == 0) {
            return head;
        }

        Node current = head;
        int count = 1;

        while (count < k && current != null) {
            current = current.next;
            count++;
        }

        if (current == null) {
            return head; // k is greater than the number of nodes
        }

        Node kthNode = current;

        while (current.next != null) {
            current = current.next;
        }

        current.next = head;
        head.prev = current;

        head = kthNode.next;
        head.prev = null;
        kthNode.next = null;

        return head;
    }
    
}
