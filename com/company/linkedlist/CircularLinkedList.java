package com.company.linkedlist;

import java.util.NoSuchElementException;

public class CircularLinkedList {

    private ListNode last;
    private int length;

    private class ListNode{
        private ListNode next;
        private int data;

        public ListNode(int data){
            this.data = data;
        }
    }

    public CircularLinkedList(){
        last = null;
        length = 0;
    }

    public int length(){
        return length;
    }

    public boolean isEmpty(){
        return true;
    }

    public void traverseCircularLinkedList(){
        if(last == null)
            return;
        ListNode first = last.next;
        while(first != last){
            System.out.print(first.data + "-->");
            first = first.next;
        }
        System.out.print(first.data);
    }

    public void insertFirst(int value){
        ListNode temp = new ListNode(value);
        if(last == null)
            last = temp;
        else
            temp.next = last.next;
        last.next = temp;
        length++;
    }

    public void insertLast(int value){
        ListNode temp = new ListNode(value);
        if(last == null){
            last = temp;
            last.next = last;
        }else{
            temp.next = last.next;
            last.next = temp;
            last = temp;
        }
        length++;
    }

    public void removeFirst(){
        if(isEmpty())
            throw new NoSuchElementException();
        ListNode temp = last.next;
        if(last.next == last)
            last = null;
        else
            last.next = temp.next;
        temp.next = null;
        length--;
    }

    public void createCircularLinkedList(){
        ListNode first = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);
        ListNode fourth = new ListNode(40);
        ListNode fifth = new ListNode(50);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = first;

        last = fifth;
    }

    public static void main(String args[]){

        CircularLinkedList cll = new CircularLinkedList();
        cll.createCircularLinkedList();

        cll.insertFirst(5);
        cll.insertLast(55);
        cll.traverseCircularLinkedList();
    }
}
