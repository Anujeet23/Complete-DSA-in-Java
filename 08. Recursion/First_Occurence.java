package Recursion;

import java.util.*;

public class First_Occurence {

    public static int firstOccurence(int arr[],int i, int key) {
       if(i == arr.length-1)
       {
           return -1;
       }

       if (arr[i] == key)
       {
           return i;
       }
        return firstOccurence(arr,i+1,key );
    }

    public static void main(String[] args) {
        int arr[] = {10,6,4,9,6,131,45,5};
        System.out.println(firstOccurence(arr,0,6));
    }
}