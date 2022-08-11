package com.company.stacks;
import java.util.*;
import java.util.Stack;

//FINDING NEW ARRAY WITH NEXT GREATER ELEMENTS IN THE GIVEN ARRAY
public class NextGreaterElement {

    static int result[];
    public static void printArray(int[] numbers){
        for(int i=0;i<=numbers.length-1;i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println("");
    }
    public static int[] findNextGreaterElements(int[] numbers) throws Exception {
        result = new int[numbers.length];
        Stack<Integer> stack = new Stack();
        for(int i = numbers.length-1;i>=0;i--){
            if(!stack.isEmpty()){
                while(!stack.isEmpty() && stack.peek()<=numbers[i]){
                    stack.pop();
                }
            }
            if(stack.isEmpty())
                result[i] = -1;
            else
                result[i] = stack.peek();
            stack.push(numbers[i]);
        }
        return result;
    }
    public static void main(String args[]) throws Exception {
        int numbers[] = {4,7,3,4,8,1};

        System.out.println("AFTER FINDING NEXT GREATER ELEMENTS");
        findNextGreaterElements(numbers);
        printArray(result);
    }
}
