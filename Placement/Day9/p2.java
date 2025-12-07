package Placement.Day9;
import java.util.*;
public class p2 {  //Two stack in one array
    static class TwoStack{
        int arr[];
        int top1,top2;
        int size;

        TwoStack(int n){
            arr=new int[n];
            size=n;
            top1=-1;
            top2=n;
        }

        // push in stack1
        public void push1(int data){
            if(top1+1 < top2){
                top1++;
                arr[top1]=data;
            }else{
                System.out.println("Stack Overflow");
            }
        }

        // push in stack2
        public void push2(int data){
            if(top1+1 < top2){
                top2--;
                arr[top2]=data;
            }else{
                System.out.println("Stack Overflow");
            }
        }

        // pop from stack1
        public int pop1(){
            if(top1 >= 0){
                int val=arr[top1];
                top1--;
                return val;
            }else{
                System.out.println("Stack Underflow");
                return -1;
            }
        }

        // pop from stack2
        public int pop2(){
            if(top2 < size){
                int val=arr[top2];
                top2++;
                return val;
            }else{
                System.out.println("Stack Underflow");
                return -1;
            }
        }
    }

    public static void main(String[] args) {
        TwoStack ts=new TwoStack(5);
        ts.push1(10);
        ts.push2(20);
        ts.push1(30);
        ts.push2(40);

        System.out.println(ts.pop1());
        System.out.println(ts.pop2());
    }
    
}
