package com.company.TwoPointer;

public class MaxConsecutiveOneIII {
    public static int longestOnes(int[] A, int K) {
        int s = 0, e = 0;
        for (e = 0; e < A.length; e++) {
            if (A[e] == 0) {
                K--;
            }
            if (K < 0 && A[s++] == 0) K++;
        }
        return e - s;
    }

    public static void main(String[] args) {
        int[] a={0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,0,1,1,1};
        System.out.println(longestOnes(a,3));
    }
}
