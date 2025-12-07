package Placement.Day10;

public class p5 {  // reverse linked list
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

        public void printList(){
            Node current=head;
            while(current!=null){
                System.out.print(current.data+" -> ");
                current=current.next;
            }
            System.out.println("null");
        }

        public void reverse(){
            Node prev=null;
            Node current=head;
            Node next;
            while(current!=null){
                next=current.next;
                current.next=prev;
                prev=current;
                current=next;
            }
            head=prev;
        }
    }

    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.addFirst(10);
        list.addFirst(20);
        list.addLast(5);
        System.out.println("Original List:");
        list.printList();
        list.reverse();
        System.out.println("Reversed List:");
        list.printList();
    }
    
}
