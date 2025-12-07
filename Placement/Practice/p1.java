package Placement.Practice;
import java.util.* ;
public class p1 { //check if array is sorted or not using recursion
    public static boolean isSorted(int arr[], int n){
        if(n==1 || n==0){
            return true;
        }
        if(arr[0] > arr[1]){
            return false;
        }
        else{
            int smallArr[] = new int[n-1];
            for(int i=1; i<n; i++){
                smallArr[i-1] = arr[i];
            }
            boolean isSmallArrSorted = isSorted(smallArr, n-1);
            return isSmallArrSorted;
        }
    }

    public static void main(String args[]){
        int arr[] = {1, 2, 3, 4, 5};
        int n = arr.length;
        if(isSorted(arr, n)){
            System.out.println("Array is sorted");
        }else{
            System.out.println("Array is not sorted");
        }
    }
    
}
