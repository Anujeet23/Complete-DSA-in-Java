package Recursion;

import java.util.*;

public class Fibonacci {

    public static int Fibo(int n) {
          if (n==0 )
          {
              return 0;
          }
          if (n==1)
          {
              return 1;
          }
          return Fibo(n-1)+Fibo(n-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter value of n: ");
        n = sc.nextInt();

        System.out.println(n+"th Fibonacci term is: "+Fibo(n));
    }
}