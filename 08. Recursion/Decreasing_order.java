package Recursion;

import java.util.*;


public class Decreasing_order {


    public static void decreaseOrder(int n) {
        if(n==0)
        {
            return;
        }
        decreaseOrder(n-1);
        System.out.print(" "+n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter value of n: ");
        n = sc.nextInt();

        decreaseOrder(n);
    }
}
