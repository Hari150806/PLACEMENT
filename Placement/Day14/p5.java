package Placement.Day14;

public class p5 { // count no of n in given integer using recursion
    public static int countN(int n, int digit){
        if(n == 0){
            return 0;
        }
        int count = (n % 10 == digit) ? 1 : 0;
        return count + countN(n / 10, digit);
    }

    public static void main(String[] args) {
        int n = 122331241;
        int digit = 2;
        System.out.println("Count of digit " + digit + " in " + n + " is: " + countN(n, digit));
    }
    
}
