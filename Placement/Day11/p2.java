package Placement.Day11;
import java.util.*;

public class p2 { // multiply the linked list
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

        public long multiplyList(){
            Node current=head;
            long mod=1000000007;
            long result=1;
            while(current!=null){
                result=(result*current.data)%mod;
                current=current.next;
            }
            return result;
        }
    }

    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);

        long product=list.multiplyList();
        System.out.println("Product of all elements in the linked list: "+product);
    }
    
}
