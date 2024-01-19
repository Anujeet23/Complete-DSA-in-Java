package Array;

import java.util.Scanner;

public class Binary_Search {

    public static int binary_Search(int arr[], int key) {
           int start = 0;
           int end = arr.length - 1;


           while (start < end) {
               int mid = (start + end) / 2;

               if (arr[mid] == key)
               {
                   return arr[mid];
               }
               else if (arr[mid] >= key)
               {
                   end = mid - 1;
               }
               else if (arr[mid] <= key)
               {
                   start = mid + 1;
               }
           }
           return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        System.out.println("Enter Key to search: ");
        int key = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of Array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        if (binary_Search(arr,key) != -1)
        {
            System.out.println(key+" is present in array");
        }
        else
        {
            System.out.println(key+" is not present in array");
        }
    }
}