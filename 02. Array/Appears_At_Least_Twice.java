package Array;

import java.util.*;


public class Appears_At_Least_Twice {

    public static boolean appears(int arr[]) {
            int start = 0;
            int end = arr.length -1;
            while (start <= end)
            {
                if (arr[start] == arr[end])
                {
                    return true;
                }
                start++;
                end--;
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

        if (appears(arr))
        {
            System.out.println("Some Number appears at least twice ");
        }
        else
        {
            System.out.println("Every number is unique");
        }
    }
}