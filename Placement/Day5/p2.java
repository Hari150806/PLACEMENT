package Placement.Day5;

public class p2 { // linear search
    public static void main(String[] args) {
        int []arr={10,20,30,40,50,60,70,80,90,100};
        int target=70;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.println("Element found at index: "+i);
                return;
            }
        }
        System.out.println("Element not found");
    }
    
}
