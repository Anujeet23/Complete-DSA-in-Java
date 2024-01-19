package Array;

import java.util.*;

public class rotated_array_search {

    public static void bubbleSort(int arr[]) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] >= arr[j]) {
                    swap(arr, i, j);
                }
            }
        }
    }

    public static void swap(int arr[],int i,int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static boolean binarySearch(int arr[],int key) {
        int start = 0;
        int end = arr.length;
        while (start <= end)
        {
            int mid = (start+end) / 2;

            if (arr[mid] == key)
            {
                return true;
            }
            else if ( arr[mid] > key)
            {
                end = mid - 1;
            }
            else
            {
                start = mid + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int key;
        System.out.println("Enter key: ");
        key = sc.nextInt();
        System.out.println("Enter elements of Array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        bubbleSort(arr);
        if(binarySearch(arr,key))
        {
            System.out.println(key+" is present in an array");
        }
        else
        {
            System.out.println(key+" is not present in an array");
        }
    }
}