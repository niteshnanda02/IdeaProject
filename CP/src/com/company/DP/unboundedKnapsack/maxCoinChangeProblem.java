package com.company.DP.unboundedKnapsack;

import java.util.Arrays;
import java.util.Scanner;

public class maxCoinChangeProblem {
    static int[][] dp=new int[301][301];
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = s.nextInt();
            }
            int N = s.nextInt();
            for (int[] ar:dp
                 ) {
                Arrays.fill(ar,-1);
            }
            System.out.println(coinChange(a, n, N));
        }
    }

    private static int coinChange(int[] a, int n, int N) {

        if (n==0&&N==0)
            return 1;
        if(n==0)
            return 0;
        if(N==0)
            return 1;
        if(dp[n][N]!=-1)
            return dp[n][N];
        if(a[n-1]<=N){
            return dp[n][N]=coinChange(a,n,N-a[n-1])+coinChange(a,n-1,N);
        }else
            return dp[n][N]=coinChange(a,n-1,N);
    }
}
