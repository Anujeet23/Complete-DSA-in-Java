package Array;

import java.util.Scanner;

public class arr1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an Array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements of an Array: ");
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }

        System.out.println("Sum of all elements in array is: "+sum);
    }
}
