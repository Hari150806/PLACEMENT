package Placement.Day28;

public class p6 { //unique number 1
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 4, 5, 3, 4}; // Example array
        int uniqueNumber = 0;
        for (int num : arr) {
            uniqueNumber ^= num; // XOR operation
        }
        System.out.println("The unique number is: " + uniqueNumber);
    }
    
}
