package com.company.DP.LCS;

import java.util.Scanner;

public class minimumDeletionsForPalindrome {
    static int[][] dp=new int[1002][1002];
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while (t-->0){


            String s1=s.next();
            StringBuilder b=new StringBuilder(s1);
            String s2=b.reverse().toString();
            int n=s1.length(),m=s2.length();

            for (int i = 0; i <=n ; i++) {
                for (int j = 0; j <=m ; j++) {
                    dp[i][j]=-1;
                }
            }
            int lcs=lcs(s1,s2,n,m);


            int deletion=n-lcs;
            System.out.println(deletion);
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
