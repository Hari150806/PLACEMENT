package Placement.Day1;

import java.util.*;

public class p1 {  //star pattern using recursion
    public static void printTable(int n,int i,int j){
        if(i > j){
            return;
        }
        System.out.println(n+" * "+i+" = "+(n*i));
        printTable(n, i + 1, j);   // increment i
    }

    public static void main(String[] args){
        printTable(8, 3, 18);
    }
}
