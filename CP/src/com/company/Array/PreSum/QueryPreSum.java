package com.company.Array.PreSum;

import java.util.Scanner;

public class QueryPreSum {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int q=s.nextInt();
        long[] a=new long[n];
        long[] pre_sum=new long[n+1];
        for (int i = 0; i <n ; i++) {
            a[i]=s.nextLong();
        }
        long sum=0;
        for (int i = 0; i <n ; i++) {
            pre_sum[i]=sum+a[i];
            sum+=a[i];
        }
        while (q-->=0){
            int l=s.nextInt();
            int r=s.nextInt();
            long ans=pre_sum[r];
            if (l-1>0){
                ans-=pre_sum[l-1];
            }
            System.out.println(ans);
        }

    }
}
