package function;

import java.util.Scanner;

public class func6 {
    public static boolean prime(int n) {
        if(n==2)
        {
            return true;
        }
        for (int i = 2; i < n; i++) {
            if(n%i == 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n = sc.nextInt();

        if(prime(n))
        {
            System.out.println(n+" is a Prime Number");
        }
        else
        {
            System.out.println(n+" is not a Prime Number");
        }
    }
}
