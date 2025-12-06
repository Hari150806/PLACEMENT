package Placement.Day1;
import java.util.*;

public class p3 {
    public static void main(String[] args) {
        int a = 12345;
        int n=(int)Math.log10(a)+1;
        int f=a/(int)Math.pow(10,n-1);
        int l=a%10;
        a=a-l+f;//set last digit
        a=l*(int)Math.pow(10,n-1)+a%(int)Math.pow(10,n-1);
        System.out.println(a);
    }
    
}
