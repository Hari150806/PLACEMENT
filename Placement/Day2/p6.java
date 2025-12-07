package Placement.Day2;

public class p6 {  // reverse an array
    public static void main(String[] args) {
		int []arr ={1,3,6,7,2,9};
		int n=arr.length/2;
		for(int i=0;i<n;i++){
		    int temp=arr[i];
		    arr[i]=arr[arr.length-1-i];
		    arr[arr.length-1-i]=temp;
		    
		}
	    for(int l=0;l<arr.length;l++){
	        System.out.print(arr[l]+",");
	    }
    	
	}
    
}
