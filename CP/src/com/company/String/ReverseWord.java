package com.company.String;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseWord {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while (t-->0){
            String l=s.next();
            String[] a=l.split("\\.");
            int L=0,R=a.length-1;
            while (L<R){
                String temp=a[L];
                a[L]=a[R];
                a[R]=temp;
                L++;
                R--;
            }
            for (int i = 0; i <a.length ; i++) {
                System.out.print(a[i]);
                if(i!=a.length-1){
                    System.out.print(".");
                }
            }
            System.out.println();
        }
    }
}
