package Placement.Day27;

public class p5 { // set nth last bit
    public static void main(String[] args) {
        int n = 5; // Example number
        int k = 1; // Example position (0-based)
        int result = n | (1 << k); // Set the nth last bit
        System.out.println("Original number: " + n);
        System.out.println("Number after setting " + k + "th last bit: " + result);
    }
    
}
