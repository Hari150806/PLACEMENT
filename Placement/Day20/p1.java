package Placement.Day20;
import java.util.*;
public class p1 {  // knapsack
    public static int knapsack(int W, int wt[], int val[], int n) {
        if (n == 0 || W == 0) {
            return 0;
        }
        if (wt[n - 1] <= W) {
            return Math.max(val[n - 1] + knapsack(W - wt[n - 1], wt, val, n - 1),
                    knapsack(W, wt, val, n - 1));
        } else {
            return knapsack(W, wt, val, n - 1);
        }
    }

    public static void main(String[] args) {
        int val[] = {60, 100, 120};
        int wt[] = {10, 20, 30};
        int W = 50;
        int n = val.length;
        System.out.println("Maximum value in Knapsack = " + knapsack(W, wt, val, n));
    }
    
}
