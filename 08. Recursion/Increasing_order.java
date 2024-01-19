package Recursion;

import java.util.*;


public class Increasing_order {


    public static void increaseOrder(int i,int n) {
        if(n < i)
        {
            return;
        }
        System.out.print(" "+i);
        increaseOrder(i+1,n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,i;
        System.out.println("Enter value of i: ");
        i = sc.nextInt();
        System.out.println("Enter value of n: ");
        n = sc.nextInt();

        increaseOrder(i,n);
    }
}
