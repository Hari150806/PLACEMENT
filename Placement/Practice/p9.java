package Placement.Practice;
import java.util.*;
public class p9 {//knapsack using memoization

    //Knapsack Problem using Memoization
    public static int knapsackMemo(int[] weights, int[] values, int W, int n, int[][] memo) {
        if (n == 0 || W == 0) {
            return 0;
        }
        if (memo[n][W] != -1) {
            return memo[n][W];
        }
        if (weights[n - 1] <= W) {
            memo[n][W] = Math.max(values[n - 1] + knapsackMemo(weights, values, W - weights[n - 1], n - 1, memo),
                                  knapsackMemo(weights, values, W, n - 1, memo));
        } else {
            memo[n][W] = knapsackMemo(weights, values, W, n - 1, memo);
        }
        return memo[n][W];
    }

    public static void main(String[] args) {
        int[] weights = {2, 3, 4, 5};
        int[] values = {3, 4, 5, 6};
        int W = 5;
        int n = weights.length;

        int[][] memo = new int[n + 1][W + 1];
        for (int i = 0; i <= n; i++) {
            Arrays.fill(memo[i], -1);
        }

        System.out.println("Maximum value in Knapsack using Memoization = " + knapsackMemo(weights, values, W, n, memo));
    }
    
    
}
