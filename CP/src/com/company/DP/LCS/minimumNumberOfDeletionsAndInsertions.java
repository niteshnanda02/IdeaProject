package com.company.DP.LCS;

import java.util.Arrays;
import java.util.Scanner;

public class minimumNumberOfDeletionsAndInsertions {
    static int[][] dp=new int[1002][1002];
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while (t-->0){

            int n=s.nextInt(),m=s.nextInt();
            for (int i = 0; i <=n ; i++) {
                for (int j = 0; j <=m ; j++) {
                    dp[i][j]=-1;
                }
            }
            String s1=s.next(),s2=s.next();
            int lcs=lcs(s1,s2,n,m);
            int insertion=m-lcs;

            int deletion=n-lcs;
            System.out.println((insertion+deletion));
        }
    }

    private static int lcs(String s1, String s2, int n, int m) {
        if (n==0||m==0)
            return 0;

        if (dp[n][m]!=-1)
            return dp[n][m];
        if (s1.charAt(n-1)==s2.charAt(m-1))
            return dp[n][m]=1+lcs(s1,s2,n-1,m-1);
        else
            return dp[n][m]=Math.max(lcs(s1,s2,n-1,m),lcs(s1,s2,n,m-1));
    }
}
