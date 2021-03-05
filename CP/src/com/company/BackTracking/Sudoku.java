package com.company.BackTracking;

import java.util.Arrays;
import java.util.Scanner;

public class Sudoku {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while (t-->0){
            int[][] arr=new int[9][9];
            for (int i = 0; i <9 ; i++) {
                for (int j = 0; j <9 ; j++) {
                    arr[i][j]=s.nextInt();
                }
            }

            solve(arr,0,0,9);
        }
    }

    private static void solve(int[][] arr, int row, int col, int n) {

        if(row==n){
            printsudoku(arr,n);
            return;
        }
        if(col==n){
            solve(arr,row+1,0,n);
            return;
        }
        if (arr[row][col]!=0){
            solve(arr,row,col+1,n);
            return;
        }
        for (int num = 1; num <=9 ; num++) {
            if(isSafe(arr,row,col,n,num)){
                arr[row][col]=num;
                solve(arr,row,col+1,n);
                arr[row][col]=0;
            }
        }
    }

    private static void printsudoku(int[][] arr, int n) {
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                System.out.print(arr[i][j]+" ");
            }
        }
    }

    private static boolean isSafe(int[][] arr, int row, int col, int n, int num) {
        //col
        for (int i = 0; i <n ; i++) {
            if (arr[row][i]==num)
                return false;
        }
        //row
        for (int i = 0; i <n ; i++) {
            if (arr[i][col]==num)
                return false;
        }
        int size= (int) Math.sqrt(n);
        int rowIndex=row-(row%size);
        int colIndex=col-(col%size);
        for (int i = rowIndex; i <rowIndex+size ; i++) {
            for (int j = colIndex; j <colIndex+size ; j++) {
                if (arr[i][j]==num)
                    return false;
            }
        }
        return true;
    }
}
