package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class BreakWord {
    public static void main(String[] args) {
        Scanner s=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String str=s.nextLine();
        System.out.println(check(str));
    }

    private static String check(String str) {
        String[] strarr=str.trim().split("\\s+");
        StringBuilder builder=new StringBuilder();
        for (int i = 0; i <strarr.length ; i++) {
            if(strarr[i].length()%2==0){
                int mid=strarr[i].length()/2;
                for (int j = 0; j <mid ; j++) {
                    builder.append(strarr[i].charAt(j));
                }
                builder.append(" ");
                for (int j = mid; j <strarr[i].length() ; j++) {
                    builder.append(strarr[i].charAt(j));
                }
            }else {
                builder.append(strarr[i]);
            }
            builder.append(" ");
        }
        return builder.toString();
    }
}
