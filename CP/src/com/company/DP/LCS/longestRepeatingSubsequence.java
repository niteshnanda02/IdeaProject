package com.company.DP.LCS;

import java.util.Arrays;
import java.util.Scanner;

public class longestRepeatingSubsequence {
    static int[][] dp;
    public static void main (String[] args)
    {
        //code
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0){
            int n=s.nextInt();
            dp=new int[n+1][n+1];
            for(int[] a:dp)
                Arrays.fill(a,-1);
            String s1=s.next();
            int ans=lcs(s1,s1,n,n);
            System.out.println(ans);
        }
    }
    private static int lcs(String s1,String s2,int n,int m){

        for(int i=0;i<n+1;i++){
            for(int j=0;j<m+1;j++){
                if(i==0||j==0)
                    dp[i][j]=0;

                else if((s1.charAt(i-1)==s2.charAt(j-1))&&i!=j)
                    dp[i][j]=1+dp[i-1][j-1];

                else
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[n][m];

    }
}