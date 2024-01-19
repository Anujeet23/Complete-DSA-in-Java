package Array;

import java.util.Scanner;

public class Largest_in_Array {
    public static int Largest(int arr[]) {
        int maxi = -10000;
        for (int i = 0; i < arr.length; i++) {
            maxi = Math.max(maxi,arr[i]);
        }
        return maxi;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of Array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Maxximum number in Array is: "+Largest(arr));
    }
}