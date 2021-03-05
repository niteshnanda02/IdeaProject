package com.company.String;

import java.util.Scanner;

public class rabinKarp {
    static int d = 256;//Total number of characters
    static int q = 101; //Prime number

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String text = s.nextLine();
        System.out.println(text);
        String pat = s.nextLine();
        rabinkarp(text, pat);
    }

    private static void rabinkarp(String text, String pat) {
        int n = text.length(), m = pat.length();
        int i, j;
        int p = 0; //Hash value of pattern
        int t = 0; //Hash value of text
        int h = 1;

        //The value of h would be pow(d,M-1)%q
        for (i = 0; i < m - 1; i++) {
            h = (h * d) % q;
        }
        //calculating hash value for pattern and text
        for(i=0;i<m;i++){
            p=(d*p+pat.charAt(i))%q;
            t=(d*t+text.charAt(i))%q;
        }
        //slide function one by one
        for(i=0;i<=n-m;i++){
            if(p==t){
                for(j=0;j<m;j++){
                    if(text.charAt(i+j)!=pat.charAt(j))
                        break;
                }
                if(j==m){
                    System.out.println("Pattern found at index "+i);
                }
            }

            if(i<n-m){
                t=(d*(t-text.charAt(i)*h)+text.charAt(i+m))%q;

                if(t<0)
                    t=t+q;
            }
        }
    }
}
