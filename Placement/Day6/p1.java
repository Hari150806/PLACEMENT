package Placement.Day6;

public class p1 {// sliding window maximum
    public static void main(String[] args) {
        int []arr={1,3,-1,-3,5,3,6,7};
        int k=3;
        for(int i=0;i<=arr.length-k;i++){
            int max=Integer.MIN_VALUE;
            for(int j=i;j<i+k;j++){
                if(arr[j]>max){
                    max=arr[j];
                }
            }
            System.out.print(max+" ");
        }
    }
    
}
