package com.company;

import java.util.Arrays;

public class reverseDiag {
    public static void main(String[] args) {
        int[][] ma={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.toString(reverseOnDiagonals(ma)));
    }
    static int[][] reverseOnDiagonals(int[][] matrix) {
        for(int i=0;i<matrix.length/2;i++){
            for(int j=0;j<matrix.length;j++){
                if(i==j||i+j==(matrix.length-1)){

                    int t=matrix[i][j];
                    matrix[i][j]=matrix[matrix.length-1-i][matrix.length-1-j];
                    matrix[matrix.length-1-i][matrix.length-1-j]=t;
                }
            }
        }
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j <matrix[i].length ; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        return matrix;
    }

}
