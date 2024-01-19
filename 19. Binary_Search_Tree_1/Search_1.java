package Binary_Search_Tree_1;


public class Search_1 {

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

    public static void search(Node root,int val) {

        if (root == null){
            return;
        }
        //Found
        if (root.data == val){
            System.out.println(val+" Found in BST");
            return;
        }
        //Left of BST
        if (root.data > val){
            search(root.left,val);
        }
        else
        {
            //Right of BST
            search(root.right,val);
        }
    }

    public static void main(String[] args) {
            Node root = new Node(4);
            root.left = new Node(2);
            root.right = new Node(5);
            root.left.left = new Node(1);
            root.left.right = new Node(3);
            root.right.right = new Node(6);
            int val = 1;

        search(root,val);
    }

}