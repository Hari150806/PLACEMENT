package Placement.Day20;

public class p3 { // partition problem using subset sum
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

    public static boolean canPartition(int[] set) {
        int totalSum = 0;
        for (int num : set) {
            totalSum += num;
        }
        if (totalSum % 2 != 0) {
            return false;
        }
        int targetSum = totalSum / 2;
        int n = set.length;
        Boolean[][] dp = new Boolean[n + 1][targetSum + 1];
        return isSubsetSum(set, n, targetSum, dp);
    }

    public static void main(String[] args) {
        int[] set = {1, 5, 11, 5};
        boolean result = canPartition(set);
        System.out.println("Can the set be partitioned into two subsets with equal sum? " + result);
    }
    
}
