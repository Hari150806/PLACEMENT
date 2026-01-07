package Placement.Day28;

public class p7 { // bit masking
    public static void main(String[] args) {
        int n = 29; // Example number
        int k = 3;  // Example position (0-based)
        int mask = 1 << k; // Create a mask with 1 at kth position
        boolean isKthBitSet = (n & mask) != 0; // Check if kth bit is set
        System.out.println("The " + k + "th bit of " + n + " is set: " + isKthBitSet);
    }
    
}
