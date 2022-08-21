package com.company.trees;

//IMPLEMENTATION OF BINARY TREE USING RECURSIVE INORDER TRAVERSAL

/* 1. Traverse the left subtree in PreOrder Fashion
 * 2. Traverse the right subtree in PreOrder Fashion
 * 3. Visit the Node
 * */
public class BinaryTreeRecPostO {

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
        BinaryTreeRecPostO bt = new BinaryTreeRecPostO();
        bt.createBinaryTree();


    }
}
