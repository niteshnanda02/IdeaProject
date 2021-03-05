package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class MaxConsecutiveOne {
    public static void main(String[] args) {
        Scanner s=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n=s.nextInt();
        int[] a=new int[n];
        for (int i = 0; i <n ; i++) {
            a[i]=s.nextInt();
        }
        int k=s.nextInt();
        System.out.println(check(n,a,k));
    }

    private static int check(int n, int[] A, int k) {
        int ans=0;
        ArrayList<Integer> zero=new ArrayList<>();
        for (int i = 0; i <A.length ; i++) {
            if(A[i]==0)
                zero.add(i);
        }
        for (int i = 0; i <zero.size()-k ; i++) {
            for (int j =i; j <i+k ; j++) {
                A[zero.get(j)]=0;
            }
            int c=find(A);
            for (int j =i; j <i+k ; j++) {
                A[zero.get(j)]=1;
            }
            if(ans<c)
                ans=c;
        }
        return ans;
    }

    private static int find(int[] a) {
        int ans=0,c=0;
        for (int i = 1; i <a.length ; i++) {
            if(ans<c)
                ans=c;
                if(a[i-1]==a[i]&&a[i]==1)
                c++;
            else
                c=0;


        }
        return ans;
    }
}
