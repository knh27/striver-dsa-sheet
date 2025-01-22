package com.pranav.striver_dsa_sheet.treeeasy;

import java.util.*;

public class IterativeTraversal {
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

//        preOrderIterative(a);
        inOrderIterative(a);
    }

    static List<Integer> preOrderIterative(TreeNode root){
        List<Integer> a=new ArrayList<>();
        Stack<TreeNode> s=new Stack<>();
        if(root==null) return a;
        s.push(root);
        while(!s.empty()){
            root=s.pop();
            System.out.print(root.val);
            a.add(root.val);
            if(root.right!=null){
                s.push(root.right);
            }
            if(root.left!=null){
                s.push(root.left);
            }
        }
        return a;

    }

    static List<Integer> inOrderIterative(TreeNode root){
        List<Integer> a=new ArrayList<>();
        Stack<TreeNode> s=new Stack<>();
        TreeNode node=root;
        while(true){
            if(node!=null){
                s.push(node);
                node=node.left;
            }else{
                if(s.empty())break;
                node=s.pop();
                a.add(node.val);
                System.out.print(node.val);
                node=node.right;
            }
        }
        return a;
    }

    static List<Integer> postOrderIterative(TreeNode root){
        List<Integer> a=new ArrayList<>();
        Stack<TreeNode> s1=new Stack<>();
        Stack<TreeNode> s2=new Stack<>();

        TreeNode node=root;
        s1.push(node);
        while(!s1.empty()){
            root=s1.pop();
            s2.add(root);
            if(root.left!=null)s1.push(root.left);
            if(root.left!=null)s1.push(root.right);
        }
        while(!s2.empty()){
            a.add(s2.pop().val);
        }
        return a;
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
