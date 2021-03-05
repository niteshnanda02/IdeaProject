package com.company.recursion.questions;

import java.util.*;

public class JosephusProblem {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while (t-->0) {
            list.clear();
            int n = s.nextInt();
            int k = s.nextInt();
            for (int i = 1; i <= n; i++) {
                list.add(i);
            }
            k--;
            solve(list, 0, k);
        }
    }

    private static void solve(List<Integer> list, int index, int k) {
        if(list.size()==1){
            System.out.println(list.get(0));
            return;
        }

        index=(index+k)%list.size();

        list.remove(index);
        solve(list,index,k);
    }
}
