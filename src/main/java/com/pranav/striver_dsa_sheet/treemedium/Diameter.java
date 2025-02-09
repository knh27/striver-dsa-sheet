package com.pranav.striver_dsa_sheet.treemedium;

public class Diameter {
    static int diameter=0;
    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        // Call function to find diameter
        findDiameter(root);

        // Print final diameter
        System.out.println("Diameter of the tree: " + diameter);
    }
    static int findDiameter(TreeNode root){
        if(root==null)return 0;
        int lD=findDiameter(root.left);
        int rD=findDiameter(root.right);
        diameter=Math.max(diameter, lD+rD);
        return 1+Math.max(rD, lD);
    }


    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val=val;
            this.left=null;
            this.right=null;
        }
    }
}


