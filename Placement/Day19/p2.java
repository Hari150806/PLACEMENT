package Placement.Day19;

public class p2 { // dynamic programming in fibonacci
    public static int fibonacci(int n, int[] memo) {
        if (n <= 1) {
            return n;
        }
        if (memo[n] != -1) {
            return memo[n];
        }
        memo[n] = fibonacci(n - 1, memo) + fibonacci(n - 2, memo);
        return memo[n];
    }

    public static void main(String[] args) {
        int n = 10; // Example: Calculate the 10th Fibonacci number
        int[] memo = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            memo[i] = -1;
        }
        int result = fibonacci(n, memo);
        System.out.println("Fibonacci number at position " + n + " is: " + result);
    }
    
}
