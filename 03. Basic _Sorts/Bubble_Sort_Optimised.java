package Basic_Sorts;

import java.util.*;


public class Bubble_Sort_Optimised {

    public static void bubbleSort(int arr[]) {
        boolean  swap = false;;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] > arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    swap = true;
                }
            }
        }
        if(swap)
        {
            System.out.println("It's not an already sorted array");
        }
        else
        {
            System.out.println("It's already a sorted array");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements of Array: ");
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        bubbleSort(arr);

        System.out.println("Array after sorting: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" "+arr[i]);
        }
    }
}