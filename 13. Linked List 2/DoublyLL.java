package LinkedList;

import java.util.*;

public class DoublyLL {

    public class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    //Add
    public void addFirst(int data)
    {
        //Creating New Node
        Node newNode = new Node(data);
        if (head == null){
            head = tail = newNode;
            return;
        }
        //New node pointing to head
        newNode.next = head;
        head.prev = newNode;
        //Now head is pointing to new node
        head = newNode;
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
        newNode.prev = tail;
        tail = newNode;
    }



    //Remove
    public void removeFirst()
    {
        if (head == null)
        {
            System.out.println("LL is empty");
            return;
        }
        head.next.prev = null;
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

    public void printreverse()
    {
        Node temp = tail;
        while (temp != head.prev)
        {
            System.out.print(temp.data+"<->");
            temp = temp.prev;
        }
        System.out.println("null");
    }
    public void print()
    {
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data+"<->");
            temp = temp.next;
        }
        System.out.println("null");
    }



    public static void main(String[] args) {
            DoublyLL dll = new DoublyLL();
            dll.addLast(4);
            dll.addFirst(3);
            dll.addFirst(2);
            dll.addFirst(1);
            dll.print();
            dll.printreverse();
            dll.removeFirst();
            dll.print();
            dll.removeLast();
            dll.print();

    }
}