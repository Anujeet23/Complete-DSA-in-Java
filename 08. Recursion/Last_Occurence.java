package Recursion;

import java.util.*;

public class Last_Occurence {

    public static int lastOccurence(int arr[],int i, int key) {
        if(i == 0)
        {
            return -1;
        }

        if (arr[i] == key)
        {
            return i;
        }
        return lastOccurence(arr,i-1,key );
    }

    public static void main(String[] args) {
        int arr[] = {10,5,2,6,4,9,6,131,45,5};
        System.out.println(lastOccurence(arr,arr.length-1,6));
        System.out.println(lastOccurence(arr,arr.length-1,5));
    }
}