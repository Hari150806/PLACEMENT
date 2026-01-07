package Placement.Day19;

public class p4 { // count stairs using memorization
    public static int countWays(int n, int[] memo) {
        if (n < 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        if (memo[n] != -1) {
            return memo[n];
        }
        memo[n] = countWays(n - 1, memo) + countWays(n - 2, memo) + countWays(n - 3, memo);
        return memo[n];
    }

    public static void main(String[] args) {
        int n = 5; // Example: Number of stairs
        int[] memo = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            memo[i] = -1;
        }
        int result = countWays(n, memo);
        System.out.println("Number of ways to climb " + n + " stairs is: " + result);
    }
    
}
