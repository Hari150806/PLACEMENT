package Placement.Day29;

public class p1 { // happy number
    private int nextNumber(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }

    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do {
            slow = nextNumber(slow);                 // 1 step
            fast = nextNumber(nextNumber(fast));    // 2 steps
        } while (slow != fast);

        return slow == 1;
    }
    public static void main(String[] args) {
        p1 happyNumberChecker = new p1();
        int number = 19; // Example number
        if (happyNumberChecker.isHappy(number)) {
            System.out.println(number + " is a happy number.");
        } else {
            System.out.println(number + " is not a happy number.");
        }
    }
    
}
