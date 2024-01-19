package Bit_Manupulation;

import java.util.*;

public class Even_Odd {
    public static void oddOrEven(int n) {
            int bitMask = 1;

            if( (n & bitMask) == 0)
            {
                System.out.println(n+" is even Number");
            }
            else
            {
                System.out.println(n+" is odd Number");
            }
    }
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number: ");
            int n = sc.nextInt();

            oddOrEven(n);
    }
}