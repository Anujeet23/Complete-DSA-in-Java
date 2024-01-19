package ArrayList;

import java.util.*;

public class Pair_Sum_One {

    public static boolean isSum(ArrayList<Integer> list, int target) {
        for (int i = 0; i < list.size()-1; i++) {
            for (int j = i+1; j < list.size(); j++) {
                if(list.get(i)+list.get(j) == target)
                {
                    System.out.println(list.get(i)+" "+list.get(j));
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter target: ");
        int target = sc.nextInt();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        if (isSum(list,target))
        {
            System.out.println("We have found the Pair");
        }
        else
        {
            System.out.println("It seems like we don't have a pair in list");
        }

    }
}