package com.company.Array.Questions;

import java.util.Arrays;
import java.util.Scanner;

public class CopsandtheThiefDevu {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while (t-->0){
            int m=s.nextInt();
            int f=s.nextInt()*s.nextInt();
            int[] a=new int[m];
            for (int i = 0; i <m ; i++) {
                a[i]=s.nextInt();
            }
            Arrays.sort(a);
            int ans=0;
            if (a.length==1){
                ans+=(a[0]-f)>0?a[0]-f:0;
                ans+=(a[0]+f)<=100?100-(a[0]+f):0;
                System.out.println(ans);
                continue;
            }
            for (int i = 1; i <m ; i++) {
                int curr=a[i-1]+f;
                if (curr>100)
                    break;
                if (curr<a[i]){
                    int v=a[i]-f-1;
                    v-=curr;
                    if (v>0){
                        ans+=v;
                    }
                }
                if (i==m-1){
                    ans+=(a[i]+f)<=100?100-(a[i]+f):0;

                }
            }
            System.out.println(ans);
        }
    }
}
