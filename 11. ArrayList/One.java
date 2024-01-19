package ArrayList;

import java.util.*;

public class One {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(1,9);

        System.out.println(list);

        //Get Operation
        System.out.println(list.get(3));

        //Delete
        list.remove(3);

        //Set
        list.set(2,15);
        System.out.println(list);

        //Contains
        System.out.println(list.contains(1));
        System.out.println(list.contains(6));

        //Size
        System.out.println(list.size());

        //Print List
        for (int i = 0; i < list.size(); i++) {
            System.out.print(" "+list.get(i));
        }
        System.out.println();
    }
}