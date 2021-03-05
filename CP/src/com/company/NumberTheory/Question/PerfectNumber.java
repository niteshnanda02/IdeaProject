package com.company.NumberTheory.Question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PerfectNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int k=Integer.parseInt(reader.readLine());
        int sum=0;
        int temp=k;
        while (temp>0){
            sum+=temp%10;
            temp/=10;
        }
        int l=10-sum;
        System.out.println(k+""+l);
    }
}
