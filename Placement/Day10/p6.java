package Placement.Day10;

public class p6 { // remove duplicates from sorted linked list
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

        public void removeDuplicates(){
            Node current=head;
            while(current!=null && current.next!=null){
                if(current.data==current.next.data){
                    current.next=current.next.next;
                }else{
                    current=current.next;
                }
            }
        }
    }

    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.addLast(10);
        list.addLast(10);
        list.addLast(20);
        list.addLast(20);
        list.addLast(30);
        list.printList();
        list.removeDuplicates();
        list.printList();
    }
    
}
