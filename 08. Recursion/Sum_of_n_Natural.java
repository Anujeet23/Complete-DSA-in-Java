package Recursion;

import java.util.*;

public class Sum_of_n_Natural {

    public static int sumOfN(int n) {
           if(n == 0)
           {
               return 0;
           }
           return n + sumOfN(n-1);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter value of n: ");
        n = sc.nextInt();

        System.out.println("Sum of first "+n+" natural numbers is: "+sumOfN(n));
    }
}