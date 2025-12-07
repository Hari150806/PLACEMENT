package Placement.Day6;

public class p5 {  // prefix sum array
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        int []prefixSum=new int[arr.length];
        prefixSum[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefixSum[i]=prefixSum[i-1]+arr[i];
        }
        System.out.print("Prefix Sum Array: ");
        for(int i=0;i<prefixSum.length;i++){
            System.out.print(prefixSum[i]+" ");
        }
    }
    
}
