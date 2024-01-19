package ArrayList;

import java.util.*;

//Arraylist is Sorted and Rotated
public class Pair_Sum_Three {

    //11 15 6 8 9 10
    public static boolean isSum(ArrayList<Integer> list, int target) {
        int bp = -1;
        int n = list.size();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > list.get(i+1))
            {
                bp = i;
                break;
            }
        }
        int lp = bp+1;//smallest
        int rp = bp;//largest

        while (lp != rp)
        {
            if (list.get(lp) + list.get(rp) == target)
            {
                System.out.println(list.get(lp)+" "+list.get(rp));
                return true;
            }

            if (list.get(lp) + list.get(rp) < target)
            {
                lp = (lp+1) % n;
            }
            else
            {
                rp = (n+rp-1) % n;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter target: ");
        int target = sc.nextInt();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        
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