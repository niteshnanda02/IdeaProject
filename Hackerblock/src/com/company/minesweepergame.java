package com.company;

import java.util.Arrays;

public class minesweepergame {
    public static void main(String[] args) {
        boolean[][] ma=new boolean[3][3];

        int[][] res=minesweeper(ma);
        for (int i = 0; i <2 ; i++) {
            for (int j = 0; j <3 ; j++) {
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }

    }
    static int[][] minesweeper(boolean[][] matrix) {
        int[][] arr=new int[matrix.length][matrix.length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                int c=0;
                if((i-1>=0&&i-1<matrix.length)&&(j-1>=0&&j-1<matrix.length)&&matrix[i-1][j-1]){
                    c++;
                }
                if((i-1>=0&&i-1<matrix.length)&&(j>=0&&j<matrix.length)&&matrix[i-1][j]){
                    c++;

                }
                if((i-1>=0&&i-1<matrix.length)&&(j+1>=0&&j+1<matrix.length)&&matrix[i-1][j+1]){
                    c++;

                }
                if((i>=0&&i<matrix.length)&&(j-1>=0&&j-1<matrix.length)&&matrix[i][j-1]){
                    c++;

                }
                if((i>=0&&i<matrix.length)&&(j+1>=0&&j+1<matrix.length)&&matrix[i][j+1]){
                    c++;

                }
                if((i+1>=0&&i+1<matrix.length)&&(j-1>=0&&j-1<matrix.length)&&matrix[i+1][j-1]){
                    c++;

                }
                if((i+1>=0&&i+1<matrix.length)&&(j>=0&&j<matrix.length)&&matrix[i+1][j]){
                    c++;

                }
                if((i+1>=0&&i+1<matrix.length)&&(j+1>=0&&j+1<matrix.length)&&matrix[i+1][j+1]){
                    c++;

                }
                arr[i][j]=c;
            }
        }
        return arr;
    }

}
