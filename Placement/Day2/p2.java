package Placement.Day2;

public class p2 {
    public static void main(String[] args) { // Fibonacci series without recursion
		int n= 7;
		int a=0;
		int b= 1;
		
		if(n==0 ||n==1){
		    System.out.print("0");
		}else if(n==2){
		    System.out.print("0 1");
		   
		}else{
		    System.out.print("0 1 ");
		    for(int i=2;i<n;i++){
		        int nt=a+b;
		        System.out.print(nt+" ");
		        a=b;
		        b=nt;
		    }
		}
		    
		
	}
    
}
