package Recursion;

import java.util.*;

public class Quicksort {

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void swap(int arr[],int i,int j) {
        int temp =arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int partition(int arr[],int si,int ei) {
         int pivot = arr[ei];
         int i = si-1;

        for (int j = si; j < ei; j++) {
            if (arr[j]<= pivot)
            {
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,ei);
        return (i+1);
    }

    public static void quickSort(int arr[],int si,int ei) {
        if (si < ei)
        {
            int pivot = partition(arr,si,ei);
            quickSort(arr,si,pivot-1);
            quickSort(arr,pivot+1,ei);
        }
    }
    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8,-4};
        quickSort(arr,0,arr.length-1);
        printArr(arr);
    }
}