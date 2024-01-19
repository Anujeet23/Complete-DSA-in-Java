package Array_2D;

import java.util.*;

public class Sum_Of_Row {

    public static int rowSum(int mat[][],int row) {
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if(i == row - 1)
                {
                    sum += mat[i][j];
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int n,m;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row: ");
        int key = sc.nextInt();
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
        System.out.println("Sum of elements of row is: "+rowSum(matrix,key));
    }
}