package com.company.Questions;

import java.util.Arrays;
import java.util.Scanner;

public class sumExponentPrimeFactor {
    static int[] seive=new int[10001002];
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        seive();
        while (t-->0){
            int n=s.nextInt();
            long ans=findSum(n);
            System.out.println(ans);
        }
    }

    private static long findSum(int n) {
        long ans=0;
        for (int i = 1; i <=n ; i++) {
            double curr=  Math.ceil(Math.log10(i)/Math.log10(seive[i]));
            ans+=curr;
        }
        return ans;
    }

    private static void seive() {
        Arrays.fill(seive,0);
        seive[1]=2;
        for (int i = 2; i <=1000000 ; i++) {
            if (seive[i]==0){
                seive[i]=i;
                for (int j = 2*i; j <=1000000 ; j+=i) {
                    seive[j]=i;
                }
            }
        }
    }
}
