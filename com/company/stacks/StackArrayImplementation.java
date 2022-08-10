package com.company.stacks;

//IMPLEMENTING STACK USING ARRAY
class Stack{
    int arr[];
    int top;
    int capacity;

    public Stack(int capacity){
        this.capacity = capacity;
        this.top = -1;
        arr = new int[capacity];
    }

    public void push(int data) throws Exception {
        if(top == capacity-1)
            throw new Exception("STACK OVERFLOWED WITH ELEMENTS");
        top++;
        arr[top] = data;
    }

    public int pop() throws Exception{
        if(top == -1)
            throw new Exception("STACK UNDERFLOWED WITH ELEMENTS");
        int result = arr[top];
        top--;
        return result;
    }

    public int peek() throws Exception{
        if(top == -1)
            throw new Exception("STACK SEEMS TO BE EMPTY");
        return arr[top];
    }

    public boolean isEmpty(){
        return top == -1;
    }
}
public class StackArrayImplementation {

    public static void main(String args[]) throws Exception {
        Stack stack = new Stack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println("THE TOP MOST ELEMENT IS " +stack.peek());

    }

}
