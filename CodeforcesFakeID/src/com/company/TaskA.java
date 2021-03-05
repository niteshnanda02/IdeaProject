package com.company;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Stack;

public class TaskA {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-->0){
            long n=s.nextInt(),k=s.nextInt();
            long res=0;
            if(n<=k){
                double kk=k,nn=n;
                double ans=Math.ceil(kk/nn);
                res= (long) ans;
            }else{
                if(n%k==0)
                    res=1;
                else
                    res=2;
            }
            System.out.println(res);
        }
    }
}
