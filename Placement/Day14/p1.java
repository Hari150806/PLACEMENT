package Placement.Day14;

public class p1 { // count no of digits in a number using recursion
    public static int countDigits(int n){
        if(n == 0){
            return 0;
        }
        return 1 + countDigits(n / 10);
    }

    public static void main(String[] args) {
        int n = 123456;
        System.out.println("Number of digits in " + n + " is: " + countDigits(n));
    }
    
}
