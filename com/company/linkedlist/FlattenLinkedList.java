package com.company.linkedlist;

import java.util.*;
public class FlattenLinkedList{

    private static ListNode head;
    private static class ListNode{
        private int data;
        private ListNode next;
        private ListNode down;

        public ListNode(int data){
            this.data = data;
            this.next = null;
            this.down = null;
        }
    }

    public void display(ListNode head){
        if(head == null)
            return;

        System.out.print(" "+head.data+" ");
        if(head.down != null){
            System.out.print("[");
            display(head.down);
            System.out.print("]");
        }
        display(head.next);
    }

    public ListNode convertList(ListNode head){
        ListNode current = head;
        Queue<ListNode> queue = new ArrayDeque<>();
        //process all nodes
        while(current != null){
            //last node is reached
            if(current.next == null)
                //dequeue the front node and set it as the next node
                // of the current node
                current.next = queue.poll();

            //if the current node has a child
            if(current.down != null)
                queue.add(current.down);

            //advance the current node
            current = current.next;
        }
        return head;
    }

    //THIS IS RECURSIVE METHOD FOR FLATTENING A MULTILEVEL LINKED LIST
    //BECAUSE TO AVOID EXTRA SPACE
    public ListNode flattenList(ListNode head){
        // base case
        if(head == null)
            return null;
        // keep track of the next pointer
        ListNode next = head.next;
        // process the down list first
        head.next = flattenList(head.down);
        // go to the last node
        ListNode tail = head;
        while(tail.next != null){
            tail = tail.next;
        }
        // process the next list after the down list
        tail.next = flattenList(next);
        // return head node
        return head;
    }
    public void createLoopInLinkedList(){
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        ListNode five = new ListNode(5);
        ListNode six = new ListNode(6);
        ListNode seven = new ListNode(7);
        ListNode eight = new ListNode(8);
        ListNode nine = new ListNode(9);
        ListNode ten = new ListNode(10);
        ListNode eleven = new ListNode(11);
        ListNode twelve = new ListNode(12);
        ListNode thirteen = new ListNode(13);
        ListNode fourteen = new ListNode(14);
        ListNode fifteen = new ListNode(15);

        head = one;

        one.next = four;
        four.next = fourteen;
        fourteen.next = fifteen;
        five.next = nine;
        nine.next = ten;
        seven.next = eight;
        eleven.next = thirteen;

        one.down = two;
        two.down = three;
        four.down = five;
        five.down = six;
        six.down = seven;
        ten.down = eleven;
        eleven.down = twelve;

    }
    public static void main(String args[]){
        FlattenLinkedList fll = new FlattenLinkedList();
        fll.createLoopInLinkedList();

        System.out.println("The original list is :");
        fll.display(head);

        System.out.println("The flattened list is :");
        ListNode prev = fll.convertList(head);
        fll.display(prev);

    }
}
