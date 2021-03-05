package com.company;

import java.awt.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner s=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String st=s.next();
        String p=s.next();
        System.out.println(check(st,p));
    }

    private static ArrayList<Integer> check(String s, String p) {
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i <=s.length()-p.length() ; i++) {
            for (int j = i; j <=i+p.length() ; j++) {
                char[] arr=s.substring(i,j).toCharArray();
                Arrays.sort(arr);
                String comp=String.valueOf(arr);
                if(comp.equals(p))
                    list.add(i);
            }
        }
        return list;
    }

}
