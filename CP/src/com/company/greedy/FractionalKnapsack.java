package com.company.greedy;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class FractionalKnapsack {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while (t-->0){
            int n=s.nextInt(),bag=s.nextInt();
            int[] p=new int[n];
            int[] w=new int[n];
            int j=0,k=0;
            for (int i = 0; i <2*n ; i++) {
                if(i%2==0) {
                    p[j] = s.nextInt();
                    j++;
                }else {
                    w[k]=s.nextInt();
                    k++;
                }
            }
            int[] d=new int[n];
            for (int i = 0; i <n ; i++) {
                d[i]=p[i]/w[i];
            }
            knapsack(p,w,d,bag,n);

        }
    }

    private static void knapsack(int[] p, int[] w, int[] d, int bag, int n) {
        double money=0;
        sort(p,w,d,n);
        System.out.println(Arrays.toString(d));
        for (int i = n-1; i >=0 ; i--) {
            if(bag>0){
                if(w[i]<=bag){
                    bag-=w[i];
                    money+=p[i];
                }else {
                    double fraction=(double)bag/(double)w[i];
                    money+=p[i]*fraction;
                    bag-=w[i]*fraction;
                }
            }else {
                break;
            }
        }
        DecimalFormat f=new DecimalFormat("##.00");
        System.out.println(f.format(money));
    }

    private static void sort(int[] p, int[] w, int[] d, int n) {
        for (int i = 0; i <n ; i++) {
            int maxIndex=max(d,0,n-i);
            swap(d,n-i-1,maxIndex);
            swap(p,n-i-1,maxIndex);
            swap(w,n-i-1,maxIndex);
        }
    }

    private static void swap(int[] d, int i, int maxIndex) {
        int temp=d[i];
        d[i]=d[maxIndex];
        d[maxIndex]=temp;

    }

    private static int max(int[] d, int i, int n) {
        int max=i;
        for (int j = i; j <n ; j++) {
            if(d[j]>d[max])
                max=j;
        }
        return max;
    }
}
