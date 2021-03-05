package com.company;

import java.util.Scanner;

public class trailinn {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        int t = s.nextInt();
//        while (t > 0) {
//            int n = s.nextInt();
//            System.out.println(check(n));
//            t--;
//        }
        int n=s.nextInt();
        int m=s.nextInt();
        int k=s.nextInt();
        int S=s.nextInt();
        char[][] arr=new char[n][m];
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <m ; j++) {
                arr[i][j]=s.next().charAt(0);
            }
        }
        escape(arr, k, S);
    }

    private static void escape(char[][] arr,int k,int s){
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr.length ; j++) {
                if(j==arr.length-1){
                    if (arr[i][j]=='.'){
                        s-=2;
                    }
                    if(arr[i][j]=='*'){
                        s+=5;
                    }
                    if(arr[i][j]=='#'){
                        if (i<arr.length-1){
                        break;
                        }else {
                            break;
                        }

                    }
                }else {
                    if (arr[i][j]=='.'){
                        s-=3;
                    }
                    if(arr[i][j]=='*'){
                        s+=4;
                    }
                    if(arr[i][j]=='#'){
                        if (i<arr.length-1){

                            break;

                        }else {
                            break;
                        }

                    }
                }

            }
        }
        if(k<=s){
            System.out.println("Yes");
            System.out.println(s);
        }else {
            System.out.println("No");
            System.out.println(s);

        }
    }

    private static int check(int n) {
        int k = n % 2;
        if (k == 0) {
            return 1;
        } else {
            return 2;
        }
    }

    private static int trail(int fac) {
        int c = 0;
        int n = 1;
        while (fac > 0) {
            if (fac % 10 == 0) {
                c++;
            }
            fac = fac / 10;

        }
        return c;
    }

    private static int fact(int n) {

        if (n == 0)
            return 1;
        return n * fact(n - 1);
    }

}
