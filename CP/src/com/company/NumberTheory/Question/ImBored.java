package com.company.NumberTheory.Question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ImBored {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String l=reader.readLine();
        String[] a=l.split(" ");
        long A=Long.parseLong(a[0]);
        long B=Long.parseLong(a[1]);

        int min= (int) Math.min(A,B);
        int ans=1;
        while (min>0){
            ans*=min;
            min--;
        }
        System.out.println(ans);

    }
}
