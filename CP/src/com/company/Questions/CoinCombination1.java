package com.company.Questions;

import java.util.Scanner;

public class CoinCombination1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt(),x=s.nextInt();
        int[] a=new int[n];
        for (int i = 0; i <n ; i++) {
            a[i]=s.nextInt();
        }
        System.out.println(solve(a,n-1,x));
    }

    private static int solve(int[] a, int n, int x) {
        if(n<0)
            return 0;
        if (x<0)
            return 0;
        if(x==0)
            return 1;


        if(a[n]<=x){
            return solve(a,n,x-a[n])+solve(a,n-1,x);
        }else{
            return solve(a,n-1,x);
        }
    }
}
