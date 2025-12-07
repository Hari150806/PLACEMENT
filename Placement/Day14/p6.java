package Placement.Day14;

public class p6 { //check if number has digit 0 using recursion
    public static boolean hasZero(int n){
        if(n == 0){
            return true;
        }
        if(n % 10 == 0){
            return true;
        }
        return hasZero(n / 10);
    }

    public static void main(String[] args) {
        int n = 123405;
        if(hasZero(n)){
            System.out.println(n + " contains digit 0");
        } else {
            System.out.println(n + " does not contain digit 0");
        }
    }
    
}
