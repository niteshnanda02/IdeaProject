package com.company.DP.unboundedKnapsack;

import java.util.Arrays;
import java.util.Scanner;

public class rodCutting {
    static int[][] dp;
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while (t-->0){
            int l=s.nextInt();
            int[] wt=new int[3];
            for (int i = 0; i <3 ; i++) {
                wt[i]=s.nextInt();
            }
            dp=new int[l+1][4];
            for (int[] a:dp
            ) {
                Arrays.fill(a,-1);
            }
//            System.out.println(rodCuttingMemo(wt,4,l));


        }
    }

//    private static int rodCuttingMemo(int[] wt,  int n, int W) {
//
//        if(n==0||W==0)
//            return 0;
//
//        if (dp[n][W]!=-1)
//            return dp[n][W];
//
//        if(wt[n-1]<=W){
//            return dp[n][W]=Math.max(val[n-1]+rodCuttingMemo(wt,val,n,W-wt[n-1]),
//                    rodCuttingMemo(wt,val,n-1,W));
//        }else {
//            return dp[n][W]=rodCuttingMemo(wt,val,n-1,W);
//        }
//    }
}