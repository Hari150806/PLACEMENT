package Placement.Day9;
import java.util.*;
public class p3 { // get min form stack
    static class MinStack{
        Stack<Integer> s;
        Stack<Integer> minS;

        MinStack(){
            s=new Stack<>();
            minS=new Stack<>();
        }

        public void push(int data){
            s.push(data);
            if(minS.isEmpty() || data<=minS.peek()){
                minS.push(data);
            }
        }

        public int pop(){
            if(s.isEmpty()){
                return -1;
            }
            int top=s.pop();
            if(top==minS.peek()){
                minS.pop();
            }
            return top;
        }

        public int getMin(){
            if(minS.isEmpty()){
                return -1;
            }
            return minS.peek();
        }
    }

    public static void main(String[] args) {
        MinStack ms=new MinStack();
        ms.push(5);
        ms.push(2);
        ms.push(1);
        ms.push(3);
        System.out.println(ms.getMin());
        ms.pop();
        System.out.println(ms.getMin());
    }
    
}
