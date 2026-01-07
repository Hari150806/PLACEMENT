package Placement.Day19;

public class p9 { // no.of ways to place 4x4 grid using 1x4 tiles
    public static int countWays(int n, int m) {
        if (n < m) {
            return 1;
        }
        return countWays(n - 1, m) + countWays(n - m, m);
    }

    public static void main(String[] args) {
        int n = 4; // Length of the grid
        int m = 4; // Size of the tile
        int result = countWays(n, m);
        System.out.println("Number of ways to place 1x" + m + " tiles in a " + n + " length grid is: " + result);
    }
    
}
