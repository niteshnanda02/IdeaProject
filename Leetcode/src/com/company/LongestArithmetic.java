package com.company;

import java.util.ArrayList;

public class LongestArithmetic {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(check(arr, 1));
    }

    private static int check(int[] arr, int difference) {
        ArrayList<ArrayList<Integer>> lists=new ArrayList<>();
        for (int j = 0; j < arr.length; j++) {
            ArrayList<Integer> list=new ArrayList<>();
            list.add(arr[j]);
            int t=j;
            for (int i = j + 1; i < arr.length; i++) {
                int val = arr[i] - arr[t];
                if (val == difference) {
                    t=i;
                    list.add(arr[i]);
                }
            }
            lists.add(list);
        }
        int ans=getMax(lists);
        return ans;
    }

    private static int getMax(ArrayList<ArrayList<Integer>> lists) {
        int max=lists.get(0).size();
        for (int i = 1; i <lists.size() ; i++) {
            if (max<lists.get(i).size()){
                max=lists.get(i).size();
            }
        }
        return max;
    }
}
