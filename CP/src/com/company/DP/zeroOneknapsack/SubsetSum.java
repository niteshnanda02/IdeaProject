package com.company.DP.zeroOneknapsack;

public class SubsetSum {
    static boolean[][] dp;
    public static void main(String[] args) {
        int[] num={3, 34, 4, 12, 5, 2};
        int sum=9;
        int n= num.length;
        dp=new boolean[n+1][sum+1];
        System.out.println(subsetsumItr(num,sum,n));
        System.out.println(subsetsumMemo(num,sum,n));

    }

    private static boolean subsetsumMemo(int[] num, int sum, int n) {
        if(sum==0){
            return true;
        }
        if (n==0)
            return false;
        if(dp[n][sum])
            return dp[n][sum];
        if(num[n-1]<=sum){
            return dp[n][sum]=subsetsumMemo(num,sum-num[n-1],n-1)|subsetsumMemo(num,sum,n-1);
        }else {
            return dp[n][sum]=subsetsumMemo(num,sum,n-1);
        }
    }

    private static boolean subsetsumItr(int[] num, int sum, int n) {
        for (int i = 0; i <n+1 ; i++) {
            for (int j = 0; j <sum+1 ; j++) {
                if(i==0&&j==0){
                    dp[i][j]=true;
                }else if(i==0){
                    dp[i][j]=false;
                }else if(j==0){
                    dp[i][j]=true;
                }
            }
        }

        for (int i = 1; i <n+1 ; i++) {
            for (int j = 1; j <sum+1 ; j++) {
                if(num[i-1]<=j){
                    dp[i][j]=dp[i-1][j-num[i-1]]|dp[i-1][j];
                }else {
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[n][sum];
    }
}
