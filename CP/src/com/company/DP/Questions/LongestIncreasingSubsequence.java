package com.company.DP.Questions;

import java.util.Arrays;
import java.util.Scanner;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while (t-->0){
            int n=s.nextInt();
            int[] a=new int[n];
            for (int i = 0; i <n ; i++) {
                a[i]=s.nextInt();
            }
            int[] vis=new int[n];
            Arrays.fill(vis,1);
            solve(a,vis,n);
        }
    }

    private static void solve(int[] a, int[] vis, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <i ; j++) {
                if(a[i]>a[j]&&vis[i]<=vis[j])
                    vis[i]=1+vis[j];
            }
        }
        System.out.println(Arrays.stream(vis).max().getAsInt());
    }
}
