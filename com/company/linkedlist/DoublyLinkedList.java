package com.company.linkedlist;

import java.util.NoSuchElementException;

public class DoublyLinkedList{

    private static ListNode head;
    private static ListNode tail;
    private static int length;

    private class ListNode{

        private int data;
        private ListNode previous;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
        }
    }

    public DoublyLinkedList(){
        this.head = head;
        this.tail = tail;
        this.length = 0;
    }

    public boolean isEmpty(){
        return length == 0;
    }

    public int length(){
        return length;
    }

    public void insertFirst(int value){
        ListNode newNode = new ListNode(value);
        if(isEmpty())
            tail = newNode;
        else
            head.previous = newNode;
        newNode.next = head;
        head = newNode;
        length++;
    }

    public void insertLast(int value){
        ListNode newNode = new ListNode(value);
        if(isEmpty())
            head = newNode;
        else{
            tail.next = newNode;
            newNode.previous = tail;
        }
        tail = newNode;
        length++;
    }

    public void displayForward(){
        ListNode current = head;
        while(current != null){
            System.out.print(current.data+"-->");
            current = current.next;
        }
        System.out.print("null");
    }

    public void displayBackward(){
        ListNode current = tail;
        while(current != null){
            System.out.print(current.data+"-->");
            current = current.previous;
        }
        System.out.print("null");
    }

    public void deleteFirst(){
        if(isEmpty())
            throw new NoSuchElementException();
        else{
            ListNode current = head;
            if(head == tail)
                tail = null;
            else
                head.next.previous = null;
            head = head.next;
            current.next = null;
            length--;
        }
    }

    public void deleteLast(){
        if(isEmpty())
            throw new NoSuchElementException();
        else{
            ListNode current = head;
            if(head == tail)
                head = null;
            else
                tail.previous.next = null;
            tail = tail.next;
            current.next = null;
            length--;
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertFirst(5);
        dll.insertFirst(4);
        dll.insertFirst(3);

        System.out.println("DISPLAYING FORWARD");
        dll.displayForward();

        System.out.println("");
        System.out.println("DISPLAYING BACKWARD");
        dll.displayBackward();
    }

}



