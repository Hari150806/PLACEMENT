package Placement.Practice;
import java.util.* ;
public class p5 { // mutliply two linked lists
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node multiplyLinkedLists(Node head1, Node head2){
        int num1 = 0, num2 = 0;
        Node current1 = head1;
        Node current2 = head2;

        while(current1 != null){
            num1 = num1 * 10 + current1.data;
            current1 = current1.next;
        }

        while(current2 != null){
            num2 = num2 * 10 + current2.data;
            current2 = current2.next;
        }

        int product = num1 * num2;

        Node dummyHead = new Node(0);
        Node current = dummyHead;

        if(product == 0){
            return new Node(0);
        }

        Stack<Integer> stack = new Stack<>();
        while(product > 0){
            stack.push(product % 10);
            product /= 10;
        }

        while(!stack.isEmpty()){
            current.next = new Node(stack.pop());
            current = current.next;
        }

        return dummyHead.next;
    }

    public static void printList(Node head){
        Node current = head;
        while(current != null){
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String args[]){
        Node head1 = new Node(3);
        head1.next = new Node(4);
        head1.next.next = new Node(2); // represents number 342

        Node head2 = new Node(4);
        head2.next = new Node(6);
        head2.next.next = new Node(5); // represents number 465

        Node resultHead = multiplyLinkedLists(head1, head2);
        System.out.print("Product Linked List: ");
        printList(resultHead); // should represent number 159030
    }
    
}
