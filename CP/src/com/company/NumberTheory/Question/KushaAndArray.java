package com.company.NumberTheory.Question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class KushaAndArray {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(reader.readLine());
        String s=reader.readLine();
        String[] a=s.split(" ");
        long[] arr=new long[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=Long.parseLong(a[i]);
        }
        Arrays.sort(arr);
        boolean val=check(arr[0],arr);
        long cnt=arr[0];
        if (val){
            System.out.println(cnt);
        }else {
            System.out.println(-1);
        }
    }

    private static boolean check(long l, long[] arr) {
        for (int i = 1; i <arr.length ; i++) {
            if (arr[i]%l!=0)
                return false;
        }
        return true;
    }
}
