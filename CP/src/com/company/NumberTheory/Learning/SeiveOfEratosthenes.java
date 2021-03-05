package com.company.NumberTheory.Learning;

import java.util.Arrays;

public class SeiveOfEratosthenes {
    private static int[] is_prime=new int[1000001];

    public static void main(String[] args) {
        Arrays.fill(is_prime,1);
        is_prime[0]=0;is_prime[1]=0;
        int maxn=50;
        for (int i = 2; i*i <=maxn ; i++) {
            if (is_prime[i]==1){
                for (int j = i*i; j <=maxn ; j+=i) {
                    is_prime[j]=0;
                }
            }
        }
        for (int i = 0; i <=maxn ; i++) {
            if (is_prime[i]==1)
                System.out.print(i+" ");
        }
    }
}
