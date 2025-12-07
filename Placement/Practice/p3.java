package Placement.Practice;
import java.util.* ;
public class p3 { //linear search using recursion
    public static int linearSearch(int arr[], int n, int key){
        if(n<=0){
            return -1; // key not found
        }
        if(arr[n-1]==key){
            return n-1; // key found at index n-1
        }
        return linearSearch(arr, n-1, key); // search in the remaining array
    }

    public static void main(String args[]){
        int arr[] = {10, 20, 30, 40, 50};
        int n = arr.length;
        int key = 30;
        int result = linearSearch(arr, n, key);
        if(result != -1){
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
    
}
