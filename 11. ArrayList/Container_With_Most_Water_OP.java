package ArrayList;

import java.util.*;

///Optimised Approach
public class Container_With_Most_Water_OP {


    public static int mostWater(ArrayList<Integer> height) {
        int maxi = Integer.MIN_VALUE;
        int start = 0;
        int end  = height.size()-1;
        while (start < end)
        {
            int ht = Math.min(height.get(start),height.get(end));
            int wth = (end-start);
            int area = ht*wth;
            maxi = Math.max(maxi,area);

            if(height.get(start) < height.get(end))
            {
                start++;
            }
            else
            {
                end--;
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