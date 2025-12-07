package Placement.Day1;
import java.util.*;

public class p4 {  // swapping integer
    public static void main(String[] args) {
        int a = 12345;
        int rev=0;
        while(a!=0){
            int l=a%10;
            if(l==2){
                l=6;
            }
            rev=rev*10+l;
            a=a/10;
        }
        System.out.println(rev);
    }
    
}
