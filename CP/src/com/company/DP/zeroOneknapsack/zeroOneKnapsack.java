package com.company.DP.zeroOneknapsack;

import java.util.Arrays;
import java.util.Scanner;

public class zeroOneKnapsack {
    static int[][] dp;
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while (t-->0){

            int n=s.nextInt();
            int W=s.nextInt();
            dp=new int[n+1][W+1];
            for (int[] a:dp
            ) {
                Arrays.fill(a,-1);
            }int[] w=new int[n];
            int[] v=new int[n];
            for (int i = 0; i <n ; i++) {
                v[i]=s.nextInt();
            }for (int i = 0; i <n ; i++) {
                w[i]=s.nextInt();
            }

//            System.out.println(knapsack(w,v,W,n));
//            System.out.println(knapsackDp(w,v,W,n));
            System.out.println(knapsackItr(w,v,W,n));
        }
    }

    private static int knapsackItr(int[] w, int[] v, int W, int n) {
        for (int i = 0; i <n+1 ; i++) {
            for (int j = 0; j <W+1 ; j++) {
                if (i==0||j==0)
                    dp[i][j]=0;
            }
        }
        for (int i = 1; i <n+1 ; i++) {
            for (int j = 1; j <W+1 ; j++) {
                if(w[i-1]<=j){
                    dp[i][j]=Math.max(v[i-1]+dp[i-1][j-w[i-1]],
                            dp[i-1][j]);
                }else {
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[n][W];
    }

    private static int knapsackDp(int[] w, int[] v, int W, int n) {
        if(n==0||W==0)
            return 0;
        if(dp[n][W]!=-1)
            return dp[n][W];
        if(w[n-1]<=W){
            return dp[n][W]=Math.max(v[n-1]+knapsackDp(w,v,W-w[n-1],n-1),
                    knapsackDp(w,v,W,n-1));
        }
        else {
            return dp[n][W]=knapsackDp(w,v,W,n-1);
        }
    }

    private static int knapsack(int[] w, int[] v, int W, int n) {

        if(n==0||W==0)
            return 0;

        if(w[n-1]<=W){
            return Math.max(v[n-1]+knapsack(w,v,W-w[n-1],n-1),
                    knapsack(w,v,W,n-1));
        }else {
            return knapsack(w,v,W,n-1);
        }
    }
}
