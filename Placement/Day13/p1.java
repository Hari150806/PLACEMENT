package Placement.Day13;
import java.util.*;
public class p1 {  // reverse a doubly linked list
    static class Node{
        int data;
        Node prev;
        Node next;

        Node(int data){
            this.data=data;
            this.prev=null;
            this.next=null;
        }
    }

    static class DoublyLinkedList{
        Node head;
        Node tail;

        public void addLast(int data){
            Node newNode=new Node(data);
            if(head==null){
                head=tail=newNode;
                return;
            }
            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;
        }

        public void printList(){
            Node current=head;
            while(current!=null){
                System.out.print(current.data+" <-> ");
                current=current.next;
            }
            System.out.println("null");
        }

        public void reverse(){
            Node current=head;
            Node temp=null;

            while(current!=null){
                temp=current.prev;
                current.prev=current.next;
                current.next=temp;
                current=current.prev;
            }

            if(temp!=null){
                head=temp.prev;
            }
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList list=new DoublyLinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        System.out.println("Original List:");
        list.printList();

        list.reverse();
        System.out.println("Reversed List:");
        list.printList();
    }
    
}
