package com.company.trees;

import java.util.Stack;

//IMPLEMENTATION OF BINARY TREE USING ITERATIVE PREORDER TRAVERSAL
public class BinaryTreeItePreO {

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

    public void preOrder(TreeNode root){
        if(root == null)
            return;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode temp = stack.pop();
            System.out.print(temp.data+" ");
            if(temp.right != null)
                stack.push(temp.right);
            if(temp.left != null)
                stack.push(temp.left);
        }
    }

    public void createBinaryTree() {
        TreeNode first = new TreeNode(9);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(4);
        TreeNode fourth = new TreeNode(5);
        TreeNode fifth = new TreeNode(3);

        root = first;
        first.left = second;
        first.right = third;

        second.left = fourth;
        second.right = fifth;
    }

    public static void main(String args[]){

        BinaryTreeItePreO bt = new BinaryTreeItePreO();
        bt.createBinaryTree();

        bt.preOrder(root);
    }
}
