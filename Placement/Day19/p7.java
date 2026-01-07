package Placement.Day19;

public class p7 { //friends pairing problem using dp
    public static int friendsPairing(int n, int[] dp) {
        if (n <= 2) {
            return n;
        }
        if (dp[n] != -1) {
            return dp[n];
        }
        dp[n] = friendsPairing(n - 1, dp) + (n - 1) * friendsPairing(n - 2, dp);
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 5; // Example: Number of friends
        int[] dp = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            dp[i] = -1;
        }
        int result = friendsPairing(n, dp);
        System.out.println("Number of ways to pair " + n + " friends is: " + result);
    }
    
}
