package Placement.Day4;

public class p3 {  // subarray sum present or not with indices
    public static boolean Subarr(int[] arr,int sum){
        
        for(int i=0;i<arr.length;i++){  // starting of sunarray
            for(int j=i;j<arr.length;j++){  //len of subarray
                int subsum=0;
                for(int k=i;k<=j;k++){  // print all sub array
                    subsum+=arr[k];
                    
                }
                if(sum==subsum){
                    System.out.print(i+1+" "+(j+1));
                    
                }
            }
        }
        
    }
    public static void main(String[] args) {
        int []arr={4,2,6,7,8,1,9,0};
        boolean result=Subarr(arr,21);
        System.out.print(result);
	}
    
}
