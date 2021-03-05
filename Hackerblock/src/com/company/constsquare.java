package com.company;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class constsquare {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String S=s.nextLine();
        square(S);
    }

    private static void square(String s) {
        char S[]=s.toCharArray();
        sort(S);
        check(S);
    }

    private static void check(char[] s) {
        int l=s.length;
        int d=(int)Math.pow(10,l);
        for (int i = d-1; i >0 ; i--) {
            int ln=root(i);
            if (ln>-1){
                checkstring(s,i);
            }
        }
    }

    private static void checkstring(char[] s, int ln) {
        if (s.length==1){
            System.out.println(ln);
            return;
        }
        int num=0;
        int a=ln;
        while (a>0){
            a=a/10;
            num++;
        }
        int[] arr=new int[num];
        for (int i = num-1; i >=0 ; i--) {
            int n=ln%10;
            ln=ln/10;
            arr[i]=n;

        }
        for (int i = 0; i <s.length-1 ; i++) {
            if (s[i]==s[i+1]){
                s[i]=(char)arr[i];
                s[i+1]=(char)arr[i];
                i++;

            }else {
                s[i]=(char)arr[i];
            }

        }
        for (int i = 0; i <s.length ; i++) {
            System.out.println(s[i]);
        }
    }

    private static int root(int i) {
        double re=Math.sqrt(i);
        boolean var= ((re-Math.floor(re))==0);
        if (var==true){
            return (int)re;
        }
        return -1;
    }

    private static void sort(char[] s) {
        Arrays.sort(s);
        reverse(s);
    }

    private static void reverse(char[] s) {
        int n=s.length;
        for (int i = 0; i <n/2 ; i++) {
            char t=s[i];
            s[i]=s[n-1-i];
            s[n-1-i]=t;
        }
    }
}
