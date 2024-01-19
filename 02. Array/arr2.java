package Array;

import java.util.Scanner;

public class arr2 {
    public static void update(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an Array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements of an Array: ");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        update(arr);

        System.out.println("Array after calling update function is:");
        for (int i = 0; i < n; i++) {
            System.out.print(" "+arr[i]);
        }
    }
}
