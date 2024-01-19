package Array;

import java.util.Scanner;

public class Reverse_Array {
    public static void reverseArray(int arr[]) {
            int start = 0;
            int end = arr.length-1;
            while (start <= end)
            {
               swap(arr,start,end);
               start++;
               end--;
            }
    }

    public static void swap(int arr[],int s,int e) {
           int temp = arr[s];
           arr[s] = arr[e];
           arr[e] = temp;
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

        reverseArray(arr);

        System.out.println("Reversed Array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(" "+arr[i]);
        }
    }
}