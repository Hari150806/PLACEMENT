package Placement.Day3;

public class p1 { // find the missing number in an array of size n-1 containing numbers from 1 to n
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6, 7, 8};
        System.out.println(findMissingNumber(arr));//o/p:5
    }

    public static int findMissingNumber(int[] arr) {
        int n = arr.length + 1;//ex:7+1=8
        long sum = (long) n * (n + 1) / 2;// ex:8*(9)/2=>72/2=36
        long arrsum = 0;
        for (int i = 0; i < arr.length; i++) {
            arrsum += (long) arr[i];//(1+2+3+4+6+7+8)=31
        }
        return (int)(sum - arrsum);//36-31=5
    }
    
}
