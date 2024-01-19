package Array;

import java.util.*;
public class Kadane_Sum_Subarray {

    //Prefix Sum
    /*public static int maxSumAllSubArrays(int arr[]) {
        int sum = 0;
        int maxi = -10;
        int[] prefix = new int[arr.length];

        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i-1] + arr[i];
        }

        for (int i = 0; i <= arr.length-1; i++) {
            for (int j = i; j <= arr.length-1; j++) {

                sum = i == 0 ? prefix[j] : prefix[j] - prefix[i-1];
                maxi = Math.max(maxi,sum);
            }
        }
        return maxi;
    }*/

    public static void kadane(int arr[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for (int i = 0; i < arr.length; i++) {
            cs = cs + arr[i];
            if(cs < 0)
            {
                cs = 0;
            }
            ms = Math.max(ms,cs);
        }
        System.out.println("Our Maxximum subarray sum is: "+ms);
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements of Array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        kadane(arr);
    }
}
