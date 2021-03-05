package com.company.Questions;

public class SmallestDivisor {
    public static int computeSum(int[] nums, int x) {
        int s = 0;
        for (int n : nums) {
            s += n / x + (n % x == 0 ? 0 : 1);
        }
        return s;
    }

    public static int smallestDivisor(int[] nums, int threshold) {
        int d = 1;
        while(computeSum(nums, d) > threshold) {
            ++d;
        }

        return d;
    }

    public static void main(String[] args) {
        System.out.println(smallestDivisor(new int[]{2,3,5,7,11},11));
    }
}
