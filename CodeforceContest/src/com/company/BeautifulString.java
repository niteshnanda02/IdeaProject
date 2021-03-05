package com.company;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class BeautifulString {
    public static void main(String[] args) {
        Scanner s=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t=s.nextInt();
        while (t>0){
            t--;
            long n=s.nextInt();
            long k=s.nextInt();
            int[] ar={};
            check(n,k);
        }
    }

    private static void check(long n, long k) {
        long b1=n-2,b2=n-1;
        if (k==2){
            b1--;
        }
        for (long i = 0; i <k-2 ; i++) {
            if (i==0)
                b1--;
            if (b1+1!=b2){
                b2--;
            }else {
                b1--;
                b2=n-1;
            }
        }
        String ans="";
        for (long i = 0; i <n ; i++) {
            if (i==b1||i==b2){
                ans+="b";
            }else {
                ans+="a";
            }
        }
        System.out.println(ans);
    }


}
