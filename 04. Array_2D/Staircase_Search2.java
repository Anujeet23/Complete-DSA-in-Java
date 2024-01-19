package Array_2D;

import java.util.*;

public class Staircase_Search2 {

    //From Left-Bottom element
    public static boolean staircaseSearch(int mat[][],int key) {
        int row = mat.length-1;
        int col = 0;

        while (row >= 0 && col < mat[0].length )
        {
            if (mat[row][col] == key)
            {
                System.out.println("Found key at: ("+row+","+col+")");
                return true;
            }
            else if (key < mat[row][col])
            {
                row--;
            }
            else
            {
                col++;
            }
        }
        System.out.println("Key not Found!!");
        return false;
    }
    public static void main(String[] args) {
        int n,m;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter key: ");
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

        staircaseSearch(matrix,key);
    }
}