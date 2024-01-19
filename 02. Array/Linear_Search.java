package Array;

import java.util.Scanner;

public class Linear_Search {

    public static boolean linear_Search(int arr[], int key) {

        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i] == key)
            {
                return true;
            }
        }
        return false;
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
        System.out.println("Enter Key to search: ");
        int key = sc.nextInt();

        if (linear_Search(arr,key))
        {
            System.out.println(key+" is found in array");
        }
        else
        {
            System.out.println(key+" is not found in array");
        }
    }
}