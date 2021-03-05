package com.company.BackTracking;
import java.util.*;
public class Permutation {
    static List<String> list;
    static public String getPermutation(int n, int k) {
        list=new ArrayList<>();
        String s="";
        for(int i=1;i<=n;i++)
            s+=i;
        solve("abc",0,n-1);
        System.out.println(list);
        return list.get(k-1);
    }
    static void solve(String s,int l,int r){
        if(l==r){
            list.add(s);
        }
        else {
            for (int i = l; i <= r; i++) {
                s = swap(s, l, i);
                solve(s, l + 1, r);
                s = swap(s, l, i);
            }
        }
    }
    static String swap(String s,int l,int r){
        char[] a=s.toCharArray();
        char t=a[l];
        a[l]=a[r];
        a[r]=t;
        return String.valueOf(a);
    }

    public static void main(String[] args) {
        getPermutation(3,5);
    }
}
