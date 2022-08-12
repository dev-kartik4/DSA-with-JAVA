package com.company.queues;

import java.util.*;
class Queue{

    private static ListNode front;
    private static ListNode rear;
    private static int length;

    private class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public boolean isEmpty(){
        return length == 0;
    }

    public int length(){
        return length;
    }

    public void printElements(){
        ListNode current = front;
        while(current != null){
            System.out.print(current.data+"-->");
            current = current.next;
        }
        System.out.print("null");
    }
    public void enqueue(int data){
        ListNode newNode = new ListNode(data);
        if(isEmpty())
            front = newNode;
        else
            rear.next = newNode;
        rear = newNode;
        length++;
    }

    public int dequeue(){
        if(isEmpty())
            throw new NoSuchElementException();
        int result = front.data;
        front = front.next;
        if(front == null)
            rear = null;
        length--;
        return result;
    }
}
public class QueueImplementation {

    public static void main(String args[]){
        Queue queue = new Queue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        //System.out.println("ELEMENT " +queue.dequeue() +" MOVED OUT OF QUEUE");

        System.out.println();
        queue.printElements();


        System.out.println();
        System.out.println("THE LENGTH OF THE QUEUE IS " +queue.length());
    }
}
