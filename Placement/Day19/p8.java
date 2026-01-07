package Placement.Day19;

public class p8 { // how many handshake in room using n(n-1)/2
    public static int countHandshakes(int n) {
        return n * (n - 1) / 2;
    }

    public static void main(String[] args) {
        int n = 5; // Example: Number of people in the room
        int result = countHandshakes(n);
        System.out.println("Number of handshakes among " + n + " people is: " + result);
    }
    
}
