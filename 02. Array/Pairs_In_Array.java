package Array;

import java.util.Scanner;

public class Pairs_In_Array {

    public static void pairsInArray(int arr[]) {

        for (int i = 0; i <= arr.length-2; i++) {
            for (int j = i+1; j <= arr.length-1; j++) {
                System.out.print(" ("+arr[i]+","+arr[j]+")");
            }
            System.out.println(" ");
        }
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
        pairsInArray(arr);
    }
}
