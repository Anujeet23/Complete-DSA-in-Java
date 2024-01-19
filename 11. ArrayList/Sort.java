package ArrayList;

import java.util.*;

public class Sort {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(8);
        list.add(12);
        list.add(45);
        list.add(4);
        list.add(-12);

        System.out.println(list);
        //Ascending Order
        Collections.sort(list);
        System.out.println(list);
        //Collection Interface Collection.sort(list) will give an error.
        //Descending Order
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);

    }
}