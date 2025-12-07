package Placement.Day4;

public class p1 {  // subarray 
    public static void main(String[] args) {
        int []arr={4,2,6,7,8,1,9,0};
        for(int i=0;i<arr.length;i++){  // starting of sunarray
            for(int j=i;j<arr.length;j++){  //len of subarray
                for(int k=i;k<=j;k++){  // print all sub array
                    System.out.print(arr[k]+" ");
                }
                System.out.println("");
            }
        }
    }
    
}
