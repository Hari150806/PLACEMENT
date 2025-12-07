package Placement.Day5;

public class p3 { // first and last occurrence
    public static void main(String[] args) {
        int []arr={10,20,30,40,50,60,70,80,90,100,70,110};
        int target=70;
        int first=-1;
        int last=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                if(first==-1){
                    first=i;
                }
                last=i;
            }
        }
        if(first!=-1){
            System.out.println("First occurrence at index: "+first);
            System.out.println("Last occurrence at index: "+last);
        }else{
            System.out.println("Element not found");
        }
    }
    
}
