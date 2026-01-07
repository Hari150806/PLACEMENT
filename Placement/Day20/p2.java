package Placement.Day20;

public class p2 { // subset sum problem using dp
    public static boolean isSubsetSum(int[] set, int n, int sum, Boolean[][] dp) {
        if (sum == 0) {
            return true;
        }
        if (n == 0) {
            return false;
        }
        if (dp[n][sum] != null) {
            return dp[n][sum];
        }
        if (set[n - 1] <= sum) {
            dp[n][sum] = isSubsetSum(set, n - 1, sum - set[n - 1], dp) ||
                          isSubsetSum(set, n - 1, sum, dp);
            return dp[n][sum];
        } else {
            dp[n][sum] = isSubsetSum(set, n - 1, sum, dp);
            return dp[n][sum];
        }
    }

    public static void main(String[] args) {
        int[] set = {3, 34, 4, 12, 5, 2};
        int sum = 9;
        int n = set.length;
        Boolean[][] dp = new Boolean[n + 1][sum + 1];
        boolean result = isSubsetSum(set, n, sum, dp);
        System.out.println("Is there a subset with the given sum? " + result);
    }
    
}
