package com.company.trees;

import java.util.Stack;

//IMPLEMENTATION OF BINARY TREE USING ITERATIVE POSTORDER TRAVERSAL
public class BinaryTreeItePostO {

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

    public void postOrder(TreeNode root){
        if(root == null)
            return;
        TreeNode current = root;
        Stack<TreeNode> stack = new Stack<>();
        while(current != null || !stack.isEmpty()){
            if(current != null){
                stack.push(current);
                current = current.left;
            }else{
                TreeNode temp = stack.peek().right;
                if(temp == null){
                    temp = stack.pop();
                    System.out.print(temp.data+",");
                    while(!stack.isEmpty() && temp == stack.peek().right){
                        temp = stack.pop();
                        System.out.print(temp.data+",");
                    }
                }else{
                    current = temp;
                }
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

        third.right = sixth;
    }

    public static void main(String args[]){
        BinaryTreeItePostO bt = new BinaryTreeItePostO();
        bt.createBinaryTree();

        bt.postOrder(root);
    }
}
