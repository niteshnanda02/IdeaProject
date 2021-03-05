package com.company.Collections.Set;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.NavigableSet;
import java.util.Scanner;
import java.util.TreeSet;

public class InversionCount {
    public static void main(String[] args) throws IOException {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        NavigableSet<Integer> set=new TreeSet<>();
        int ans=0;
        for (int i = 0; i <n ; i++) {
            int x,y;
            x=s.nextInt();
            set.add(x);
            y=set.headSet(x).size();
            ans+=i-y;
        }
        System.out.println(ans);
    }
}
