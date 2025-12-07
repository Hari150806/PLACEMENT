package Placement.Day10;
import java.util.*;
public class p4 { // kth element from end in linked list
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    static class LinkedList{
        Node head;
        Node tail;

        public void addFirst(int data){
            Node newNode=new Node(data);
            if(head==null){
                head=tail=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
        }

        public void addLast(int data){
            Node newNode=new Node(data);
            if(head==null){
                head=tail=newNode;
                return;
            }
            tail.next=newNode;
            tail=newNode;
        }

        public int kthFromEnd(int k){
            Node slow=head;
            Node fast=head;

            for(int i=0;i<k;i++){
                if(fast==null){
                    return -1; // k is greater than the length of the list
                }
                fast=fast.next;
            }

            while(fast!=null){
                slow=slow.next;
                fast=fast.next;
            }
            return slow.data;
        }
    }

    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.addFirst(10);
        list.addFirst(20);
        list.addLast(5);
        int k=2;
        System.out.println("Kth element from end: "+list.kthFromEnd(k));
    }
    
}
