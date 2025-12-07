package Placement.Day13;
import java.util.*;
public class p3 {  // recursion apowerb
    public static int apowerb(int a,int b){
        if(b==0){
            return 1;
        }
        return a*apowerb(a,b-1);
    }
    public static void main(String[] args) {
        int a=2;
        int b=5;
        System.out.println(apowerb(a,b));
    }
    
}
