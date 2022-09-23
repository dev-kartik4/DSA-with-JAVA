package com.company.stacks;

import java.util.*;

//CONVERSION OF INFIX TO POSTFIX USING STACK
public class InfixToPostfix {

    public static int Prec(char ch){
        switch(ch){
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }
    public static String infixToPostfix(String exp){
        String result = "";

        Deque<Character> stack = new ArrayDeque<>();

        for(int i=0;i<exp.length();i++){
            char ch = exp.charAt(i);

            if(Character.isLetterOrDigit(ch))
                result += ch;
            else if(ch == '(')
                stack.push(ch);

            else if(ch == ')'){
                while(!stack.isEmpty() && stack.peek() != '('){
                    result += stack.peek();
                    stack.pop();
                }
                stack.pop();
            }else{
                while(!stack.isEmpty() && Prec(ch)<=Prec(stack.peek())){
                    result += stack.peek();
                    stack.pop();
                }
                stack.push(ch);
            }
        }
        while(!stack.isEmpty()){
            if(stack.peek() == '(')
                return "INVALID EXPRESSION";
            result += stack.peek();
            stack.pop();
        }
        return result;
    }
    public static void main(String args[]){
        String exp = "a+b*(c^d-e)^(f+g*h)-i";
        System.out.println(infixToPostfix(exp));
    }
}
