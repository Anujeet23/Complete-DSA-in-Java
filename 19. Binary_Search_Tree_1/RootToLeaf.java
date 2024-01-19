package Binary_Search_Tree_1;

import java.util.*;

public class RootToLeaf {

    static  class Node{
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node insert(Node root,int val) {
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
        return  root;
    }

    public static void inOrder(Node root) {
        if (root == null){
            return;
        }

        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    public static void printPath(ArrayList<Node> path) {
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i).data+"->");
        }
        System.out.print("Null");
        System.out.println();
    }

    public static void rootToLeaf(Node root,ArrayList<Node> path) {
        if (root == null){
            return;
        }
        path.add(root);
        if (root.left == null && root.right == null){
           printPath(path);
        }
        rootToLeaf(root.left,path);
        rootToLeaf(root.right,path);
        path.remove(path.size()-1);

    }

    public static void main(String[] args) {
        int values[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root,values[i]);
        }

        inOrder(root);
        System.out.println();

        rootToLeaf(root, new ArrayList<>());

    }
}