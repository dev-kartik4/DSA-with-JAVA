package com.company.trees;

import java.util.Stack;

//IMPLEMENTATION OF BINARY TREE USING ITERATIVE INORDER TRAVERSAL
public class BinaryTreeIteInO {

    private static TreeNode root;

    private static class TreeNode{

        private int data;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public void inOrder(TreeNode root){
        if(root == null)
            return;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode temp = root;
        while(!stack.isEmpty() || temp != null){
            if(temp != null){
                stack.push(temp);
                temp = temp.left;
            }else{
                temp = stack.pop();
                System.out.print(temp.data+" ");
                temp = temp.right;
            }
        }
    }
    public void createBinaryTree(){
        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);
        TreeNode fifth = new TreeNode(5);
        TreeNode sixth = new TreeNode(6);

        root = first;
        first.left = second;
        first.right = third;

        second.left = fourth;
        second.right = fifth;

        third.left = sixth;
    }

    public static void main(String args[]){
        BinaryTreeIteInO bt = new BinaryTreeIteInO();
        bt.createBinaryTree();

        bt.inOrder(root);
    }
}
