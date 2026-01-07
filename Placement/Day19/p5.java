package Placement.Day19;

public class p5 {// count stairs using tabulation
    public static int countWays(int n) {
        if (n < 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        int[] table = new int[n + 1];
        table[0] = 1; // One way to stay at the ground (do nothing)
        for (int i = 1; i <= n; i++) {
            table[i] += table[i - 1];
            if (i >= 2) {
                table[i] += table[i - 2];
            }
            if (i >= 3) {
                table[i] += table[i - 3];
            }
        }
        return table[n];
    }

    public static void main(String[] args) {
        int n = 5; // Example: Number of stairs
        int result = countWays(n);
        System.out.println("Number of ways to climb " + n + " stairs is: " + result);
    }
    
}
