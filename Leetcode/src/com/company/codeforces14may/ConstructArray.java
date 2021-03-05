package com.company.codeforces14may;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ConstructArray {
    private static class Pair{
        int i,j;

        public Pair(int i, int j) {
            this.i = i;
            this.j = j;
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while (t-->0){
            int n=s.nextInt();
            int[] a=new int[n];
            int k=1;
            while(k<=n){
                int l=0,r=0;
                if(k==1){
                    l=1;
                    r=n;
                }else {
                    Pair pair=getZero(a);
                    l=pair.i;
                    r=pair.j;
                }

                int v=(r-l+1);
                if(v%2==0){
                    a[(l+r-1)/2-1]=k;
                }else {
                    a[(l+r)/2-1]=k;

                }
                k++;
            }
            System.out.println(Arrays.toString(a));
        }
    }
    private static Pair getZero(int[] a){
        int j=0,c=0,ans=0;
        for (int i = 1; i <a.length ; i++) {
            if(a[i-1]==0&&a[i]==0){
                c++;
            }
            if(ans<=c){
                ans=c;
                c=0;
                j=i;
            }
        }
        return new Pair(j-ans,j);
    }
}
