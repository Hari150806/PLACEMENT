package Placement.Day4;

public class p2 {   // subarray sum present or not
    public static void main(String[] args) {
        int []arr={4,2,6,7,8,1,9,0};
        int sum =21;
        for(int i=0;i<arr.length;i++){  // starting of sunarray
            for(int j=i;j<arr.length;j++){  //len of subarray
                int subsum=0;
                for(int k=i;k<=j;k++){  // print all sub array
                    subsum+=arr[k];
                    
                }
                if(sum==subsum){
                    System.out.print("present");
                }
               //System.out.println("");
            }
        }
    }
    
}
