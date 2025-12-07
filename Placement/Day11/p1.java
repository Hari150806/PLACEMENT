package Placement.Day11;

public class p1 { // detect loop in linked list
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

        public boolean hasLoop(){
            Node slow=head;
            Node fast=head;

            while(fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;

                if(slow==fast){
                    return true;
                }
            }
            return false;
        }
    }

    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);

        // Creating a loop for testing
        list.tail.next = list.head.next; // 30 -> 20

        if(list.hasLoop()){
            System.out.println("Loop detected in the linked list.");
        }else{
            System.out.println("No loop in the linked list.");
        }
    }
    
}
