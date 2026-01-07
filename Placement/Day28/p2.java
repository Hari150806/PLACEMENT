package Placement.Day28;

public class p2 { // flip nth last bit
    public static void main(String[] args) {
        int n = 10; // Example number
        int k = 2; // Example position (0-based)
        int result = n ^ (1 << k); // Flip the kth last bit
        System.out.println("Original number: " + n);
        System.out.println("Number after flipping " + k + "th last bit: " + result);
    }
    
}
