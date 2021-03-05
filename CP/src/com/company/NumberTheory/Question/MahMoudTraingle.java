package com.company.NumberTheory.Question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MahMoudTraingle {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String l = reader.readLine();
        String[] a = l.split(" ");
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Long.parseLong(a[i]);
        }
        Arrays.sort(arr);
        boolean flag = false;
        for (int i = 1; i <n-1 ; i++) {
            if(arr[i-1]+arr[i]>arr[i+1]){
                flag=true;
                break;
            }
        }
        if (flag)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
