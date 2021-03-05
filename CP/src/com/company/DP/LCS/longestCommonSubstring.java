package com.company.DP.LCS;

import java.util.Arrays;
import java.util.Scanner;

public class longestCommonSubstring {
    static int[][] dp;
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while (t-->0){
            int n=s.nextInt(),m=s.nextInt();
            dp=new int[n+1][m+1];
            for (int[] a:dp
                 ) {
                Arrays.fill(a,-1);
            }
            String s1=s.next(),s2=s.next();
            int max=Integer.MIN_VALUE;
            for (int i = 0; i <=n ; i++) {
                for (int j = 0; j <=m ; j++) {
                    if (i==0||j==0)
                        dp[i][j]=0;
                    else if(s1.charAt(i-1)==s2.charAt(j-1)) {
                        dp[i][j] = dp[i - 1][j - 1] + 1;
                        if (max<dp[i][j])
                            max=dp[i][j];
                    }
                    else
                        dp[i][j]=0;

                }
            }
            System.out.println(max);
        }
    }

}
