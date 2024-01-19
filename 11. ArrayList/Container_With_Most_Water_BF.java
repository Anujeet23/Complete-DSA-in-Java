package ArrayList;

import java.util.*;

//Brute Force Approach
public class Container_With_Most_Water_BF {

    public static int mostWater(ArrayList<Integer> height) {
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < height.size()-1; i++) {
            for (int j = i+1; j < height.size(); j++) {
                //Minimum height among two otherwise water will spill
                int area = /*Minimum Height*/Math.min(height.get(i), height.get(j))  *  (j - i);//Width
                maxi = Math.max(area,maxi);
            }
        }
        return maxi;
    }

    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println(height);
        System.out.println("Area of Container with Most Water is: "+mostWater(height));
    }
}