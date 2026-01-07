package Placement.Day27;

public class p4 { // clear last bit
    public static void main(String[] args) {
        int n = 5; // Example number
        int result = n & (~1); // Clear the last bit
        System.out.println("Original number: " + n);
        System.out.println("Number after clearing last bit: " + result);
    }
    
}
