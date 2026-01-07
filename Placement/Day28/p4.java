package Placement.Day28;

public class p4 { //power of four
    public static void main(String[] args) {
        int n = 16; // Example number
        boolean isPowerOfFour = (n > 0) && ((n & (n - 1)) == 0) && ((n - 1) % 3 == 0);
        System.out.println(n + " is power of four: " + isPowerOfFour);
    }
    
}
