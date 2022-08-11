package com.company.stacks;

import java.util.Stack;

public class ValidParentheses{

    public static boolean isValid(String str){
        Stack<Character> stack = new Stack<>();
        char[] charArray = str.toCharArray();
        for(char ch:charArray){
            if(ch == '{' || ch == '(' || ch == '[')
                stack.push(ch);
            else{
                char top = stack.peek();
                if(stack.isEmpty())
                    return false;
                else{
                    if((ch == ')' && top == '(') ||
                            (ch == ']' && top == '[') ||
                            (ch == '}' && top == '{'))
                        stack.pop();
                    else
                        return false;
                }
            }
        }
        return stack.isEmpty();
    }
    public static void main(String args[]){
        String str = "{()}";
        System.out.println("THE PARENTHESES ARE VALID "+isValid(str));
    }
}
