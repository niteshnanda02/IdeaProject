package com.company.Codeforce9may;

import java.util.Scanner;

public class AliceBOB {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while (t-->0){
            int n=s.nextInt();
            int[] a=new int[n];
            for (int i = 0; i <n ; i++) {
                a[i]=s.nextInt();
            }
            int ali=a[0],bo=0,nali=ali,nbo=bo;
            int c=0;
            int i=0,j=0;
            for (i = 1,j=a.length-1;  i<j ; ) {
                while (ali<bo){
                    ali+=a[i];
                    i++;
                    c++;
                }
                while (bo<ali){
                    bo+=a[j];
                    j--;
                    c++;
                }
            }
            System.out.println(c+" "+ali+" "+bo);
        }
    }
}
