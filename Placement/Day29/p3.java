package Placement.Day29;

public class p3 { // find no of time repeating 
    public static void main(String[] args) {
	    int[] arr= {1,2,3,3,3,3,3,7,7,7,7,8,8,8,8,4,4,5,6};
	    int k= 5;
	    int n= arr.length;
	    for(int i=0;i< n;i++){
	        arr[arr[i]%n]+=n;
	    }
	    for(int i=0;i<n;i++){
	        if((arr[i]/n)>=k){
	            System.out.println(i+" is repeating "+k+" times");
	            break;
	        }
	    }
	    for(int i=0;i<n;i++){
	        arr[i]=arr[i]%n;
	    }
    }
    
}
