package Array_2D;

import java.util.*;

public class search_in_matrix {
    public static boolean search(int mat[][],int key) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
              if(mat[i][j] == key)
              {
                  System.out.println(key+" found at location: i->"+i+" j->"+j);
                  return true;
              }
            }
        }
        System.out.println("Key not found");
        return false;
    }

    public static void main(String[] args) {

        int matrix[][] =  new int[3][3];
        int key;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter key: ");
        key = sc.nextInt();
        System.out.println("Enter elements of an Array: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        boolean ans = search(matrix,key);

    }
}