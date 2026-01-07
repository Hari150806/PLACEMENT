package Placement.Day28;

public class p8 { // single number 2
    public static void main(String[] args) {
        int[] arr = {6, 1, 3, 3, 3, 6, 6}; // Example array
        int result = 0;
        for (int i = 0; i < 32; i++) {
            int sum = 0;
            for (int num : arr) {
                if (((num >> i) & 1) == 1) {
                    sum++;
                }
            }
            if (sum % 3 != 0) {
                result |= (1 << i);
            }
        }
        System.out.println("The unique number is: " + result);
    }
    
}
