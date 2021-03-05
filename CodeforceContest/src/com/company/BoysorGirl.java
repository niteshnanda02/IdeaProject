package com.company;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;

public class BoysorGirl {
    public static void main(String[] args) {
        Scanner s=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String str=s.next();
        count(str);
    }

    private static void count(String str) {
        HashMap<Character,Integer> map=new HashMap<>();
        for (int i = 0; i <str.length() ; i++) {
            char ch=str.charAt(i);
            map.put(ch,1);
        }
        if (map.size()%2==0){
            System.out.println("CHAT WITH HER!");
        }else {
            System.out.println("IGNORE HIM!");
        }
    }
}
