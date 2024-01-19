package Backtracking;

import java.util.*;
//All Ways NQueen
public class Nqueen_all_ways {

    public static void nQueens(char board[][],int row) {
        if(row == board.length)
        {
            printBoard(board);
            return;
        }

        for (int j = 0; j < board.length; j++) {
            board[row][j] = 'Q';
            nQueens(board,row+1);
            //Backtrack
            board[row][j] = 'X';
        }
    }

    public static void printBoard(char board[][]) {
        System.out.println("---------Chess Board---------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(" "+board[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n  = sc.nextInt();
        char board[][] = new char[n][n];

        //Initialize
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'X';
            }
        }
        nQueens(board,0);
    }
}