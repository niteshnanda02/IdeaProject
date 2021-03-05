package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ChatRoom {
    public static void main(String[] args) {
        Scanner s=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String str=s.next();
        check(str);
    }

    private static void check(String str) {
        String fin="hello";
        for (int i = 0; i <str.length() ; i++) {
            char ch=str.charAt(i);
            if (fin.length()==0)
                break;
            if(fin.charAt(0)==ch){
                fin=fin.substring(1);
            }
        }
        if (fin.length()==0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
