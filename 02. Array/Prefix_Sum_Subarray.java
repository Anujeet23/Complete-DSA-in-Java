package Array;

import java.util.Scanner;

public class Prefix_Sum_Subarray {

    public static int maxSumAllSubArrays(int arr[]) {
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

        System.out.println("Maximum sum of subarray is found to be: "+maxSumAllSubArrays(arr));
    }
}
