package com.pranav.striver_dsa_sheet.treeeasy;

import java.util.LinkedList;
import java.util.Queue;
import java.util.List;
import java.util.ArrayList;

public class Treebasic {
    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
        Node f=new Node(6);
        Node g=new Node(7);

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



        Treebasic obj=new Treebasic();
//        obj.preOrder(a);
//        obj.inOrder(a);
//        obj.postOrder(a);

//        System.out.println(obj.size(a));

//        System.out.println(obj.sum(a));

//    n     System.out.println(obj.max(a));

//        System.out.println(obj.height(a));

//        obj.nthLevel(a,2);


        //level traversal using brute force appraoch having time complexity o(n*logn)

//        int level=obj.height(a)+1;
//        for(int i=1;i<=level;i++){
//            obj.nthLevel(a,i);
//            System.out.println();
//        }

//        obj.BFS(a);

//        obj.levelOrderRev(a,5)



    }
    void preOrder(Node root){
        if(root==null){
            return;
        }
        System.out.println(root.val);
        preOrder(root.left);
        preOrder(root.right);
    }

    void inOrder(Node root){
        if(root==null)return;
        inOrder(root.left);
        System.out.print(root.val);
        inOrder(root.right);
    }

    void postOrder(Node root){
        if(root==null)return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val);
    }

    int size(Node root){
        if(root==null)return 0;
        return 1+size(root.left)+size(root.right);
    }

    int sum(Node root){
        if(root==null) return 0;
        return root.val+sum(root.left)+sum(root.right);
    }

     int max(Node root){
        if(root==null) return Integer.MIN_VALUE;
        return Math.max(root.val, Math.max(max(root.left), max(root.right)));

    }

    int height(Node root){
        if(root==null|| (root.left==null && root.right==null)) return 0;

        int maxHeight=Math.max(height(root.left), height(root.right));
        return 1+maxHeight;
    }

    void nthLevel(Node root, int n){
        if(root==null)return;
        if(n==1){
            System.out.print(root.val);
            return;
        }
        nthLevel(root.left, n-1);
        nthLevel(root.right, n-1);
    }

    void BFS(Node root){
        Queue<Node> q=new LinkedList<>();
        if(root!=null)q.add(root);
        while(q.size()>0){
            Node temp=q.peek();
            if(temp.left!=null)q.add(temp.left);
            if(temp.right!=null)q.add(temp.right);
            System.out.print(temp.val);
            q.remove();
        }
    }

//     List<List<Integer>> levelOrder(Node root, List<List<Integer>> a, int n){
//        if(n==1){
//
//
//        }
//        return a;
//    }

    List<Integer> levelOrderRev(Node root, List<Integer> a, int n){
        if(root==null) return a;
        if(n==1){
            a.add(root.val);
        }
        levelOrderRev(root.right,a ,n-1);
        levelOrderRev(root.left, a, n-1);
        return a;
    }



}
class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val=val;
    }
}