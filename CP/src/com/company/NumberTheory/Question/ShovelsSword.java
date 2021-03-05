package com.company.NumberTheory.Question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ShovelsSword {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        while (t-- > 0) {
            String s = reader.readLine();
            String[] arr = s.split(" ");
            long a = Long.parseLong(arr[0]);
            long b = Long.parseLong(arr[1]);
            long ans=Math.min(a,Math.min(b,(a+b)/3));
            System.out.println(ans);
        }
    }

}
