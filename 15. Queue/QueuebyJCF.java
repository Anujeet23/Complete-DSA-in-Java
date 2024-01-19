package Queue;

import java.util.*;

public class QueuebyJCF {
    public static void main(String[] args) {
        //Queue is interface in java, so we can't create object
        //For creating object we can take help from LinkedList and ArrayDeque
        //1. Queue<Integer> q = new LinkedList<>();
        Queue<Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        //remove(q);
        while (!q.isEmpty()) {

            System.out.print( q.peek()+ " ");
            q.remove();
        }

    }
}