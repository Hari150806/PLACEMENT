package Placement.Day13;
import java.util.*;
public class p2 {  // deletion in circular linked list
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    static class CircularLinkedList{
        Node head;
        Node tail;

        public void addLast(int data){
            Node newNode=new Node(data);
            if(head==null){
                head=tail=newNode;
                tail.next=head; // point to itself
                return;
            }
            tail.next=newNode;
            tail=newNode;
            tail.next=head; // maintain circular nature
        }

        public void printList(){
            if(head==null) return;
            Node current=head;
            do{
                System.out.print(current.data+" -> ");
                current=current.next;
            }while(current!=head);
            System.out.println("(back to head)");
        }

        public void deleteNode(int key){
            if(head==null) return;

            // If the list contains only one node
            if(head.data==key && head.next==head){
                head=null;
                tail=null;
                return;
            }

            Node current=head;
            Node prev=null;

            // If head needs to be deleted
            if(head.data==key){
                tail.next=head.next;
                head=head.next;
                return;
            }

            // Search for the key to be deleted
            do{
                prev=current;
                current=current.next;
            }while(current!=head && current.data!=key);

            // If key was found
            if(current.data==key){
                prev.next=current.next;
                // If tail is to be deleted
                if(current==tail){
                    tail=prev;
                }
            }
        }
    }

    public static void main(String[] args) {
        CircularLinkedList list=new CircularLinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);

        System.out.println("Original List:");
        list.printList();

        list.deleteNode(30);
        System.out.println("After deleting 30:");
        list.printList();

        list.deleteNode(10);
        System.out.println("After deleting 10 (head):");
        list.printList();

        list.deleteNode(50);
        System.out.println("After deleting 50 (tail):");
        list.printList();
    }
    
}
