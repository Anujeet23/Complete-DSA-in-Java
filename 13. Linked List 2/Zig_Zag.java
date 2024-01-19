package LinkedList;

import java.util.*;
//Floyd's Cycle Finding Algorithm
public class Zig_Zag {

    public static class Node{
        int data;
        Node next;

        public Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addFirst(int data)
    {    //Creating New Node
        Node newNode = new Node(data);
        if (head == null){
            head = tail = newNode;
            return;
        }
        //New node pointing to head
        newNode.next = head;
        //Now head is pointing to new node
        head = newNode;
    }

    public void printLL()
    {
        if (head == null){
            System.out.println("LL is empty");
            return;
        }

        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public Node getMid(Node head)
    {
        Node slow = head;
        //Little Change for odd length LL
        Node fast = head.next;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public void zigZag(){
        //Find mid
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next !=  null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        //Reverse 2nd Half
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;

        while (curr != null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node left = head;
        Node right = prev;
        Node nextL, nextR;


        //Alt Merge
        while (left != null && right != null){
             nextL = left.next;
             left.next = right;
             nextR = right.next;
             right.next = nextL;

             left = nextL;
             right = nextR;
        }
    }



    public static void main(String[] args) {
        Zig_Zag ll = new Zig_Zag();
        ll.addFirst(6);
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);

        ll.printLL();
        ll.zigZag();
        ll.printLL();
    }
}