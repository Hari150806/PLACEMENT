package Placement.Day21;

public class p2 { //rod cutting
    public static int rodCutting(int[] prices, int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0;

        for (int i = 1; i <= n; i++) {
            int maxVal = Integer.MIN_VALUE;
            for (int j = 0; j < i; j++) {
                maxVal = Math.max(maxVal, prices[j] + dp[i - j - 1]);
            }
            dp[i] = maxVal;
        }

        return dp[n];
    }

    public static void main(String[] args) {
        int[] prices = {1, 5, 8, 9, 10, 17, 17, 20}; // Prices for lengths 1 to 8
        int n = prices.length;
        int maxProfit = rodCutting(prices, n);
        System.out.println("Maximum obtainable value is: " + maxProfit);
    }
    
}
