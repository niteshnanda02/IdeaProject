package com.company.DP.unboundedKnapsack;

public class minCoinChangeProblem {
    static int[][] dp;
    public int minCoins(int coins[], int M, int V)
    {
        // Your code goes here
        dp=new int[M+1][V+1];
        return solve(coins,M,V);
    }

    int solve(int[] c,int n,int sum){
        for(int i=0;i<n+1;i++){
            for(int j=0;j<sum+1;j++){
                if(i==0)
                    dp[i][j]=Integer.MAX_VALUE-1;
                else if(j==0)
                    dp[i][j]=0;
            }
        }

        for(int j=1;j<sum+1;j++){
            if(j%c[0]==0)
                dp[1][j]=j/c[0];
            else
                dp[1][j]=Integer.MAX_VALUE-1;
        }

        for(int i=2;i<n+1;i++){
            for(int j=1;j<sum+1;j++){
                if(c[i-1]<=j)
                    dp[i][j]=Math.min(dp[i][j-c[i-1]]+1,dp[i-1][j]);
                else
                    dp[i][j]=dp[i-1][j];
            }
        }

        return (dp[n][sum]==Integer.MAX_VALUE-1)?-1:dp[n][sum];
    }
}
