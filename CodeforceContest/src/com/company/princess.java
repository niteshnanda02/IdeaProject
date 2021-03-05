package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class princess {
    public static void main(String[] args) {
        Scanner s=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t=s.nextInt();
        while (t>0){
            t--;
            int n=s.nextInt();
            HashMap<Integer,Integer> map=new HashMap<>();
            ArrayList<Integer> contain=new ArrayList<>();
            for (int i = 1; i <=n ; i++) {
                int k=s.nextInt();
                ArrayList<Integer> l1=new ArrayList<>(k);
                for (int j = 0; j <k ; j++) {
                    int g=s.nextInt();
                    l1.add(g);
                }
                int min=minm(l1);
                contain.add(min);
                while (contain.contains(min)){
                    l1.remove(min);
                    min=minm(l1);
                }


            }
        }
    }

    private static int minm(ArrayList<Integer> l1) {
        int min=l1.get(0);
        for (int i = 1; i <l1.size() ; i++) {
            if (l1.get(i)<min){
                min=l1.get(i);
            }
        }
        return min;
    }
}
