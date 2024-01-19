package Recursion;

import java.util.*;

public class Power {

    public static int powerOf(int x,int n) {
        if(n == 0)
        {
            return 1;
        }
        return x * powerOf(x,n-1);
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