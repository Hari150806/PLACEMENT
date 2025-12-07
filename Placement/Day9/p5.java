package Placement.Day9;
import java.util.*;
public class p5 { //check if top of stack is greater than the array element
    public static boolean checkStackArray(Stack<Integer> s, int arr[], int n) {
        if (s.size() != n) {
            return false; // Sizes don't match
        }

        for (int i = 0; i < n; i++) {
            if (s.pop() <= arr[i]) {
                return false; // Stack top is not greater than array element
            }
        }

        return true; // All stack tops are greater than corresponding array elements
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);

        int arr[] = {5, 15, 25};
        int n = arr.length;

        boolean result = checkStackArray(s, arr, n);
        System.out.println("Are all stack tops greater than array elements? " + result);
    }
    
}
