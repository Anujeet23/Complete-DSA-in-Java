package Binary_Tree_2;

import java.util.*;

public class Diameter_2 {

    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right =  null;
        }
    }

    static class BinaryTree{
        static int idx = -1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }

    public static void preOrder( Node root) {
        if (root == null){
            //System.out.print("-1 ");
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }


    public static void inOrder( Node root) {
        if (root == null){
            //System.out.print("-1 ");
            return;
        }

        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    public static void postOrder(Node root) {
        if (root == null){
            //System.out.print("-1 ");
            return;
        }

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }

    public static void levelOrder(Node root) {
        if(root == null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()){
            Node currNode = q.remove();
            if(currNode == null){
                System.out.println();
                if (q.isEmpty()){
                    break;
                }
                else {
                    q.add(null);
                }
            }
            else {
                System.out.print(currNode.data+" ");
                if(currNode.left != null){
                    q.add(currNode.left);
                }
                if(currNode.right != null){
                    q.add(currNode.right);
                }
            }

        }
    }

    public static int height(Node root) {
        if(root == null){
            return 0;
        }

        int lh = height(root.left);
        int rh = height(root.right);
        int height = Math.max(lh,rh)+1;

        return height;
    }
    static int count = 0;
    public static int totalNodes(Node root) {
        if(root == null){
            return 0;
        }

        totalNodes(root.left);
        totalNodes(root.right);
        count++;
        return count;
    }

    static int sum = 0;
    public static int totalSum(Node root) {
        if(root == null){
            return 0;
        }

        //int ls = totalSum(root.left);
        //int rs = totalSum(root.right);
        //int treSum = ls + rs + root.data;

        return totalSum(root.left)+totalSum(root.right)+root.data;
    }

    //Approach 2
    static class Info{
        int diam;
        int ht;
        public Info(int diam,int ht){
            this.ht = ht;
            this.diam = diam;
        }
    }
    public static Info diameter(Node root) {
        if (root == null){
            return new Info(0,0);
        }
        Info leftInfo = diameter(root.left);
        Info rightInfo = diameter(root.right);

        int diam = Math.max(Math.max(leftInfo.diam,rightInfo.diam),leftInfo.ht+ rightInfo.ht +1);
        int ht = Math.max(leftInfo.ht, +rightInfo.ht) +1;

        return new Info(diam, ht);
    }

    public static void main(String[] args) {


        //Main Tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);


        System.out.println("Diameter is: "+diameter(root).diam);
        System.out.println("Height is: "+diameter(root).ht);

    }
}

