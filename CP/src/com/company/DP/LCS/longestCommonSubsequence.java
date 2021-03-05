package com.company.DP.LCS;

import java.util.Arrays;
import java.util.Scanner;

public class longestCommonSubsequence {
    static int[][] dp=new int[101][101];
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
            String s1=s.next(), s2=s.next();
//            System.out.println(lcs(s1,s2,n,m));
            System.out.println(lcsItr(s1,s2,n,m));
            printlcs(s1,s2,n,m);

        }
    }
    private static int lcsItr(String s1,String s2,int n,int m){

        for(int i=0;i<n+1;i++){
            for(int j=0;j<m+1;j++){
                if(i==0||j==0)
                    dp[i][j]=0;

                else if((s1.charAt(i-1)==s2.charAt(j-1)))
                    dp[i][j]=1+dp[i-1][j-1];

                else
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }

        return dp[n][m];

    }
    private static void printlcs(String s1, String s2, int n, int m) {
        StringBuilder builder=new StringBuilder();
        int i=n,j=m;
        while (i>0&&j>0){
            if(s1.charAt(i-1)==s2.charAt(j-1)) {
                builder.append(s1.charAt(i-1));
                i--;
                j--;
            }
            else {
                if(dp[i][j-1]>=dp[i-1][j]){
                    j--;
                }else {
                    i--;
                }
            }
        }
        System.out.println(builder.reverse());
    }

    private static int lcs(String s1, String s2, int n, int m) {

        if(n==0||m==0)
            return 0;
        if(dp[n][m]!=-1)
            return dp[n][m];
        if(s1.charAt(n-1)==s2.charAt(m-1)){
            return dp[n][m]=1+lcs(s1,s2,n-1,m-1);
        }else {
            return dp[n][m]=Math.max(lcs(s1,s2,n-1,m),lcs(s1,s2,n,m-1));
        }
    }
}
