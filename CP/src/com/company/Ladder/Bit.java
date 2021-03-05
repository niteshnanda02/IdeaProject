package com.company.Ladder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bit {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(reader.readLine());
        int i=0;
        while (t-->0){
            String x=reader.readLine();
            if (x.contains("++"))
                i++;
            if (x.contains("--"))
                i--;
        }
        System.out.println(i);
    }
}
