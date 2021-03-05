package com.company.DP.zeroOneknapsack;

import java.util.Arrays;
import java.util.Scanner;

public class countSubsetSum {
    static int[][] dp;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = s.nextInt();
            }
            int sum = s.nextInt();
            dp = new int[n + 1][sum + 1];
            int c = equalSubset(a, n, sum);
            System.out.println(c);
        }
    }

    private static int equalSubset(int[] a, int n, int originalSum) {
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < originalSum + 1; j++) {
                if (i == 0 && j == 0) {
                    dp[i][j] = 1;
                } else if (j == 0) {
                    dp[i][j] = 1;
                } else if (i == 0) {
                    dp[i][j] = 0;
                }
            }
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < originalSum + 1; j++) {


                if (a[i - 1] <= j) {
                    dp[i][j] = dp[i - 1][j - a[i - 1]] + dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[n][originalSum];
    }
}


