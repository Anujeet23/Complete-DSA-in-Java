package LinkedList;

import java.util.*;
//Floyd's Cycle Finding Algorithm
public class Detect_Cycle {

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
    public  boolean isCycle(){
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Detect_Cycle l = new Detect_Cycle();
        head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = temp;
        //1->2->3->1
        System.out.println("Is there any cycle in LL?: "+l.isCycle());
    }
}