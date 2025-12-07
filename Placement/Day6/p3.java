package Placement.Day6;

public class p3 { // bitonic point in an array
    public static void main(String[] args) {
        int []arr={1,3,8,12,4,2};
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int mid=left+(right-left)/2;
            if(arr[mid]>arr[mid+1]){
                right=mid;
            }else{
                left=mid+1;
            }
        }
        System.out.println("Bitonic point is at index: "+left);
    }
    
}
