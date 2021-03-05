package com.company.String;

import java.util.Arrays;
import java.util.Scanner;

public class LongestPalindromeSubstring {
    static int[][] dp;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            String str = s.next();
            int n = str.length();
            dp = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    dp[i][j] = -1;
                }
            }
            int maxLen = 0;
            String maxString = "";
            for (int j = 0; j < n; j++) {
                for (int i = 0; i < n; i++) {
                    if (i == j) {
                        dp[i][j] = 1;
                        if (maxLen < 1) {
                            maxLen = 1;
                            maxString = str.substring(i, i + 1);
                        }
                    } else if (j - 1 == i) {
                        if (str.charAt(i) == str.charAt(j)) {
                            dp[i][j] = 1;
                            if (maxLen<2) {
                                maxLen = 2;
                                maxString = str.substring(i, j + 1);
                            }
                        } else {
                            dp[i][j] = 0;
                        }
                    } else if (i < j) {
                        if ((str.charAt(i) == str.charAt(j)) && i < n - 1 && j > 0 && dp[i + 1][j - 1] == 1) {
                            dp[i][j] = 1;
                            if (maxLen < j - i+1) {
                                maxLen = j - i+1;
                                maxString = str.substring(i, j + 1);
                            }
                        } else {
                            dp[i][j] = 0;
                        }
                    }
                }
            }
            System.out.println(maxString);
        }
    }
}
