package Placement.Day7;
import java.util.*;

public class p4 {  // merge sorted array without extra space
    public static void main(String[] args) {
        int []arr1={1,5,9,10,15,20};
        int []arr2={2,3,8,13};
        int n1=arr1.length;
        int n2=arr2.length;
        for(int i=0;i<n1;i++){
            if(arr1[i]>arr2[0]){
                // swap
                int temp=arr1[i];
                arr1[i]=arr2[0];
                arr2[0]=temp;
                // sort arr2
                Arrays.sort(arr2);
            }
        }
        // print arr1
        for(int i=0;i<n1;i++){
            System.out.print(arr1[i]+" ");
        }
        // print arr2
        for(int i=0;i<n2;i++){
            System.out.print(arr2[i]+" ");
        }
    }
    
}
