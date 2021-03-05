package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TooLongWord {
    public static void main(String[] args) {
        Scanner s=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n=s.nextInt();
        String[] arr=new String[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=s.next();
        }
        replace(arr,n);
        for (int i = 0; i <n ; i++) {
            System.out.println(arr[i]);
        }
    }

    private static void replace(String[] arr, int n) {
        for (int i = 0; i <n ; i++) {
            int len=arr[i].length();
            if (len>10){
                int c=arr[i].length()-2;
                arr[i]=arr[i].charAt(0)+String.valueOf(c)+arr[i].charAt(arr[i].length()-1);
            }
        }
    }
}
