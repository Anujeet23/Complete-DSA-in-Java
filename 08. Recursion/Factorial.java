package Recursion;

import java.util.*;


public class Factorial {


    public static int Factorial(int n) {
       if(n==0 | n==1)
           return 1;

       return n*Factorial(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter value of n: ");
        n = sc.nextInt();

        System.out.println("Factorial of n is: "+Factorial(n));
    }
}
