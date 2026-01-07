package Placement.Day28;

public class p5 { // bit difference
    public static void main(String[] args) {
        int a = 29; // Example number 1
        int b = 15; // Example number 2
        int xor = a ^ b;
        int count = 0;
        while (xor != 0) {
            count += (xor & 1);
            xor >>= 1;
        }
        System.out.println("Number of differing bits between " + a + " and " + b + ": " + count);
    }
    
}
