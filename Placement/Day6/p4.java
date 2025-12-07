package Placement.Day6;

public class p4 {// square root of integer in array
    public static void main(String[] args) {
        int []arr={1,4,9,16,25,36,49,64,81,100};
        int []sqrtArr=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            sqrtArr[i]=(int)Math.sqrt(arr[i]);
        }
        System.out.print("Square roots of the array elements: ");
        for(int i=0;i<sqrtArr.length;i++){
            System.out.print(sqrtArr[i]+" ");
        }
    }
    
}
