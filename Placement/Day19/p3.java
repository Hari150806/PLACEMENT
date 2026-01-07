package Placement.Day19;

public class p3 { //fibonacci using tabulation
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        int[] table = new int[n + 1];
        table[0] = 0;
        table[1] = 1;
        for (int i = 2; i <= n; i++) {
            table[i] = table[i - 1] + table[i - 2];
        }
        return table[n];
    }

    public static void main(String[] args) {
        int n = 10; // Example: Calculate the 10th Fibonacci number
        int result = fibonacci(n);
        System.out.println("Fibonacci number at position " + n + " is: " + result);
    }
    
}
