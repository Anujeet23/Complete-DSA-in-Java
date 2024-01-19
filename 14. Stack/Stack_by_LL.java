package Stack;

import java.util.*;

public class Stack_by_LL {

    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class  Mystack {
        static Node head = null;

        public static boolean isEmpty() {
            return head == null;
        }

        //Push
        public static void push(int data) {
            Node newNode = new Node(data);
            if(isEmpty()){
                head = newNode;
            }
            else {
                newNode.next = head;
                head = newNode;
            }
        }


        //Pop
        public static int pop() {
            if (isEmpty()){
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        public static int peek(){
            if (isEmpty())
            {
                return -1;
            }
            return head.data;
        }
    }


    public static void main(String[] args) {
        Mystack s = new Mystack();
        s.push(10);
        s.push(23);
        s.push(20);

        while (!s.isEmpty()){
            System.out.println(s.peek()+" ");
            s.pop();
        }
    }
}