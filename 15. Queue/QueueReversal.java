package Queue;

import java.util.*;

public class QueueReversal {

    public static void reversal( Queue<Integer> q) {
        Stack<Integer> s = new Stack<>();
        //Putting it in stack
        while (!q.isEmpty()){
            s.push(q.remove());
        }
        //Putting back into queue
        while (!s.isEmpty()){
            q.add(s.pop());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        reversal(q);

        while (!q.isEmpty()){
            System.out.print(q.remove()+" ");
        }
        System.out.println();

    }
}