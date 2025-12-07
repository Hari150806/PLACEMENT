package Placement.Day6;

public class p2 { // index of extra element in one array
    public static void main(String[] args) {
        int []arr1={1,2,3,4,5};
        int []arr2={1,2,3,4,5,6};
        int index=-1;
        for(int i=0;i<arr2.length;i++){
            if(i>=arr1.length || arr1[i]!=arr2[i]){
                index=i;
                break;
            }
        }
        System.out.println("Index of extra element: "+index);
    }
    
}
