package com.company.BackTracking;

import java.util.*;

public class NQueenProble {
    static boolean check;
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while (t-->0){
            check=false;
            int n=s.nextInt();
            boolean[][] arr=new boolean[n][n];
            solve(arr,0,n);
            if(!check){
                System.out.print("-1");
            }
            System.out.println();
        }
    }

    private static void solve(boolean[][] arr, int row, int n) {

        if(row==n){
            check=true;
            print(arr,n);
            return;
        }

        for (int col = 0; col <n ; col++) {
            if(isSafe(arr,row,col,n)){
                arr[row][col]=true;
                solve(arr,row+1,n);
                arr[row][col]=false;
            }
        }
    }

    private static boolean isSafe(boolean[][] arr, int row, int col, int n) {

        //up
        for (int i = row; i >=0 ; i--) {
            if(arr[i][col])
                return false;

        }

        for (int i = row,j=col; i >=0&&j>=0 ; i--,j--) {
            if (arr[i][j])
                return false;

        }

        for (int i = row,j=col; i >=0&&j<n ; i--,j++) {
            if (arr[i][j])
                return false;

        }
        return true;
    }

    private static void print(boolean[][] arr, int n) {
        System.out.print("[");
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j < n; j++) {
                if(arr[i][j])
                    System.out.print((j+1)+" ");
            }

        }            System.out.print("] ");

    }
}
