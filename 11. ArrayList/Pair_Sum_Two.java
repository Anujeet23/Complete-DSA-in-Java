package ArrayList;

import java.util.*;

//Arraylist is Sorted
public class Pair_Sum_Two {

    public static boolean isSum(ArrayList<Integer> list, int target) {
        int start = 0;
        int end = list.size()-1;

        while (start < end)
        {
            if(list.get(start) + list.get(end) == target)
            {
                System.out.println(list.get(start)+" "+list.get(end));
                return true;
            }

            if (list.get(start) + list.get(end) < target)
            {
                start++;
            }
            else
            {
                end--;
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
            System.out.println("We have found the Pair in list");
        }
        else
        {
            System.out.println("It seems like we don't have any pair in the list");
        }

    }
}