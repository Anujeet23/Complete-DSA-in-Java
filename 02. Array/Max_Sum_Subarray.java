package Array;

import java.util.Scanner;

public class Max_Sum_Subarray {

    public static int maxSumAllSubArrays(int arr[]) {
        int sum = 0;
        int maxi = -10;
        for (int i = 0; i <= arr.length-1; i++) {
            for (int j = i; j <= arr.length-1; j++) {
                sum = 0;
                System.out.print("[");
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k]+" ");
                    sum = sum  + arr[k];
                }
                maxi = Math.max(maxi,sum);

                System.out.print("]");
            }
            System.out.println(" ");
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

        System.out.println("Pairs of this elements are: ");
        System.out.println("Maximum sum of subarray is found to be: "+maxSumAllSubArrays(arr));
    }
}
