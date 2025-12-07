package Placement.Day8;
import java.util.*;
public class p4 {  //postfix expression evaluation
    public static int postfixEval(String exp){
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<exp.length();i++){
            char ch=exp.charAt(i);
            if(Character.isDigit(ch)){
                s.push(ch-'0');
            }else{
                int op2=s.pop();
                int op1=s.pop();
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
        String exp="231*+9-";
        System.out.println("Postfix Evaluation: "+postfixEval(exp));
    }
    
}
