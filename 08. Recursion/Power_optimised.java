package Recursion;

import java.util.*;

public class Power_optimised {
//Optimised to logn Complexity
    public static int powerOf(int x,int n) {
        if (n==0)
        {
            return 1;
        }
        int halfPowerSq = powerOf(x,n/2) * powerOf(x,n/2);

         if(n % 2 != 0)
         {
             return x * halfPowerSq;
         }
         return halfPowerSq;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,n;
        System.out.println("Enter number: ");
        x = sc.nextInt();
        System.out.println("Enter power: ");
        n = sc.nextInt();
        System.out.println("Ans: "+powerOf(x,n));
    }
}