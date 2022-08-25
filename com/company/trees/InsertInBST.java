package com.company.trees;

//IMPLEMENTING BINARY SEARCH TREE AND INSERTING NODE IN BST
//SEARCH A GIVEN KEY IN BINARY SEARCH TREE
public class InsertInBST {

    private static TreeNode root;

    private static class TreeNode{
        private int data;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(TreeNode root, int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public void insert(int value){
        root = insert(root,value);
    }

    public TreeNode insert(TreeNode root,int value){
        if(root == null){
            root = new TreeNode(root, value);
            return root;
        }
        if(value < root.data)
            root.left = insert(root.left,value);
        else
            root.right = insert(root.right,value);
        return root;
    }

    public void inOrder(){
        inOrder(root);
    }

    public void inOrder(TreeNode root){
        if(root == null)
            return;
        inOrder(root.left);
        System.out.print(root.data+",");
        inOrder(root.right);
    }

    //SEARCH KEY IN BINARY SEARCH TREE
    public TreeNode searchKey(TreeNode root,int key){
        if(root == null || root.data == key){
            return root;
        }
        if(key < root.data)
            return searchKey(root.left,key);
        else
            return searchKey(root.right,key);
    }
    //VALIDATE BINARY SEARCH TREE
    public boolean isValid(TreeNode root,long min,long max){
        if(root == null)
            return true;
        if(root.data <= min || root.data >= max)
            return false;
        boolean left = isValid(root.left,min,root.data);
        if(left){
            boolean right = isValid(root.right,root.data,max);
            return right;
        }
        return false;
    }
    public static void main(String args[]){

        InsertInBST bst = new InsertInBST();
        bst.insert(5);
        bst.insert(3);
        bst.insert(7);
        bst.insert(1);

        bst.inOrder(root);

        System.out.println();
        System.out.println("THE KEY IS "+bst.searchKey(root,3).data);

        System.out.println();
        System.out.println("IS THE ABOVE BINARY SEARCH TREE VALID ? " +bst.isValid(root,Long.MIN_VALUE,Long.MAX_VALUE));
    }
}
