package Greddy_Algorithm;

import java.util.*;

public class ActivitySelection {

    public static void main(String[] args) {
          int start[] = {1,3,0,5,8,5};
          int end[] = {2,4,6,7,9,9};

          //Sorting if already not sorted
         int activities[][] = new int[start.length][3];
        for (int i = 0; i < start.length; i++) {
            //Storing original index as after sorting we will not be able to get it.
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }

        //Lambda Function -> ShortForm
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));
          //End time basis sorted
            int maxAct = 0;
            ArrayList<Integer> ans = new ArrayList<>();
            
            maxAct = 1;
            ans.add(activities[0][0]);
            int lastEnd = activities[0][2];
        for (int i = 0; i < end.length; i++) {
            if(activities[i][1] >= lastEnd) {
                maxAct++;
                ans.add(activities[i][0]);
                lastEnd = end[i];
            }
        }
        System.out.println("Maximum Activities: "+maxAct);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print("A"+ans.get(i)+" ");
        }
        System.out.println();
    }
}
