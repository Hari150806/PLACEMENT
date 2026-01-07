package Placement.Practice;
import java.util.*;
public class p7 { //knapsack problem
    
    //Knapsack Problem
    public static int knapsack(int[] weights, int[] values, int W, int n) {
        if (n == 0 || W == 0) {
            return 0;
        }
        if (weights[n - 1] <= W) {
            return Math.max(values[n - 1] + knapsack(weights, values, W - weights[n - 1], n - 1),
                            knapsack(weights, values, W, n - 1));
        } else {
            return knapsack(weights, values, W, n - 1);
        }
    }
    public static void main(String[] args) {
        int[] weights = {2, 3, 4, 5};
        int[] values = {3, 4, 5, 6};
        int W = 5;
        int n = weights.length;

        System.out.println("Maximum value in Knapsack = " + knapsack(weights, values, W, n));
    }
    
}
