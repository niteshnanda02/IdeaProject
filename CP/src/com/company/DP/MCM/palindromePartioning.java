package com.company.DP.MCM;
import java.lang.*;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class palindromePartioning {
    static int[][] dp=new int[1002][1002];
    public static void main (String[] args)
    {
        //code
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0){
            String s1=s.next();
            for(int[] a:dp)
                Arrays.fill(a,-1);
            System.out.println(solve(s1,0,s1.length()-1));
        }
    }
    private static int solve(String s,int i,int j){

        if(i>=j)
            return 0;

        if(isPali(s,i,j))
            return 0;

        if(dp[i][j]!=-1)
            return dp[i][j];
        int min=Integer.MAX_VALUE;
        for(int k=i;k<=j-1;k++){
            int left=0,right=0;
            if(dp[i][k]!=-1)
                left=dp[i][k];
            else
                left=solve(s,i,k);
            if(dp[k+1][j]!=-1)
                right=dp[k+1][j];
            else
                right=solve(s,k+1,j);
            int temp=1+left+right;
            min=Math.min(min,temp);
        }

        return dp[i][j]=min;

    }
    private static boolean isPali(String s,int i,int j){

        while(i<j){
            if(s.charAt(i)!=s.charAt(j))
                return false;

            i++;
            j--;
        }

        return true;
    }
}