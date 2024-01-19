package Queue;

import java.util.*;

public  class QueueUsingDeque {

    static class Queue{
        Deque<Integer> dq = new LinkedList<>();

        public void add(int data){
            dq.addLast(data);
        }

        public int remove(){
            return dq.removeFirst();
        }

        public int peek(){
            return dq.getFirst();
        }

    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        System.out.println("First: "+q.peek());
        System.out.print(q.remove());
        System.out.print(q.remove());
        System.out.print(q.remove());
        System.out.print(q.remove());
        System.out.print(q.remove());

    }
}