package Placement.Day27;

public class p2 { // Bit manipulation to find unique number in array where every other number occurs twice
    public static int findUnique(int[] arr) {
        int unique = 0;
        for (int num : arr) {
            unique ^= num; // XOR operation
        }
        return unique;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 4, 5, 3, 2};
        int uniqueNumber = findUnique(arr);
        System.out.println("The unique number is: " + uniqueNumber);
    }
    
}
