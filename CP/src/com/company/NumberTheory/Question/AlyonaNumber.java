package com.company.NumberTheory.Question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class AlyonaNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String l=reader.readLine();
        String[] a=l.split(" ");
        int x=Integer.parseInt(a[0]);
        int y=Integer.parseInt(a[1]);
        int max=Math.max(x,y);
        int min=Math.min(x,y);
        long ans=0;
        int[] count=new int[5];
        for (int i = 1; i <=max ; i++) {
            count[(5-(i%5))%5]++;
        }
        for (int i = 1; i <=min ; i++) {
            ans+=count[i%5];
        }
        System.out.println(ans);
    }
}
