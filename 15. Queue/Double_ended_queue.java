package Queue;

import java.util.*;

public class Double_ended_queue {

    public static void main(String[] args) {
           Deque<Integer> dq = new LinkedList<>();
           dq.addFirst(1);
           dq.addFirst(2);
           dq.addLast(3);
           dq.addLast(4);
           dq.removeLast();
//           dq.removeFirst();
        System.out.println(dq);
        System.out.println("First element: "+ dq.getFirst());
        System.out.println("Last element: "+ dq.getLast()
        );
    }
}