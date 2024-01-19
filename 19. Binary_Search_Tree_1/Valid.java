package Binary_Search_Tree_1;

import java.util.*;

public class Valid {

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

    public static Node insert(Node root, int val) {
        if (root == null){
            root = new Node(val);
            return root;
        }

        if (root.data > val){
            root.left = insert(root.left,val);
        }
        else {
            root.right = insert(root.right,val);
        }
        return root;
    }

    public static void inOrder(Node root) {
        if (root == null){
            return;
        }

        System.out.print(root.data+" ");
        inOrder(root.left);
        inOrder(root.right);
    }

    public static boolean isValidBST(Node root,Node min,Node max) {
        if (root == null){
            return true;
        }

        if (min != null && root.data <= min.data){
            return false;
        } else if (max!=null && root.data >= max.data) {
            return false;
        }

        return isValidBST(root.left,min,root) && isValidBST(root.right,root,max);
    }

    public static void main(String[] args) {
        int values[] = {11,11,11};
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root,values[i]);
        }

        if (isValidBST(root,null,null)){
            System.out.println("Valid");
        }
        else {
            System.out.println("Not Valid");
        }


    }
}