package Placement.Day5;

public class p4 { // count zeros 0s in array
    public static void main(String[] args) {
        int []arr={0,1,0,2,0,3,4,0,5,0,0,6,0};
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                count++;
            }
        }
        System.out.println("Number of 0s in the array: "+count);
    }
    
}
