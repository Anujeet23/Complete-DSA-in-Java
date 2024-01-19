package Binary_Search_Tree_1;

import java.util.*;

public class Mirror {

    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

//    public static Node insert(Node root,int val) {
//        if (root == null){
//            root = new Node(val);
//            return root;
//        }
//
//        if (root.data > val){
//            root.left = insert(root.left,val);
//        }
//        else {
//            root.right = insert(root.right,val);
//        }
//        return root;
//    }

    public static void preOrder(Node root) {
        if (root == null){
            return;
        }

        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static Node mirror(Node root) {
        if (root == null){
            return null;
        }

        //Left and Right Subtree
        Node leftS = mirror(root.left);
        Node rightS = mirror(root.right);

        root.left = rightS;
        root.right = leftS;

        return root;
    }

    public static void main(String[] args) {
      Node root = new Node(8);
      root.left = new Node(5);
      root.right = new Node(10);
      root.left.left = new Node(3);
      root.left.right = new Node(6);
      root.right.right = new Node(11);

        root = mirror(root);
        preOrder(root);

    }
}