package com.company.BinarySearch;

import java.util.Scanner;

public class DZY {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        char c1,c2;
        int n=s.nextInt();
        int m=s.nextInt();
        char[][] a=new char[n][m];
        for (int i = 0; i <n ; i++) {
            String l=s.next();
            for (int j = 0; j <m ; j++) {
                a[i][j]=l.charAt(j);
            }
        }
        int l=1;
        for (int i = 0; i <n ; i++) {
            if(i%2==0){
                c1='B';
                c2='W';
            }else {
                c1='W';
                c2='B';
            }
            l=1;
            for (int j = 0; j <m ; j++) {
                if (a[i][j]=='.'){
                    if(l==1)
                        a[i][j]=c1;
                    else
                        a[i][j]=c2;
                }
                l*=-1;
            }
        }
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <m ; j++) {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
}
