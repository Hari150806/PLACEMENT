package Placement.Day10;
import java.util.*;
public class p3 { //delete linked list without lead pointer
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

        public void deleteNode(Node node){
            if(node==null || node.next==null){
                System.out.println("Cannot delete the node");
                return;
            }
            node.data=node.next.data;
            node.next=node.next.next;
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
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.printList();

        // Deleting node with value 20
        Node nodeToDelete=list.head.next; // Node with value 20
        list.deleteNode(nodeToDelete);
        list.printList();
    }
    
}
