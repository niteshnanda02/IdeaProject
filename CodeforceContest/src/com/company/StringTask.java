package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class StringTask {
    public static void main(String[] args) {
        Scanner s=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String str=s.next();
        String ans=convert(str);
        System.out.println(ans);
    }

    private static String convert(String str) {
        StringBuilder builder=new StringBuilder();
        for (int i = 0; i <str.length() ; i++) {
            char ch=str.charAt(i);
            if (ch=='A'||ch=='O'||ch=='Y'||ch=='E'||ch=='U'||ch=='I'||ch=='a'||ch=='o'||ch=='y'||ch=='e'||ch=='u'||ch=='i')
                continue;
            if (ch>=65&&ch<=90){
                builder.append('.');
                int c=ch-'A'+'a';
                builder.append((char)c);
            }else {
                builder.append('.');
                builder.append(ch);
            }
        }
        return builder.toString();
    }
}
