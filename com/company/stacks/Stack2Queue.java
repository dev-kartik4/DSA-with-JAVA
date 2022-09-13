package com.company.stacks;

import java.util.ArrayDeque;
import java.util.Queue;

//IMPLEMENT STACK USING 2 QUEUES
class Stacks{
    Queue<Integer> q1 = new ArrayDeque<>();
    Queue<Integer> q2 = new ArrayDeque<>();

    void push(int data){
        while(!q1.isEmpty()){
            q2.offer(q1.poll());
        }
        q1.offer(data);
        while(!q2.isEmpty()){
            q1.offer(q2.poll());
        }
    }

    int pop(){
        return q1.poll();
    }
}
public class Stack2Queue {

    public static void main(String args[]){
        Stacks stack = new Stacks();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println(stack.pop());

    }
}
