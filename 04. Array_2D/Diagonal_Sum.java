package Array_2D;

import java.util.*;

public class Diagonal_Sum {
    public static int diagonalSumEven(int mat[][]) {
        int primarySum = 0;
        int secondarySum = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if(i==j)
                {
                    primarySum += mat[i][j];
                }
                else if ( i+j == (mat.length-1))
                {
                    secondarySum += mat[i][j];
                }
            }
        }
        return (primarySum + secondarySum);
    }

    public static int diagonalSumOdd(int mat[][]) {
        int primarySum = 0;
        int secondarySum = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if(i==j)
                {
                    primarySum += mat[i][j];
                }
                else if ( i+j == (mat.length-1))
                {
                    secondarySum += mat[i][j];
                }
            }
        }
        return (primarySum + secondarySum);
        }

    public static void main (String[] args) {
        int n,m;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows and columns of Matrix respectively: ");
        n = sc.nextInt();
        m = sc.nextInt();

        int matrix[][] =  new int[n][m];

        System.out.println("Enter elements of an Array: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        if (n % 2 == 0)
        {
            System.out.println("Diagonal sum is: "+diagonalSumEven(matrix));
        }
        else
        {
            System.out.println("Diagonal sum is: "+diagonalSumOdd(matrix));
        }
    }
}