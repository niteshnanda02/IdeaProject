package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class NewYearChaos {
    public static void main(String[] args) {
        Scanner s=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t=s.nextInt();
        while (t>0){
            t--;
            int n=s.nextInt();
            int[] arr=new int[n];
            for (int i = 0; i <n ; i++) {
                arr[i]=s.nextInt();
            }
            int ans=check(arr,n);
            if (ans==-1){
                System.out.println("Too chaotic");
            }else {
                System.out.println(ans+1);
            }
        }
    }

    private static int check(int[] q, int n) {
        int ans=-1;
        for (int i = n-1; i >0 ; i--) {
            int val=q[i-1]-q[i];
            if (val>2){
                return -1;
            }
            if (val>0){
                ans+=val;
            }
        }
        return ans;

    }
}
