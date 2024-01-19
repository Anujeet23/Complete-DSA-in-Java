package Recursion;

import java.util.*;

public class Tiling {


    public static int tilingProblem(int n){

         if(n==0 | n==1)
         {
             return 1;
         }

         int verticalTiles = tilingProblem(n-1);
         int horizontalTiles = tilingProblem(n-2);

         int totalWays = verticalTiles + horizontalTiles;

         return totalWays;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter value of n: ");
        n = sc.nextInt();
        System.out.println("Ways of fitting tile on a floor are: "+tilingProblem(n));
    }
}