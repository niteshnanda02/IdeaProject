package com.company.DP.zeroOneknapsack;

import java.util.Arrays;
import java.util.Scanner;

public class countSubsetWithGivenDiff {

    /*count(|S1-S2|)=diff(given)
        S1-S2=diff;  ----(1)
        S1+S2=Sum(arr) ----(2)

        (1)+(2)

        2S1=diff+sum(arr)

        S1=diff+sum(arr)/2;

        Now as you can see our problem changes for count subset with given difference to count the subset with
        sum S1. This problem we already done which is count subset problem with given sum

     */
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
            int diff = s.nextInt();
            countSubsetWithdiff(a, n, diff);
        }
    }

    private static void countSubsetWithdiff(int[] a, int n, int diff) {
        int sum = Arrays.stream(a).sum();
        int S1 = (diff + sum) / 2;
        dp = new int[n + 1][S1 + 1];
        for (int[] arr : dp
        ) {
            Arrays.fill(arr, -1);
        }
        int ans = countsubsetSum(a, n, S1);

        System.out.println(ans);

    }

    private static int countsubsetSum(int[] a, int n, int sum) {
        if (n == 0 && sum == 0)
            return 1;
        else if (n == 0)
            return 0;
        else if (sum == 0)
            return 1;
        if (dp[n][sum] != -1)
            return dp[n][sum];
        if (a[n - 1] <= sum) {
            return dp[n][sum] = countsubsetSum(a,n-1,sum-a[n-1])+countsubsetSum(a,n-1,sum);
        } else {
            return dp[n][sum] = countsubsetSum(a,n-1,sum);
        }
    }
}
