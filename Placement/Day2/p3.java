package Placement.Day2;
import java.util.*;

public class p3 { // Square pattern
    public static void main(String[] args) {
		int n=6;
		int size=2*n-1;//size of matrix
		int a=n-1,b=n-1;//position of center square pattern
		for(int i=0;i<size;i++){
		    for(int j=0;j<size;j++){
		        int c_to_x=Math.max(Math.abs(a-i),Math.abs(b-j));//dis b/w center to element
		        System.out.print(c_to_x+1+" ");
		        
		    }
		    System.out.println(" ");
		}
	}
    
}
