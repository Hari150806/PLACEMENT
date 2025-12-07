package Placement.Day8;
import java.util.*;
public class p5 {  // prefix expression evaluation
    public static int prefixEval(String str){
        Stack<Integer> s=new Stack<>();

        for(int i=str.length()-1;i>=0;i--){
            char ch=str.charAt(i);

            if(Character.isDigit(ch)){
                s.push(ch-'0');
            }else{
                int op1=s.pop();
                int op2=s.pop();

                switch(ch){
                    case '+':
                        s.push(op1+op2);
                        break;
                    case '-':
                        s.push(op1-op2);
                        break;
                    case '*':
                        s.push(op1*op2);
                        break;
                    case '/':
                        s.push(op1/op2);
                        break;
                }
            }
        }
        return s.pop();
    }

    public static void main(String[] args) {
        String str="-+7*45+20";
        System.out.println("Prefix Evaluation: "+prefixEval(str));
    }
    
}
