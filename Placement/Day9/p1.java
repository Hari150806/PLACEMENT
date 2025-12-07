package Placement.Day9;

import java.util.*;
public class p1 { // reverse first k element of Queue
    public static void reverseKElements(Queue<Integer> q, int k) {
        Stack<Integer> s = new Stack<>();

        // Step 1: Push first k elements into the stack
        for (int i = 0; i < k; i++) {
            if (!q.isEmpty()) {
                s.push(q.poll());
            }
        }

        // Step 2: Enqueue back the stack elements to the queue
        while (!s.isEmpty()) {
            q.offer(s.pop());
        }

        // Step 3: Move the remaining elements to the back of the queue
        int size = q.size();
        for (int i = 0; i < size - k; i++) {
            q.offer(q.poll());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);
        q.offer(5);

        int k = 3;
        reverseKElements(q, k);

        while (!q.isEmpty()) {
            System.out.println(q.poll() + " ");
        }
    }
}