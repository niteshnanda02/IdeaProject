package com.company.BackTracking;

import java.util.Arrays;
import java.util.Scanner;

public class knighTourProblem {
    static int[] x={-2,-1,1,2,2,1,-1,-2},y={1,2,2,1,-1,-2,-2,-1};
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[][] a=new int[n][n];
        boolean[][] vis=new boolean[n][n];
        vis[0][0]=true;
        solve(a,vis,n,0,0,1);
    }

    private static boolean solve(int[][] a, boolean[][] vis, int n, int row, int col, int c) {

        if(c==n*n){
            print(a);
            return true;
        }

        for (int i = 0; i <8 ; i++) {
            int nr=row+x[i],nc=col+y[i];
            if(isSafe(nr,nc,n,vis)){
                vis[nr][nc]=true;
                a[nr][nc]=c;
                if (solve(a,vis,n,nr,nc,c+1))
                    return true;

                vis[nr][nc]=false;
                a[nr][nc]=0;
            }
        }
        return false;
    }

    private static boolean isSafe(int nr, int nc, int n, boolean[][] vis) {
        if(nr<0||nr>=n||nc<0||nc>=n||vis[nr][nc])
            return false;
        return true;
    }

    private static void print(int[][] a) {
        for (int[] d:a
             ) {
            System.out.println(Arrays.toString(d));
        }
    }
}
