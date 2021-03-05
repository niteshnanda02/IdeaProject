package com.company.DP.zeroOneknapsack;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSubsetSum {
    static boolean[][] dp;
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while (t-->0){
            int n=s.nextInt();
            int[] a=new int[n];
            for (int i = 0; i <n ; i++) {
                a[i]=s.nextInt();
            }
            int sum= Arrays.stream(a).sum();
            //If sum is odd that means there is no chance of
            //dividing it into two subarray of equal sum
            if(sum%2!=0){
                System.out.println("NO");
            }
            //Now check can we actually divide the sum into subarray
            else {
                int originalSum=sum/2;
                dp=new boolean[n+1][originalSum+1];
                boolean temp=equalSubset(a,n,originalSum);
                if(temp){
                    System.out.println("YES");
                }else {
                    System.out.println("NO");
                }
            }
        }
    }

    private static boolean equalSubset(int[] a, int n, int originalSum) {
        for (int i = 0; i <n+1 ; i++) {
            for (int j = 0; j <originalSum+1 ; j++) {
                if (i==0&&j==0){
                    dp[i][j]=true;
                }
                else if(j==0){
                    dp[i][j]=true;
                }
                else if(i==0){
                    dp[i][j]=false;
                }
            }
        }

        for (int i = 1; i <n+1 ; i++) {
            for (int j = 1; j <originalSum+1 ; j++) {


                if(a[i-1]<=j){
                    dp[i][j]=dp[i-1][j-a[i-1]]|dp[i-1][j];
                }else {
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[n][originalSum];
    }
}
