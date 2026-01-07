package Placement.Day27;

public class p8 { // nth last bit set or not
    public static void main(String[] args) {
        int n = 10; // Example number
        int k = 2; // Example position (0-based)
        if ((n & (1 << k)) != 0) {
            System.out.println("The " + k + "th bit is set.");
        } else {
            System.out.println("The " + k + "th bit is not set.");
        }
    }
    
}
