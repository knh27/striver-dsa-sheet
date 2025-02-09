package com.pranav.striver_dsa_sheet.treemedium;

public class BalancedTree {

    public static void main(String[] args) {

    }

    /*static class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        int lh=height(root.left);
        int rh=height(root.right);

        if(Math.abs(lh-rh)>1) return false;
        else return isBalanced(root.left) && isBalanced(root.right);
    }

    public int height(TreeNode root){
        if(root==null)return 0;
        if(root.left==null && root.right==null) return 1;
        return 1+Math.max(height(root.left), height(root.right));

    }

}*/


    //this is optimal solution from chatgpt
    static class Solution {
        public boolean isBalanced(TreeNode root) {
            return checkHeight(root) != -1;
        }

        private int checkHeight(TreeNode root) {
            if (root == null) return 0;

            int leftHeight = checkHeight(root.left);
            if (leftHeight == -1) return -1;

            int rightHeight = checkHeight(root.right);
            if (rightHeight == -1) return -1;

            if (Math.abs(leftHeight - rightHeight) > 1) return -1;

            return Math.max(leftHeight, rightHeight) + 1;
        }
    }

    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val=val;
            this.right=null;
            this.left=null;
        }
    }

}
