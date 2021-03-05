package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PatternMatching {
    public static void main(String[] args) {
        Scanner s=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t=s.nextInt();
        for (int i = 1; i <=t ; i++) {
            int n=s.nextInt();
            String S=s.next();
            ArrayList<String> list=new ArrayList<>();
            for (int j = 0; j <n ; j++) {
                list.add(s.next());
            }
            String ans=check(list,n);
        }
    }

    private static String check(ArrayList<String> list, int n) {
        
        for (int i = 0; i <n ; i++) {

        }
        return null;
    }
}
