package Array_2D;

import java.util.*;

public class Count_num {

    public static int coutNum(int mat[][],int key) {
        int count = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if(mat[i][j] == key)
                {
                    count++;
                }
            }
        }
        return count;
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
        System.out.println("Count of "+key+" is: "+coutNum(matrix,key));
    }
}