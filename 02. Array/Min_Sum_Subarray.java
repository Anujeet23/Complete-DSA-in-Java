package Array;

import java.util.Scanner;

public class Min_Sum_Subarray {

    public static int minSumAllSubArrays(int arr[]) {
        int sum = 0;
        int mini = 10000;
        for (int i = 0; i <= arr.length-1; i++) {
            for (int j = i; j <= arr.length-1; j++) {

                System.out.print("[");
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k]+" ");
                    sum = sum +  arr[k];
                }
                mini = Math.min(mini,sum);

                System.out.print("]");
            }
            System.out.println(" ");
        }
        return mini;
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

        System.out.println("Pairs of this elements are: ");
        System.out.println("Minimum sum of subarray is found to be: "+minSumAllSubArrays(arr));
    }
}
