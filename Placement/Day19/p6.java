package Placement.Day19;

public class p6 { //ncr using dp
    public static int nCr(int n, int r, int[][] dp) {
        if (r == 0 || r == n) {
            return 1;
        }
        if (dp[n][r] != -1) {
            return dp[n][r];
        }
        dp[n][r] = nCr(n - 1, r - 1, dp) + nCr(n - 1, r, dp);
        return dp[n][r];
    }

    public static void main(String[] args) {
        int n = 5; // Example: Total items
        int r = 2; // Example: Items to choose
        int[][] dp = new int[n + 1][r + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= r; j++) {
                dp[i][j] = -1;
            }
        }
        int result = nCr(n, r, dp);
        System.out.println("nCr of " + n + " and " + r + " is: " + result);
    }
    
}
