package Placement.Day28;

public class p3 { // power of two
    public static void main(String[] args) {
        int n = 16; // Example number
        boolean isPowerOfTwo = (n > 0) && ((n & (n - 1)) == 0);
        System.out.println(n + " is power of two: " + isPowerOfTwo);
    }
    
}
