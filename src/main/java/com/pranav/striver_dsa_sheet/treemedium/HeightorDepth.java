package com.pranav.striver_dsa_sheet.treemedium;

//import com.pranav.striver_dsa_sheet.treeeasy.Node;

public class HeightorDepth {
    public static void main(String[] args) {
        TreeNode a=new TreeNode(1);
        TreeNode b=new TreeNode(2);
        TreeNode c=new TreeNode(3);
        TreeNode d=new TreeNode(4);
        TreeNode e=new TreeNode(5);
        TreeNode f=new TreeNode(6);
        TreeNode g=new TreeNode(7);

        a.left=b;
        a.right=c;

        b.left=d;
        b.right=null;

        c.left=e;
        c.right=f;

        f.left=g;
        f.right=null;

/*
                1
              /  \
            2     3
          /     /  \
        4      5    6
                   /
                  7

 */
    }
    
    static int height(TreeNode root){
        if(root==null) return 0;
        int lh=height(root.left);
        int rh=height(root.right);
        return 1+Math.max(lh, rh);
    }
}

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val=val;
        this.left=null;
        this.right=null;
    }
}
