package com.company.Questions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class A1 {
    static class pair implements Comparable<pair> {
        String t;
        int l;

        pair(String t, int l) {
            this.t = t;
            this.l = l;
        }

        @Override
        public int compareTo(pair p) {
            return this.l - p.l;
        }
    }

    public static String arrangeWords(String text) {
        String[] a = text.split(" ");
        pair[] p = new pair[a.length];
        for (int i = 0; i < a.length; i++) {
            p[i] = new pair(a[i], a[i].length());

        }
        Arrays.sort(p);

        String ans = "";

        for (int i = 0; i < p.length; i++) {
            if (i == 0) {
                ans += p[i].t.substring(0, 1).toUpperCase() + p[i].t.substring(1) + " ";
            } else
                ans += p[i].t + " ";
        }
        return ans.trim();
    }

    public static void main(String[] args) {
//        System.out.println(arrangeWords("Leetcode is cool"));
//        char a = (char) 5+'0';
//        System.out.println(a);
        List<Integer>[] l=new List[10];
        StringBuilder builder=new StringBuilder();
    }
}