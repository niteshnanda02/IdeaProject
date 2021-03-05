package com.company.Array.countsum;

import java.util.Arrays;
import java.util.Scanner;

public class repeatedNumberO1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n+1];
        boolean flag=false;
        for (int i = 0; i <n ; i++) {
            a[i]=s.nextInt();
        }
        for (int i = 0; i <n ; i++) {
            if (a[Math.abs(a[i])]>0){
                a[Math.abs(a[i])]*=-1;
            }else{
                System.out.println(i);
                break;
            }

        }
    }
}
