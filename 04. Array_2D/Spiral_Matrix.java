package Array_2D;

import java.util.*;

public class Spiral_Matrix {
    public static void print_Spiral(int matrix[][]) {
          int startRow = 0;
          int startCol = 0;
          int endRow = matrix.length-1;
          int endCol = matrix[0].length-1;

          while (startRow <= endRow && startCol <= endCol)
          {
              //Top
              for (int j = startCol; j <= endCol ; j++) {
                  System.out.println(matrix[startRow][j]+" ");
              }

              //Right
              for (int i = startRow+1; i <= endRow; i++) {
                  System.out.println(matrix[i][endCol]+" ");
              }

              //Bottom
              for (int j = endCol-1; j >= startCol ; j--) {
                  System.out.println(matrix[endRow][j]+" ");
              }

              //Left
              for (int i = endRow-1; i >= startRow+1 ; i--) {
                  System.out.println(matrix[i][startCol]+" ");
              }

              startCol++;
              startRow++;
              endRow--;
              endCol--;
          }
        System.out.println();
    }
    public static void main(String[] args) {
        int matrix[][] =  new int[4][4];

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter elements of an Array: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

    }
}