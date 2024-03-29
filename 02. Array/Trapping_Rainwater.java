package Array;

import java.util.*;

public class Trapping_Rainwater {

    public static int trappedRainwater(int height[]) {
           //Calculate left max boundary - array
        int leftMax[] = new int[height.length];
        leftMax[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            leftMax[i] = Math.max(height[i],leftMax[i-1]);
        }
           //Calculate right max boundary -array
        int rightMax[] = new int[height.length];
        rightMax[height.length-1] = height[height.length-1];
        for (int i = height.length-2; i >=0 ; i--) {
            rightMax[i] = Math.max(height[i],rightMax[i+1]);
        }
            /* LOOP
             waterLevel = min(leftMax bound,rightMax bound)
             trappedWater = waterLevel - height[i]
             */
        int trappedWater = 0;
        for (int i = 0; i < height.length; i++) {
           int waterlevel = Math.min(leftMax[i],rightMax[i]);
           trappedWater += waterlevel - height[i];
        }
        return trappedWater;
    }

    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();

        int[] height = new int[n];
        System.out.println("Enter elements of Array: ");
        for (int i = 0; i < n; i++)
        {
            height[i] = sc.nextInt();
        }
        System.out.println("Trapped water is: "+trappedRainwater(height));

    }
}