package Queue;

import java.util.*;

public class QueueByArray {
    public static class Queue{
        static int arr[];
        static int size;
        static int rear;
        Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
        }
    }

    public static boolean isEmpty(Queue q ) {
        return q.rear == -1;
    }

    public static void add(Queue q ,int data) {
        if (q.rear == q.size-1){
            System.out.println("Queue is Full");
            return;
        }
        q.rear = q.rear + 1;
        q.arr[q.rear] = data;
    }

    public static int remove(Queue q) {
        if(isEmpty(q)){
            System.out.println("Empty Queue");
            return -1;
        }
        int front = q.arr[0];
        for (int i = 0; i < q.rear; i++) {
            q.arr[i] = q.arr[i+1];
        }
        q.rear = q.rear -1;
        return front;
    }

    public static int peek(Queue q) {
        if (isEmpty(q)){
            System.out.println("Empty Queue");
            return -1;
        }
        return q.arr[0];
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);

        add(q,1);
        add(q,2);
        add(q,3);

        while (!isEmpty(q)){
            System.out.print(peek(q)+" ");
            remove(q);
        }

    }
}