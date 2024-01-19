package Array_2D;

import java.util.*;

public class Transpose {

    public static void transpose(int mat[][]) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(" "+mat[j][i]);
            }
            System.out.println();
        }
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
        System.out.println("Transpose of a Matrix is: ");
        transpose(matrix);

    }
}