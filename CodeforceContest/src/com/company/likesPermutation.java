package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class likesPermutation {
    public static void main(String[] args) {
        Scanner s=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t=s.nextInt();
        while (t>0){
            t--;
            int n=s.nextInt();
            int[] arr=new int[n];
            for (int i = 0; i <n ; i++) {
                arr[i]=s.nextInt();
            }
            check(n,arr);
        }
    }

    private static void check(int n, int[] arr) {
        List<List<Integer>> lists=new ArrayList<>();
        for (int i = 0; i <n ; i++) {

        }
    }
}
