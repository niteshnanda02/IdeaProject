package com.company.PrefixSum;

import java.util.Scanner;

public class CumulativeSumQuery {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n];
        int[] prefixsum=new int[n+1];
        for (int i = 0; i <n ; i++) {
            a[i]=s.nextInt();
            prefixsum[i+1]=prefixsum[i]+a[i];
        }
        int q=s.nextInt();
        for (int i = 0; i <q ; i++) {
            int l=s.nextInt(),r=s.nextInt();
            r++;
            int ans=prefixsum[r]-prefixsum[l];
            System.out.println(ans);
        }
    }
}
