package com.company.stacks;

import java.util.Stack;

public class ReverseStringStack {

    public static String reverseStringWithStack(String str){
        Stack<Character> stack = new Stack<>();
        char charArray[] = str.toCharArray();
        for(char c : charArray)
            stack.push(c);

        for(int i=0;i<str.length();i++)
            charArray[i] = stack.pop();

        return new String(charArray);
    }

    public static void main(String args[]){
        String str = "KARTIK";

        System.out.println("BEFORE REVERSING STRING "+str);

        System.out.println("AFTER REVERSING STRING "+reverseStringWithStack(str));
    }
}
