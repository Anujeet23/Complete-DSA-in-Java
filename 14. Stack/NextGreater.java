package Stack;

import java.util.*;

public class NextGreater {

    public static void nextGrater(int arr[]) {
        ArrayList<Integer> al = new ArrayList<>();

        for (int i = 0; i < arr.length-1; i++) {
                if(arr[i+1] > arr[i])
                {
                    al.add(arr[i+1]);
                }
                else
                {
                    al.add(-1);
                }
            }
        //There will be no greater element to the right of last element
        al.add(-1);
        System.out.println(al);
    }


    public static void main(String[] args) {
        int arr[] = {6,8,0,1,3};
        NextGreater ng = new NextGreater();
        ng.nextGrater(arr);
    }
}