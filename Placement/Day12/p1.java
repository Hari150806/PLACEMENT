package Placement.Day12;
import java.util.*;
public class p1 { //doubly linked list
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

        public void addFirst(int data){
            Node newNode=new Node(data);
            if(head==null){
                head=tail=newNode;
                return;
            }
            newNode.next=head;
            head.prev=newNode;
            head=newNode;
        }

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
    }

    public static void main(String[] args) {
        DoublyLinkedList list=new DoublyLinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addFirst(5);
        list.addLast(30);
        list.printList();
    }
    
}
