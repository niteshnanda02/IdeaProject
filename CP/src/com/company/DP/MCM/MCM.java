package com.company.DP.MCM;

import java.util.*;
import java.lang.*;
import java.io.*;

class MCM {
    static int[][] dp = new int[101][101];

    public static void main(String[] args) {
        //code
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = s.nextInt();
            for (int[] d : dp)
                Arrays.fill(d, -1);
            System.out.println(solve(a, 1, a.length - 1));
        }
    }

    private static int solve(int[] a, int i, int j) {
        if (i >= j)
            return 0;
        if (dp[i][j] != -1)
            return dp[i][j];
        int min = Integer.MAX_VALUE;
        for (int k = i; k <= j - 1; k++) {
            int first = 0, second = 0;
            if (dp[i][k] != -1)
                first = dp[i][k];
            else
                first = solve(a, i, k);

            if (dp[k + 1][j] != -1)
                second = dp[k + 1][j];
            else
                second = solve(a, k + 1, j);

            int temp = first + second + a[i - 1] * a[k] * a[j];

            min = Math.min(min, temp);
        }
        return dp[i][j] = min;
    }
}