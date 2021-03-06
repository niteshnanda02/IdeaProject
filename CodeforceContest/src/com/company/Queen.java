package com.company;

import java.util.Map;

public class Queen {
    public static void main(String[] args) {

        int n = 4;

        boolean[][] board = new boolean[n][n];

        queens(board, 0);
    }

    public static void queens(boolean[][] board, int row){

        if (row == board.length){
            printBoard(board);
            return;
        }

        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)){
                board[row][col] = true;

                queens(board, row + 1);

                board[row][col] = false;
            }
        }

    }

    public static boolean isSafe(boolean[][] board, int row, int col) {


        // vertical up
        for (int i = 0; i < row; i++) {
            if (board[i][col]){
                return false;
            }
        }

        // diag left
        int minLeft = Math.min(row, col);
        for (int i = 0; i <= minLeft; i++) {
            if (board[row - i][col - i]){
                return false;
            }
        }

        // diag right
        int minRight = Math.min(row, board.length - col - 1);
        for (int i = 0; i <= minRight ; i++) {
            if (board[row - i][col + i]){
                return false;
            }
        }

        return true;
    }

    public static void printBoard(boolean[][] board){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j]){
                    System.out.print("Q ");
                } else {
                    System.out.print("X ");
                }
            }

            System.out.println();
        }

        System.out.println();
    }


}