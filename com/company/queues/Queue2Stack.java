package com.company.queues;

import java.util.Stack;

//IMPLEMENT QUEUE USING 2 STACK
class Queues{
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    void offer(int data){
        s1.push(data);
    }

    int poll(){
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        int ans = s2.pop();
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
        return ans;
    }
}
public class Queue2Stack {

    public static void main(String args[]){
        Queues queue = new Queues();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);

        System.out.println(queue.poll());
    }
}
