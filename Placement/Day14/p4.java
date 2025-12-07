package Placement.Day14;

public class p4 { // sum of digits in a number using recursion
    public static int sumOfDigits(int n){
        if(n == 0){
            return 0;
        }
        return (n % 10) + sumOfDigits(n / 10);
    }

    public static void main(String[] args) {
        int n = 12345;
        System.out.println("Sum of digits in " + n + " is: " + sumOfDigits(n));
    }
    
}
