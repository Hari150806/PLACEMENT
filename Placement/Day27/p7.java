package Placement.Day27;

public class p7 { // bit manupulation to check last bit is set or not
    public static void main(String[] args) {
        int n = 5; // Example number
        if ((n & 1) == 1) {
            System.out.println("Last bit is set (odd number)");
        } else {
            System.out.println("Last bit is not set (even number)");
        }
    }
    
}
