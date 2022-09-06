package com.company.linkedlist;

import java.util.*;
public class CloneLinkedList{

    private static ListNode head;
    private static class ListNode{

        private int data;
        private ListNode next;
        private ListNode random;

        public ListNode(int data){
            this.data = data;
            this.next = null;
            this.random = null;
        }
    }

    public void display(ListNode head){
        ListNode current = head;
        while(current != null){
            System.out.print(current.data+"-->");
            current = current.next;
        }
        System.out.print("null");
    }

    public int length(){
        ListNode current = head;
        int count = 1;
        while(current.next != null){
            current = current.next;
            count++;
        }
        return count;
    }

    public ListNode cloneLinkedList(ListNode head){
        HashMap<ListNode,ListNode> map = new HashMap<ListNode,ListNode>();
        if(head == null || head.next == null)
            return head;
        ListNode current = head;
        while(current != null){
            map.put(current, new ListNode(current.data));
            current = current.next;
        }
        current = head;
        ListNode dummy = new ListNode(0);
        ListNode cloneHead = dummy;
        while(current != null){
            cloneHead.next = map.get(current);
            map.get(current).random = map.get(current.random);
            current = current.next;
            cloneHead = cloneHead.next;
        }
        for (Map.Entry<ListNode,ListNode> entry : map.entrySet()){
            System.out.println(entry.getKey().data + " => "
                    + ": " + entry.getValue().data);
        }
        return dummy.next;
    }


    public void createLoopInLinkedList(){
        ListNode first = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);
        ListNode fourth = new ListNode(40);
        ListNode fifth = new ListNode(50);

        head = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
    }

    public static void main(String args[]){
        CloneLinkedList cll = new CloneLinkedList();
        cll.createLoopInLinkedList();


        cll.display(head);
        System.out.println();
        System.out.println("LENGTH OF THE LINKED LIST "+cll.length());

        System.out.println();
        ListNode prev = cll.cloneLinkedList(head);

        System.out.println("AFTER CLONING LINKED LIST ");
        cll.display(prev);


    }
}
