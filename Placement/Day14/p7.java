package Placement.Day14;
import java.util.*;
public class p7 {  // tower of Hanoi using recursion
    public static void towerOfHanoi(int n, char source, char helper, char destination){
        if(n==1){
            System.out.println("Move disk 1 from "+source+" to "+destination);
            return;
        }
        towerOfHanoi(n-1, source, destination, helper);
        System.out.println("Move disk "+n+" from "+source+" to "+destination);
        towerOfHanoi(n-1, helper, source, destination);
    }

    public static void main(String[] args) {
        int n = 3; // number of disks
        towerOfHanoi(n, 'A', 'B', 'C'); // A, B and C are names of rods
    }
    
}
