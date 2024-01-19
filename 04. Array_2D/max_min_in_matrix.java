package Array_2D;

import java.util.*;

public class max_min_in_matrix {

    public static int max(int mat[][]) {
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                 maxi = Math.max(maxi,mat[i][j]);
            }
        }
        return maxi;
    }

    public static int min(int mat[][]) {
        int mini = Integer.MAX_VALUE;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                mini = Math.min(mini,mat[i][j]);
            }
        }
        return mini;
    }

    public static void main(String[] args) {

        int matrix[][] =  new int[3][3];
        int key;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter elements of an Array: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Maxximum value in a given matrix is: "+max(matrix));
        System.out.println("Minimum value in a given matrix is: "+min(matrix));

    }
}