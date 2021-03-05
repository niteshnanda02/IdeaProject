package com.company;

import java.util.HashSet;
import java.util.Set;

public class Longest {
    public static void main(String[] args) {
        System.out.println(maxTurbulenceSize(new int[]{9, 4, 2, 10, 7, 8, 8, 1, 9}));
    }

    public static int maxTurbulenceSize(int[] A) {
        int ans = 0;
        for (int i = 0; i < A.length; i++) {
            Set<Integer> set = new HashSet<>();
            for (int j = i + 1; j < A.length - 1; j++) {
                if (A[j - 1] > A[j]) {
                    set.add(A[j - 1]);
                    set.add(A[j]);
                } else if (A[j] < A[j + 1]) {
                    set.add(A[j]);
                    set.add(A[j + 1]);
                } else
                    break;
            }
            if (ans < set.size())
                ans = set.size();

        }
        return ans;
    }
}
