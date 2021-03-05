package com.company.DP.unboundedKnapsack;

import java.util.Arrays;
import java.util.Scanner;

public class unboundKnapsack {
    static int[][] dp;
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while (t-->0){
            int n=s.nextInt(),W=s.nextInt();
            int[] wt=new int[n];
            int[] val=new int[n];
            for (int i = 0; i <n ; i++) {
                wt[i]=s.nextInt();
            }
            for (int i = 0; i <n ; i++) {
                val[i]=s.nextInt();
            }
            dp=new int[n+1][W+1];
            for (int[] a:dp
                 ) {
                Arrays.fill(a,-1);
            }
            System.out.println(unboundKnapsackmemo(wt,val,n,W));


        }
    }

    private static int unboundKnapsackmemo(int[] wt, int[] val, int n, int W) {

        if(n==0||W==0)
            return 0;

        if (dp[n][W]!=-1)
            return dp[n][W];

        if(wt[n-1]<=W){
            return dp[n][W]=Math.max(val[n-1]+unboundKnapsackmemo(wt,val,n,W-wt[n-1]),
                            unboundKnapsackmemo(wt,val,n-1,W));
        }else {
            return dp[n][W]=unboundKnapsackmemo(wt,val,n-1,W);
        }
    }
}
