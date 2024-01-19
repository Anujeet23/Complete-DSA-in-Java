package Binary_Tree_1;

import java.util.*;

public class Tree {

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

    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);

        System.out.println("PreOrder Traversal: ");
        preOrder(root);

        System.out.println();
        System.out.println("InOrder Traversal: ");
        inOrder(root);

        System.out.println();
        System.out.println("PostOrder Traversal: ");
        postOrder(root);

        System.out.println();
        System.out.println("LevelOrder Traversal: ");
        levelOrder(root);

        System.out.println();
        System.out.println("Height of Tree is: "+height(root));

        System.out.println();
        System.out.println("Total Nodes of the Tree are: "+totalNodes(root));

        System.out.println();
        System.out.println("Total Sum of the nodes of Tree is: "+totalSum(root));

    }
}