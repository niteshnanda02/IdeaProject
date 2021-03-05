package com.company.Questions;

import java.util.HashSet;
import java.util.Set;

public class s1 {
    public static int solve(int input1, int[] input2) {
        Set<Integer> set = new HashSet<>();
        int ans = 0;
        for (int i = 0; i < input1; i++) {
            String f = Integer.toBinaryString(input2[i]);
            if (set.contains(count(f)))
                ans++;
            else
                set.add(count(f));
        }
        return ans;
    }

    private static int count(String s) {
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1')
                c++;
        }
        return c;
    }

    public static void main(String[] args) {
        System.out.println(solve(2,new int[]{1,2}));
    }
}
