package com.company.NumberTheory.Question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ToyArmy {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        long n=Long.parseLong(reader.readLine());
        System.out.println(n+n/2);
    }
}
