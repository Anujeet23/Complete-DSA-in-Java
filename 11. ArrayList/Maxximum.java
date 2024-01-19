package ArrayList;

import java.util.*;


public class Maxximum {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(8);
        list.add(12);
        list.add(45);
        list.add(4);
        list.add(-12);

        int maxi = Integer.MIN_VALUE;
        int mini = Integer.MAX_VALUE;

        for (int i = 0; i < list.size(); i++) {
                maxi =Math.max(maxi,list.get(i));
                mini =Math.min(mini,list.get(i));
        }
        System.out.println("Maxximum number in the list is: "+maxi);
        System.out.println("Minimum number in the list is: "+mini);

    }
}