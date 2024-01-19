package Queue;

import java.util.*;

public class CircularQueue {
    public static class Queue {
        int arr[];
        int size;
        int rear;
        int front;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }
    }

    public static boolean isEmpty(Queue q) {
        return q.rear == -1 && q.front == -1;
    }

    public static boolean isFull(Queue q) {
        return (q.rear + 1) % q.size == q.front;
    }

    public static void add(Queue q, int data) {
        if (isFull(q)) {
            System.out.println("Queue is Full");
            return;
        }
        if (isEmpty(q)) {
            q.front = 0;
        }
        q.rear = (q.rear + 1) % q.size;
        q.arr[q.rear] = data;
    }

    public static int remove(Queue q) {
        if (isEmpty(q)) {
            System.out.println("Empty Queue");
            return -1;
        }

        int result = q.arr[q.front];
        if (q.rear == q.front) {
            q.rear = q.front = -1;
        }
        else {
            q.front = (q.front + 1) % q.size;
        }
        return result;
    }

    public static int peek(Queue q) {
        if (isEmpty(q)) {
            System.out.println("Empty Queue");
            return -1;
        }
        return q.arr[q.front];
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);

        add(q, 1);
        add(q, 2);
        add(q, 3);

        while (!isEmpty(q)) {
            int value = peek(q);
            System.out.print(value + " ");
            remove(q);
        }
    }
}
