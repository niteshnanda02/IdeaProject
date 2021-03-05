package com.company.BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class NewYearAndHurry {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String l=reader.readLine();
        String[] a=l.split(" ");
        int n=Integer.parseInt(a[0]);
        int k=Integer.parseInt(a[1]);
        k=240-k;
        int[] arr=new int[n];
        arr[0]=5;
        for (int i = 1; i <n ; i++) {
            arr[i]=(i+1)*5+arr[i-1];
        }
        int i= Arrays.binarySearch(arr,k);
        if(i<0){
            i=Math.abs(i)-1;
        }else
            i++;
        System.out.println(i);
    }
}
