package Placement.Day9;
import java.util.*;
public class p4 {  // next greter element
    public static void printNGE(int[] arr) {
        int n = arr.length;
        Stack<Integer> s = new Stack<>();
        int[] nge = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            while (!s.isEmpty() && s.peek() <= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nge[i] = -1;
            } else {
                nge[i] = s.peek();
            }
            s.push(arr[i]);
        }

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " --> " + nge[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 25, 7, 8};
        printNGE(arr);
    }


}
