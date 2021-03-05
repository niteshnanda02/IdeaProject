package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class PolygonPerimeter {
    public static void main(String[] args) {
        boolean[][] arr={{true,true,true,true,true},
                {true,true,true,true,true}};
        int ans=polygon(arr);
        System.out.println(ans);
    }

    private static int polygon(boolean[][] matrix) {
        int c=0;
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j <matrix[i].length ; j++) {
                if (matrix[i][j]==true){
                    if (i-1<0)
                        c++;
                    else if (matrix[i-1][j]==false)
                        c++;
                    if (i+1>matrix.length-1)
                        c++;
                    else if (matrix[i+1][j]==false)
                        c++;
                    if (j-1<0)
                        c++;
                    else if (matrix[i][j-1]==false)
                        c++;
                    if (j+1>matrix.length-1)
                        c++;

                    else if (matrix[i][j+1]==false)
                        c++;

                }

            }
        }
        return c;
    }
}
