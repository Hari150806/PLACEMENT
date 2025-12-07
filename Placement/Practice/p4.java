package Placement.Practice;
import java.util.* ;
public class p4 {  //binary search using recursion
    public static int binarySearch(int arr[], int left, int right, int key){
        if(right >= left){
            int mid = left + (right - left) / 2;
            if(arr[mid] == key){
                return mid;
            }
            if(arr[mid] > key){
                return binarySearch(arr, left, mid - 1, key);
            }
            return binarySearch(arr, mid + 1, right, key);
        }
        return -1; // key not found
    }

    public static void main(String args[]){
        int arr[] = {2, 3, 4, 10, 40};
        int n = arr.length;
        int key = 10;
        int result = binarySearch(arr, 0, n - 1, key);
        if(result == -1){
            System.out.println("Element not present in array");
        }else{
            System.out.println("Element found at index: " + result);
        }
    }
    
}
