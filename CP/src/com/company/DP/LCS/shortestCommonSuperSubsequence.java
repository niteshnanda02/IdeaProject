package com.company.DP.LCS;

import java.util.Arrays;
import java.util.Scanner;

public class shortestCommonSuperSubsequence {
    static int[][] dp=new int[101][101];
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while (t-->0){
            for (int[] a:dp
                 ) {
                Arrays.fill(a,-1);
            }
            String s1=s.next(),s2=s.next();
            int n=s1.length(),m=s2.length();
            int length=n+m;
            int ans=length-lcs(s1,s2,n,m);
            System.out.println(ans);
            printCommonSCS(s1,s2,n,m);
        }
    }

    private static void printCommonSCS(String s1, String s2, int n, int m) {
        int i=n,j=m;
        StringBuilder builder=new StringBuilder();
        while (i>0&&j>0){
            if (s1.charAt(i-1)==s2.charAt(j-1)){
                builder.append(s1.charAt(i-1));
                i--;j--;
            }else {
                if(dp[i-1][j]>dp[i][j-1]){
                    builder.append(s1.charAt(i-1));
                    i--;
                }else {
                    builder.append(s2.charAt(j-1));
                    j--;
                }
            }
        }
        //if j==0
        while (i>0){
            builder.append(s1.charAt(i-1));
            i--;
        }
        //else i==0
        while (j>0){
            builder.append(s2.charAt(j-1));
            j--;
        }
        System.out.println(builder.reverse());
    }

    private static int lcs(String s1, String s2, int n, int m) {
        if(n==0||m==0)
            return 0;

        if (dp[n][m]!=-1)
            return dp[n][m];

        if(s1.charAt(n-1)==s2.charAt(m-1))
            return dp[n][m]=1+lcs(s1,s2,n-1,m-1);
        else
            return dp[n][m]=Math.max(lcs(s1,s2,n-1,m),lcs(s1,s2,n,m-1));
    }
}
