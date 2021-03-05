package com.company.Questions;

import java.util.Arrays;
import java.util.Scanner;

public class Vanya {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt(),l=s.nextInt();
        int[] a=new int[n];
        for (int i = 0; i <n ; i++) {
            a[i]=s.nextInt();
        }
        Arrays.sort(a);
        double minRad=Math.max(a[0],l-a[n-1]) ;
        for (int i = 1; i <n ; i++) {
            minRad=Math.max(minRad,(a[i]-a[i-1])/2.0);
        }
        System.out.printf("%.10f%n",minRad);
    }
}
