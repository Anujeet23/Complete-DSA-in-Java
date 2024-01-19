package Queue;

import java.util.*;

public class QueueByLL {
    static class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    static class Queue{
        static Node head = null;
        static Node tail = null;
    }

    public static boolean isEmpty(Queue q) {
        return q.head == null && q.tail == null;
    }

    public static void add(Queue q,int data) {
        Node newNode = new Node(data);
        if (q.head == null){
            q.head = q.tail = newNode;
        }
        q.tail.next = newNode;
        q.tail = newNode;
    }

    public static int remove(Queue q) {
        if(isEmpty(q)){
            System.out.println("Empty queue");
            return -1;
        }

        int front = q.head.data;
        if(q.tail == q.head){
            q.tail = q.head = null;
        }
        else {
            q.head = q.head.next;
        }
        return front;
    }

    public static int peek(Queue q) {
        if(isEmpty(q)){
            System.out.println("Empty Queue");
            return -1;
        }
        return q.head.data;
    }

    public static void main(String[] args) {
        Queue q = new Queue();

        add(q, 1);
        add(q, 2);
        add(q, 3);
        //remove(q);
        while (!isEmpty(q)) {
            int value = peek(q);
            System.out.print(value + " ");
            remove(q);
        }
    }
}