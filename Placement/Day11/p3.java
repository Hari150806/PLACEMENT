package Placement.Day11;
import java.util.*;
public class p3 {  // merge two sorted 
    public static Node mergeTwoSortedLinkedList(Node head1, Node head2) {
        if (head1 == null) return head2;
        if (head2 == null) return head1;

        Node mergedHead;
        if (head1.data <= head2.data) {
            mergedHead = head1;
            head1 = head1.next;
        } else {
            mergedHead = head2;
            head2 = head2.next;
        }

        Node mergedTail = mergedHead;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                mergedTail.next = head1;
                head1 = head1.next;
            } else {
                mergedTail.next = head2;
                head2 = head2.next;
            }
            mergedTail = mergedTail.next;
        }

        if (head1 != null) {
            mergedTail.next = head1;
        } else {
            mergedTail.next = head2;
        }

        return mergedHead;
    }

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    
}
