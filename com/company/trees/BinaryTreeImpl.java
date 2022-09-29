package com.company.trees;

//IMPLEMENTATION OF BINARY TREE
//HEIGHT OF BINARY TREE
//SIZE AND MAX/MIN OF BINARY TREE

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node{
    Node left,right;
    int data;

    public Node(int data){
        this.data = data;
    }
}
public class BinaryTreeImpl {

    static Scanner sc;
    static Node createTree(){
        Node root = null;

        System.out.println("ENTER DATA");
        int data = sc.nextInt();
        if(data == -1) return null;

        root = new Node(data);

        System.out.println("ENTER LEFT FOR "+data);
        root.left = createTree();

        System.out.println("ENTER RIGHT FOR "+data);
        root.right = createTree();

        return root;
    }

    //HEIGHT OF BINARY TREE
    static int height(Node root){
        if(root == null)
            return 0;
        return Math.max(height(root.left),height(root.right))+1;
    }

    //SIZE OF BINARY TREE
    static int size(Node root){
        if(root == null)
            return 0;
        return size(root.left) + size(root.right) + 1;
    }

    //MAXIMUM OF A BINARY TREE
    static int maximum(Node root){
        if(root == null)
            return Integer.MIN_VALUE;
        return Math.max(root.data,Math.max(maximum(root.left),maximum(root.right)));
    }

    //LEVEL ORDER TRAVERSAL OF A BINARY TREE
    static void printLevelOrder(Node root){
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            Node temp = queue.poll();
            System.out.println(temp.data+",");
            if(temp.left != null)
                queue.add(temp.left);
            if(temp.right != null)
                queue.add(temp.right);
        }
    }

    //LEFT VIEW OF A BINARY TREE
    static void printLeftViewUtil(Node root,ArrayList list,int level){

        if(root == null) return;
        if(list.get(level)==null)
            list.add(root);
        printLeftViewUtil(root.left,list,level+1);
        printLeftViewUtil(root.right,list,level+1);
    }
    static void printLeftView(Node root){
        ArrayList<Node> list = new ArrayList<>();
        printLeftViewUtil(root,list,0);

        for(Node cur : list){
            System.out.print(cur.data+",");
        }
    }

    static void printRightViewUtil(Node root,ArrayList list,int level){
        if(root == null) return;
        list.set(level,root);
        printLeftViewUtil(root.left,list,level+1);
        printLeftViewUtil(root.right,list,level+1);
    }
    public static void main(String args[]){
        sc = new Scanner(System.in);

        createTree();

        System.out.println("THE HEIGHT OF THE BINARY TREE IS "+height(createTree()));
    }

}
