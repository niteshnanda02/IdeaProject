package com.company.Questions;

import java.util.Arrays;

public class VBirthdayPresent {

    public static int birthdayPresent(int[] input1, int input2, int input3) {
        int[] candles = new int[input2];
        for (int i = 0; i < input2; i++) {
            candles[i] = 1 << i;
        }
        int[][] dp = new int[input2 + 1][input3 + 1];
        for (int[] a : dp
        ) {
            Arrays.fill(a, -1);
        }
        return (int) solve(input3, candles, input1, input2 - 1, dp);
    }

    private static long solve(int W, int[] wt, int[] val, int n, int[][] dp) {
        if (n == 0 && W > 0) {
            return Integer.MAX_VALUE;
        }
        if (n == 0 || W < 0) {
            return 0;
        }
        if (dp[n][W] != -1)
            return dp[n][W];
        return dp[n][W] = (int) Math.min(val[n] + solve(W - wt[n], wt, val, n, dp), solve(W, wt, val, n - 1, dp));


    }

    public static void main(String[] args) {
        System.out.println(birthdayPresent(new int[]{0,10000,1000,100,10},4,3));
    }
}
