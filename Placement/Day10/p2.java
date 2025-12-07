package Placement.Day10;
import java.util.*;
public class p2 {  // deletion in linked list
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

        public void deleteFirst(){
            if(head==null){
                System.out.println("List is empty");
                return;
            }
            head=head.next;
            if(head==null){
                tail=null;
            }
        }

        public void printList(){
            Node current=head;
            while(current!=null){
                System.out.print(current.data+" -> ");
                current=current.next;
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.addFirst(10);
        list.addFirst(20);
        list.addLast(5);
        list.printList();
        list.deleteFirst();
        list.printList();
    }
    
}
