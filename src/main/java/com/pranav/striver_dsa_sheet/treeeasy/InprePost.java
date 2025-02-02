package com.pranav.striver_dsa_sheet.treeeasy;
import java.util.*;
public class InprePost {
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
        List<List<Integer>> aa=preInPost(a);
        display(aa);
    }
    
    public static void display(List<List<Integer>> aa){
        for(List<Integer> i:aa){
            for(Integer j:i){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static List<List<Integer>> preInPost(TreeNode root){
        List<Integer> pre=new ArrayList<>();
        List<Integer> in=new ArrayList<>();
        List<Integer> post=new ArrayList<>();

        Stack<NodeState> s=new Stack<>();

//        TreeNode node=root;


        if(root!=null)s.push(new NodeState(root, 1));
        while(!s.isEmpty()){
            NodeState cur=s.peek();
            if(cur.state==1){
                pre.add(cur.node.val);
                cur.state++;
                if(cur.node.left!=null){
                    s.push(new NodeState(cur.node.left,1));
                }
            }
            else if(cur.state==2){
                in.add(cur.node.val);
                cur.state++;
                if(cur.node.right!=null){
                    s.push(new NodeState(cur.node.right, 1));
                }
            }else{
                post.add(cur.node.val);
                s.pop();
            }
        }




        List<List<Integer>> aa=new ArrayList<>();


        aa.add(pre);
        aa.add(in);
        aa.add(post);
        return aa;
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

    static class NodeState{
        TreeNode node;
        int state;

        NodeState(TreeNode node, int state){
            this.node=node;
            this.state=state;
        }
    }

}
