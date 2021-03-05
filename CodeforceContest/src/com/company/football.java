package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class football {
    public static void main(String[] args) {
        Scanner s=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String str=s.next();
        count(str);
    }

    private static void count(String str) {
        int z=0,o=0,zm=0,om=0;
        for (int i = 0; i <str.length() ; i++) {
            char ch=str.charAt(i);
            if (ch=='0'){
                o=0;
                z++;
                if (z>zm){
                    zm=z;
                }
            }
            if (ch=='1'){
                z=0;
                o++;
                if (o>om){
                    om=o;
                }
            }
        }
        if (zm>=7||om>=7)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
