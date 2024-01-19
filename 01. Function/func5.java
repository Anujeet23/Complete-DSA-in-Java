package function;

import java.util.Scanner;

public class func5 {
    public static int fact(int n){
        int factorial = 1;
        while(n!=0)
        {
            factorial = factorial * n;
            n--;
        }
        return factorial;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n and r respectively: ");
        int n = sc.nextInt();
        int r = sc.nextInt();
        int n_fact = fact(n);
        int r_fact = fact(r);
        int n_r_fact = fact(n-r);
        int coeff = n_fact/r_fact * n_r_fact;
        System.out.println("Coefficient of Binomial: "+coeff);

    }
}
