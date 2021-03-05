package com.company.DP.MCM;

import java.util.Arrays;

public class eggDrop {
    static int[][] dp;
    static int eggDrop(int n, int k)
    {
        // Your code here

        dp=new int[n+1][k+1];
        for(int[] a:dp)
            Arrays.fill(a,-1);

        return eggdrop(n,k);

    }
    static int eggdrop(int n,int k){
        if(k<=1)
            return k;
        if(n==1)
            return k;
        if(dp[n][k]!=-1)
            return dp[n][k];
        int min=Integer.MAX_VALUE;
        for(int f=1;f<=k;f++){
            int below=0,above=0;
            if(dp[n-1][f-1]!=-1){
                below=dp[n-1][f-1];
            }else{
                below=eggdrop(n-1,f-1);
            }

            if(dp[n][k-f]!=-1){
                above=dp[n][k-f];
            }else{
                above=eggdrop(n,k-f);
            }
            int temp=1+Math.max(below,above);
            min=Math.min(temp,min);
        }
        return dp[n][k]=min;
    }
}
