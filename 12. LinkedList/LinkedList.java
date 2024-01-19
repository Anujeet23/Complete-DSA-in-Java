package LinkedList;

import java.util.Scanner;

public class LinkedList {
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

    public void removeFirst()
    {
        if (head == null)
        {
            System.out.println("LL is empty");
            return;
        }
        head = head.next;
    }

    public void removeLast()
    {
        if (head == null)
        {
            System.out.println("LL is empty");
            return;
        }
       Node temp = head;
       while (temp.next.next != null)
       {
           temp = temp.next;
       }
       temp.next = null;
    }
    public void addLast(int data)
    {
        //Creating New Node
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
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

    public void addAtIndex(int index, int data) {
        if (index == 0)
        {
            addFirst(data);
            return;
        }
                Node temp = head;
                Node newNode = new Node(data);
                int i = 0;
                while (i < index-1)
                {
                   temp =  temp.next;
                   index--;
                }
                newNode.next = temp.next;
                temp.next =newNode;
    }
    public int size()
    {
        Node temp = head;
        int cnt = 0;
        while (temp != null) {
            cnt++;
            temp = temp.next;
        }
        return cnt;
    }

    public boolean search(int target)
    {
        Node temp = head;
        while (temp != null)
        {
            if(temp.data == target)
            {
                return true;
            }
          temp = temp.next;
        }
        return false;
    }

    public int helper(Node head,int target)
    {
        if (head == null){
            return -1;
        }

        if (head.data == target){
            return 0;
        }
        int index = helper(head.next,target);
        if (index == -1){
            return -1;
        }

        return index+1;
    }
    public int searchRecursive(int target)
    {
        return helper(head,target);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter target: ");
        int target = sc.nextInt();
            LinkedList ll = new LinkedList();
            ll.addFirst(1);
            ll.addFirst(2);
            ll.addFirst(3);
            ll.addFirst(4);
            ll.addLast(5);
            ll.addAtIndex(3,10);
            ll.printLL();
            System.out.println("Size of Linked List is: "+ll.size());
            ll.removeFirst();
            ll.printLL();
            ll.removeLast();
            ll.printLL();
            System.out.println(ll.search(target));
        System.out.println(ll.searchRecursive(target));


    }

}