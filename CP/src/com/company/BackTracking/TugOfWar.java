package com.company.BackTracking;

import java.util.ArrayList;
import java.util.Scanner;

public class TugOfWar {
    static int minAns=Integer.MAX_VALUE;
    static String ans="";
    public static void main(String[] args) {
        int[] a={23, 45, -34, 12, 0, 98,
                -99, 4, 189, -1, 4};
        solve(a,0,new ArrayList<>(),new ArrayList<>(),0,0);
        System.out.println(ans);
    }

    private static void solve(int[] a, int i, ArrayList<Integer> list1, ArrayList<Integer> list2, int sum1, int sum2) {
        if(i==a.length){
            int diff=Math.abs(sum1-sum2);
            if(diff<minAns){
                minAns=diff;
                ans=list1+" "+list2;
            }
            return;
        }
        if(list1.size()<(a.length+1)/2) {
            list1.add(a[i]);
            solve(a, i + 1, list1, list2, sum1 + a[i], sum2);
            list1.remove(list1.size() - 1);
        }
        if(list2.size()<(a.length+1)/2) {
            list2.add(a[i]);
            solve(a, i + 1, list1, list2, sum1, sum2 + a[i]);
            list2.remove(list2.size() - 1);
        }
    }
}
