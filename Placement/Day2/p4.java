package Placement.Day2;

public class p4 {   // second largest in an array
    public static void main(String[] args) {
		 int []arr = {3,1,6,7,8,9,5,3};
		 int max= arr[0];
		 for(int i=0;i<arr.length;i++){
		     if(arr[i]>max){
		         max=arr[i];
		     }
		 }
		 int smax=-1;
		 for(int i=0;i<arr.length;i++){
		     if(arr[i]>smax && arr[i]<max){
		         smax=arr[i];
		     }
		 }
		 System.out.print(smax);
	
	}
    
}
