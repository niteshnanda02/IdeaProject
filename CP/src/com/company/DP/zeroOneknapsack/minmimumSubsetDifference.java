package com.company.DP.zeroOneknapsack;

import java.util.*;

public class minmimumSubsetDifference {
    static boolean[][] dp;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = s.nextInt();
            }
            minmimumdiff(a, n);
        }

    }

    private static void minmimumdiff(int[] a, int n) {
        int range = Arrays.stream(a).sum();
        dp = new boolean[n + 1][range + 1];
        List<Boolean> list = subsetSum(a, n, range);
        int min = Integer.MAX_VALUE;
        for (int S1 = 0; S1 < list.size(); S1++) {
            if (list.get(S1)) {
                int S2 = range - S1;
                int diff=S2-S1;
                min = Math.min(min, diff);
            }
        }
        System.out.println(min);
    }

    private static List<Boolean> subsetSum(int[] a, int n, int sum) {

        for (int i = 0; i <n+1 ; i++) {
            for (int j = 0; j <sum+1 ; j++) {
                if (i==0&&j==0)
                    dp[i][j]=true;
                else if(j==0){
                    dp[i][j]=true;
                }else if(i==0){
                    dp[i][j]=false;
                }
            }
        }

        for (int i = 1; i <n+1 ; i++) {
            for (int j = 1; j <sum+1 ; j++) {
                if(a[i-1]<=j){
                    dp[i][j]=dp[i-1][j-a[i-1]]|dp[i-1][j];
                }else {
                    dp[i][j]=dp[i-1][j];
                }
            }
        }

        List<Boolean> list=new ArrayList<>();
        for (int i = 0; i <=sum/2 ; i++) {
            list.add(dp[n][i]);
        }

        return list;

    }
}
