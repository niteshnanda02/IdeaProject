package com.company.Questions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class combinationwithdifference {

    static ArrayList<String> list;
    public static void main(String[] args){
        list=new ArrayList<>()
        ;
        for (int i = 1; i <=9 ; i++) {
            String t="";
            solve(t,3,7,i);
        }
        System.out.println(list);
    }

    private static void solve(String t, int n, int k, int i) {

        if(n==0){
            list.add(t);
            return;
        }
        t=t+i;

        if(i-k>=0)
            solve(t,n-1,k,i-k);

        if (i+k<10)
            solve(t,n-1,k,i+k);
    }
}
