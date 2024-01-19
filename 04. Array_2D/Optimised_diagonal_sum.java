package Array_2D;

import java.util.*;

public class Optimised_diagonal_sum {

    public static int diagonalSum(int mat[][]) {
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            sum += mat[i][i];

            if(i != mat.length-i-1) {
                sum += mat[i][mat.length - i - 1];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
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

        System.out.println("Sum of diagonal elements is: "+diagonalSum(matrix));
    }
}