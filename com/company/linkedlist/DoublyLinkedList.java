package com.company.linkedlist;

import java.util.NoSuchElementException;
public class DoublyLinkedList{

    private static ListNode head;
    private static ListNode tail;
    private static int length;

    private class ListNode{
        private int data;
        private ListNode next;
        private ListNode previous;

        public ListNode(int data){
            this.data = data;
            this.next = null;
            this.previous = null;
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

    public void insertFirst(int data){
        ListNode newNode = new ListNode(data);
        if(isEmpty())
            tail = newNode;
        else
            head.previous = newNode;
        newNode.next = head;
        head = newNode;
        length++;
    }

    public void insertLast(int data){
        ListNode newNode = new ListNode(data);
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
            ListNode current = tail;
            if(head == tail)
                head = null;
            else
                tail.previous.next = null;
            tail = tail.previous;
            current.previous = null;
            length--;
        }
    }
    public static void main(String args[]){
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertFirst(5);
        dll.insertFirst(4);
        dll.insertFirst(3);
        dll.insertFirst(2);
        dll.insertFirst(1);

        dll.insertLast(6);
        dll.insertLast(7);
        dll.insertLast(8);
        dll.insertLast(9);
        dll.insertLast(10);

        dll.deleteFirst();
        dll.deleteLast();

        System.out.println("DISPLAYING FORWARD");
        dll.displayForward();

        System.out.println("");
        System.out.println("DISPLAYING BACKWARD");
        dll.displayBackward();
    }
}



