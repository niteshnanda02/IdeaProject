package com.company.PrefixSum;

import java.util.HashSet;
import java.util.Set;

public class ZeroSumSubArray {
    public static void main(String[] args) {
        int[] a={1, 4, -2, -2, 5, -4, 3};
        System.out.println(solve(a));
    }
    private static boolean solve(int[] a){
        int sum=0;
        Set<Integer> set=new HashSet<>();
        for (int i = 0; i <a.length ; i++) {
            sum+=a[i];

            if (a[i]==0||sum==0||set.contains(sum)){
                return true;
            }
            set.add(sum);
        }
        return false;
    }
}
