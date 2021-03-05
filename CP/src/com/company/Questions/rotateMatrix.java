package com.company.Questions;

public class rotateMatrix {
    public static void main(String[] args)
    {
        int N = 4;

        // Test Case 1
        int mat[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };

        rotateMatrix(N, mat);

        displayMatrix(N, mat);
    }
    private static void rotateMatrix(int n,int[][] mat){
        for (int x = 0; x <n/2 ; x++) {
            for (int y = x; y <n-x-1 ; y++) {
                //store top to temp
                int temp=mat[x][y];
                //move right to top
                mat[x][y]=mat[y][n-x-1];
                //move bottom to right
                mat[y][n-x-1]=mat[n-x-1][n-y-1];
                //move left to bottom
                mat[n-x-1][n-y-1]=mat[n-y-1][x];
                //store temp to left;
                mat[n-y-1][x]=temp;
            }

        }
    }
    private static void displayMatrix(int n, int[][] mat) {
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
