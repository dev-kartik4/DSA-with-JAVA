package com.company.stacks;

//IMPLEMENTED STACK USING LINKEDLIST
public class StackImplementation{

    private static ListNode top;
    private static int length;

    private class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
        }
    }

    public StackImplementation(){
        top = null;
        length = 0;
    }

    public boolean isEmpty(){
        return length == 0;
    }

    public int length(){
        return length;
    }


    //PUSHING ELEMENT INTO STACK
    public void push(int data){
        ListNode temp = new ListNode(data);
        temp.next = top;
        top = temp;
        length++;
    }

    //POPPING ELEMENT OUT OF STACK
    public int pop(){
        int result = top.data;
        top = top.next;
        length--;
        return result;
    }

    //PEEK TO CHECK TOP ELEMENT IN STACK
    public int peek(){
        return top.data;
    }

    public static void main(String args[]){
        StackImplementation stack = new StackImplementation();
        stack.push(5);
        stack.push(10);
        stack.push(15);
        stack.push(20);
        stack.push(25);

        System.out.println("THE TOP ELEMENT IS "+stack.peek());

    }
}
