package com.company.DP.Questions;

import java.util.Scanner;

public class MaxProductSubarray {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n];
        for (int i = 0; i <n ; i++) {
            a[i]=s.nextInt();
        }
        System.out.println(maxProduct(a,n));
    }

    private static long maxProduct(int[] a, int n) {

        if(n==0)
            return 1;

        return Math.max(a[n-1]*maxProduct(a,n-1),maxProduct(a,n-1));
    }
}
