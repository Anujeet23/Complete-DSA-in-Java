package Array_2D;

import java.util.*;

public class matrix {

    public static void main(String[] args) {

            int matrix[][] =  new int[3][3];

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter elements of an Array: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" "+matrix[i][j]);
            }
            System.out.println();
        }

    }
}