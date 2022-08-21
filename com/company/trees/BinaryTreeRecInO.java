package com.company.trees;

//IMPLEMENTATION OF BINARY TREE USING RECURSIVE INORDER TRAVERSAL

/* 1. Traverse the left subtree in PreOrder Fashion
 * 2. Visit the Node
 * 3. Traverse the right subtree in PreOrder Fashion
 * */
public class BinaryTreeRecInO {

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
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
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

        BinaryTreeRecInO bt = new BinaryTreeRecInO();
        bt.createBinaryTree();

        bt.inOrder(root);
    }
}
