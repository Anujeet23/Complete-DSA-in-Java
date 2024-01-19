package Basic_Sorts;

import java.lang.reflect.Array;
import java.util.*;
public class Counting_Sort {

    public static void countingSort(int arr[]) {
            int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest,arr[i]);
        }
        int count[] = new int[largest+1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        //Sorting
        int j = 0;
        for (int i = 0; i <count.length ; i++)
        {
            while (count[i] > 0)
            {
                arr[j] = i;
                j++;
                count[i]--;
            }
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

        countingSort(arr);
        System.out.println("Array after sorting: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" "+arr[i]);
        }

    }
}