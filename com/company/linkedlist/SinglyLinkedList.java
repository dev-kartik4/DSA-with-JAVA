package com.company.linkedlist;

public class SinglyLinkedList{

    private static ListNode head;
    private static class ListNode{

        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void display(){
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

    public void insertFirst(int value){
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
    }

    public void insertLast(int value){
        ListNode newNode = new ListNode(value);
        if(head == null || head.next == null)
            return;
        else{
            ListNode previous = head;
            while(previous.next != null){
                previous = previous.next;
            }
            previous.next = newNode;
        }
    }

    public void insertNode(int value,int position){
        ListNode newNode = new ListNode(value);
        if(position == 1){
            newNode.next = head;
            head = newNode;
        }else{
            ListNode previous = head;
            int count = 1;
            while(count < position-1){
                previous = previous.next;
                count++;
            }
            ListNode temp = previous.next;
            previous.next = newNode;
            newNode.next = temp;
        }
    }

    public void deleteFirst(){
        if(head == null)
            return;
        else{
            ListNode temp = head;
            head = head.next;
            temp.next = null;
        }
    }

    public void deleteLast(){
        if(head == null || head.next == null)
            return;
        else{
            ListNode previous = null;
            ListNode current = head;
            while(current.next != null){
                previous = current;
                current = current.next;
            }
            previous.next = null;
        }
    }

    public void deleteNode(int position){
        if(position == 1)
            head = head.next;
        else{
            ListNode previous = head;
            int count = 1;
            while(count < position-1){
                previous = previous.next;
                count++;
            }
            ListNode temp = previous.next;
            previous.next = temp.next;
            temp.next = null;
        }
    }

    public boolean searchElement(ListNode head,int searchKey){
        ListNode current = head;
        while(current.next != null){
            if(current.data == searchKey)
                return true;
            current = current.next;
        }
        return false;
    }

    public ListNode reverseLinkedList(){
        ListNode current = head;
        ListNode previous = null;
        ListNode next = null;
        while(current != null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }

    public ListNode findMiddleNode(){
        if(head == null)
            return head;
        else{
            ListNode fastPtr = head;
            ListNode slowPtr = head;
            while(fastPtr != null && fastPtr.next != null){
                fastPtr = fastPtr.next.next;
                slowPtr = slowPtr.next;
            }
            return slowPtr;
        }
    }

    public ListNode getNthNodeFromEnd(int n){
        if(head == null)
            return head;
        else{
            ListNode refPtr = head;
            ListNode mainPtr = head;
            int count = 1;
            while(count < n){
                refPtr = refPtr.next;
                count++;
            }
            while(refPtr != null && refPtr.next != null){
                refPtr = refPtr.next;
                mainPtr = mainPtr.next;
            }
            return mainPtr;
        }
    }

    public void removeDuplicates(){
        ListNode current = head;
        while(current.next != null){
            if(current.data == current.next.data)
                current.next = current.next.next;
            else
                current = current.next;
        }
    }

    public void insertInSortedLinkedList(int value){
        ListNode newNode = new ListNode(value);
        ListNode current = head;
        ListNode temp = null;
        while(current.next != null && current.data < newNode.data){
            temp = current;
            current = current.next;
        }
        temp.next = newNode;
        newNode.next = current;
    }

    public void removeKey(int element){
        ListNode current = head;
        ListNode temp = null;
        while(current.data != element){
            temp = current;
            current = current.next;
        }
        temp.next = current.next;
    }

    public boolean detectLoop(){
        ListNode fastPtr = head;
        ListNode slowPtr = head;
        while(fastPtr != null && fastPtr.next != null){
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
            if(slowPtr == fastPtr)
                return true;
        }
        return false;
    }

    public ListNode findStartOfLoop(){
        if(head == null)
            return head;
        else{
            ListNode slowPtr = head;
            ListNode fastPtr = head;
            while(fastPtr != null && fastPtr.next != null){
                fastPtr = fastPtr.next.next;
                slowPtr = slowPtr.next;
                if(slowPtr == fastPtr)
                    getStartNodeOfLoop(slowPtr);
            }
        }
        return null;
    }

    public ListNode getStartNodeOfLoop(ListNode slowPtr){
        ListNode temp = head;
        while(temp != slowPtr){
            temp = temp.next;
            slowPtr = slowPtr.next;
        }
        return temp;
    }

    public void removeLoop(ListNode slowPtr){
        ListNode temp = head;
        while(temp.next != slowPtr){
            temp = temp.next;
            slowPtr = slowPtr.next;
        }
        slowPtr.next = null;
    }

    public boolean checkPalindrome(ListNode head){
        if(head == null)
            return true;

        ListNode current = head;
        ListNode previous = null;
        ListNode next = null;
        while(current != null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        ListNode p1 = head;
        ListNode p2 = previous;

        while(p1 != null){
            if(p1.data != p2.data)
                return false;
            p1 = p1.next;
            p2 = p2.next;
        }
        return true;
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null)
            return head;
        else{
            ListNode refPtr = head;
            ListNode mainPtr = head;
            ListNode previous = null;
            int count = 1;
            while(count<n){
                refPtr = refPtr.next;
                count++;
            }
            while(refPtr != null && refPtr.next != null){
                refPtr = refPtr.next;
                previous = mainPtr;
                mainPtr = mainPtr.next;
            }
            ListNode temp = mainPtr;
            previous.next = refPtr;
            temp.next = null;
            return head;
        }
    }

    public ListNode merge(ListNode a,ListNode b){
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        while(a != null && b != null){
            if(a.data < b.data){
                tail.next = a;
                a = a.next;
            }else{
                tail.next = b;
                b = b.next;
            }
            tail = tail.next;
        }
        if(a == null)
            tail.next = b;
        else
            tail.next = a;
        return dummy.next;
    }

    public ListNode add(ListNode a,ListNode b){
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        int carry = 0;
        while(a != null || b != null){
            int x = (a != null) ? a.data : 0;
            int y = (b != null) ? b.data : 0;
            int sum = carry + x + y;
            carry = sum/10;
            tail.next = new ListNode(sum%10);
            tail = tail.next;
            if(a != null) a = a.next;
            if(b != null) b = b.next;
        }
        if(carry > 0)
            tail.next = new ListNode(carry);
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
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.createLoopInLinkedList();

        sll.insertFirst(5);
        sll.insertLast(55);
        sll.insertNode(15,3);


        sll.display();
        System.out.println();
        System.out.println("LENGTH OF THE LINKED LIST "+sll.length());

        System.out.println();
        System.out.println("MIDDLE NODE OF THE LINKED LIST IS "+sll.findMiddleNode().data);

        System.out.println();
        System.out.println("NTH NODE FROM THE END OF THE LINKED LIST IS "+sll.getNthNodeFromEnd(2).data);

    }
}